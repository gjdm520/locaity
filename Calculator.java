package ruangong;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {

    // UI elements
    private JTextField numField;
    private JButton plusButton;
    private JButton minusButton;
    private JButton multiplyButton;
    private JButton divideButton;
    private JButton equalsButton;
    private JButton clearButton;

    // instance variables
    private double currentNum;
    private String currentOp;

    public Calculator() {
        super("Calculator");

        // initialize UI elements
        numField = new JTextField(10);
        plusButton = new JButton("+");
        minusButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");
        equalsButton = new JButton("=");
        clearButton = new JButton("C");

        // set up layout
        JPanel buttonPanel = new JPanel(new GridLayout(4, 2));
        buttonPanel.add(clearButton);
        buttonPanel.add(divideButton);
        buttonPanel.add(plusButton);
        buttonPanel.add(minusButton);
        buttonPanel.add(multiplyButton);
        buttonPanel.add(equalsButton);
        add(numField, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);

        // add action listeners
        plusButton.addActionListener(this);
        minusButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);
        equalsButton.addActionListener(this);
        clearButton.addActionListener(this);

        // set initial state
        currentNum = 0.0;
        currentOp = "+";
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/")) {
            // store current number and operator
            currentNum = Double.parseDouble(numField.getText());
            currentOp = command;
            numField.setText("");
        } else if (command.equals("=")) {
            // perform operation and display result
            double num2 = Double.parseDouble(numField.getText());
            double result = 0.0;
            if (currentOp.equals("+")) {
                result = currentNum + num2;
            } else if (currentOp.equals("-")) {
                result = currentNum - num2;
            } else if (currentOp.equals("*")) {
                result = currentNum * num2;
            } else if (currentOp.equals("/")) {
                result = currentNum / num2;
            }
            numField.setText(Double.toString(result));
        } else if (command.equals("C")) {
            // clear the display
            numField.setText("");
            currentNum = 0.0;
            currentOp = "+";
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }
}