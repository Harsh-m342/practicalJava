import java.awt.*;
import java.awt.event.*;

import javax.imageio.plugins.tiff.ExifTIFFTagSet;
public class Answer10 extends Frame implements ActionListener {
    private Button b1=null;
    private Button b2=null;
    private Button b3=null;
    Answer10(){
        b1=new Button("RED");
        b2=new Button("Blue");
        b3=new Button("Exit");
        add(b1);
        add(b2);
        add(b3);
        b1.setLocation(50,50);
        b2.setLocation(50,70);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        setSize(200,200);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        Object src=e.getSource();
        if(src==b1){
            setBackground(Color.RED);
        }
        else if(src==b2){
            setBackground(Color.BLUE);
        }
        else if(src==b3){
            System.exit(0);        }
    }
    public static void main(String[] args) {
        new Answer10();
    }
    
}