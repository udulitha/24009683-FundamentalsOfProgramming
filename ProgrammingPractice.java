import java.util.ArrayList;
import java.util.Scanner;


/**
 * Write a description of class ProgrammingPractice here.
 *
 * @author (Sanduni Dissanayake)
 * @version (A.1.0.0)
 */
public class ProgrammingPractice
{
    // instance variables - replace the example below with your own
    private String unit;
    private double marks;
    private ArrayList<Double> studentMarks = new ArrayList<>();
    private int numberOfCalculation;
    

    /**
     * Constructor for objects of class ProgrammingPractice
     */
    public ProgrammingPractice()
    {
        // initialise instance variables
        getInput();
        
        
        
    }
    
    public void getInput(){
        boolean correctInput=false;
        do{
            System.out.println("How many students do you want to record the marks?");
            numberOfCalculation=(new Scanner (System.in)).nextInt();
            if(numberOfCalculation>0&&numberOfCalculation<=25){
                correctInput=true;
            }else{
                System.out.println("Incorrect value, please add value belwen 0 to 25");
            
            }
        }while(!correctInput);
        
        int i=0;
        while(i<numberOfCalculation){
            System.out.println("Please type marks of the students");
            studentMarks.add((new Scanner(System.in).nextDouble()));
            i++;
        
        }
    
    }
    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
}
