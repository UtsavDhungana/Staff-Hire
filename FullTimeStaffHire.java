/**
 * A child class FullTimeStaffHire is created that extends StaffHire class.
 *
 * @author : Utsav Dhungana
 * @date : January 13,2020
 */
public class FullTimeStaffHire extends StaffHire {
    private int salary;
    private int workingHours;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;
    
    //parameterized constructure
    public FullTimeStaffHire(int vacancyNumber, String designation, String jobType, int salary, int workingHours){
        super(vacancyNumber, designation, jobType);
        this.salary = salary;
        this.workingHours = workingHours;
        this.staffName = "";
        this.joiningDate = "";
        this.qualification = "";
        this.appointedBy = "";
        this.joined = false;
    }
    
    //getter method
    public int getSalary(){
        return salary;
    }
    
    public int getWorkingHours(){
        return workingHours;
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
    
    public boolean hasJoined(){
        return joined;
    }
    
    //setter method
    public void setSalary(int salary){
        //assign new value to the salary attributes if the staff has not joined else give suitable message as output to the user.
        if(!joined){
            this.salary = salary;
        }else{
            System.out.println("The Staff is already apppointed, it is therefore not possible to change the salary");
        }
    }
    
    public void setWorkingHours(int workingHours){
        //assign new value to the working hours attribute.
        this.workingHours = workingHours;
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
    
    public void setJoined(boolean joined){
        this.joined = joined;
    } 
    
    //method to hire full time staff
    public void hireFullTimeStaff(String staffName, String joiningDate, String qualification, String appointedBy){
        //assigned new value to the staffName, joiningDate, qualification, appointedBy and assign joiningStatement as true if the staff has not joined else give suitable message as output to the user.  
        if(!joined){
            this.staffName = staffName;
            this.joiningDate = joiningDate;
            this.qualification = qualification;
            this.appointedBy = appointedBy;
            this.joined = true;
        }else{
            System.out.println(staffName + " has a qualification of " + qualification + " and was appointed by " + appointedBy + " on " + joiningDate);  
        }
    }
    
    //method to display the details of staff
    public void display(){
        super.display();
        //display the details of the staff only if the staff has already joined.
        if(joined){
            System.out.println("Staff Name : " + staffName);
            System.out.println("Salary : " + salary);
            System.out.println("Working Hours : " + workingHours);
            System.out.println("Joining Date : " + joiningDate);
            System.out.println("Qualification : " + qualification);
            System.out.println("Appointed By : " + appointedBy);
        }
    }
}