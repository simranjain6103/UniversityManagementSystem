
package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JButton login, cancel;
    JTextField tfusername,tfpassword;
    
    Login (){
        
        
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
      
        JLabel lblusername= new JLabel("Username");
        lblusername.setBounds(500, 300, 100, 30);
        add(lblusername);
        
         tfusername=new JTextField();
        tfusername.setBounds(610, 300, 300, 30);
        add(tfusername);
        
         JLabel lblpassword= new JLabel("Password");
        lblpassword.setBounds(500,350, 100, 30);
        add(lblpassword);
        
        tfpassword=new JPasswordField();
        tfpassword.setBounds(610, 350, 300, 30);
        add(tfpassword);
        
        login = new JButton("Login");
        login.setBounds(500, 450, 120, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        login.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(login);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(800, 450, 120, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(1000, 270, 200, 200);
        add(image);
        
        setVisible(true);
         setLocation(0,0);
       setSize(1560, 850);  
    }
    public void actionPerformed(ActionEvent ae) {
        
    if(ae.getSource() == login ){
    String username=tfusername.getText();
      String password=tfpassword.getText();
      String query = "select * from login where username ='" + username + "' and password='" + password + "'";
    try {
        Conn c =new Conn();
      ResultSet rs = c.s.executeQuery(query);
      if(rs.next()){
          setVisible(false);
          new Project();
      }else{
          JOptionPane.showMessageDialog(null, "Invalid username and password");
           tfusername.setText(""); // Optional: clear fields for retry
           tfpassword.setText("");
      }
    }catch(Exception e){
         e.printStackTrace();
    }
    } else if (ae.getSource() == cancel){
        setVisible(false);
    }

}
    
  public static void main(String[] args){
      new Login();
  }  
    
    
}
