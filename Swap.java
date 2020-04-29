import java.awt.*;
import java.awt.event.*;
public class Swap extends Frame implements ActionListener {
    TextField tf1;
    TextField tf2;
    Button swp;

    Swap(){
        tf1=new TextField("MOHAN");
        tf2=new TextField("ROHAN");
        swp=new Button("SWAP!!");
        add(tf1);
        add(tf2);
        add(swp);
        swp.addActionListener(this);
        setTitle("SWAP PROGRAM");
        setLayout(new FlowLayout());
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        Object src=e.getSource();
        if(src==swp){
            System.out.println("swap clicked");
            String tmp=tf1.getText();
            String tmp2=tf2.getText();
            tf1.setText(tmp2);
            tf2.setText(tmp);
        }
    }
    public static void main(String[] args) {
        Swap s=new Swap();
    }

}