import java.awt.*;
import java.awt.event.*;

public class penApp extends Frame {
    public int oldx=0;
    public int oldy=0;
    public int newx=0;
    public int newy=0;

    public static void main(String[] args){
        penApp window = new penApp();
        window.setVisible(true);
    }

    public penApp(){
        setSize(600, 500);
        setTitle("Pen 응용");
        MouseKeeper mouse = new MouseKeeper();
        addMouseListener(mouse);
    }

    private class MouseKeeper extends MouseAdapter{
        public void mousePressed(MouseEvent e){
            newx=e.getX();
            newy=e.getY();
            repaint();
        }
    }

    public void paint(Graphics g){
        g.drawLine(oldx, oldy, newx, newy);
        g.setColor(Color.red);
        g.drawString("Hello", newx, newy);
        oldx=newx;
        oldy=newy;
    }
}
