
package university.management.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable {
    
    Thread t;
    JLabel lblusername;

    Splash() {
        setLocation(0, 0);
        setSize(1560, 850);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1920, 1080, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1540, 850);

        add(image);
        
        // Create and configure the label
       lblusername = new JLabel("<html>Welcome To ITM<br>Institute of Technology and Management</html>");
lblusername.setBounds(500, 300, 1000, 200);
lblusername.setFont(new Font("Arial", Font.BOLD, 20)); // Initial font size
lblusername.setForeground(Color.WHITE); // Change color for visibility
image.add(lblusername);


        t = new Thread(this);
        t.start();
        setVisible(true);
    }

   public void run() {
    try {
        // Get the initial width of the label
        int initialWidth = lblusername.getWidth();
        
        // Zoom in effect
        for (int size = 20; size <= 60; size++) {
            lblusername.setFont(new Font("Arial", Font.BOLD, size));
            // Recalculate the width of the label
            int newWidth = lblusername.getPreferredSize().width;
            // Update the position to keep it centered
            lblusername.setBounds((getWidth() - newWidth) / 2, lblusername.getY(), newWidth, lblusername.getHeight());
            Thread.sleep(20); // Adjust speed of zoom effect
        }
        Thread.sleep(3000); // Keep it displayed for a while
        
        setVisible(false);
        // next frame
        new Login();
    } catch (Exception e) {
        e.printStackTrace();
    }
}


    public static void main(String[] args) {
        new Splash();
    }
}
