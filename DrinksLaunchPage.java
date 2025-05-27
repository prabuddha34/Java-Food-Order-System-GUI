import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrinksLaunchPage extends JFrame implements ActionListener {
  JButton btn1,btn2,btn3;
    DrinksLaunchPage(){
        setTitle("Order Your Drinks");
        setSize(400, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBackground(Color.WHITE);
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        ImageIcon img1 = new ImageIcon(new ImageIcon(getClass().getResource("/drink1.jpg"))
                .getImage().getScaledInstance(300, 150, Image.SCALE_SMOOTH));
        JLabel label1 = new JLabel(img1);
        JLabel price1 = new JLabel("Price: $2.99");
        price1.setAlignmentX(Component.CENTER_ALIGNMENT);
        btn1 = new JButton("Order Pepsi");
        btn1.setMaximumSize(new Dimension(200, 40));
        btn1.setAlignmentX(Component.CENTER_ALIGNMENT);


        ImageIcon img2 = new ImageIcon(new ImageIcon(getClass().getResource("/drink2.jpg"))
                .getImage().getScaledInstance(300, 150, Image.SCALE_SMOOTH));
        JLabel label2 = new JLabel(img2);
        JLabel price2 = new JLabel("Price: $1.99");
        price2.setAlignmentX(Component.CENTER_ALIGNMENT);
        btn2 = new JButton("Order Coca Cola");
        btn2.setMaximumSize(new Dimension(200, 40));
        btn2.setAlignmentX(Component.CENTER_ALIGNMENT);


        ImageIcon img3 = new ImageIcon(new ImageIcon(getClass().getResource("/drink3.jpg"))
                .getImage().getScaledInstance(300, 150, Image.SCALE_SMOOTH));
        JLabel label3 = new JLabel(img3);
        JLabel price3 = new JLabel("Price: $0.99");
        price3.setAlignmentX(Component.CENTER_ALIGNMENT);
        btn3 = new JButton("Order Fanta");
        btn3.setMaximumSize(new Dimension(200, 40));
        btn3.setAlignmentX(Component.CENTER_ALIGNMENT);


        btn1.setFocusable(false);
        btn2.setFocusable(false);
        btn3.setFocusable(false);


        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);


        mainPanel.add(label1);
        mainPanel.add(price1);
        mainPanel.add(Box.createVerticalStrut(10));
        mainPanel.add(btn1);
        mainPanel.add(Box.createVerticalStrut(20));

        mainPanel.add(label2);
        mainPanel.add(price2);
        mainPanel.add(Box.createVerticalStrut(10));
        mainPanel.add(btn2);
        mainPanel.add(Box.createVerticalStrut(20));

        mainPanel.add(label3);
        mainPanel.add(price3);
        mainPanel.add(Box.createVerticalStrut(10));
        mainPanel.add(btn3);

        add(mainPanel);
        setVisible(true);
    }




    @Override
    public void actionPerformed(ActionEvent e) {
        double price = 0;
        String item = "";

        if (e.getSource() == btn1) {
            price = 2.99;
            item = "Pepsi";
        } else if (e.getSource() == btn2) {
            price = 1.99;
            item = "Coca Cola";
        } else if (e.getSource() == btn3) {
            price = 0.99;
            item = "Fanta";
        }

        String input = JOptionPane.showInputDialog(this, "Enter quantity for " + item + ":");
        try {
            int qty = Integer.parseInt(input);
            double total = qty * price;
            JOptionPane.showMessageDialog(this, "Total for " + qty + " " + item + ": $" + String.format("%.2f", total));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid quantity entered.");
        }

    }
}