package CalculatorInterface;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Text extends JFrame {
    static JLabel lbl1;

    Text()
    {
        lbl1 = new JLabel("Calculator", JLabel.CENTER);
        lbl1.setBounds(10, 10, 60, 30);
    }
}

public class calculatorinterface {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);  
        frame.setLayout(null); 

        Color c = new Color(0-0-0);
        frame.getContentPane().setBackground(c);

        JTextField display = new JTextField();
        display.setBounds(30, 37, 320, 40); 
        display.setEditable(false);  
        frame.add(display);

        Text t = new Text();
        frame.add(t.lbl1);

        JButton button = new JButton("1");
        button.setBounds(35 , 85 , 55 , 35);
        button.setBackground(Color.GRAY);
        button.setForeground(Color.WHITE);
        frame.add(button);

        JButton button1 = new JButton("2");
        button1.setBounds(95, 85, 55, 35);
        button1.setBackground(Color.GRAY);
        button1.setForeground(Color.WHITE);
        frame.add(button1);

        JButton button2 = new JButton("3");
        button2.setBounds(155, 85, 55, 35);
        button2.setBackground(Color.GRAY);
        button2.setForeground(Color.WHITE);
        frame.add(button2);

        JButton button3 = new JButton("4");
        button3.setBounds(35, 125, 55, 35);
        button3.setBackground(Color.GRAY);
        button3.setForeground(Color.WHITE);
        frame.add(button3);

        JButton button4 = new JButton("5");
        button4.setBounds(95, 125, 55, 35);
        button4.setBackground(Color.GRAY);
        button4.setForeground(Color.WHITE);
        frame.add(button4);

        JButton button5 = new JButton("6");
        button5.setBounds(155, 125, 55, 35);
        button5.setBackground(Color.GRAY);
        button5.setForeground(Color.WHITE);
        frame.add(button5);

        JButton button6 = new JButton("7");
        button6.setBounds(35, 165, 55, 35);
        button6.setBackground(Color.GRAY);
        button6.setForeground(Color.WHITE);
        frame.add(button6);

        JButton button7 = new JButton("8");
        button7.setBounds(95, 165, 55, 35);
        button7.setBackground(Color.GRAY);
        button7.setForeground(Color.WHITE);
        frame.add(button7);

        JButton button8 = new JButton("9");
        button8.setBounds(155, 165, 55, 35);
        button8.setBackground(Color.GRAY);
        button8.setForeground(Color.WHITE);
        frame.add(button8);

        JButton button9 = new JButton("+");
        button9.setBounds(35, 205, 55, 35);
        button9.setBackground(Color.GRAY);
        button9.setForeground(Color.WHITE);
        frame.add(button9);

        JButton button10 = new JButton("-");
        button10.setBounds(95, 205, 55, 35);
        button10.setBackground(Color.GRAY);
        button10.setForeground(Color.WHITE);
        frame.add(button10);

        JButton button11 = new JButton("*");
        button11.setBounds(155, 205, 55, 35);
        button11.setBackground(Color.GRAY);
        button11.setForeground(Color.WHITE);
        frame.add(button11);

        JButton button12 = new JButton("/");
        button12.setBounds(215 , 85 , 55 , 35);
        button12.setBackground(Color.GRAY);
        button12.setForeground(Color.WHITE);
        frame.add(button12);

        JButton button13 = new JButton("=");
        button13.setBounds(215 , 125 , 55 , 35);
        button13.setBackground(Color.GRAY);
        button13.setForeground(Color.WHITE);
        frame.add(button13);

        JButton button_delete = new JButton("Del");
        button_delete.setBounds(215, 165, 55, 35);
        button_delete.setBackground(Color.ORANGE);
        button_delete.setForeground(Color.WHITE);
        frame.add(button_delete);

        JButton button_C = new JButton("С");
        button_C.setBounds(215, 205, 55, 35); 
        button_C.setBackground(Color.WHITE);
        button_C.setForeground(Color.BLACK);
        frame.add(button_C); 

        JButton button_coma = new JButton(".");
        button_coma.setBounds(275, 85, 55, 35);
        button_coma.setBackground(Color.GRAY);
        button_coma.setForeground(Color.WHITE);
        frame.add(button_coma);

        JButton button_parem = new JButton("<");
        button_parem.setBounds(275, 125, 55, 35);
        button_parem.setBackground(Color.WHITE);
        button_parem.setForeground(Color.BLACK);
        frame.add(button_parem);

        JButton button_vasukul = new JButton(">");
        button_vasukul.setBounds(275, 165, 55, 35);
        button_vasukul.setBackground(Color.WHITE);
        button_vasukul.setForeground(Color.BLACK);
        frame.add(button_vasukul);

        ActionListener buttonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String command = e.getActionCommand();
                String currentText = display.getText();

                if (command.equals("=")) {
                    try {
                        double result = eval(currentText);
                        display.setText(String.valueOf(result));
                    } catch (Exception ex) {
                        display.setText("Error");
                    }
                } else if (command.equals("Del")) {
                    if (currentText.length() > 0) {
                        display.setText(currentText.substring(0, currentText.length() - 1));
                    }
                } else {
                    display.setText(currentText + command);
                } 
            }
        };

        button.addActionListener(buttonListener);
        button1.addActionListener(buttonListener);
        button2.addActionListener(buttonListener);
        button3.addActionListener(buttonListener);
        button4.addActionListener(buttonListener);
        button5.addActionListener(buttonListener);
        button6.addActionListener(buttonListener);
        button7.addActionListener(buttonListener);
        button8.addActionListener(buttonListener);
        button9.addActionListener(buttonListener);
        button10.addActionListener(buttonListener);
        button11.addActionListener(buttonListener);
        button12.addActionListener(buttonListener);
        button13.addActionListener(buttonListener);
        button_delete.addActionListener(buttonListener);

        frame.setVisible(true); 
    }

    private static double eval(String expression) {
        String[] tokens = expression.split("(?=[-+*/])|(?<=[-+*/])");

        double result = Double.parseDouble(tokens[0]); 
        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i].trim();
            double number = Double.parseDouble(tokens[i + 1].trim());

            switch (operator) {
                case "+":
                    result += number;
                    break;
                case "-":
                    result -= number;
                    break;
                case "*":
                    result *= number;
                    break;
                case "/":
                    if (number != 0) {
                        result /= number;
                    } else {
                        throw new ArithmeticException("Division by zero");
                    }
                    break;
            }
        }

        return result;
    }
}