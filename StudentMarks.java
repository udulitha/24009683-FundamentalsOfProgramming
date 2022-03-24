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
    private double sum;
    private double mean;
    private double standardDeviation;
    private double max;
    private double min;


    /**
     * Constructor for objects of class ProgrammingPractice
     */
    public StudentMarks()
    {
    marks = new double[25];
    sum=0;
    mean=0;
    standardDeviation=0;

    }

 public void getInput(){

    boolean correctMarks=false;
    
    Scanner in = new Scanner(System.in);
    System.out.println("Input the unit name:");
    String unitName = in.nextLine();
        

            int i=0;
            while(i<marks.length){
                try {
                    System.out.println("Input Student Marks:");
                    double enteredValue = Double.parseDouble(in.nextLine());
                    marks[i]= enteredValue;
        
                    if(enteredValue>=0 && enteredValue<=100){
                        correctMarks=true;
                        i++;
                    }else{
                        System.out.println("Incorrect value, please type a number between 0 and 100");
                    }
                 } catch (NumberFormatException e) {
                    System.out.println("Incorrect value, please type a number");
                }
            }

        }
       
public void printStudentMarks(){
   
    for (double studentMark : marks){ 
            System.out.println("Student Marks: " +studentMark);
    }
}

public void findMaxMinMarks(){

         //find heighest Marks
        max = marks[0];
        for (double studentMark : marks){ 
           
            if(max < studentMark){
                max = studentMark;
            }
        }
        System.out.println("Student heighest Marks: " +max);
        //find lowest Marks
        min = marks[0];
        for (double studentMark : marks){ 
            if(min > studentMark){
                min = studentMark;
            }
        }
        System.out.println("Student lowest Marks: " +min);
    
}

public void findMean(){
    // find mean of the student marks

       for (double studentMark : marks){ 
          sum += studentMark;
        }
    mean= sum/marks.length;
    System.out.println("Mean of student marks::"+ mean);

}

public void findStandardDeviation(){
    // Find standard deviation of the student marks

    for (double studentMark : marks){ 
          standardDeviation +=  Math.pow(studentMark-mean, 2);
        }
    
    
    standardDeviation =  Math.sqrt((standardDeviation/(marks.length-1)));
    System.out.println("The Standard Deviation: " + standardDeviation);

}



public static void main(String[] args) {
        
            StudentMarks myObj=new StudentMarks();
            myObj.getInput();
            myObj.printStudentMarks();
            myObj.findMaxMinMarks();
            myObj.findMean();
            myObj.findStandardDeviation();
            

            
        }
        
    }


    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    

