package graphics2D;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class DrawComponent extends JComponent {
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g; // Acessa objeto a partir da Graphics2D
		
		double 	leftX = 100,
				topY = 100,
				width = 200,
				height = 150;
		float[] dashPattern = { 20, 10, 30, 10 };
		
		// Cria um retângulo
		Rectangle2D ret = new Rectangle2D.Double(leftX,topY,width,height);
		g2.setPaint(Color.red);	// Define a cor do desenho
		g2.setStroke(new BasicStroke(3)); // Define o estilo do traço
		g2.draw(ret);
		
		Ellipse2D elip = new Ellipse2D.Double();
		elip.setFrame(ret);
		g2.setPaint(Color.blue);
		g2.setStroke(new BasicStroke(6, BasicStroke.CAP_BUTT, // Define o estilo do traço
                BasicStroke.JOIN_MITER, 10,
                dashPattern, 0));
		g2.draw(elip);
		
		
		g2.setPaint(Color.yellow);
		g2.setStroke(new BasicStroke(2)); // Define o estilo do traço
		g2.draw(new Line2D.Double(leftX,topY,leftX+width,topY+height));
		
		double centerX = ret.getCenterX();
		double centerY = ret.getCenterY();
		double raio = 150;
		Ellipse2D circ = new Ellipse2D.Double();
		circ.setFrameFromCenter(centerX, centerY, centerX+raio, centerY+raio);
		g2.setPaint(Color.orange);
		g2.draw(circ);
		g2.draw3DRect(10, 10, 50, 50, true);
		g2.setPaint(Color.blue);
		g2.fill3DRect(330, 300, 50, 50, false);
		g2.setPaint(Color.red);
		g2.drawString("Outro Exemplo", 10, 350);
	
	}
}
