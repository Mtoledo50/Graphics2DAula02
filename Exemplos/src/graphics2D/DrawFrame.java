package graphics2D;

import javax.swing.JFrame;

public class DrawFrame extends JFrame {
	public static final int LARGURA = 400;
	public static final int ALTURA = 400;
	public DrawFrame() {
		setTitle("DrawTest");
		setSize(LARGURA,ALTURA);
		DrawComponent comp = new DrawComponent();
		add(comp);
	}
}
