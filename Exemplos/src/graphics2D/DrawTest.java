package graphics2D;

import java.awt.EventQueue;

import javax.swing.JFrame;


public class DrawTest {

	public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable()  {
            public void run() {
                DrawFrame frame = new DrawFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
             }
         });
	}

}
