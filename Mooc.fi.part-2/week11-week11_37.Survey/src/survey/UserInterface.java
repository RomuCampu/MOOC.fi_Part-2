package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        
        frame = new JFrame("Survey");
        frame.setPreferredSize(new Dimension(300, 300));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }
    
    public void createComponents(Container container) {
        
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);
        
        // label
        container.add(new JLabel("Are you?"));
        
        // buttons
        ButtonGroup buttonGroup = new ButtonGroup();
       
        JCheckBox yes = new JCheckBox("Yes!");
        container.add(yes);
        
        JCheckBox no = new JCheckBox("No!");
        container.add(no);
        
        // new label
        container.add(new JLabel("Why?"));
        
        // new buttons
        JRadioButton noReason = new JRadioButton("No reason.");
        buttonGroup.add(noReason);
        container.add(noReason);
        
        JRadioButton becaseItIsFun = new JRadioButton("Because it is fun!");
        buttonGroup.add(becaseItIsFun);
        container.add(becaseItIsFun);
        
        JButton done = new JButton("Done!");
        container.add(done);
    }


    public JFrame getFrame() {
        return frame;
    }
}
