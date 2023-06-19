package eventDriven;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;
 


public class CarDealership {
    private Car[] cars;
    private JButton[] sellButtons;
    private JFrame frame;
    private JPanel panel;

    public CarDealership() {
        cars = new Car[3];
        cars[0] = new Car("Sedan", 4);   
        cars[1] = new Car("SUV", 6);
        cars[2] = new Car("Sports", 2);

        frame = new JFrame("Car Dealership"); 
        panel = new JPanel();   
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));  

        
        sellButtons = new JButton[cars.length];
        for (int i = 0; i < cars.length; i++) {
            sellButtons[i] = new JButton("Sell " + cars[i].getModel());
            final int modelIndex = i;
        
            sellButtons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    cars[modelIndex].sell();  
                    displayAvailableCars(); 
                }
            });
            panel.add(sellButtons[i]); 
        }

        frame.getContentPane().add(panel);  
        frame.setSize(200, 200) ;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);  


        displayAvailableCars();  
    }

    public void displayAvailableCars() {
        for (int i = 0; i < cars.length; i++) {
            JButton sellButton = sellButtons[i];
            sellButton.setText("Sell " + cars[i].getModel() + " (" + cars[i].getStock() + " available)");
         
            if (cars[i].getStock() == 0) {
                sellButton.setEnabled(false);
            } else {
                sellButton.setEnabled(true);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CarDealership();  // Create instance  
            }
        });
    }

    private class Car {
        private String model;
        private int stock;

        public Car(String model, int stock) {
            this.model = model;
            this.stock = stock;
        }

        public String getModel() {
            return model;
        }

        public int getStock() {
            return stock;
        }

        public void sell() {
            if (stock > 0) {
                stock--;  // Decrement the stock  
            }
        }
    }
}
