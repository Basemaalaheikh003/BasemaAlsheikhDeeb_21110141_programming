// Event-Driven Programming

// Calculate the area of a circle

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculate Area");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel labelRadius = new JLabel("Radius: ");
        labelRadius.setBounds(50, 50, 100, 30);
        frame.add(labelRadius);

        JTextField textFieldRadius = new JTextField();
        textFieldRadius.setBounds(150, 50, 100, 30);
        frame.add(textFieldRadius);

        JButton buttonCalculate = new JButton("Calculate");
        button