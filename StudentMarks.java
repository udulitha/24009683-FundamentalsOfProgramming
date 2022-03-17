import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;


/**
 * Write a description of class ProgrammingPractice here.
 *
 * @author (Sanduni Dissanayake)
 * @version (A.1.2.0)
 */
class StudentMarks {
	
	
    private double[] marks;
    private int numberOfStudents;
    private double sum;
    private double mean;
    private double StandardDeviation;


    /**
     * Constructor for objects of class ProgrammingPractice
     */
    public StudentMarks()
    {
        marks = new double[25];
	numberOfStudents=0;
	sum=0;
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

public void findMean(){


      
      double i;
      
      for(i = 0; i < numberOfStudents; i++) {
         sum+=marks[i];
      }
	mean= sum/numberOfStudents;
	System.out.println("Mean of student marks::"+ mean);

}

public void findStandardDeviation(){

	for(i = 0; i < numberOfStudents; i++){
	    StandardDeviation = StandardDeviation + Math.pow(i-mean, 2);
	}
	
	return Math.sqrt((StandardDeviation/numberOfStudents));
	System.out.println("The Standard Deviation: " + StandardDeviation);

}


public class Main {
	public static void main(String[] args) {
		
		        StudentMarks myObj=new StudentMarks();
        		myObj.getInput();
			myObj.printStudentMarks();
			myObj.findMaxMinMarks();
			myObj.findMean();
			myObj.findStandardDeviation();
			

			
		}
		
	}
}

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    

