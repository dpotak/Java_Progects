package CalculatorInterface;
import javax.swing.*;
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

        JTextField display = new JTextField();
        display.setBounds(30, 37, 320, 40); 
        display.setEditable(false);  
        frame.add(display);

        Text t = new Text();
        frame.add(t.lbl1);

        JButton button = new JButton("1");
        button.setBounds(30 , 85 , 55 , 35);
        frame.add(button);

        JButton button1 = new JButton("2");
        button1.setBounds(90, 85, 55, 35);
        frame.add(button1);

        JButton button2 = new JButton("3");
        button2.setBounds(150, 85, 55, 35);
        frame.add(button2);

        JButton button3 = new JButton("4");
        button3.setBounds(30, 125, 55, 35);
        frame.add(button3);

        JButton button4 = new JButton("5");
        button4.setBounds(90, 125, 55, 35);
        frame.add(button4);

        JButton button5 = new JButton("6");
        button5.setBounds(150, 125, 55, 35);
        frame.add(button5);

        JButton button6 = new JButton("7");
        button6.setBounds(30, 165, 55, 35);
        frame.add(button6);

        JButton button7 = new JButton("8");
        button7.setBounds(90, 165, 55, 35);
        frame.add(button7);

        JButton button8 = new JButton("9");
        button8.setBounds(150, 165, 55, 35);
        frame.add(button8);

        JButton button9 = new JButton("+");
        button9.setBounds(30, 205, 55, 35);
        frame.add(button9);

        JButton button10 = new JButton("-");
        button10.setBounds(90, 205, 55, 35);
        frame.add(button10);

        JButton button11 = new JButton("*");
        button11.setBounds(150, 205, 55, 35);
        frame.add(button11);

        JButton button12 = new JButton("/");
        button12.setBounds(210 , 85 , 55 , 35);
        frame.add(button12);

        JButton button13 = new JButton("=");
        button13.setBounds(210 , 125 , 55 , 35);
        frame.add(button13);

        JButton button_delete = new JButton("Del");
        button_delete.setBounds(210, 165, 55, 35);
        frame.add(button_delete);


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