import java.util.ArrayList;
import java.util.Scanner;


/**
 * Write a description of class ProgrammingPractice here.
 *
 * @author (Sanduni Dissanayake)
 * @version (A.1.2.0)
 */
class StudentMarks {
	
	
	private double[] marks;
	private double mean;
	private double statdardDeviation;


    /**
     * Constructor for objects of class ProgrammingPractice
     */
    public StudentMarks()
    {
        marks = new double[25];
	mean=0;
	statdardDeviation=0;

    }

 public void getInput(){

	boolean correctMarks=false;
	
	Scanner in = new Scanner(System.in);
	System.out.println("Input the unit name:");
	String unitName = in.nextLine();
      	System.out.println("Input number of students:");
	int numberOfStudents = Integer.parseInt(in.nextLine().trim());
		
            if(numberOfStudents>0 && numberOfStudents<=25){

                int i=0;
        	while(i<numberOfStudents){
            	System.out.println("Input Student Marks:");
            	marks[i]=(new Scanner(System.in)).nextDouble();
		
			if(i>0 && i=<100){
				correctMarks=true;
				i++;
				
        		}else{
			System.out.println("Incorrect value, please type a number between 0 and 100");
                        }


            }
        }else{
                System.out.println("Incorrect value, please type a number between 0 and 25");
            }

        }
       
public void printStudentMarks(){
	System.out.println("Student Marks: " +marks);
}

public void findMaxMinMarks(){

		StudentMarks stu = new StudentMarks();
		StudentMarks max = new StudentMarks();
		StudentMarks min = new StudentMarks("", 100);
		for (int i = 0; i < n; i ++) {
			
			
			stu.marks = in.nextDouble();
			if (max.marks < stu.marks) {
				
				
				max.marks = stu.marks;
				System.out.println("Student heighest Marks: " +max.marks);
			}
			if (min.marks > stu.marks) {
				
				
				min.marks = stu.marks;
				System.out.println("Student heighest Marks: " +min.marks);

        }
 

    }
    
}

public void meanOfTheMarks(){

}


public class Main {
	public static void main(String[] args) {
		
		        StudentMarks myObj=new StudentMarks();
        		myObj.getInput();
			myObj.printStudentMarks();
			myObj.findMaxMinMarks();
			

			
		}
		
	}
}

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    

