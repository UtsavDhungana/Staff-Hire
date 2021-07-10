/**
 * A child class PartTimeStaffHire is created that extends StaffHire class.
 *
 * @author : Utsav Dhungana
 * @date : January 13, 2020
 */

import javax.swing.JOptionPane;

public class PartTimeStaffHire extends StaffHire {
    private int workingHours;
    private int wagesPerHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private String shifts;
    private boolean joined;
    private boolean terminated;
   
    
    //parameterized constructor
    public PartTimeStaffHire(int vacancyNumber, String designation, String jobType, int workingHours, int wagesPerHour, String shifts){
        super(vacancyNumber, designation, jobType);
        this.workingHours = workingHours;
        this.wagesPerHour = wagesPerHour;
        this.shifts = shifts;
        this.staffName = "";
        this.joiningDate = "";
        this.qualification = "";
        this.appointedBy = "";
        this.joined = false;
        
    }
    
    //getter methods
    public int getWorkingHours(){
        return workingHours;
    }
    
    public int getWagesPerHour(){
        return wagesPerHour;
    }
    
    public String getStaffName(){
        return staffName;
    }
    
    public String getJoiningDate(){
        return joiningDate;
    }
    
    public String getQualification(){
        return qualification;
    }
    
    public String getAppointedBy(){
        return appointedBy;
    }
    
    public String getShifts(){
        return shifts;
    }
    
    public boolean hasJoined(){
        return joined;
    }
    
    public boolean isTerminated(){
        return terminated;
    }
    
    //setter methods
    public void setWorkingHours(int workingHours){
        this.workingHours = workingHours;
    }
    
    public void setWagesPerHour(int wagesPerHour){
        this.wagesPerHour = wagesPerHour;
    }
    
    public void setStaffName(String staffName){
        this.staffName = staffName;
    }
    
    public void setJoiningDate(String joiningDate){
        this.joiningDate = joiningDate;
    }
    
    public void setQualification(String qualification){
        this.qualification = qualification;
    }
    
    public void setAppointedBy(String appointedBy){
        this.appointedBy = appointedBy;
    }
    
    public void setShifts(String shifts){
        //assign the new value to the shifts attributes if the staff has not joined else give suitable message as output to the user. 
        if(!joined){
            this.shifts = shifts;
        }else{
            System.out.println("The staff is already assigned with the working shifts");    
        }
    }
    
    public void setJoined(boolean joined){
        this.joined = joined;
    }
    
    public void setTerminated(boolean terminated){
        this.terminated = terminated;
    }
    
    //method to hire part time staff
    public void hirePartTimeStaff(String staffName, String joiningDate, String qualification, String appointedBy){
        //assigned new value to the staffName, joiningDate, qualification, appointedBy and assign joined as true and terminated as false if the staff has not joined else give suitable message as output to the user.
        if(!joined){
            this.staffName = staffName;
            this.joiningDate = joiningDate;
            this.qualification = qualification;
            this.appointedBy = appointedBy;
            this.joined = true;
            this.terminated = false;
        }else{
            System.out.println(staffName + " has already joined on " + joiningDate + ".");
        }
    }
    
    //method to terminate the staff
    public void terminateStaff(){
        //assigned empty string to the staffName, joiningDate, qualification, appointedBy assign joined as false and terminated as true if the staff has not been terminated else give suitable message as output to the user. 
        if(!terminated){
            String a = getStaffName();
            
            
            this.staffName = "";
            this.joiningDate = "";
            this.qualification = "";
            this.appointedBy = "";
            this.joined = false;
            this.terminated = true;
            
            System.out.println(a + " has been terminated");
            // JOptionPane.showMessageDialog(null, a + " has been terminated.", 
            // "Info", 1);
        }else{
            System.out.println("The staff has already been terminated.");
            // JOptionPane.showMessageDialog(frame, "The staff has already been terminated.", 
            // "Info", 1);
        }
    }
        
    //method to display the details of staff
    public void display(){
        super.display();
        //display the details of the staff only if the staff has already joined.
        if(joined){
            System.out.println("Staff Name : " + staffName);
            System.out.println("Wages Per Hour :" + wagesPerHour);
            System.out.println("Working Hours :" + workingHours);
            System.out.println("Joining Date :" + joiningDate);
            System.out.println("Qualification :" + qualification);
            System.out.println("Appointed By :" + appointedBy);
            System.out.println("Income Per Day :" + (wagesPerHour*workingHours));
            
            // JOptionPane.showMessageDialog(frame, "Staff Name : " + staffName + 
            // "\nWages Per Hour :" + wagesPerHour + "\nWorking Hours :" + workingHours + 
            // "\nJoining Date :" + joiningDate + "\nQualification :" + qualification + 
            // "\nAppointed By :" + appointedBy + "\nIncome Per Day :" + (wagesPerHour*workingHours));
        }
    } 
}