package greeter.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Swing on");
        frame.setPreferredSize(new Dimension(400, 200));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);
        
        container.add(new JLabel("First - "));
        container.add(new JLabel("Second - "));
        container.add(new JLabel("Third"));
        container.add(new JButton("click"));
        
        
//        container.setLayout(new BorderLayout());
//        
//        container.add(new JButton("North"), BorderLayout.NORTH);
//        container.add(new JButton("East"), BorderLayout.EAST);
//        container.add(new JButton("South"), BorderLayout.SOUTH);
//        container.add(new JButton("West"), BorderLayout.WEST);
//        container.add(new JButton("Center"), BorderLayout.CENTER);
//        
//        container.add(new JButton("Default (Center)"));
        
        
//        JLabel text = new JLabel("Hi!");
//        container.add(text);
//        JButton button = new JButton("Click!");
//        container.add(button);
    }

    public JFrame getFrame() {
        return frame;
    }
}
