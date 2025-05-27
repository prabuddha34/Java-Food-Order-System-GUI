import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeliveryFrame extends JFrame implements ActionListener{

    JPanel panel;
    JTextField nameField, pinField, ageField;
    JLabel nameLabel, pinLabel, ageLabel;
    JButton subButton;

    DeliveryFrame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Login");
        this.setLayout(null);
        this.setSize(500, 500);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(50, 50, 380, 350);
        panel.setBackground(Color.LIGHT_GRAY);
        this.add(panel);

        nameLabel = new JLabel("What is your name?");
        nameLabel.setBounds(30, 20, 200, 25);
        panel.add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(160, 20, 180, 25);
        panel.add(nameField);

        pinLabel = new JLabel("Enter your PIN:");
        pinLabel.setBounds(30, 60, 200, 25);
        panel.add(pinLabel);

        pinField = new JTextField();
        pinField.setBounds(160, 60, 180, 25);
        panel.add(pinField);

        ageLabel = new JLabel("Enter your age:");
        ageLabel.setBounds(30, 100, 200, 25);
        panel.add(ageLabel);

        ageField = new JTextField();
        ageField.setBounds(160, 100, 180, 25);
        panel.add(ageField);

        subButton = new JButton("Submit");
        subButton.setBounds(130, 150, 100, 30);
        subButton.setFocusable(false);
        subButton.addActionListener(this);
        panel.add(subButton);

        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name=nameField.getText();
        String age=ageField.getText();
        if(e.getSource()==subButton){
            new DeliveryLaunchPage();
            JOptionPane.showMessageDialog(this,"Welcome "+" "+name+"Age"+age+"to the System");
        }
    }
}
