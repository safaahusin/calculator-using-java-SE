package calculate1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class HelpAbout extends JFrame implements ActionListener {
    
    private JLabel []l;
    private JPanel []p;
    private JButton b;
 
   public HelpAbout()
    {
      // this.getContentPane().setBackground( new Color(100,100,170) );
         this.setIconImage(new ImageIcon("s1.jpg").getImage());  
        ImageIcon m=new ImageIcon("ss.jpg");
        this.setContentPane(new JLabel(m));
        setSize(500,500);
        setTitle("Programmer ");
        setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l=new JLabel[10];
        p=new JPanel[10];
         Font f=new Font("Serfi",Font.BOLD+Font.ITALIC,15);
        l[0]=new JLabel("ProGrammer By :- ");
        l[0].setFont(f);
        l[0].setForeground(Color.darkGray);
        setLayout(null);
        l[0].setBounds(40,13, 250, 30);
        p[0]=new JPanel(null);
        p[0].add(l[0]);
        p[0].setBackground(Color.lightGray);
        p[0].setBorder(new LineBorder(new Color(100,100,100),3));
        p[0].setBounds(100,30, 250,50);
        l[1]=new JLabel("Safaa  Hussien  El-Shafe'y ");
        l[1].setBounds(30,20, 300, 20);
        l[2]=new JLabel("Student in Computer and Information Science "); 
        l[2].setBounds(30,50, 350, 20);
        l[3]=new JLabel("Helwan University");
        l[3].setBounds(30,80, 300, 20);
        l[4]=new JLabel("safaahusin@yahoo.com");
        l[4].setBounds(30,110, 250, 20);
        l[5]=new JLabel("Using Java Language ");
        l[5].setBounds(30,140, 250, 30);
        l[6]=new JLabel("25/1/2016");
        l[6].setBounds(30,170, 200, 30);
        p[1]=new JPanel(null);
        p[1].add(l[1]);
        p[1].add(l[2]);
        p[1].add(l[3]);
        p[1].add(l[4]);
        p[1].add(l[5]);
        p[1].add(l[6]);
        b=new JButton ("Back");
        b.addActionListener(this);
        b.setBounds(150, 250, 80, 50);
        b.setBorder(new LineBorder(Color.BLACK,1));
        p[1].add(b);
        for(int i=1;i<=6;i++)
        {
            l[i].setForeground(Color.BLACK);
            l[i].setFont(f);
        }
        p[1].setBorder(new LineBorder(Color.WHITE,7));
        p[1].setBackground(Color.gray);
        p[1].setBounds(30, 110,430, 330);
        add(p[0]);
        add(p[1]);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand()=="Back")
        {
            Standard c=new Standard();
            c.setVisible(true);
            setVisible(false);
        }
    }
}
