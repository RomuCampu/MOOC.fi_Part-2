
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MenuPanel extends JPanel {

    public MenuPanel() {
        super(new GridLayout(1, 3));
        createComponent();
    }

    private void createComponent() {
        add(new JButton("+"));
        add(new JButton("-"));
        add(new JButton("Z"));
    }
}
