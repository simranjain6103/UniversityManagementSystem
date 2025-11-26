package university.management.system;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class About extends JFrame {

    About() {
        // Set up the window
        setTitle("About - University Management System");
        setSize(700, 500);
        setLocationRelativeTo(null);  // Center the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);  // We will manually position components

        // Gradient Background (Light Blue to Light Purple)
        JPanel background = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                GradientPaint gradient = new GradientPaint(0, 0, new Color(0, 102, 204), 700, 500, new Color(255, 153, 204));
                g2d.setPaint(gradient);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        background.setBounds(0, 0, 700, 500);
        add(background);

        // Title: University Management System
        JLabel heading = new JLabel("<html><center>University<br/>Management<br/>System</center></html>");
        heading.setBounds(50, 50, 600, 100);
        heading.setFont(new Font("Segoe UI", Font.BOLD, 36));
        heading.setForeground(Color.WHITE);
        heading.setHorizontalAlignment(SwingConstants.CENTER);
        background.add(heading);

        // Developer Info Card
        JPanel developerCard = createInfoCard("Developed By", "Simran Jain", 100, 150, 500, 80);
        background.add(developerCard);

        // Roll Number Info Card
        JPanel rollCard = createInfoCard("Roll Number", "0905CA1017", 100, 250, 500, 80);
        background.add(rollCard);

        // Contact Info Card
        JPanel contactCard = createInfoCard("Contact", "simranjain6301@gmail.com", 100, 350, 500, 80);
        background.add(contactCard);

        // Add Hover Effect to Cards
        addHoverEffect(developerCard);
        addHoverEffect(rollCard);
        addHoverEffect(contactCard);

        // Set the window visible
        setVisible(true);
    }

    // Helper method to create info cards with rounded corners and text inside
    private JPanel createInfoCard(String title, String info, int x, int y, int width, int height) {
        JPanel card = new JPanel();
        card.setBounds(x, y, width, height);
        card.setBackground(new Color(255, 255, 255, 90));  // Semi-transparent white
        card.setLayout(new BorderLayout());
        card.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 2, true));
        card.setOpaque(true);
        card.setLayout(new GridBagLayout());  // Using GridBagLayout for easy positioning of components

        // Title label inside the card
        JLabel titleLabel = new JLabel(title);
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
        titleLabel.setForeground(new Color(255, 255, 255));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Content label inside the card
        JLabel contentLabel = new JLabel(info);
        contentLabel.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        contentLabel.setForeground(Color.WHITE);
        contentLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Add title and content labels to the card
        card.add(titleLabel, new GridBagConstraints() {{
            gridx = 0; gridy = 0;
            anchor = GridBagConstraints.CENTER;
            insets = new Insets(10, 10, 5, 10);
        }});
        card.add(contentLabel, new GridBagConstraints() {{
            gridx = 0; gridy = 1;
            anchor = GridBagConstraints.CENTER;
            insets = new Insets(5, 10, 10, 10);
        }});

        return card;
    }

    // Method to add hover effect to each info card
    private void addHoverEffect(JPanel panel) {
        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel.setBackground(new Color(255, 255, 255, 120));  // Lighter background on hover
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel.setBackground(new Color(255, 255, 255, 90));  // Original semi-transparent white
            }
        });
    }

    public static void main(String[] args) {
        new About();
    }
}
