import java.awt.*;

public class Ellipse extends Rectangle {

    @Override
    public void draw(Graphics g) {
        super.draw(g); // Desenha o retângulo base
        g.setColor(getColor()); // Define a cor da elipse
        g.fillOval(getX(), getY(), getWidth(), getHeight()); // Desenha a elipse
    }


}