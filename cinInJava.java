import java.util.Scanner;

class cinInJava{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("enter a integer number: ");
        int myInt = input.nextInt();
        System.out.println("the integer number you entered is: "+ myInt);

        System.out.print("please enter a float number: ");
        float number = input.nextFloat();
        System.out.println("the float number you entered is: " + number);
        
        System.out.print("please enter a string text: ");
        String text = input.next();
        System.out.println("the string text you entered is: " + text);
    }
}