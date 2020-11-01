/**
 *The Developer class has four attributes, the platform, interviewerName, developerName and workingHours. 
 *The platform, interviewerName and workingHours are initialized in the constructor by being assigned, whereas the developerName is assigned as an empty string (""). 
 *Each attribute has a corresponding accessor method. 
 *The platform, working hours, interviewer name and, if the developer name is not an empty string, the developer name too are displayed from a method.
 * @author Abhishek Gupta
 * @version 1.1
 */
public class Developer
{
    //We create 4 instance variables
    protected String platform; //Instance platform is taken as string
    protected String interviewerName; //Instance interviewerName is taken as string
    protected int workingHours; //Instance workingHours is taken as int
    protected String developerName; //Instance developerName is taken as string
    //Constructor for the objects of class Developer
    public Developer(String platform, String interviewerName, int workingHours)
    {
        //Initializing the instance variables
        this.platform=platform;
        this.interviewerName=interviewerName;
        this.workingHours=workingHours;
        developerName="";
    }
    /**
     * Accessor method to get platform
     * @param none
     * @return the value of platform
     */
    public String getPlatform()
    {
        return platform;
    }
    /**
     * Accessor method to get name of the interviewer
     * @param none
     * @return the value of interviewerName
     */
    public String getInterviewerName()
    {
        return interviewerName;
    }
    /**
     * Accessor method to get the number of working hours
     * @param none
     * @return the value of workingHours
     */
    public int getWorkingHours()
    {
        return workingHours;
    }
    /**
     * Accessor method to set the name of the developer
     * @param  developerName a parameter for the method
     * @return none
     */
    public void setDeveloperName(String developerName)
    {
        this.developerName=developerName;
    }
    /**
     * Accessor method to get the name of the developer
     * @param none
     * @return the value of developerName
     */
    public String getDeveloperName()
    {
        return developerName;
    }
    //Method to display the information about the developer which contains platform, working hours, interviewer name and name of the developer, if the developer name is not an empty string.
    public void display()
    {
        System.out.println("The platform of the developer: "+platform);
        System.out.println("Total working hours of the developer: "+workingHours+"hrs");
        System.out.println("The name of the interviewer: "+interviewerName);
        if (!developerName.equals("")){
            System.out.println("The name of the developer: "+ developerName);
        }
    }
}