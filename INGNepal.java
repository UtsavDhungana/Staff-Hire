/**
 * The class INGNepal consists of code for the GUI and its validation.
 *
 * @author : Utsav Dhungana
 * @date : April 17, 2020
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;
import javax.swing.border.Border;

import java.util.ArrayList;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;




public class INGNepal{
    private JFrame frame;
    
    private JPanel panel1, panel2, panel3;
    
    private JLabel lblBody1, lblBody2, lblVacancyNumFT1, lblVacancyNumFT2 , 
    lblDesignation, lblJobType, lblSalary, lblWorkingHour, lblStaffName, lblJoiningDate, lblQualification, 
    lblAppointedBy, lblVacancyNumPT1,lblVacancyNumPT2,lblVacancyNumPT3,lblDesignationPT,
    lblJobTypePT, lblWorkingHourPT, lblWagesPT, lblShiftPT, lblStaffNamePT, lblJoiningDatePT, lblQualificationPT,
    lblAppointedByPT , lblTerminate; 
    
    private JTextField tfVacancyNumFT1, tfVacancyNumFT2,tfDesignation, tfJobType, tfSalary,tfWorkingHour, tfStaffName,
    tfQualification, tfJoiningDate, tfAppointedBy, tfVacancyNumPT1, tfVacancyNumPT2, tfVacancyNumPT3,
    tfDesignationPT, tfJobTypePT, tfWorkingHourPT, tfWagesPT, tfShiftPT, tfStaffNamePT, 
    tfQualificationPT, tfAppointedByPT, tfJoiningDatePT;
    
    private JButton btnPartTimeSH, btnFullTimeSH, btnAdd, btnAppoint, btnDisplay, btnClear,
    btnPrevious, btnAddPT, btnAppointPT, btnClearPT, btnDisplayPT, btnPreviousPT , btnTerminate;
    
    private ArrayList <StaffHire> ad = new ArrayList<>();
    
    
    
    public INGNepal(){
        initializeFrame();
        initializePanel1();
        initializePanel2();
        initializePanel3();
        initializeMenu();
        initializeFont();
    }
    
    private void initializeFrame(){
        frame = new JFrame("Hire Staff");
        frame.setSize(620, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
    }
    
    private void initializePanel1(){
        panel1 = new JPanel();
        panel1.setBounds(10, 45, 585, 205);
        panel1.setLayout(null);
        frame.getContentPane().add(panel1);
        
        
        //Initializing the Border
        TitledBorder title;
        Border blackline = BorderFactory.createLineBorder(Color.black);
        title = BorderFactory.createTitledBorder(blackline, "Welcome to Staff Hire", 
        TitledBorder.CENTER, TitledBorder.TOP, new Font("Times New Romance", Font.BOLD,40));
        panel1.setBorder(title);
        
        //Initializing the Border
        lblBody1 = new JLabel("Click here to hire Full Time Staff");
        lblBody1.setBounds(15, 100, 300, 40 );
        panel1.add(lblBody1);
        
        lblBody2 = new JLabel("Click here to hire Part Time Staff");
        lblBody2.setBounds(330, 100, 300, 40);
        panel1.add(lblBody2);
        
        //Initializing the Buttons
        btnFullTimeSH = new JButton("Full Time Staff");
        btnFullTimeSH.setBounds(30, 140, 200, 30);
        panel1.add(btnFullTimeSH);
        btnFullTimeSH.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae){
                frame.setSize(600, 770);
                panel1.setVisible(false);
                panel3.setVisible(false);
                panel2.setVisible(true);
                frame.setTitle("Hire Full Time Staff");
                
                
            }
        
        
        });
        
        btnPartTimeSH = new JButton("Part Time Staff ");
        btnPartTimeSH.setBounds(350, 140, 200, 30);
        panel1.add(btnPartTimeSH);
        btnPartTimeSH.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae){
                frame.setSize(600, 920);
                panel1.setVisible(false);
                panel2.setVisible(false);
                panel3.setVisible(true);
                frame.setTitle("Hire Part Time Staff");
                
            }
        
        });
        
        
        panel1.setVisible(true);
    }
    
    private void initializePanel2(){
        //Initialize main panel 
        panel2 = new JPanel();
        panel2.setBounds(0, 40, 600, 820);
        panel2.setLayout(null);
        frame.getContentPane().add(panel2); 
        
        //initializing panels for Using Border
        JPanel panelBorder1 = new JPanel();
        panelBorder1.setBounds(5, 8, 570, 280);
        panelBorder1.setLayout(null);
        panel2.add(panelBorder1);
        
        JPanel panelBorder2 = new JPanel();
        panelBorder2.setBounds(5, 300, 570, 280);
        panelBorder2.setLayout(null);
        panel2.add(panelBorder2);
        
        //initializing title Border
        TitledBorder title;
        Border blackline = BorderFactory.createLineBorder(Color.black);
        title = BorderFactory.createTitledBorder(blackline, "Add Full Time Staff", 
        TitledBorder.CENTER, TitledBorder.TOP, new Font("Times New Romance", Font.BOLD,15));
        panelBorder1.setBorder(title);
        
        TitledBorder title1;
        title1 = BorderFactory.createTitledBorder(blackline, "Appoint Full Time Staff", 
        TitledBorder.CENTER, TitledBorder.TOP, new Font("Times New Romance", Font.BOLD,15));
        panelBorder2.setBorder(title1);
        
        //initializing the labels to panelBorder1
        lblVacancyNumFT1 = new JLabel("Vacancy Number : ");
        lblVacancyNumFT1.setBounds(10, 20, 300, 30);
        panelBorder1.add(lblVacancyNumFT1);
        
        lblDesignation = new JLabel("Designation : ");
        lblDesignation.setBounds(10, 60, 300, 30);
        panelBorder1.add(lblDesignation);
        
        lblJobType = new JLabel("Job Type : ");
        lblJobType.setBounds(10, 100, 300, 30);
        panelBorder1.add(lblJobType);
        
        lblSalary = new JLabel("Salary : ");
        lblSalary.setBounds(10, 140, 300, 30);
        panelBorder1.add(lblSalary);
        
        lblWorkingHour = new JLabel("Working Hours Per Day : ");
        lblWorkingHour.setBounds(10, 180, 300, 30);
        panelBorder1.add(lblWorkingHour);
        
        //initializing the labels to panelBorder1
        lblVacancyNumFT2 = new JLabel("Vacancy Number : ");
        lblVacancyNumFT2.setBounds(10, 20, 300, 30);
        panelBorder2.add(lblVacancyNumFT2);
        
        lblStaffName = new JLabel("Staff Name : ");
        lblStaffName.setBounds(10, 60, 300, 30);
        panelBorder2.add(lblStaffName);
        
        lblJoiningDate = new JLabel("Joining Date : ");
        lblJoiningDate.setBounds(10, 100, 300, 30);
        panelBorder2.add(lblJoiningDate);
        
        lblQualification = new JLabel("Qualification : ");
        lblQualification.setBounds(10, 140, 300, 30);
        panelBorder2.add(lblQualification);
        
        lblAppointedBy = new JLabel("Appointed By : ");
        lblAppointedBy.setBounds(10, 180, 300, 30);
        panelBorder2.add(lblAppointedBy);
        
        //initializing the Text Fields to paenlBorder1
        tfVacancyNumFT1 = new JTextField();
        tfVacancyNumFT1.setBounds(230, 25, 300, 25);
        panelBorder1.add(tfVacancyNumFT1);
        
        tfDesignation = new JTextField();
        tfDesignation.setBounds(230, 65, 300, 25);
        panelBorder1.add(tfDesignation);
        
        tfJobType = new JTextField();
        tfJobType.setBounds(230, 105, 300, 25);
        panelBorder1.add(tfJobType);
        
        tfSalary = new JTextField();
        tfSalary.setBounds(230, 145, 300, 25);
        panelBorder1.add(tfSalary);
        
        tfWorkingHour = new JTextField();
        tfWorkingHour.setBounds(230, 185, 300, 25);
        panelBorder1.add(tfWorkingHour);
        
        //initializing the Text Fields to paenlBorder1
        tfVacancyNumFT2 = new JTextField();
        tfVacancyNumFT2.setBounds(230, 25, 300, 25);
        panelBorder2.add(tfVacancyNumFT2);
        
        tfStaffName = new JTextField();
        tfStaffName.setBounds(230, 65, 300, 25);
        panelBorder2.add(tfStaffName);
        
        tfJoiningDate = new JTextField();
        tfJoiningDate.setBounds(230, 105, 300, 25);
        panelBorder2.add(tfJoiningDate);
        
        tfQualification = new JTextField();
        tfQualification.setBounds(230, 145, 300, 25);
        panelBorder2.add(tfQualification);
        
        tfAppointedBy = new JTextField();
        tfAppointedBy.setBounds(230, 185, 300, 25);
        panelBorder2.add(tfAppointedBy);
        
        //initializing the button to panelBorder1
        btnAdd = new JButton("Add");
        btnAdd.setBounds(200, 235, 150, 30);
        panelBorder1.add(btnAdd);
        btnAdd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                addButtonFT();
                clearButtonFT();
            }
        
        });
        
        //initializing the button to panelBorder2
        btnAppoint = new JButton("Appoint");
        btnAppoint.setBounds(210, 235, 150, 30);
        panelBorder2.add(btnAppoint);
        btnAppoint.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                appointFT();
                clearButtonFT();
            }
        
        });
        
        //initializing the buttons to panel2
        btnDisplay = new JButton("Display");
        btnDisplay.setBounds(340, 600, 200, 30);
        panel2.add(btnDisplay);
        btnDisplay.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
               displayFT();
            }
        });
        
        btnClear = new JButton("Clear");
        btnClear.setBounds(40, 600, 200, 30);
        panel2.add(btnClear);
        btnClear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                clearButtonFT();
            }
        });
        
        btnPrevious = new JButton("Return to the previous panel");
        btnPrevious.setBounds(140, 650, 300, 30);
        panel2.add(btnPrevious);
        btnPrevious.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                frame.setSize(620, 300);
                panel1.setVisible(true);
                panel2.setVisible(false);
                panel3.setVisible(false);
                frame.setTitle("Hire Staff");
                
            }
        });
        
        
        panel2.setVisible(false);
    }
    
    private void initializePanel3(){
        panel3 = new JPanel();
        panel3.setBounds(0, 30, 600, 920);
        panel3.setLayout(null);
        frame.getContentPane().add(panel3);
        
        //initializimng panels for using borders
        JPanel panelBorder1 = new JPanel();
        panelBorder1.setBounds(5, 8, 570, 310);
        panelBorder1.setLayout(null);
        panel3.add(panelBorder1);
        
        JPanel panelBorder2 = new JPanel();
        panelBorder2.setBounds(5, 330, 570, 270);
        panelBorder2.setLayout(null);
        panel3.add(panelBorder2);
        
        JPanel panelBorder3 = new JPanel();
        panelBorder3.setBounds(5, 655, 570, 150);
        panelBorder3.setLayout(null);
        panel3.add(panelBorder3);

        
        //initializing title Border
        TitledBorder title;
        Border blackline = BorderFactory.createLineBorder(Color.black);
        title = BorderFactory.createTitledBorder(blackline, "Add Part Time Staff", 
        TitledBorder.CENTER, TitledBorder.TOP, new Font("Times New Romance", Font.BOLD,15));
        panelBorder1.setBorder(title);
        
        TitledBorder title1;
        title1 = BorderFactory.createTitledBorder(blackline, "Appoint Part Time Staff", 
        TitledBorder.CENTER, TitledBorder.TOP, new Font("Times New Romance", Font.BOLD,15));
        panelBorder2.setBorder(title1);
        
        TitledBorder title2;
        title2 = BorderFactory.createTitledBorder(blackline, "Terminate Part Time Staff", 
        TitledBorder.CENTER, TitledBorder.TOP, new Font("Times New Romance", Font.BOLD,15));
        panelBorder3.setBorder(title2);
        
        //initializing the Labels for panelBorder1
        lblVacancyNumPT1 = new JLabel("Vacancy Number : ");
        lblVacancyNumPT1.setBounds(10, 20, 300, 30);
        panelBorder1.add(lblVacancyNumPT1);
        
        lblDesignationPT = new JLabel("Designation : ");
        lblDesignationPT.setBounds(10, 60, 300, 30);
        panelBorder1.add(lblDesignationPT);
        
        lblJobTypePT = new JLabel("Job Type : ");
        lblJobTypePT.setBounds(10, 100, 300, 30);
        panelBorder1.add(lblJobTypePT);
        
        lblWorkingHourPT = new JLabel("Working Hours Per Day : ");
        lblWorkingHourPT.setBounds(10, 140, 300, 30);
        panelBorder1.add(lblWorkingHourPT);
        
        lblWagesPT = new JLabel("Wages Per Hour : ");
        lblWagesPT.setBounds(10, 180, 300, 30);
        panelBorder1.add(lblWagesPT);
        
        lblShiftPT = new JLabel("Shift : ");
        lblShiftPT.setBounds(10, 220, 300, 30);
        panelBorder1.add(lblShiftPT);
        
        //initializing the Labels for panelBorder2
        lblVacancyNumPT2 = new JLabel("Vacancy Number : ");
        lblVacancyNumPT2.setBounds(10, 20, 300, 30);
        panelBorder2.add(lblVacancyNumPT2);
        
        lblStaffNamePT = new JLabel("Staff Name : ");
        lblStaffNamePT.setBounds(10, 60, 300, 30);
        panelBorder2.add(lblStaffNamePT);
        
        lblJoiningDatePT = new JLabel("Joining Date : ");
        lblJoiningDatePT.setBounds(10, 100, 300, 30);
        panelBorder2.add(lblJoiningDatePT);
        
        lblQualificationPT = new JLabel("Qualification : ");
        lblQualificationPT.setBounds(10, 140, 300, 30);
        panelBorder2.add(lblQualificationPT);
        
        lblAppointedByPT = new JLabel("Appointed By : ");
        lblAppointedByPT.setBounds(10, 180, 300, 30);
        panelBorder2.add(lblAppointedByPT);
        
        //initializing the Labels for panelBorder1
        lblTerminate = new JLabel ("---------- Enter existing vacancy number for terminatation ---------- ");
        lblTerminate.setBounds(10, 20, 800, 30);
        panelBorder3.add(lblTerminate);
        
        lblVacancyNumPT3 = new JLabel ("Vacancy Number : ");
        lblVacancyNumPT3.setBounds(10, 60, 300, 30 );
        panelBorder3.add(lblVacancyNumPT3);
        
       
        //initializing the Text Fields for panelBorder1
        tfVacancyNumPT1 = new JTextField();
        tfVacancyNumPT1.setBounds(230, 25, 300, 25);
        panelBorder1.add(tfVacancyNumPT1);
        
        tfDesignationPT = new JTextField();
        tfDesignationPT.setBounds(230, 65, 300, 25);
        panelBorder1.add(tfDesignationPT);
        
        tfJobTypePT = new JTextField();
        tfJobTypePT.setBounds(230, 105, 300, 25);
        panelBorder1.add(tfJobTypePT);
        
        tfWorkingHourPT = new JTextField();
        tfWorkingHourPT.setBounds(230, 145, 300, 25);
        panelBorder1.add(tfWorkingHourPT);
        
        tfWagesPT = new JTextField();
        tfWagesPT.setBounds(230, 185, 300, 25);
        panelBorder1.add(tfWagesPT);
        
        tfShiftPT = new JTextField();
        tfShiftPT.setBounds(230, 225, 300, 25);
        panelBorder1.add(tfShiftPT);
        
        //initializing the Text Fields for panelBorder2
        tfVacancyNumPT2 = new JTextField();
        tfVacancyNumPT2.setBounds(230, 25, 300, 25);
        panelBorder2.add(tfVacancyNumPT2);
        
        tfStaffNamePT = new JTextField();
        tfStaffNamePT.setBounds(230, 65, 300, 25);
        panelBorder2.add(tfStaffNamePT);
        
        tfJoiningDatePT = new JTextField();
        tfJoiningDatePT.setBounds(230, 105, 300, 25);
        panelBorder2.add(tfJoiningDatePT);
        
        tfQualificationPT = new JTextField();
        tfQualificationPT.setBounds(230, 145, 300, 25);
        panelBorder2.add(tfQualificationPT);
        
        tfAppointedByPT = new JTextField();
        tfAppointedByPT.setBounds(230, 185, 300, 25);
        panelBorder2.add(tfAppointedByPT);
        
        //initializing the Text Fields for panelBorder3
        tfVacancyNumPT3 = new JTextField();
        tfVacancyNumPT3.setBounds(230, 65, 300, 25);
        panelBorder3.add(tfVacancyNumPT3);
        
        //initializing the Button for panelBorder1
        btnAddPT = new JButton("Add");
        btnAddPT.setBounds(200, 270, 150, 30);
        panelBorder1.add(btnAddPT);
        btnAddPT.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
               addButtonPT();
               clearButtonPT();
            }
        });
        
        //initializing the Text Fields for panelBorder2
        btnAppointPT = new JButton("Appoint");
        btnAppointPT.setBounds(210, 230, 150, 30);
        panelBorder2.add(btnAppointPT);
        btnAppointPT.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
               appointPT();
               clearButtonPT();
            }
        });
        
         //initializing the buttons to panel3
        btnDisplayPT = new JButton("Display");
        btnDisplayPT.setBounds(340, 615, 200, 30);
        panel3.add(btnDisplayPT);
        btnDisplayPT.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
               displayPT();
            }
        });
        
        btnClearPT = new JButton("Clear");
        btnClearPT.setBounds(40, 615, 200, 30);
        panel3.add(btnClearPT);
        btnClearPT.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                clearButtonPT();
            }
        });
        
        btnPreviousPT = new JButton("Return to the previous panel");
        btnPreviousPT.setBounds(140, 815, 300, 30);
        panel3.add(btnPreviousPT);
        btnPreviousPT.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                frame.setSize(620, 300);
                panel1.setVisible(true);
                panel2.setVisible(false);
                panel3.setVisible(false);
                frame.setTitle("Hire Staff");
            }
        });
        
        //initializing the buttons to panelBorder3
        btnTerminate = new JButton("Terminate");
        btnTerminate.setBounds(210, 110, 150, 25);
        panelBorder3.add(btnTerminate);  
        btnTerminate.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                terminatePT();
                clearButtonPT();
            }
        });
        
        panel3.setVisible(false);
    }
    
    private void initializeMenu(){
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBounds(0,0, 800, 40);
        frame.add(menuBar);
        
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);
        
        JMenu aboutMenu = new JMenu("About");
        menuBar.add(aboutMenu);
        
        JMenuItem miNew = new JMenuItem("New");
        fileMenu.add(miNew);
        fileMenu.addSeparator();
        miNew.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                clearButtonFT();
                clearButtonPT();
            }
        });
        
        JMenuItem miExit = new JMenuItem("Exit");
        fileMenu.add(miExit);
        miExit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                int n = JOptionPane.showConfirmDialog(frame,"Do you want to close this application?"
                , "Close Application", JOptionPane.YES_NO_OPTION);
                if(n == (JOptionPane.YES_OPTION)){
                    System.exit(0);
                }
            }   
        });
        
        JMenuItem miApp = new JMenuItem("App");
        aboutMenu.add(miApp);
        aboutMenu.addSeparator();
        miApp.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae){
                JOptionPane.showMessageDialog(frame, "Version 2.0.1 ", "Version", 1);
            }   
        });
        
        JMenuItem miDeveloper = new JMenuItem("Developer");
        aboutMenu.add(miDeveloper);
        miDeveloper.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae){
                JOptionPane.showMessageDialog(frame, "Name : Utsav Dhungana" 
                + "\nEmail : utsav.dhungana123@gmail.com" + "\nContact No : 9800903394 ", "Details", 1);
            }           
        });
        
    }
    
    private void clearButtonFT(){
        tfVacancyNumFT1.setText("");
        tfDesignation.setText("");
        tfJobType.setText("");
        tfSalary.setText("");
        tfWorkingHour.setText("");
        tfStaffName.setText("");
        tfJoiningDate.setText("");
        tfQualification.setText("");
        tfAppointedBy.setText("");
        tfVacancyNumFT2.setText("");
        
    }
    
    private void clearButtonPT(){
        tfVacancyNumPT1.setText("");
        tfDesignationPT.setText("");
        tfJobTypePT.setText("");
        tfWorkingHourPT.setText("");
        tfWagesPT.setText("");
        tfShiftPT.setText("");
        tfStaffNamePT.setText("");
        tfJoiningDatePT.setText("");
        tfQualificationPT.setText("");
        tfAppointedByPT.setText("");
        tfVacancyNumPT2.setText("");
        tfVacancyNumPT3.setText("");
    }
    
    private void addButtonFT(){
        try{
            String vacancyNumber = tfVacancyNumFT1.getText().trim() ;
            String designation = tfDesignation.getText().trim();
            String jobType = tfJobType.getText().trim();
            String salary = tfSalary.getText().trim();
            String workingHour = tfWorkingHour.getText().trim();
            
            
            
            if ( vacancyNumber.isEmpty() || designation.isEmpty() || jobType.isEmpty() || salary.isEmpty() || workingHour.isEmpty() ){
                JOptionPane.showMessageDialog(frame, "Please fill all the text fields of Add Full Time Staff", "Error", 0);
                
            }
            else{
                int intVacancyNumber = Integer.parseInt(vacancyNumber);
                int intSalary = Integer.parseInt(salary);
                int intWorkingHour = Integer.parseInt(workingHour);
                
                if (intVacancyNumber <= 0 || intSalary <= 0 || intWorkingHour <= 0 ){
                    JOptionPane.showMessageDialog(frame, "Enter a number greater than 0", "Error", 0);
                }
                if(intWorkingHour > 12){
                    JOptionPane.showMessageDialog(frame, "Maximum working hours per day is 12 hrs", "Error", 0);
                }
                else{
                    //here the validateAddButton(int a) method is called, and if the method returns true then if statement is executed and if the method returns false then else statement is executed.
                    if(validateAddButton(intVacancyNumber)){
                        ad.add(new FullTimeStaffHire(intVacancyNumber, designation, jobType, intWorkingHour, intSalary));
                
                        JOptionPane.showMessageDialog(frame, " VacancyNumber : " + intVacancyNumber + "\n Designation : "
                        + designation + "\n Job Type : " + jobType + "\n Salary : " + salary + "\n Working Hour Per Day : "
                        + intWorkingHour ,"Added", 1);
                    }
                    else{
                        JOptionPane.showMessageDialog(frame, "Enter a unique vacancy number", "Error", 0);
                    }
                }    
            }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(frame, "Enter data of appropriate data type", "Error", 0);
        }
    }
    
    private void addButtonPT(){
        try{
            String vacancyNumber1 = tfVacancyNumPT1.getText().trim();
            String designation = tfDesignationPT.getText().trim();
            String jobType = tfJobTypePT.getText().trim();
            String workingHour = tfWorkingHourPT.getText().trim();
            String wages = tfWagesPT.getText().trim();
            String shift = tfShiftPT.getText().trim();
            
            if( vacancyNumber1.isEmpty() || designation.isEmpty() || jobType.isEmpty() || 
            workingHour.isEmpty() || wages.isEmpty() || shift.isEmpty()){
                 JOptionPane.showMessageDialog(frame, "Please fill all the text fields of Appoint Full Time Staff", "Error", 0);
            }
            else{
                int intVacancyNumber1 = Integer.parseInt(vacancyNumber1);
                int intWorkingHour = Integer.parseInt(workingHour);
                int intWages = Integer.parseInt(wages);
                
                if(intVacancyNumber1 <= 0 || intWorkingHour <= 0 || intWages <= 0){
                    JOptionPane.showMessageDialog(frame, "Enter a number greater than 0", "Error", 0);
                }
                if(intWorkingHour > 6 ){
                    JOptionPane.showMessageDialog(frame, "Maximum working hours per day is 6hrs", "Error", 0);
                }
                else{
                    //here the validateAddButton(int a) method is called, and if the method returns true then if statement is executed and if the method returns false then else statement is executed.
                    if(validateAddButton(intVacancyNumber1)){
                        ad.add(new PartTimeStaffHire(intVacancyNumber1, designation, jobType, intWorkingHour, intWages, shift));
                    
                        JOptionPane.showMessageDialog(frame, "VacancyNumber : " + intVacancyNumber1 + "\n Designation : "
                        + designation + "\n Job Type : " + jobType + "\n Working Hours Per Day : " + intWorkingHour + "\n Wages Per Day : "
                        + intWages + "\n Shift : " + shift ,"Added", 1);
                    }
                    else{
                        JOptionPane.showMessageDialog(frame, "Enter a unique vacancy number", "Error", 0);
                    }
                }
            }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(frame, "Enter data of appropriate data type", "Error", 0);
        }
    }
    
    
    //a method validateAddButton(int a) is created to return boolean value which is called in addButtonPT() and addButtonFT() to accept unique vacancy number.
    public boolean validateAddButton(int a){
        if (ad.size()>0){
            for(StaffHire i : ad){
                        if(a == i.getVacancyNumber()){
                            return false;
                        }                        
            }
        }
        else{
            return true;
        }
        
        //if we enter second or more data, the program executs for loop and when the vacancy number doesn't match with an existing vacancy number the method returns true.
        return true;
    }
    
    private void appointFT(){
        try{
            String vacancyNumberFT2 = tfVacancyNumFT2.getText().trim();
            String staffName = tfStaffName.getText().trim();
            String joiningDate = tfJoiningDate.getText().trim();
            String qualification = tfQualification.getText().trim();
            String appointedBy = tfAppointedBy.getText().trim();
            boolean check = false;
            int intIndex = 0;
            
            if(vacancyNumberFT2.isEmpty() || staffName.isEmpty() || joiningDate.isEmpty() 
            || qualification.isEmpty() || appointedBy.isEmpty()){
                JOptionPane.showMessageDialog(frame, "Please fill all the text fields of Appoint Full Time Staff", "Error", 0);
            }
            else{
                int intVacancyNumberFT2 = Integer.parseInt(vacancyNumberFT2);
                
                if(intVacancyNumberFT2 <= 0){
                     JOptionPane.showMessageDialog(frame, "Enter a number greater than 0", "Error", 0);
                }
                else if(ad.size() < 1){
                    JOptionPane.showMessageDialog(frame, "Vacancy has not been declared", "Error", 0);
                }
                else{
                    for(StaffHire i : ad){
                       if(i.getVacancyNumber() == intVacancyNumberFT2 && (i) instanceof FullTimeStaffHire){
                            check = true;
                            //initiaalizing variable with particular index of ArrayList
                            intIndex = ad.indexOf(i);
                            break;
                       }
                    }
                    
                    
                    if(check){
                        FullTimeStaffHire a = (FullTimeStaffHire) ad.get(intIndex);
                        
                        if(a.hasJoined()){
                            JOptionPane.showMessageDialog(frame,"Vacancy Number" + intVacancyNumberFT2 + " has already been filled", "Error", 0);
                        }
                        else{
                            a.hireFullTimeStaff(staffName, joiningDate, qualification, appointedBy);
                            JOptionPane.showMessageDialog(frame, " Staff Name : " + staffName + 
                            "\n Joining Date: " + joiningDate + "\n Qualification : " + qualification
                            + "\n Appointed By : " + appointedBy, "Appointed", 1);
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(frame, " Vacancy Number " + intVacancyNumberFT2 + 
                        " does not exists!" + "\n Enter existing Vacancy Number!!", "Error", 0);
                    }
                }
            }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(frame, "Enter data of appropriate data type", "Error", 0);
        }
    }
    
    private void appointPT(){
        try{
            String vacancyNumberPT2 = tfVacancyNumPT2.getText().trim();
            String staffName = tfStaffNamePT.getText().trim();
            String joiningDate = tfJoiningDatePT.getText().trim();
            String qualification = tfQualificationPT.getText().trim();
            String appointedBy = tfAppointedByPT.getText().trim();
            Boolean check = false;
            int intIndex = 0;
            
            if(vacancyNumberPT2.isEmpty() || staffName.isEmpty() || joiningDate.isEmpty() || 
            qualification.isEmpty() || appointedBy.isEmpty()){
                 JOptionPane.showMessageDialog(frame, "Please fill all the text fields of Appoint Part Time Staff", "Error", 0);
            }
            else{
                int intVacancyNumberPT2 = Integer.parseInt(vacancyNumberPT2);
                
                if(intVacancyNumberPT2 <= 0){
                    JOptionPane.showMessageDialog(frame, "Enter a number greater than 0", "Error", 0);
                }
                else if(ad.size() < 1){
                    JOptionPane.showMessageDialog(frame, "Vacancy has not been declared", "Error", 0);
                }
                else{
                    for(StaffHire i : ad){
                        if(intVacancyNumberPT2 == i.getVacancyNumber() && (i) instanceof PartTimeStaffHire){
                            check = true;
                            //initiaalizing variable with particular index of ArrayList
                            intIndex = ad.indexOf(i);
                            break;
                        }
                    }
                    
                    if(check ){
                         PartTimeStaffHire a = (PartTimeStaffHire) ad.get(intIndex);
                         
                         if(a.hasJoined()){
                             JOptionPane.showMessageDialog(frame,"Vacancy Number" + intVacancyNumberPT2 + " has already been filled", "Error", 0);
                         }
                         else{
                             a.hirePartTimeStaff(staffName, joiningDate, qualification, appointedBy);
                            
                             JOptionPane.showMessageDialog(frame, " Staff Name : " + 
                             staffName +"\n Joining Date: " + joiningDate + "\n Qualification : "
                             + qualification + "\n Appointed By : " + appointedBy, "Appointed", 1);
                         }
                    }
                    else{
                        JOptionPane.showMessageDialog(frame, " Vacancy Number " + 
                        intVacancyNumberPT2 + " does not exists!" +
                        "\n Enter existing Vacancy Number!!", "Error", 0);
                    }
                }
            }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(frame, "Enter data of appropriate data type", "Error", 0);
        }
    }
    
    private void terminatePT(){
        try{
            String vacancyNumberPT3 = tfVacancyNumPT3.getText().trim();
            boolean check = false;
            int index = 0;
            
            if(vacancyNumberPT3.isEmpty()){
                JOptionPane.showMessageDialog(frame, "Please enter vacancy number you want to terminate",
                "Error", 0);
            }
            else if(ad.size() < 1){
                    JOptionPane.showMessageDialog(frame, "Staff has not been hired", "Error", 0);
            }
            else{
                int intVacancyNumberPT3 = Integer.parseInt(vacancyNumberPT3);
                for(StaffHire i : ad){
                    if(intVacancyNumberPT3 == i.getVacancyNumber() && (i) instanceof PartTimeStaffHire){
                        check = true;
                        index = ad.indexOf(i);
                        break;
                    }
                }   
                if(check){
                    PartTimeStaffHire a = (PartTimeStaffHire)ad.get(index);
                    String b = a.getStaffName();
                    a.terminateStaff();
                    ad.remove(index);
                    JOptionPane.showMessageDialog(frame, b + " has been terminated", "Terminated",
                    1);
                }
                else{
                    JOptionPane.showMessageDialog(frame, "Enter existing vacancy number!!", "Terminated",
                    0);
                }
            }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(frame, "Enter data of appropriate data type", "Error", 0);
        }
    }
    
    private void displayFT(){
       int count = 0;
       if(ad.size()<1){
           JOptionPane.showMessageDialog(frame, "No data has been entered", "Error", 0);
       }
       else{
          
           for(StaffHire i : ad){
               if((i) instanceof FullTimeStaffHire){
                   count = count + 1;
                   System.out.println("\n---------------Full Time Vacancy Detail--------------- \n");
                   FullTimeStaffHire a = (FullTimeStaffHire)i;
                   a.display();
                   System.out.println("\n --------------XXXXXXXXXXXXXXXXXXXXXXXXX--------------- \n" );
               }
           }
           if(count == 0){
               JOptionPane.showMessageDialog(frame,
                "No data of FullTimeStaffHire has been entered!!","Error", 0);
            }
       }
    }
    
    private void displayPT(){
        int count = 0;
        if(ad.size()< 1){
            JOptionPane.showMessageDialog(frame, "No data has been entered", "Error", 0);
        }
        else{
            
            for(StaffHire i : ad){
                if((i) instanceof PartTimeStaffHire){
                    count = count + 1;
                    PartTimeStaffHire a = (PartTimeStaffHire)i;
                    System.out.println("\n---------------Part Time Vacancy Detail--------------- \n");
                    a.display();
                    System.out.println("\n --------------XXXXXXXXXXXXXXXXXXXXXXXXXX--------------- \n" );
                }
            }
            if(count == 0){
                    JOptionPane.showMessageDialog(frame,
                    "No data of PartTimeStaffHire has been entered!!","Error", 0);
            }
        }
    }
    
    private void initializeFont(){
        
        Font ft3 = new Font("Times New Romance", Font.BOLD,15);
        lblBody1.setFont(ft3);
        lblBody2.setFont(ft3);
        btnFullTimeSH.setFont(ft3);
        btnPartTimeSH.setFont(ft3);
        
        Font ft4 = new Font("Times New Romance", Font.PLAIN,18);
        lblVacancyNumFT1.setFont(ft4);
        lblVacancyNumFT2.setFont(ft4);
        lblDesignation.setFont(ft4);
        lblJobType.setFont(ft4);
        lblSalary.setFont(ft4);
        lblWorkingHour.setFont(ft4);
        lblStaffName.setFont(ft4);
        lblJoiningDate.setFont(ft4);
        lblQualification.setFont(ft4);
        lblAppointedBy.setFont(ft4);
        lblVacancyNumPT1.setFont(ft4);
        lblVacancyNumPT2.setFont(ft4);
        lblVacancyNumPT3.setFont(ft4);
        lblDesignationPT.setFont(ft4);
        lblJobTypePT.setFont(ft4);
        lblWorkingHourPT.setFont(ft4);
        lblWagesPT.setFont(ft4); 
        lblShiftPT.setFont(ft4);
        lblStaffNamePT.setFont(ft4);
        lblJoiningDatePT.setFont(ft4);
        lblQualificationPT.setFont(ft4);
        lblAppointedByPT.setFont(ft4);
        lblTerminate.setFont(ft4);
        
        
        Font ftButton = new Font("Times New Romance", Font.BOLD,18);
        btnAdd.setFont(ftButton);
        btnAppoint.setFont(ftButton);
        btnDisplay.setFont(ftButton);
        btnClear.setFont(ftButton);
        btnPrevious.setFont(ftButton);
        btnAddPT.setFont(ftButton);
        btnAppointPT.setFont(ftButton);
        btnDisplayPT.setFont(ftButton);
        btnClearPT.setFont(ftButton);
        btnPreviousPT.setFont(ftButton);
        btnTerminate.setFont(ftButton);
    }
    
    public static void main(String[]args){
        new INGNepal().frame.setVisible(true);
         try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch(Exception e){
        };
    }

}