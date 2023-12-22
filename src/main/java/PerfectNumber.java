import java.util.Scanner;

public class PerfectNumber {
    public static void perfectNumber(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=input.nextInt();

        if(n<=0){
            System.out.println("Please Enter a Positive Number");
            return ;
        }

        int sum=1;

        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                if(i!=n/i){
                    sum+=i;
                    sum+=n/i;
                }else sum+=i;
            }
        }


        if(sum==n) System.out.println(n + " is a perfect Number");
        else System.out.println(n + " is a not perfect Number");
    }

    public static void main(String[] args) {
        perfectNumber();
    }

}
