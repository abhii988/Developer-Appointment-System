/**
 *The JuniorDeveloper class extends Developer class and has seven attributes; salary, appointedDate, evaluationPeriod, terminationDate, specialization, appointedBy and joined. 
 *The platform, interviewerName, workingHours, salary, appointedBy and terminationDate are initialized in the constructor by being assigned, where platform, interviewerName and workingHours are called from the super class, whereas the appointedDate, evaluationPeriod, specialization are assigned as an empty string ("") and joined is set as the boolean value "false". Each attribute has a corresponding accessor method. 
 *There is a method to set the salary as changes to salary inevitably occur. 
 *There are two methods to hire and to display the details of a junior developer.
 * @author Abhishek Gupta
 * @version 1.1
 */
public class JuniorDeveloper extends Developer
{
    //We create 7 instance variables.
    private float salary; //Instance salary is taken as float
    private String appointedDate; //Instance appointedDate is taken as string
    private String evaluationPeriod; //Instance evaluationPeriod is taken as string
    private String terminationDate; //Instance terminationDate is taken as string
    private String specialization; //Instance specialization is taken as string
    private String appointedBy; //Instance appointedBy is taken as string
    private boolean joined; //Instance joined is taken as boolean
    //Constructor for the objects of class JuniorDeveloper.
    public JuniorDeveloper(String platform, String interviewerName, int workingHours, float salary, String appointedBy, String terminationDate)
    {
        //Initializing the instance variables
        super(platform, interviewerName, workingHours); //Calling from super class constructor
        this.salary=salary;
        this.appointedBy=appointedBy;
        this.terminationDate=terminationDate;
        appointedDate="";
        evaluationPeriod="";
        specialization="";
        joined=false;
    }
    /**
     * Accessor method to get salary
     * @param none
     * @return the value of salary
     */
    public float getSalary()
    {
        return salary;
    }
    /**
     * Accessor method to get appointed by
     * @param none
     * @return the value of appointedBy
     */
    public String getAppointedBy()
    {
        return appointedBy;
    }
    /**
     * Accessor method to get date of termination
     * @param none
     * @return the value of terminationDate
     */
    public String getTerminationDate()
    {
        return terminationDate;
    }
    /**
     * Accessor method to get appointed date
     * @param none
     * @return the value of appointedDate
     */
    public String getAppointedDate()
    {
        return appointedDate;
    }
    /**
     * Accessor method to get evaluation period
     * @param none
     * @return the value of evaluationPeriod
     */
    public String getEvaluationPeriod()
    {
        return evaluationPeriod;
    }
    /**
     * Accessor method to get specialization
     * @param none
     * @return the value of specialization
     */
    public String getSpecialization()
    {
        return specialization;
    }
    /**
     * Accessor method to get boolean value of joined
     * @param none
     * @return the boolean value of joined
     */
    public boolean getJoined()
    {
        return joined;
    }
    /**
     * Accessor method to set the salary of the developer
     * @param  salary a parameter for the method
     * @return none
     */
    public void setSalary (float salary)
    {
        /** IF the developer has not yet joined, a new value of salary is assigned. 
        *ELSE a message is displayed saying that it is not possible to change the salary.
        */
        if(getJoined()==false){
            this.salary=salary;
            System.out.println("Salary has been changed successfully!");
        }
        else{
            System.out.println("It is not possible to change the salary, as a developer has already joined.");
        }
    }
    //Method to hire a junior developer that accepts parameters, a new developer name, appointed date, appointed date, termination date, specialization and evaluationPeriod which is assigned for a particular developer.
    public void hireJuniorDeveloper(String juniorDeveloperName, String appointedDate, String terminationDate, String specialization)
    {
        /** IF the developer has not joined, then the method to set the developer name is called from the super class with the developer name as a parameter and the appointed date, termination date, specialization and evaluationPeriod are updated by taking input. Also, the joined status of the developer is changed to true.
        *ELSE a message saying already appoined is displayed with, the developer name and room number is displayed.
        */
        if (getJoined()==false){
            super.setDeveloperName(juniorDeveloperName);
            this.appointedDate=appointedDate;
            this.terminationDate=terminationDate;
            this.specialization=specialization;
            joined=true;
            System.out.println("Congratulations, a junior developer has been appointed successfully!");
        }
        else{
            System.out.println("A developer was already appointed on: "+getAppointedDate());
        }
    }
    //Method to display the information about the developer which contains platform, working hours, interviewer name and name of the developer, if the developer name is not an empty string(called from super class). IF the joined status is true, it also displays the appointed date, evaluation period, termination date, salary, specialization and by whom the developer was appointed.
    public void display()
    {
        super.display();
        if(getJoined()==true){
            System.out.println("The developer was appointed on: "+getAppointedDate());
            System.out.println("The evaluation period of the developer is: "+getEvaluationPeriod());
            System.out.println("The termination date of the developer is: "+getTerminationDate());
            System.out.println("The salary of the developer is: "+getSalary()+"$");
            System.out.println("The specialization of the developer is: "+getSpecialization());
            System.out.println("The developer was apppointed by: "+getAppointedBy());
        }
    }
}