import java.util.*;
public class StudentMarks{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of students");
        int numOfStudents=input.nextInt();
        int[] stuGrades= new int[numOfStudents];
        for(int i=0;i<numOfStudents;i++){
            System.out.println("Enter the marks for student"+i);
            
            int j=input.nextInt();
            if(j>=0 && j<=100){
            stuGrades[i]=j;
            }else{
                throw new ArithmeticException(e);
                
            }
        }
        }

        

    }

