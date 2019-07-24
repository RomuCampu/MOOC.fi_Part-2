
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {

    private JFrame frame;
    private JButton addButton;
    private JButton removeButton;
    private JButton resetButton;

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(300, 300));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);

        JTextField resultField = new JTextField("0");
        resultField.setEnabled(false);

        JTextField inputField = new JTextField();
        
        // lower panel buttons
        JPanel buttons = new JPanel();
    
        this.addButton = new JButton("+");
        this.removeButton = new JButton("-");
        this.resetButton = new JButton("Z");
        this.resetButton.setEnabled(false);
        
        buttons.setLayout(new GridLayout(1, 3));
        
        
        buttons.add(addButton);
        buttons.add(removeButton);
        buttons.add(resetButton);
        
        CalculatorActionListener listener = new CalculatorActionListener(inputField, resultField, addButton,  removeButton, resetButton);
        
        this.addButton.addActionListener(listener);
        this.removeButton.addActionListener(listener);
        this.resetButton.addActionListener(listener);
        inputField.addActionListener(listener);
        container.add(resultField);
        container.add(inputField);
        container.add(buttons, BorderLayout.SOUTH);
    }
  
    public JFrame getFrame() {
        return frame;
    }
}
