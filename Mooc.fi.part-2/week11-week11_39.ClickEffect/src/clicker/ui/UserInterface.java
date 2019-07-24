package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.WindowConstants;
import javax.swing.*;


public class UserInterface implements Runnable {
    
    private Calculator calculator;
    private JFrame frame;

    public UserInterface() {}
    
    public UserInterface(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(300, 300));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        
        BorderLayout layout = new BorderLayout();
        container.setLayout(layout);
        
        JLabel textArea = new JLabel("" + this.calculator.giveValue());
        
        JButton button = new JButton("Click!");
        ClickListener listener = new ClickListener(this.calculator ,textArea);
        button.addActionListener(listener);
        
        container.add(textArea);
        container.add(button, BorderLayout.SOUTH);
        
    }

    public JFrame getFrame() {
        return frame;
    }
}
