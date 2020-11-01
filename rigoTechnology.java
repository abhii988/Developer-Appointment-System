/**
 *This is the GUI interface for the previous coursework about Senior and Junior Developers.
 * @author Abhishek Gupta
 * @version 1.1
 */
//Importing required packages from the java libraries.
//import javax.swing.*;
//import java.awt.event.*;
//import java.util.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
public class rigoTechnology implements ActionListener
{
    JFrame frame;

    JPanel senDevPltPanel, senDev, junDevPltPanel, junDev;

    JLabel lblSenPltfrm, lblSenIntrvwr, lblSenSalry, lblSenWrkHr, lblSenContPrd, lblSenStaffRoomNo; 
    JLabel lblSenDevName, lblSenAdvsalry, lblSenPltfrmNum, lblSenJoinDate;
    JLabel lblJunSalry, lblJunPltfrm, lblJunIntrvwr, lblJunWrkHr, lblJunAppointBy, lblJunTerminate;
    JLabel lblJunDevName, lblJunAppointDate, lblJunSpecialization, lblJunTermDate, lblJunPltfrmNum;

    JTextField txtSenPltfrm, txtSenIntrvwr, txtSenSalry, txtSenWrkHr, txtSenContPrd; 
    JTextField txtSenDevName, txtSenAdvsalry, txtSenPltfrmNum, txtSenStaffRoomNo, txtSenJoinDate;
    JTextField txtJunSalry, txtJunPltfrm, txtJunIntrvwr, txtJunWrkHr, txtJunAppointBy, txtJunTerminate;
    JTextField txtJunDevName, txtJunAppointDate, txtJunSpecialization, txtJunTermDate, txtJunPltfrmNum;

    JButton btnClear, btnDisplay, btnAddS, btnSenAppoint, btnTerminate, btnAddJ, btnJunAppoint;
    
    List<Developer> list = new ArrayList<Developer>();

