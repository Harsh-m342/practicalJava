import java.awt.*;
import java.awt.event.*;
public class Answer9 extends Frame {
    private TextField tx=null;
    Answer9(){
        tx=new TextField("String!!");
        add(tx);
        tx.setBackground(Color.PINK);
        setSize(200,200);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setVisible(true);
    }
    public static void main(String[] args) {
        new Answer9();
    }
    
}