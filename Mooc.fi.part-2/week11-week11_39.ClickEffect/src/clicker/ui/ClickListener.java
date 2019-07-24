
package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;


public class ClickListener implements ActionListener {

    private Calculator calculator;
    private JLabel label;
    
    public ClickListener(Calculator calculator, JLabel label) {
        this.calculator = calculator;
        this.label = label;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        this.calculator.increase();
        this.label.setText("" + calculator.giveValue());
    }
}
