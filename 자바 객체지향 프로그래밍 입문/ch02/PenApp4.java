import java.awt.*;
import java.awt.event.*;

class Pt{
    int x;
    int y;
}

public class PenApp4 extends Frame{
    public Pt startPoint=null;
    public Pt endPoint=null;
    public boolean firstClick=true;

    public static void main(String[] args){
        PenApp4 window = new PenApp4();
        window.setVisible(true);
    }

    public PenApp4(){
        setSize(600,500);
        setTitle("Pen 응용");
        MouseKeeper mouse=new MouseKeeper();
        addMouseListener(mouse);

        startPoint=new Pt();
        endPoint=new Pt();
    }

    public class MouseKeeper extends MouseAdapter{
        public void mousePressed(MouseEvent e){
            if(firstClick){
                startPoint.x=e.getX();
                startPoint.y=e.getY();
                firstClick=false;
            }
            else{
                endPoint.x=e.getX();
                endPoint.y=e.getY();
                firstClick=true;
                repaint();
            }
        }
    }

    public void paint(Graphics g){
        g.drawLine(startPoint.x, startPoint.y, endPoint.x, endPoint.y);
    }
}