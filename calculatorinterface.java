import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculatorinterface {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My one window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);  
        frame.setLayout(null); 

        JButton button = new JButton("1");
        button.setBounds(30 , 50 , 55 , 35);
        frame.add(button);

        JButton button1 = new JButton("2");
        button1.setBounds(100, 50, 55, 35);
        frame.add(button1);

        JButton button2 = new JButton("3");
        button2.setBounds(170, 50, 55, 35);
        frame.add(button2);

        frame.setVisible(true);
    }
}