    //Main method for execution of the application and creating instance of the Class and calling the GUI method
    public static void main(String[] args)
    {
        new rigoTechnology().gui();
    }
    //The GUI method of the program
    public void gui()
    {     
        //Creating the main frame 
        frame = new JFrame("Rigo Technology");
        frame.setTitle("RigoTechnology");
        frame.getContentPane().setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Creating the labels
        lblSenPltfrm=new JLabel("Platform:");
        lblSenIntrvwr=new JLabel("Interviewer's Name:");
        lblSenSalry=new JLabel("Salary:");
        lblSenWrkHr=new JLabel("Working Hours:");
        lblSenContPrd = new JLabel("Contract Period:"); 
        lblSenStaffRoomNo = new JLabel("Room No:");
        lblSenDevName=new JLabel("Developer's Name:");
        lblSenAdvsalry=new JLabel("Advance Salary:");
        lblSenPltfrmNum=new JLabel("Platform No:");
        lblSenJoinDate = new JLabel("Joining Date:");
        lblJunSalry = new JLabel("Salary:");
        lblJunPltfrm = new JLabel("Platform:");
        lblJunIntrvwr = new JLabel("Interviewer's Name:");
        lblJunWrkHr = new JLabel("Working Hours:");
        lblJunAppointBy = new JLabel("Appointed By:");
        lblJunTerminate = new JLabel("Termination Date:");
        lblJunDevName = new JLabel("Developer's Name:");
        lblJunAppointDate = new JLabel("Appointed Date:");
        lblJunSpecialization = new JLabel("Specialization:");
        lblJunTermDate = new JLabel("Termination Date:");
        lblJunPltfrmNum = new JLabel("Platform No:");

        //Creating the text fields
        txtSenPltfrm=new JTextField();
        txtSenIntrvwr=new JTextField();
        txtSenSalry=new JTextField();
        txtSenWrkHr=new JTextField();
        txtSenContPrd = new JTextField();
        txtSenDevName=new JTextField();
        txtSenAdvsalry=new JTextField();
        txtSenPltfrmNum=new JTextField();
        txtSenStaffRoomNo = new JTextField();
        txtSenJoinDate = new JTextField();
        txtJunSalry = new JTextField();
        txtJunPltfrm = new JTextField();
        txtJunIntrvwr = new JTextField();
        txtJunWrkHr = new JTextField();
        txtJunAppointBy = new JTextField();
        txtJunTerminate = new JTextField();
        txtJunDevName = new JTextField();
        txtJunAppointDate = new JTextField();
        txtJunSpecialization = new JTextField();
        txtJunTermDate = new JTextField();
        txtJunPltfrmNum = new JTextField();

        //Creating the button
        btnClear=new JButton("Clear");
        btnDisplay = new JButton("Display");
        btnAddS=new JButton("Add for Senior");        
        btnSenAppoint=new JButton("Appoint");
        btnTerminate = new JButton("Terminate");
        btnAddJ = new JButton("Add for Junior");
        btnJunAppoint = new JButton("Appoint");
        
        //Creating the panel for senior developer platform
        senDevPltPanel = new JPanel();
        senDevPltPanel.setBorder(new TitledBorder(null, "Add Platform for Senior Developer", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        senDevPltPanel.setLayout(null);

        //Adding required labels, button and text fields to the panel
        senDevPltPanel.add(lblSenPltfrm);
        senDevPltPanel.add(txtSenPltfrm);
        senDevPltPanel.add(lblSenIntrvwr);
        senDevPltPanel.add(txtSenIntrvwr);
        senDevPltPanel.add(lblSenSalry);
        senDevPltPanel.add(txtSenSalry);
        senDevPltPanel.add(lblSenWrkHr);
        senDevPltPanel.add(txtSenWrkHr);
        senDevPltPanel.add(lblSenContPrd);
        senDevPltPanel.add(txtSenContPrd);
        senDevPltPanel.add(btnAddS);

        //Creating the panel for senior developer platform
        senDev = new JPanel();
        senDev.setBorder(new TitledBorder(null, "Senior Developer", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        senDev.setLayout(null);

        //Adding required labels, button and text fields to the panel
        senDev.add(lblSenDevName);
        senDev.add(txtSenDevName);
        senDev.add(lblSenAdvsalry);
        senDev.add(txtSenAdvsalry);
        senDev.add(lblSenPltfrmNum);
        senDev.add(txtSenPltfrmNum);
        senDev.add(lblSenStaffRoomNo);
        senDev.add(txtSenStaffRoomNo);
        senDev.add(lblSenJoinDate);
        senDev.add(txtSenJoinDate);
        senDev.add(btnSenAppoint);
        senDev.add(btnTerminate);

        //Creating the panel for JUnior developer platform
        junDevPltPanel = new JPanel();
        junDevPltPanel.setBorder(new TitledBorder(null, "Add Platform for Junior Developer", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        junDevPltPanel.setLayout(null);
        
        //Adding required labels, button and text fields to the panel
        junDevPltPanel.add(lblJunSalry);
        junDevPltPanel.add(txtJunSalry);
        junDevPltPanel.add(lblJunPltfrm);
        junDevPltPanel.add(txtJunPltfrm);
        junDevPltPanel.add(lblJunIntrvwr);
        junDevPltPanel.add(txtJunIntrvwr);
        junDevPltPanel.add(lblJunWrkHr);
        junDevPltPanel.add(txtJunWrkHr);
        junDevPltPanel.add(txtJunAppointBy);
        junDevPltPanel.add(lblJunAppointBy);
        junDevPltPanel.add(lblJunTerminate);
        junDevPltPanel.add(txtJunTerminate);
        junDevPltPanel.add(btnAddJ);
        
        //Creating the panel for senior developer platform
        junDev = new JPanel();
        junDev.setBorder(new TitledBorder(null, "Junior Developer", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        junDev.setLayout(null);
        
        //Adding required labels, button and text fields to the panel
        junDev.add(lblJunDevName);
        junDev.add(txtJunDevName);
        junDev.add(lblJunAppointDate);
        junDev.add(txtJunAppointDate);
        junDev.add(lblJunSpecialization);
        junDev.add(txtJunSpecialization);
        junDev.add(lblJunTermDate);
        junDev.add(txtJunTermDate);
        junDev.add(lblJunPltfrmNum);
        junDev.add(txtJunPltfrmNum);
        junDev.add(btnJunAppoint);
        
        //Setting the bounds of all labels, panels, text fields and buttons
        senDevPltPanel.setBounds(10, 19, 499, 122);
        senDev.setBounds(10, 152, 499, 154);
        junDev.setBounds(548, 152, 499, 154);
        junDevPltPanel.setBounds(548, 19, 499, 122);

        lblSenWrkHr.setBounds(275, 22, 90, 21);
        lblSenContPrd.setBounds(181, 86, 95, 21);
        lblSenSalry.setBounds(10, 86, 60, 21);
        lblSenIntrvwr.setBounds(10, 54, 117, 21);
        lblSenPltfrm.setBounds(10, 22, 70, 21);
        lblSenDevName.setBounds(10, 22, 110, 21);
        lblSenAdvsalry.setBounds(257, 86, 98, 21);
        lblSenPltfrmNum.setBounds(10, 54, 85, 21);
        lblSenStaffRoomNo.setBounds(259, 54, 63, 21);
        lblSenJoinDate.setBounds(10, 86, 80, 21);
        lblJunSalry.setBounds(10, 86, 60, 21);
        lblJunPltfrm.setBounds(10, 22, 70, 21);
        lblJunIntrvwr.setBounds(10, 54, 117, 21);
        lblJunWrkHr.setBounds(332, 54, 90, 21);
        lblJunAppointBy.setBounds(273, 22, 83, 21);
        lblJunTerminate.setBounds(176, 86, 104, 21);
        lblJunDevName.setBounds(10, 22, 110, 21);
        lblJunAppointDate.setBounds(253, 54, 94, 21);
        lblJunSpecialization.setBounds(10, 54, 84, 21);
        lblJunTermDate.setBounds(10, 86, 120, 21);
        lblJunPltfrmNum.setBounds(253, 86, 79, 21);

        txtSenIntrvwr.setBounds(135, 54, 350, 21);
        txtSenPltfrm.setBounds(135, 22, 136, 21);
        txtSenWrkHr.setBounds(368, 22, 117, 21);
        txtSenSalry.setBounds(73, 86, 99, 21);
        txtSenContPrd.setBounds(280, 86, 76, 21);
        txtSenDevName.setBounds(125, 22, 360, 21);
        txtSenAdvsalry.setBounds(355, 86, 130, 21);
        txtSenPltfrmNum.setBounds(110, 54, 140, 21);
        txtSenStaffRoomNo.setBounds(355, 54, 130, 21);
        txtSenJoinDate.setBounds(110, 86, 140, 21);
        txtJunSalry.setBounds(73, 86, 97, 21);
        txtJunPltfrm.setBounds(132, 22, 136, 21);
        txtJunIntrvwr.setBounds(132, 54, 196, 21);
        txtJunWrkHr.setBounds(425, 54, 60, 21);
        txtJunAppointBy.setBounds(357, 22, 128, 21);
        txtJunTerminate.setBounds(284, 86, 79, 21);
        txtJunDevName.setBounds(125, 22, 360, 21);
        txtJunAppointDate.setBounds(352, 54, 133, 21);
        txtJunSpecialization.setBounds(110, 54, 133, 21);
        txtJunTermDate.setBounds(110, 86, 133, 21);
        txtJunPltfrmNum.setBounds(352, 86, 133, 21);

        btnAddS.setBounds(366, 82, 119, 29);
        btnDisplay.setBounds(414, 330, 95, 29);
        btnClear.setBounds(548,330,95,29);
        btnSenAppoint.setBounds(280, 114, 95, 29);
        btnTerminate.setBounds(390, 114, 95, 29);
        btnAddJ.setBounds(370, 82, 115, 29);
        btnJunAppoint.setBounds(390, 114, 95, 29);

        //Adding required panels and buttons to the main frame
        frame.getContentPane().add(senDev);
        frame.getContentPane().add(senDevPltPanel);
        frame.getContentPane().add(junDev);
        frame.getContentPane().add(junDevPltPanel);
        frame.getContentPane().add(btnDisplay);
        frame.getContentPane().add(btnClear);
        
        //Creating actionlistener to the buttons
        btnAddS.addActionListener(this);
        btnSenAppoint.addActionListener(this);
        btnTerminate.addActionListener(this);
        btnAddJ.addActionListener(this);
        btnJunAppoint.addActionListener(this);
        btnDisplay.addActionListener(this);
        btnClear.addActionListener(this);
        
        frame.setSize(1073,419);
        frame.setVisible(true);  
    }
    /*
     * Action Performed method to validate events listened to.
     * Also to define the action triggers for each events.
     */
    public void actionPerformed(ActionEvent e)
    {
        //For the Add for senior button
        if(e.getSource().equals(btnAddS)){
            try{
                /*
                 * Check if the Platform already exists in the ArrayList
                 * Comparison of working hours, salary and contract period
                 * Using try catch to catch the exceptions NumberFormatException and Exception
                 */
                String seniorPlatform = txtSenPltfrm.getText();
                String seniorInterviewer = txtSenIntrvwr.getText();
                int seniorWorkingHr = Integer.parseInt(txtSenWrkHr.getText());
                int seniorSalary = Integer.parseInt(txtSenSalry.getText());
                int seniorContractPrd = Integer.parseInt(txtSenContPrd.getText());
                if ( seniorWorkingHr < 12 || seniorSalary < 5000 || seniorContractPrd < 3 ){
                    throw new Exception ( "The Working Hours should be more than 12 hours.\nSalary should start from 5000 and Minimum Contract Period is 3 months." );
                }
                SeniorDeveloper seniorPltfrmInfo = new SeniorDeveloper(seniorPlatform, seniorInterviewer, seniorSalary, seniorWorkingHr, seniorContractPrd);
                list.add(seniorPltfrmInfo);
                JOptionPane.showMessageDialog(frame,"Platform "+ seniorPlatform + " has been added successfully.","Add for Senior",JOptionPane.INFORMATION_MESSAGE);
            }
            catch(NumberFormatException emptyNumExc){
                JOptionPane.showMessageDialog(frame,"Please fill in all of the text fields.\nSalary, Working Hours and Contract Period must be in number.","Error",JOptionPane.ERROR_MESSAGE);   
            }
            catch (Exception allExc){
                JOptionPane.showMessageDialog(frame, allExc.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        //For the Appoint Button for Senior Developer
        if (e.getSource().equals(btnSenAppoint)){
            try{
                /*
                 * Check if the Platform number is more than 0 or exists in the ArrayList
                 * Comparison of advance salary with salary 
                 * Using try catch to catch the exceptions NumberFormatException, IndexOutOfBoundsException and Exception
                 */
                String seniorDevName = txtSenDevName.getText();
                String seniorJoinDate = txtSenJoinDate.getText();
                int seniorAdvSalary = Integer.parseInt(txtSenAdvsalry.getText());
                String seniorStaffRoomNo = txtSenStaffRoomNo.getText();
                int seniorPltfrmNum = ((Integer.parseInt(txtSenPltfrmNum.getText()))-1);
                if(seniorPltfrmNum>0 || seniorPltfrmNum<=list.size()){
                    if(list.get(seniorPltfrmNum) instanceof SeniorDeveloper){
                        SeniorDeveloper seniorDev = (SeniorDeveloper)list.get(seniorPltfrmNum);
                        if ( seniorDev.getSalary() < seniorAdvSalary ){
                            throw new Exception("Advance salary cannot be more than Salary.");
                        }
                        seniorDev.hireSeniorDeveloper(seniorDevName, seniorJoinDate, seniorAdvSalary, seniorStaffRoomNo);
                        JOptionPane.showMessageDialog(frame, seniorDevName+" has been appointed as a Senior Developer.","Appoint",JOptionPane.INFORMATION_MESSAGE);
                    }                    
                }
            }
            catch(NumberFormatException emptyNumExc){
                JOptionPane.showMessageDialog(frame,"Please fill in all of the text fields.\nAdvance Salary and Platform Number must be in number.","Error",JOptionPane.ERROR_MESSAGE);
            }
            catch (IndexOutOfBoundsException pltfrmExc){
                JOptionPane.showMessageDialog(frame, "Platform Number not available.\nPlease enter a valid Platform Number.","Error",JOptionPane.ERROR_MESSAGE);
            }
            catch (Exception salExc){
                JOptionPane.showMessageDialog(frame, salExc.getMessage() ,"Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        //For the Terminate Button for Senior Developer
        if (e.getSource().equals(btnTerminate)){
            try{
                /*
                 * Check if the senior developer is already appointed
                 * Comparison of working hours, salary and contract period
                 * Using try catch to catch the exceptions IndexOutOfBoundsException and Exception
                 */
                int seniorPltfrmNum = ((Integer.parseInt(txtSenPltfrmNum.getText()))-1);
                SeniorDeveloper seniorDevObj = (SeniorDeveloper)list.get(seniorPltfrmNum);
                if (seniorDevObj.getAppointed()==(true)){
                    seniorDevObj.contractTermination();
                    JOptionPane.showMessageDialog(frame, "Senior Developer has been terminated successfully","Terminate",JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(frame, "No developer appointed in this Platform.\nPlease enter a valid Platform Number.","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
            catch (IndexOutOfBoundsException pltfrmExc){
                JOptionPane.showMessageDialog(frame, "Platform not available.\nPlease enter a valid Platform Number.","Error",JOptionPane.ERROR_MESSAGE);
            }
            catch(Exception emptyExc){
                JOptionPane.showMessageDialog(frame,"Please fill in all of the fields.\nValid Platform No. is required for termination.","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        //For the Add for junior button
        if (e.getSource().equals(btnAddJ)){
            try{
                /*
                 * Check if the Platform already exists in the ArrayList
                 * Comparison of working hours and salary
                 * Using try catch to catch the exceptions NumberFormatException and Exception
                 */
                String juniorPlatform = txtJunPltfrm.getText();
                String juniorInterviewer = txtJunIntrvwr.getText();
                int juniorWorkingHr = Integer.parseInt(txtJunWrkHr.getText());
                int juniorSalary = Integer.parseInt(txtJunSalry.getText());
                String juniorAppointed = txtJunAppointBy.getText();
                String juniorTermination = txtJunTerminate.getText();
                if (juniorWorkingHr < 12 || juniorSalary < 5000){
                    throw new Exception ( "The Working Hours should be within 12 hours and Salary should start from 5000." );
                }
                JuniorDeveloper juniorPltfrmInfo = new JuniorDeveloper(juniorPlatform, juniorInterviewer, juniorWorkingHr, juniorSalary, juniorAppointed, juniorTermination);
                list.add(juniorPltfrmInfo);
                JOptionPane.showMessageDialog(frame,"Platform "+ juniorPlatform + " has been added successfully.","Add for Junior",JOptionPane.INFORMATION_MESSAGE);
            }
            catch (NumberFormatException emptyNumExc){
                JOptionPane.showMessageDialog(frame,"Please fill in all of the text fields.\nSalary and Working Hours must be in number.","Error",JOptionPane.ERROR_MESSAGE);   
            }
            catch (Exception allExc){
                JOptionPane.showMessageDialog(frame, allExc.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        //For the Appoint Button for Junior Developer
        if (e.getSource().equals(btnJunAppoint)){
            try{
                /*
                 * Check if the Platform number is more than 0 or exists in the ArrayList
                 * Using try catch to catch the exceptions NumberFormatException and IndexOutOfBoundsException
                 */
                String juniorDevName = txtJunDevName.getText();
                String juniorAppointDate = txtJunAppointDate.getText();
                String juniorSpecialization = txtJunSpecialization.getText();
                String juniorTermDate = txtJunTermDate.getText();
                int juniorPltfrmNum = ((Integer.parseInt(txtJunPltfrmNum.getText()))-1);
                if(juniorPltfrmNum>0 || juniorPltfrmNum<=list.size()){
                    if(list.get(juniorPltfrmNum) instanceof JuniorDeveloper){
                        JuniorDeveloper juniorDev = (JuniorDeveloper) list.get(juniorPltfrmNum);
                        juniorDev.hireJuniorDeveloper (juniorDevName, juniorAppointDate, juniorTermDate, juniorSpecialization);
                        JOptionPane.showMessageDialog(frame, juniorDevName+" has been appointed as a Junior Developer.","Appoint",JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
            catch(NumberFormatException emptyNumExc){
                JOptionPane.showMessageDialog(frame,"Please fill in all of the text fields.\nPlatform Number must be in number.","Error",JOptionPane.ERROR_MESSAGE);
            }
            catch (IndexOutOfBoundsException pltfrmExc){
                JOptionPane.showMessageDialog(frame, "Platform Number not available.\nPlease enter a valid Platform Number.","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        //For the Display Button of both Junior and Senior Developers
        if(e.getSource().equals(btnDisplay)){
            /*
             * Check if the ArrayList is empty or not 
             * Check if senior developer exists in the ArrayList
             * Check if junior developer exists in the ArrayList
             */
            if (!list.isEmpty()){
                for (Developer dev: list){
                    if(dev instanceof SeniorDeveloper){
                        SeniorDeveloper obj=(SeniorDeveloper)dev;
                        obj.display();
                    }
                    if(dev instanceof JuniorDeveloper){
                        JuniorDeveloper obj1=(JuniorDeveloper)dev;
                        obj1.display();
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(frame,"Nothing to Display!!!","Error",JOptionPane.WARNING_MESSAGE);
            }
        }
        //For the Appoint Button 
        if (e.getSource().equals(btnClear)){
            //Simply clears all the text fields
            txtSenPltfrm.setText("");
            txtSenIntrvwr.setText("");
            txtSenSalry.setText("");
            txtSenWrkHr.setText("");
            txtSenContPrd.setText("");
            txtSenDevName.setText("");
            txtSenAdvsalry.setText("");
            txtSenPltfrmNum.setText("");
            txtSenStaffRoomNo.setText("");
            txtSenJoinDate.setText("");
            txtJunSalry.setText("");
            txtJunPltfrm.setText("");
            txtJunIntrvwr.setText("");
            txtJunWrkHr.setText("");
            txtJunAppointBy.setText("");
            txtJunTerminate.setText("");
            txtJunDevName.setText("");
            txtJunAppointDate.setText("");
            txtJunSpecialization.setText("");
            txtJunTermDate.setText("");
            txtJunPltfrmNum.setText("");
            JOptionPane.showMessageDialog(frame,"All Field(s) Cleared.","Clear",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
