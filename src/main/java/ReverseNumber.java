import java.util.Scanner;

public class ReverseNumber {
    public static int reverseNumber(int number){
        int reversedNumber=0;
        while(number>0){
            reversedNumber=reversedNumber*10+number%10;
            number/=10;
        }

        return reversedNumber;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number ");
        int number=input.nextInt();
        if(number<=0) System.out.println("Enter the Positive Number");
        int reversedNumber=reverseNumber(number);
        System.out.println("Reversed Number = "+reversedNumber);
    }
}
