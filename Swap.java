/*Name: Swap AWT Program
Description: this program swaps the value of two text fields implemets actionlistener
Author: Harsh Mishra
*/
import java.awt.*;
import java.awt.event.*;
public class Swap extends Frame implements ActionListener {
    TextField tf1; //define a text field
    TextField tf2; //define another text field
    Button swp; //button for swapping

    Swap(){
        tf1=new TextField("MOHAN"); //inititated text field with string value
        tf2=new TextField("ROHAN"); //inititated 2nd text field with string value
        swp=new Button("SWAP!!"); //Button to swap 
        add(tf1); //Adding to frame
        add(tf2);
        add(swp);
        swp.addActionListener(this); //Setting listener to record action
        setTitle("SWAP PROGRAM"); //Tile of the frame
        setLayout(new FlowLayout()); //Layout manager
        setSize(100,100); //size of frame
        setBackground(Color.GRAY); //background color
        setVisible(true); //visibility:true
    }
    public void actionPerformed(ActionEvent e){
        Object src=e.getSource(); //getting source of action
        if(src==swp){
            System.out.println("Swap clicked");
            String tmp=tf1.getText();  //Program for swapping
            String tmp2=tf2.getText();
            tf1.setText(tmp2);
            tf2.setText(tmp);
        }
    }
    public static void main(String[] args) { //driver program
        Swap s=new Swap();
    }

}