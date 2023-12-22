import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class CouponNumber {
    public static int findNumberOfDraws(HashSet<Integer>set){
        int moves=0;
        Random random=new Random();
        while(set.size()>0){
            int num=random.nextInt(1000)+1;
            if(set.contains(num)){
                set.remove(num);
            }
            moves++;
        }

        return moves;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number of Coupon :");
        int number=input.nextInt();
        System.out.println("Enter "+number+" distinct Coupon within the Range from 1 to 1000");

        HashSet<Integer>set=new HashSet<>();

        for(int i=0;i<number;i++){
            int couponNumber=input.nextInt();
            set.add(couponNumber);
        }

        System.out.println(findNumberOfDraws(set)+" Draws are required to generate all the Coupon");
    }
}
