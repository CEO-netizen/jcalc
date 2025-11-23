/*
 *
 *        __           __        ________  ______
 *       / /________ _/ /____   / ____/ / / /  _/
 *  __  / / ___/ __ `/ / ___/  / / __/ / / // /
 * / /_/ / /__/ /_/ / / /__   / /_/ / /_/ // /
 * \____/\___/\__,_/_/\___/   \____/\____/___/
 * ASCii art by: Zero
 * code by: Zero title: Jcalc GUI
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame implements ActionListener {
  private JTextField display;
  private double lastResult = 0.0;

  public Main() {
    setTitle("Jcalc GUI");
    setSize(300, 450);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new BorderLayout());
    setLocationRelativeTo(null); // Center window
    setResizable(false);

    display = new JTextField();
    display.setEditable(true);
    display.setFont(new Font("Arial", Font.BOLD, 24));
    add(display, BorderLayout.NORTH);

    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new BorderLayout());

    // Basic buttons panel (4x4 grid)
    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));

    String[] buttons = {
      "7", "8", "9", "/",
      "4", "5", "6", "*",
      "1", "2", "3", "-",
      "0", "C", "=", "+"
    };

    for (String text : buttons) {
      JButton button = new JButton(text);
      button.setFont(new Font("Arial", Font.BOLD, 20));
      button.addActionListener(this);
      buttonPanel.add(button);
    }

    mainPanel.add(buttonPanel, BorderLayout.CENTER);

    // Function buttons panel (below basic buttons)
    JPanel funcPanel = new JPanel();
    funcPanel.setLayout(new FlowLayout());

    String[] funcButtons = {"sqrt(", "sin(", "cos(", "cbrt(", "pi", "e", "(", ")", "ans"};

    for (String text : funcButtons) {
      JButton button = new JButton(text);
      button.setFont(new Font("Arial", Font.BOLD, 16));
      button.addActionListener(this);
      funcPanel.add(button);
    }

    mainPanel.add(funcPanel, BorderLayout.SOUTH);

    add(mainPanel, BorderLayout.CENTER);
    setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    String input = e.getActionCommand();

    if (input.matches("[0-9]")
        || input.equals("+")
        || input.equals("-")
        || input.equals("*")
        || input.equals("/")
        || input.equals("(")
        || input.equals(")")) {
      display.setText(display.getText() + input);
    } else if (input.equals("C")) {
      display.setText("");
      lastResult = 0.0;
    } else if (input.equals("=")) {
      try {
        ExpressionParser parser = new ExpressionParser(display.getText(), lastResult);
        double result = parser.parse();
        lastResult = result;
        display.setText(String.valueOf(result));
      } catch (Exception ex) {
        display.setText("Error: " + ex.getMessage());
      }
    } else {
      // Function buttons: append to display
      display.setText(display.getText() + input);
    }
  }

  public static void main(String[] args) {
    new Main();
  }
}
