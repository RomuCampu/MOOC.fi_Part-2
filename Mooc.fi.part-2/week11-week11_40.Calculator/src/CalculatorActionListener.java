
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorActionListener implements ActionListener {

    private JTextField textInput;
    private JTextField textOutput;
    private JPanel panel;
    private JButton addButton;
    private JButton minButton;
    private JButton Z;
    private CalculatorLogic calculator = new CalculatorLogic();

    ;

    public CalculatorActionListener(JTextField textInput, JTextField textOutput,
            JButton addButton, JButton minButton, JButton Z) {
        this.textInput = textInput;
        this.textOutput = textOutput;
        this.addButton = addButton;
        this.minButton = minButton;
        this.Z = Z;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        int input = 0;

        try {
            input = Integer.parseInt(this.textInput.getText());
        } catch (Exception e) {
        }

        if (ae.getSource() == this.addButton) {
            this.calculator.add(input);
        } else if (ae.getSource() == this.minButton) {
            this.calculator.decrease(input);
        } else {
            this.calculator.reset();
        }

        this.textOutput.setText("" + this.calculator.result());
        this.textInput.setText("");
        resetButton();
    }

    private void resetButton() {
        if (this.calculator.result() == 0) {
            this.Z.setEnabled(false);
        } else {
            this.Z.setEnabled(true);
        }
    }
}
