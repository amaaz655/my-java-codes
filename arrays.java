import java.util.Scanner;
class arrays {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int size;
        System.out.print("enter the size for your array: ");
        size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the elements in the array: ");
        for(int i =0 ; i< size ; i++){
            arr[i]=input.nextInt();
        }
        System.out.print("the elements in your array are: ");
        for(int i =0 ; i<size ; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
