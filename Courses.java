/*IN THIS PROJECT YOU ARE ADKED TO ENTER THE NUMBER OF COURSES AND IN EACH COURSE YOU ARE ASKED TO ENTER THE NUMBER OF STUDENTS AND THEN YOU HAVE
TO FIND THE PREFINAL RESULTS OF EACH STUDENT AND THE AVERAGE OF QUIZZES AND ASSIGNMENTS */
import java.util.Scanner;

public class Courses {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
			
		System.out.println("enter the number of courses:");
		int X = scan.nextInt();
            
        int num = X;
            for(int l =0; l < num; l++) {
                System.out.println("enter the number of students in a course");
		        int a=scan.nextInt();
		        System.out.println("enter the number of quizzes in this course:");
		        int b = scan.nextInt();
		        System.out.println("enter the number of assignments in this course: ");
		        int c = scan . nextInt();
                int[] student= new int[a];
		        double quizSum=0, assignSum=0;
		        int temp1=0,temp2=0;
		        for(int i =0 ; i<a;i++) {
			        int sum1=0,sum2=0;

			        System.out.println("enter the marks in each quiz taken in this courseby student " + (i+1));
                    int[] quiz = new int[b];
			    for(int j =0 ; j<b; j++) {
				
				    quiz[j]=scan.nextInt();
				    sum1+=quiz[j];
			    }
			
			    System.out.println("enter the marks in each assignment taken in this course by student " + (i+1));
                int[] assign= new int[c];
			    for(int k =0 ; k<c; k++) {
				
				    assign[k] = scan.nextInt();
				    sum2+=assign[k];
			    }
		
			    student[i]=sum1+sum2;
			    System.out.print("the prefinal result for student "+ (i+1) + " is ");
			    System.out.println(student[i]);
			    temp1 += sum1;
			    temp2 += sum2;
		    }
		quizSum=temp1;
		assignSum=temp2;
		System.out.println("the average for the quizes in this course is: " + (quizSum/a));
		System.out.println("the average for the assignment in this course is: " + (assignSum/a));
		
		}
	}
}