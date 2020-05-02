import java.awt.*;
import java.awt.event.*;
public class m extends Frame implements MouseListener {
    Label l;
    m(){
        addMouseListener(this);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setSize(200,200);
        setVisible(true);
    }
    public void mouseEntered(MouseEvent e){
        Frame.setSize(600,600);
    }
    public void mouseClicked(MouseEvent e){
        Frame.setSize(200,200);
    }
    public void mouseExited(MouseEvent e){
        System.exit(0);
    }
    public void mousePressed(MouseEvent e) {  
        l.setText("pressed");
    }  
    public void mouseReleased(MouseEvent e) {  
        l.setText("released");
    }  
    public static void main(String[] args) {
        new m();
    }
    
}