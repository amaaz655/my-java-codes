import java.util.Scanner;
class ifElse{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.println("enter number 1");
        num1=input.nextInt();

        System.out.println("enter number 2");
        num2=input.nextInt();

        if(num1>num2){
            System.out.println("num1 is greater");
        }
        else if(num1==num2){
            System.out.println("num1 is equal to num2");
        }
        else{
            System.out.println("num2 is greater");
        }


    }
}