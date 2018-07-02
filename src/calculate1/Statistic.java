package calculate1;
import java.awt.Color;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Statistic extends Standard {
    public JButton []b11;
    private JPanel p1;
    private JButton bt;
   public Statistic()
    {
        char ch;
        for(int i=9;i<=11;i++)
        b28[i].setEnabled(false);
        b28[5].setText("DL");
        setSize(600,420);
        setTitle("Statistic");
        setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        b11=new JButton[11];
        b11[0]=new JButton("CAD");
        b11[1]=new JButton("F - E");
        b11[2]=new JButton("Exp");
        b11[3]=new JButton(st[1]);
      
        b11[4]=new JButton(st[2]);
        b11[5]=new JButton(st[0]);
        b11[6]=new JButton(st[3]);
        b11[7]=new JButton(st[4]);
        b11[8]=new JButton(st[5]);
        b11[9]=new JButton("Add");
        
        b11[0].setBounds(455,18,70, 30);
        b11[1].setBounds(410,70,55, 30);
        b11[7].setBounds(410,130,55, 30);
        b11[3].setBounds(410,190,55, 30);
        b11[5].setBounds(410,250,55, 30);
        
        b11[9].setBounds(455,300,70, 30);
        
        b11[2].setBounds(510,70,55, 30);
        b11[8].setBounds(510,130,55, 30);
        b11[4].setBounds(510,190,55, 30);
        b11[6].setBounds(510,250,55, 30);
        
        for(int i=0;i<10;i++)
        {
             add(b11[i]);
             b11[i].setBorder(new LineBorder(Color.BLACK,3));
             b11[i].addActionListener(this);
        }
       
    }
}
