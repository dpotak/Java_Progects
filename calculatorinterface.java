import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculatorinterface {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My one window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);  
        frame.setLayout(null); 

        JButton button = new JButton("Click me");
        button.setBounds(100 , 10 , 100 , 100);
        frame.add(button);

        frame.setVisible(true);
    }
}

