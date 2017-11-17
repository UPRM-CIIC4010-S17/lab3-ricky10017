import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
                        //this variable produces the height of each stripe
                        int stripeHeight = height/5;
                        //
                        int starHeight = stripeHeight/2;
 
                        //Draw a border
                        g.setColor(Color.BLACK);
                        g.drawRect(x1, y1, width, height);
                        
                        //Fill red stripes
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1, width, height);
                        
                        //Fill white stripes
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, stripeHeight, width, stripeHeight);
                        g.fillRect(x1, stripeHeight*3, width, stripeHeight);
                        
                        //Fill triangle
                        Polygon triangle = new Polygon();
                        triangle.addPoint(x1, y1);
                        triangle.addPoint(x2/2, y2/2);
                        triangle.addPoint(x1, y2);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(triangle);
                        
                        
//                        //Draw square
//                        g.setColor(Color.BLACK);
//                        g.drawRect(x, y, width, starHeight);
                        
                        //Draw a star
                        Polygon star = new Polygon();
                        star.addPoint(stripeHeight - 16, (stripeHeight*2) + 15);//upper right
                        star.addPoint(stripeHeight - 6, (stripeHeight*2) + 15);
                        star.addPoint(stripeHeight, stripeHeight*2);//top
                        star.addPoint(stripeHeight + 6, (stripeHeight*2) + 15);
                        star.addPoint(stripeHeight + 16, (stripeHeight*2) + 15);
                        star.addPoint(stripeHeight + 9, (stripeHeight*2) + 25);
                        star.addPoint(stripeHeight + 14, (stripeHeight*2) + 40);
                        star.addPoint(stripeHeight, (stripeHeight*2) + 30);
                        star.addPoint(stripeHeight - 13, (stripeHeight*2) + 40);
                        star.addPoint(stripeHeight - 9, (stripeHeight*2) + 25);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(star);
                        
                        
            }
}