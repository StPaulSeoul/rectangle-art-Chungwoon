import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class myClass extends JPanel {
	private static final long serialVersionUID = 1L;
	public static Dimension size;

	public myClass() {
		super();
		setBackground(Color.BLACK);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(3.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

		g2.setColor(Color.YELLOW);
		Rectangle2D a = new Rectangle2D.Double(0, 0, 400, 560);
		Rectangle2D b = new Rectangle2D.Double(400, 420, 140, 140);
		Rectangle2D c = new Rectangle2D.Double(1520, 210, 200, 630);
		g2.fill(a);
		g2.fill(b);
		g2.fill(c);

		g2.setColor(Color.RED);
		Rectangle2D d = new Rectangle2D.Double(0, 560, 540, 1080);
		Rectangle2D e = new Rectangle2D.Double(620, 420, 900, 420);
		Rectangle2D f = new Rectangle2D.Double(1520, 0, 400, 210);
		g2.fill(d);
		g2.fill(e);
		g2.fill(f);

		g2.setColor(Color.BLUE);
		Rectangle2D h = new Rectangle2D.Double(400, 0, 1120, 420);
		Rectangle2D i = new Rectangle2D.Double(780, 840, 940, 240);
		Rectangle2D j = new Rectangle2D.Double(1720, 410, 200, 670);
		g2.fill(h);
		g2.fill(i);
		g2.fill(j);

		g2.setColor(Color.WHITE);
		Rectangle2D k = new Rectangle2D.Double(540, 420, 80, 420);
		Rectangle2D l = new Rectangle2D.Double(540, 840, 240, 240);
		Rectangle2D m = new Rectangle2D.Double(1720, 210, 200, 200);
		g2.fill(k);
		g2.fill(l);
		g2.fill(m);

		/*
		 * int boxesWidth = 1000; int boxesHeight = 700;
		 * 
		 * for (int x = 0; x < boxesWidth; x++) { for (int y = 0; y <
		 * boxesHeight; y++) { int v = (int) ((double) 255 / (double)
		 * (boxesWidth + boxesHeight) * (x + y));
		 * 
		 * Color c = new Color(v, 0, v, 255); g2.setColor(c);
		 * 
		 * Rectangle2D r = new Rectangle2D.Double(x * size.getWidth() /
		 * boxesWidth, y * size.getHeight() / boxesHeight, size.getWidth() /
		 * boxesWidth, size.getHeight() / boxesHeight); g2.fill(r); } }
		 */
	}

	public void setupDisplay() {
		JFrame application = new JFrame();
		application.add(this);
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.setSize(1920, 1080);
		application.setExtendedState(JFrame.MAXIMIZED_BOTH);
		application.setUndecorated(true);
		application.setVisible(true);
		size = application.getSize();
	}

	public static void main(String[] args) {
		myClass program = new myClass();
		program.setupDisplay();

		program.repaint();
	}
}
