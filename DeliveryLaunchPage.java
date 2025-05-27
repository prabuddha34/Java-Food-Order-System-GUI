import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeliveryLaunchPage extends JFrame implements ActionListener {
    JButton orderSnacks, orderMainCourse, orderDrinks;
    JPanel panel;

    DeliveryLaunchPage() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setTitle("Order Your Food");
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setBounds(50, 90, 380, 300);
        this.add(panel);

        orderSnacks = new JButton("Order Snacks");
        orderMainCourse = new JButton("Order Main Course");
        orderDrinks = new JButton("Order Drinks");

        orderDrinks.setBounds(90, 30, 200, 40);
        orderMainCourse.setBounds(90, 100, 200, 40);
        orderSnacks.setBounds(90, 170, 200, 40);

        orderDrinks.setFocusable(false);
        orderMainCourse.setFocusable(false);
        orderSnacks.setFocusable(false);

        orderSnacks.addActionListener(this);
        orderMainCourse.addActionListener(this);
        orderDrinks.addActionListener(this);

        panel.add(orderSnacks);
        panel.add(orderMainCourse);
        panel.add(orderDrinks);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==orderSnacks){
        new SnackLaunchPage();
    }
    if(e.getSource()==orderDrinks){
        new DrinksLaunchPage();
    }
    if(e.getSource()==orderMainCourse){
        new MainCourseLaunchPage();
    }
    }
}
