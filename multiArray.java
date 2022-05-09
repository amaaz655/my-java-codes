import java.util.Scanner;

class multiArray{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the rows and colums for the 2d array: ");
        int rows,cols;
        rows = input.nextInt();
        cols= input.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.print("input numbers in the 2d array: ");
        for(int i = 0 ; i < rows ; i++){
            for( int j = 0 ; j < cols; j++ ){
                arr[i][j]=input.nextInt();
            }
        }

        System.out.println("the elements in the 2d array are: ");
        for(int i = 0 ; i < rows ; i++){
            for( int j = 0 ; j < cols; j++ ){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}