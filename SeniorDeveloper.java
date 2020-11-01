/**
 *The SeniorDeveloper class extends Developer class and has seven attributes; salary, joiningDate, staffRoomNumber, contractPeriod, advanceSalary, appointed and terminated. 
 *The platform, interviewerName, salary, workingHours and contractPeriod are initialized in the constructor by being assigned, where platform, interviewerName and workingHours are called from the super class, whereas the joiningDate, staffRoomNumber are assigned as an empty string (""), advanceSalary as 0.0f and terminated, appointed are set as the boolean value "false". 
 *Each attribute has a corresponding accessor method. 
 *There are two methods to set salary and contractPeriod. 
 *There are many methods to hire developer for a particular platform, to terminate the developer contract, to print the platform, interviewer name and developer salary and to display the details of the developer.
 * @author Abhishek Gupta
 * @version 1.1
 */
public class SeniorDeveloper extends Developer
{
    //We create 7 instance variables
    private float salary; //Instance salary is taken as float
    private String joiningDate; //Instance joiningDate is taken as string
    private String staffRoomNumber; //Instance staffRoomNumber is taken as string
    private int contractPeriod; //Instance contractPeriod is taken as int
    private float advanceSalary; //Instance advanceSalary is taken as float
    private boolean appointed; //Instance appointed is taken as boolean 
    private boolean terminated; //Instance terminated is taken as boolean
    //Constructor for the objects of class SeniorDeveloper
    public SeniorDeveloper(String platform, String interviewerName, float salary, int workingHours, int contractPeriod)
    {
        //Initializing the instance variables
        super(platform, interviewerName, workingHours); //Calling from super class constructor
        this.salary=salary;
        joiningDate="";
        staffRoomNumber="";
        this.contractPeriod=contractPeriod;
        advanceSalary=0.0f;
        terminated=false;
        appointed=false;
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
     * Accessor method to get the joining date
     * @param none
     * @return the value of joiningDate
     */
    public String getJoiningDate()
    {
        return joiningDate;
    }
    /**
     * Accessor method to get staff room number
     * @param none
     * @return the value of staffRoomNumber
     */
    public String getStaffRoomNumber()
    {
        return staffRoomNumber;
    }
    /**
     * Accessor method to get contract period
     * @param none
     * @return the value of contractPeriod
     */
    public int getContractPeriod()
    {
        return contractPeriod;
    }
    /**
     * Accessor method to get advance salary
     * @param none
     * @return the value of advanceSalary
     */
    public float getAdvanceSalary()
    {
        return advanceSalary;
    }
    /**
     * Accessor method to get boolean value of appointed
     * @param none
     * @return the boolean value of appointed
     */
    public boolean getAppointed()
    {
        return this.appointed;
    }
    /**
     * Accessor method to get boolean value of terminated
     * @param none
     * @return the boolean value of terminated
     */
    public boolean getTerminated()
    {
        return this.terminated;
    }
    /**
     * Accessor method to set the salary of the developer
     * @param  salary a parameter for the method
     * @return none
     */
    public void setSalary(float salary)
    {
        this.salary=salary;
    }
    /**
     * Accessor method to set the contract period
     * @param  contractPeriod a parameter for the method
     * @return none
     */
    public void setContractPeriod(int contractPeriod)
    {
        this.contractPeriod=contractPeriod;
    }
    //Method to hire a senior developer that accepts parameters, a new developer name, joining date, advance salary and staff room number which is assigned for a particular developer.
    public void hireSeniorDeveloper(String seniorDeveloperName, String joiningDate, float advanceSalary, String staffRoomNumber)
    {
        /** IF the developer is already appointed, the developer name and room number is displayed. 
        *ELSE the method to set the developer name is called from the super class with the developer name as a parameter and the joining date, staff room number and advance salary are updated by taking input. Also, the appointed status of the developer is changed to true and developer termination status is initialized to false. 
        */
        if (getAppointed()==true){
            System.out.println("A developer is already appointed. The details of the developer are:");
            System.out.println("Developer Name: "+ getDeveloperName());
            System.out.println("Corresponding Room Number:" + getStaffRoomNumber());
        }
        else{
            super.setDeveloperName(seniorDeveloperName);
            this.joiningDate=joiningDate;
            this.staffRoomNumber=staffRoomNumber;
            this.advanceSalary=advanceSalary;
            this.appointed=true;
            this.terminated=false;
            System.out.println("Congratulations, a senior developer has been appointed successfully!");
        }
    }
    //Method to terminate the developer contract.
    public void contractTermination() 
    {
        /** IF the developer termination status is true then a message is displayed. 
        *ELSE the method terminates the existing developer's contract and removes the developer name, joining date, staff room number and advance salary. Also, the appointed status and the termination status of the developer is changed to false and true respectively. 
        */
        if(getTerminated()==true){
            System.out.println("The contract has already been terminated.");
        }
        else{
            System.out.println("The contract for "+super.getDeveloperName()+" is terminated.");
            super.setDeveloperName("");
            this.joiningDate="";
            this.advanceSalary=0.0f;
            this.appointed=false;
            this.terminated=true;            
        }
    }
    //Method to print the information about the developer which contains platform, interviewer's name and salary.
    public void print()
    {
        System.out.println("The interviewer's platform is: "+getPlatform());
        System.out.println("The name of the interviewer is: "+getInterviewerName());
        System.out.println("The salary of the developer is: "+getSalary()+"$");
    }
    //Method to display the information about the developer which contains platform, working hours, interviewer name and name of the developer, if the developer name is not an empty string(called from super class). IF the appointed status is true, it also displays the termination status, joining date and advance salary of the developer.
    public void display()
    {
        super.display();
        if(getAppointed()==true){
            System.out.println("The termination status is: "+this.terminated); //use true if it doesnt work
            System.out.println("The joining date is: "+this.joiningDate);
            System.out.println("The advance salary is: "+this.advanceSalary+"$");
        }
    }   
}

