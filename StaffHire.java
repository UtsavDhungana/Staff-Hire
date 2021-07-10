/**
 * A parent class StaffHire is created with attributes vacancyNumber, designation and jobType.
 *
 * @author : Utsav Dhungana
 * @date : January 13, 2020
 */
public class StaffHire{
    private int vacancyNumber;
    private String designation;
    private String jobType;
    
    
    //paramaterized constructor
    public StaffHire(int vacancyNumber, String designation, String jobType){
    this.vacancyNumber = vacancyNumber;
    this.designation = designation;
    this.jobType = jobType;
    }
    
    //getter methods
    public int getVacancyNumber(){
        return vacancyNumber;
    }
    
    public String getDesignation(){
        return designation;
    }
    
    public String getJobType(){
        return jobType;
    }
    
    //setter methods
    public void setVacancyNumber(int vacancyNumber){
        this.vacancyNumber = vacancyNumber;
    }
    
    public void setDesignation(String designation){
        this.designation = designation;
    }
    
    public void setJobType(String jobType){
        this.jobType = jobType;
    }
    
    //method to display the details of staff
    public void display(){
        System.out.println("Vacancy Number : " + vacancyNumber);
        System.out.println("Designation : " + designation);
        System.out.println("Job Type : " + jobType);
    }
}