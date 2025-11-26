
package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Project extends JFrame implements ActionListener {
    
    Project(){
        
         
       setSize(1560, 850);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        JMenuBar mb= new JMenuBar();
        
        
        //new information
        
        
        JMenu newInformation = new JMenu ("New Information");
        newInformation.setForeground(Color.red);
        mb.add(newInformation);
        
        
        JMenuItem facultyInfo = new JMenuItem ("New Faculty info"); 
        facultyInfo.setBackground(Color.WHITE);
        facultyInfo.addActionListener(this);
        newInformation.add(facultyInfo);
        
        JMenuItem studentInfo = new JMenuItem ("New Student info"); 
        studentInfo.setBackground(Color.WHITE);
        studentInfo.addActionListener(this);
        newInformation.add(studentInfo);
        
        //details
        
        
        JMenu details = new JMenu ("View Details");
        details.setForeground(Color.blue);
        mb.add(details);
        
        JMenuItem facultydetails = new JMenuItem ("View faculty Details"); 
        facultydetails.setBackground(Color.WHITE);
         facultydetails.addActionListener(this);
        details.add(facultydetails);
        
        JMenuItem studentdetails = new JMenuItem ("View Student Details"); 
        studentdetails.setBackground(Color.WHITE);
         studentdetails.addActionListener(this);
        details.add(studentdetails);
        
        //apply leave
        
       
        JMenu leave = new JMenu ("Apply Leave");
        leave.setForeground(Color.red);
        mb.add(leave);
       
        
        JMenuItem facultyleave = new JMenuItem ("Apply faculty leave"); 
        facultyleave.setBackground(Color.WHITE);
      facultyleave.addActionListener(this);
        leave.add(facultyleave);
        
        JMenuItem studentleave = new JMenuItem ("Apply Student leave"); 
        studentleave.setBackground(Color.WHITE);
         studentleave.addActionListener(this);
        leave.add(studentleave);
        
        //leave details
        
        
        JMenu leaveDetails = new JMenu ("View Details");
        leaveDetails.setForeground(Color.blue);
        mb.add(leaveDetails);
       
        JMenuItem facultyLeaveDetails = new JMenuItem ("faculty leave Details"); 
        facultyLeaveDetails.setBackground(Color.WHITE);
         facultyLeaveDetails .addActionListener(this);
       leaveDetails.add(facultyLeaveDetails);
        
        JMenuItem studentLeaveDetails = new JMenuItem ("Student leave Details"); 
        studentLeaveDetails.setBackground(Color.WHITE);
        studentLeaveDetails .addActionListener(this);
        leaveDetails.add(studentLeaveDetails);
        
        //exams
        
        
        JMenu exam = new JMenu ("View Details");
        exam.setForeground(Color.red);
        mb.add(exam);
      
        
        JMenuItem result = new JMenuItem ("Veiw Reasult"); 
       result.setBackground(Color.WHITE);
        result.addActionListener(this);
        exam.add(result);
        
        JMenuItem entermarks = new JMenuItem ("Enter Marks"); 
        entermarks.setBackground(Color.WHITE);
        entermarks .addActionListener(this);
        exam.add(entermarks);
        
        //update
        
         JMenu update = new JMenu ("Update Information");
        update.setForeground(Color.blue);
        mb.add(update);
        
        
        JMenuItem updateFacultyInfo = new JMenuItem ("Update Factulty Info"); 
       updateFacultyInfo.setBackground(Color.WHITE);
          updateFacultyInfo.addActionListener(this);
        update.add(updateFacultyInfo);
        
        JMenuItem updateStudentInfo = new JMenuItem ("Update Student Info"); 
        updateStudentInfo.setBackground(Color.WHITE);
         updateStudentInfo.addActionListener(this);
       update.add(updateStudentInfo);
        
         // fee
        JMenu fee = new JMenu("Fee Details");
        fee.setForeground(Color.red);
        mb.add(fee);
        
        JMenuItem feestructure = new JMenuItem("Fee Structure");
        feestructure.setBackground(Color.WHITE);
        feestructure.addActionListener(this);
        fee.add(feestructure);
        
        JMenuItem feeform = new JMenuItem("Student Fee Form");
        feeform.addActionListener(this);
        feeform.setBackground(Color.WHITE);
        feeform.addActionListener(this);
        fee.add(feeform);
        
        // Utility
        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.blue);
        mb.add(utility);
        
        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setBackground(Color.WHITE);
        notepad.addActionListener(this);
        utility.add(notepad);
        
        JMenuItem calc = new JMenuItem("Calculator");
        calc.setBackground(Color.WHITE);
        calc.addActionListener(this);
        utility.add(calc);
        
        //about
        
        JMenu about = new JMenu("About");
        about.setForeground(Color.red);
        mb.add(about);
        
        JMenuItem ab = new JMenuItem("About");
       ab.setBackground(Color.WHITE);
        ab.addActionListener(this);
        about.add(ab); 
        
        // exit
         JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.blue);
        mb.add(exit);
        
        JMenuItem ex = new JMenuItem("Exit");
        ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
        exit.add(ex);
        
       
       setJMenuBar (mb);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();
     if (msg.equals("Exit")){
        setVisible(false);
     }else if(msg.equals("Calculator")){
         try{
             Runtime.getRuntime().exec("calc.exe");
         }catch(Exception e){
         }
    }else if(msg.equals("Notepad")){
         try{
             Runtime.getRuntime().exec("notepad.exe");
         }catch(Exception e){
             
         }
    }else if(msg.equals("New Faculty info")){
        new AddTeacher();
    }else if(msg.equals("New Student info")){
        new AddStudent();
    }
    else if(msg.equals("View faculty Details")){
        new TeacherDetails();
    }
    else if(msg.equals("View Student Details")){
        new StudentDetails();
    }
    else if(msg.equals("Apply faculty leave")){
        new TeacherLeave();
    }
    else if(msg.equals("Apply Student leave")){
        new StudentLeave();
    }
    else if(msg.equals("faculty leave Details")){
        new TeacherLeaveDetails();
    }
    else if(msg.equals("Student leave Details")){
        new StudentLeaveDetails();
    }
     else if(msg.equals("Update Factulty Info")){
        new UpdateTeacher();
    }
    else if(msg.equals("Update Student Info")){
        new UpdateStudent();
    }
      else if(msg.equals("Veiw Reasult")){
        new ExaminationDetails();
   
    }
      else if(msg.equals("Enter Marks")){
        new EnterMarks();
    }
      else if(msg.equals("About")){
        new About();
    }else if(msg.equals("Fee Structure")){
        new FeeStructure();
    }else if(msg.equals("Student Fee Form")){
        new StudentFeeForm();
    }
    }
    public static void main(String[] args){
 new Project();
 }   
}
