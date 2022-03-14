import java.util.ArrayList;

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
    

    /**
     * Constructor for objects of class ProgrammingPractice
     */
    public ProgrammingPractice()
    {
        // initialise instance variables
        getInput();
        printStudentMark();
        
        
    }
    
    public void getInput(){
        boolean correctInput=false;
        do{
            System.out.println("How many Students");
            numberOfCalculation=(new Scanner (System.in)).nextint();
            if(numberOfCalculation>0&&numberOfCalculation<=100){
                correctInput=true;
            }else{
                System.out.println("Incorrect value")
            
            }
        }while(!correctInput);
        
        int i=0;
        while(i<numberOfCalculation){
            S
        
        }
    
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
