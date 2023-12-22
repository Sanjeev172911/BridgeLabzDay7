import java.util.Scanner;

public class PrimeNumber {

    public static void primeNumber(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=input.nextInt();

        if(n==1){
            System.out.println("1 is not a Prime nor Composite");
        }

        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                System.out.println(n+" is not a Prime NUmber");
                return;
            }
        }

        System.out.println(n+ " is a Prime Number");
    }



    public static void main(String[] args) {
        primeNumber();
    }

}
