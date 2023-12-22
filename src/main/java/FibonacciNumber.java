import java.util.Scanner;

public class FibonacciNumber {
    public static void fibonacciSeries(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");

        int n=input.nextInt();

        int firstNum=0;
        int secondNum=1;

        for(int i=0;i<n;i++){
            System.out.print(firstNum+" ");
            int num=firstNum+secondNum;
            firstNum=secondNum;
            secondNum=num;

        }
    }

    public static void main(String[] args) {
        fibonacciSeries();
    }
}
