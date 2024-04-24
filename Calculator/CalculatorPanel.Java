import javax.swing.*;

public class CalculatorPanel{
   public static void main(String[] args){
      JFrame frame = new JFrame("Calculator"); frame.
      setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      
      Calculator calcPanel = new Calculator();
      frame.getContentPane().add(calcPanel);
      
      frame.pack();
      frame.setResizable(false);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }  
}