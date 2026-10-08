import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

    JTextField display;
    double firstNumber = 0;
    String operator = "";

    Calculator() {
        setTitle("Calculator");
        setSize(350, 450);
        setLayout(new BorderLayout(10, 10));

        // Display
        display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 25));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        // Keyboard
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.addActionListener(this);
            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);

        // Clear button
        JButton clear = new JButton("C");
        clear.setFont(new Font("Arial", Font.BOLD, 20));
        clear.addActionListener(this);
        add(clear, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(300, 400));
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String button = e.getActionCommand();

        // Number or decimal
        if (button.matches("[0-9.]")) {
            display.setText(display.getText() + button);
        }

        // Clear
        else if (button.equals("C")) {
            display.setText("");
            firstNumber = 0;
            operator = "";
        }

        // Operator
        else if (button.equals("+") || button.equals("-")
                || button.equals("*") || button.equals("/")) {

            if (!display.getText().isEmpty()) {
                firstNumber = Double.parseDouble(display.getText());
                operator = button;
                display.setText("");
            }
        }

        // Equal
        else if (button.equals("=")) {

            if (!display.getText().isEmpty() && !operator.isEmpty()) {

                double secondNumber = Double.parseDouble(display.getText());
                double result = 0;

                if (operator.equals("+"))
                    result = firstNumber + secondNumber;

                else if (operator.equals("-"))
                    result = firstNumber - secondNumber;

                else if (operator.equals("*"))
                    result = firstNumber * secondNumber;

                else if (operator.equals("/")) {
                    if (secondNumber == 0) {
                        display.setText("Cannot divide by zero");
                        return;
                    }
                    result = firstNumber / secondNumber;
                }

                display.setText(String.valueOf(result));
                operator = "";
            }
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}

