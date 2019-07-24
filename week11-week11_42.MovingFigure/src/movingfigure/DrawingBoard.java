
package movingfigure;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingBoard extends JPanel {
    
    private Figure figure;
    
    public DrawingBoard(Figure figure) {
        this.figure = figure;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        figure.draw(g);
    }
}
