import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JPanel {

   JTextField displayField;
   JButton button0, button1, button2, button3, button4, button5, button6,
         button7, button8, button9, buttonMultiply, buttonDivide, buttonAdd,
         buttonSubtract, buttonEquals, buttonClear, buttonDecimal;
   double previousValue, currentValue;
   String operation = "";
   String text = "";

   public Calculator() {
      setPreferredSize(new Dimension(435, 415));
      setBackground(new Color(250, 218, 221));
      setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

      Border border = BorderFactory.createLineBorder(new Color(254, 238, 237), 3);

      displayField = new JTextField(9);
      displayField.setHorizontalAlignment(JTextField.RIGHT);
      displayField.setText("0");
      displayField.setFont(new Font("Nanum Gothic", Font.PLAIN, 50));
      displayField.setBorder(border);
      displayField.setEditable(false);

      button0 = new JButton("0");
      button0.setPreferredSize(new Dimension(155, 75));

      button1 = new JButton("1");
      button1.setPreferredSize(new Dimension(75, 75));

      button2 = new JButton("2");
      button2.setPreferredSize(new Dimension(75, 75));

      button3 = new JButton("3");
      button3.setPreferredSize(new Dimension(75, 75));

      button4 = new JButton("4");
      button4.setPreferredSize(new Dimension(75, 75));

      button5 = new JButton("5");
      button5.setPreferredSize(new Dimension(75, 75));

      button6 = new JButton("6");
      button6.setPreferredSize(new Dimension(75, 75));

      button7 = new JButton("7");
      button7.setPreferredSize(new Dimension(75, 75));

      button8 = new JButton("8");
      button8.setPreferredSize(new Dimension(75, 75));

      button9 = new JButton("9");
      button9.setPreferredSize(new Dimension(75, 75));

      buttonMultiply = new JButton("X");
      buttonMultiply.setPreferredSize(new Dimension(75, 75));

      buttonDivide = new JButton("%");
      buttonDivide.setPreferredSize(new Dimension(75, 75));

      buttonAdd = new JButton("+");
      buttonAdd.setPreferredSize(new Dimension(75, 75));

      buttonSubtract = new JButton("-");
      buttonSubtract.setPreferredSize(new Dimension(75, 75));

      buttonEquals = new JButton("=");
      buttonEquals.setPreferredSize(new Dimension(155, 75));

      buttonClear = new JButton("AC");
      buttonClear.setPreferredSize(new Dimension(155, 75));

      buttonDecimal = new JButton(".");
      buttonDecimal.setPreferredSize(new Dimension(75, 75));

      add(displayField);
      add(button7);
      add(button8);
      add(button9);
      add(buttonClear);
      add(button4);
      add(button5);
      add(button6);
      add(buttonAdd);
      add(buttonSubtract);
      add(button1);
      add(button2);
      add(button3);
      add(buttonMultiply);
      add(buttonDivide);
      add(button0);
      add(buttonDecimal);
      add(buttonEquals);

      ButtonListener bListener = new ButtonListener();
      button0.addActionListener(bListener);
      button1.addActionListener(bListener);
      button2.addActionListener(bListener);
      button3.addActionListener(bListener);
      button4.addActionListener(bListener);
      button5.addActionListener(bListener);
      button6.addActionListener(bListener);
      button7.addActionListener(bListener);
      button8.addActionListener(bListener);
      button9.addActionListener(bListener);
      buttonMultiply.addActionListener(bListener);
      buttonDivide.addActionListener(bListener);
      buttonAdd.addActionListener(bListener);
      buttonSubtract.addActionListener(bListener);
      buttonEquals.addActionListener(bListener);
      buttonClear.addActionListener(bListener);
      buttonDecimal.addActionListener(bListener);

   }

   private class ButtonListener implements ActionListener {
      public void actionPerformed(ActionEvent ae) {
         if (ae.getSource() == button0) {
            try {
               text += "0";
               currentValue = Double.parseDouble(text);
               displayField.setText(text);
            } catch (Exception e) {
               currentValue = 0;
               previousValue = 0;
               displayField.setText("Error. Please Try Again");
            }
         } else if (ae.getSource() == button1) {
            try {
               text += "1";
               currentValue = Double.parseDouble(text);
               displayField.setText(text);
            } catch (Exception e) {
               currentValue = 0;
               previousValue = 0;
               displayField.setText("Error. Please Try Again");
            }
         } else if (ae.getSource() == button2) {
            try {
               text += "2";
               currentValue = Double.parseDouble(text);
               displayField.setText(text);
            } catch (Exception e) {
               currentValue = 0;
               previousValue = 0;
               displayField.setText("Error. Please Try Again");
            }
         } else if (ae.getSource() == button3) {
            try {
               text += "3";
               currentValue = Double.parseDouble(text);
               displayField.setText(text);
            } catch (Exception e) {
               currentValue = 0;
               previousValue = 0;
               displayField.setText("Error. Please Try Again");
            }
         } else if (ae.getSource() == button4) {
            try {
               text += "4";
               currentValue = Double.parseDouble(text);
               displayField.setText(text);
            } catch (Exception e) {
               currentValue = 0;
               previousValue = 0;
               displayField.setText("Error. Please Try Again");
            }
         } else if (ae.getSource() == button5) {
            try {
               text += "5";
               currentValue = Double.parseDouble(text);
               displayField.setText(text);
            } catch (Exception e) {
               currentValue = 0;
               previousValue = 0;
               displayField.setText("Error. Please Try Again");
            }
         } else if (ae.getSource() == button6) {
            try {
               text += "6";
               currentValue = Double.parseDouble(text);
               displayField.setText(text);
            } catch (Exception e) {
               currentValue = 0;
               previousValue = 0;
               displayField.setText("Error. Please Try Again");
            }
         } else if (ae.getSource() == button7) {
            try {
               text += "7";
               currentValue = Double.parseDouble(text);
               displayField.setText(text);
            } catch (Exception e) {
               currentValue = 0;
               previousValue = 0;
               displayField.setText("Error. Please Try Again");
            }
         } else if (ae.getSource() == button8) {
            try {
               text += "8";
               currentValue = Double.parseDouble(text);
               displayField.setText(text);
            } catch (Exception e) {
               currentValue = 0;
               previousValue = 0;
               displayField.setText("Error. Please Try Again");
            }
         } else if (ae.getSource() == button9) {
            try {
               text += "9";
               currentValue = Double.parseDouble(text);
               displayField.setText(text);
            } catch (Exception e) {
               currentValue = 0;
               previousValue = 0;
               displayField.setText("Error. Please Try Again");
            }
         } else if (ae.getSource() == buttonDecimal) {
            try {
               if (text.isEmpty()) {
                  text = "0.";
              } else {
                  if (!text.contains(".")) {
                      text += ".";
                  }
              }
               currentValue = Double.parseDouble(text);
               displayField.setText(text);
            } catch (Exception e) {
               currentValue = 0;
               previousValue = 0;
               displayField.setText("Error. Please Try Again");
            }
         } else if (ae.getSource() == buttonMultiply) {
            try {
               handleOperation();
               operation = "x";
               previousValue = currentValue;
               currentValue = 0;
               displayField.setText(Double.toString(previousValue) + " x");
               text = "";
            } catch (Exception e) {
               currentValue = 0;
               previousValue = 0;
               displayField.setText("Error. Please Try Again");
            }
         } else if (ae.getSource() == buttonDivide) {
            try {
               handleOperation();
               operation = "%";
               previousValue = currentValue;
               currentValue = 0;
               displayField.setText(Double.toString(previousValue) + " %");
               text = "";
            } catch (Exception e) {
               currentValue = 0;
               previousValue = 0;
               displayField.setText("Error. Please Try Again");
            }
         } else if (ae.getSource() == buttonAdd) {
            try {
               handleOperation();
               operation = "+";
               previousValue = currentValue;
               currentValue = 0;
               displayField.setText(Double.toString(previousValue) + " +");
               text = "";
            } catch (Exception e) {
               currentValue = 0;
               previousValue = 0;
               displayField.setText("Error. Please Try Again");
            }
         } else if (ae.getSource() == buttonSubtract) {
            try {
               handleOperation();
               operation = "-";
               previousValue = currentValue;
               currentValue = 0;
               displayField.setText(Double.toString(previousValue) + " -");
               text = "";
            } catch (Exception e) {
               currentValue = 0;
               previousValue = 0;
               displayField.setText("Error. Please Try Again");
            }
         } else if (ae.getSource() == buttonEquals) {
            try {
               handleOperation();
               text = "";
               operation = "";
            } catch (Exception e) {
               currentValue = 0;
               previousValue = 0;
               displayField.setText("Error. Please Try Again");
            }
         } else if (ae.getSource() == buttonClear) {
            try {
               text = "";
               currentValue = 0;
               previousValue = 0;
               displayField.setText("0");
            } catch (Exception e) {
               currentValue = 0;
               previousValue = 0;
               displayField.setText("Error. Please Try Again");
            }
         }
      }

      private void handleOperation(){
         if (operation.equals("x")){
            previousValue = previousValue * currentValue;
            currentValue = previousValue;
            displayField.setText(Double.toString(previousValue));
         } else if (operation.equals("%")){
            previousValue = previousValue / currentValue;
            currentValue = previousValue;
            displayField.setText(Double.toString(previousValue));
         } else if (operation.equals("+")){
            previousValue = previousValue + currentValue;
            currentValue = previousValue;
            displayField.setText(Double.toString(previousValue));
         } else if (operation.equals("-")) {
            previousValue = previousValue - currentValue;
            currentValue = previousValue;
            displayField.setText(Double.toString(previousValue));
         } else {
            previousValue = currentValue;
            displayField.setText(Double.toString(currentValue));
         }
      }
   }
}
