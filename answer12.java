import java.awt.*;
import java.awt.event.*;
public class answer12 extends Frame implements ActionListener {
    private Button b1=null;
    private Button b2=null;
    private Button b3=null;
    private Label l;
    private Label c;
    private Label clg;
    private Label roll;
    private Label cgpa;
    answer12(){
        b1=new Button("A");
        b2=new Button("B");
        b3=new Button("Exit");
        l=new Label("Name: Harsh Mishra");
        c=new Label("Course: B.Sc Computer Science");
        clg=new Label("College: Keshav Mahavidyalaya");
        roll=new Label("Roll No: 0759");
        cgpa=new Label("CGPA: 7.5");

       
        add(b1);
        add(b2);
        add(b3);
        b1.setLocation(50,50);
        b2.setLocation(50,70);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        setSize(500,200);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        Object src=e.getSource();
        if(src==b1){
            l.setBounds(40, 50, 300, 20);
            add(l);
            c.setBounds(40,70,300,20);
            add(c);
            roll.setBounds(40,90,300,20);
            add(roll);
            clg.setBounds(40, 110, 300, 20);
            add(clg);
        }
        else if(src==b2){
            cgpa.setBounds(40,130,300,20);
            add(cgpa);
        }
        else if(src==b3){
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        new answer12();
    }
    
}