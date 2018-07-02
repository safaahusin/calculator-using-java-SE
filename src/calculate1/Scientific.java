package calculate1;

import Core.Operation;
import java.awt.Color;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Scientific extends Standard {
    private JPanel second,fun;
    private JButton b;
    private JButton []b12;
    private JButton []b6;
    private JButton []b8;
  private  Operation op=new Operation();
  public  Scientific()
   {
       b28[9].setEnabled(true);
       b28[10].setEnabled(true);
       b28[11].setEnabled(true);
        setSize(800,420);
        setTitle("Scientific ");
        setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        second =new JPanel();
        second.setBounds(390,5,395,352);
        second.setBackground(Color.gray);
        second.setBorder(new LineBorder(Color.white,7));
        fun=new JPanel(); 
        second.setLayout(null);
        fun.setBounds(13,7,300,170);
        fun.setBorder(new TitledBorder("Fun"));
        fun.setBackground(Color.GRAY);
        second.add(fun);
         add(second);
         b12=new JButton[12];
         fun.setLayout(null);
         b12[0]=new JButton("Sin"); 
         b12[0].setBounds(15,20,81 ,30);
         b12[1]=new JButton("Cos");
          b12[1].setBounds(107,20,81 ,30);
         b12[2]=new JButton("Tan");
          b12[2].setBounds(200,20,81 ,30);
         b12[3]=new JButton("Sinh");
         b12[3].setBounds(15,70,81 ,30);
         b12[4]=new JButton("Cosh");
          b12[4].setBounds(107,70,81 ,30);
         b12[5]=new JButton("Tanh");
          b12[5].setBounds(200,70,81 ,30);
         b12[6]=new JButton("Sin^-1");
          b12[6].setBounds(15,120,81 ,30);
         b12[7]=new JButton("Cos^-1");
         b12[7].setBounds(107,120,81 ,30);
         b12[8]=new JButton("Tan^-1");
          b12[8].setBounds(200,120,81 ,30);
          for(int i=0;i<9;i++)
          {
              fun.add(b12[i]);
              b12[i].setBorder(new LineBorder(Color.BLACK,2));
              b12[i].addActionListener(this);
          }
          b6=new JButton[7];
          b6[0]=new JButton("Int");
          b6[0].setBounds(320,20,60 ,35);
          b6[1]=new JButton("Frac");
          b6[1].setBounds(320,67,60 ,35);
          b6[2]=new JButton("Random");
          b6[2].setBounds(320,113,60 ,35);
          b6[3]=new JButton("F - E");
          b6[3].setBounds(320,158,60 ,35);
          b6[4]=new JButton("Exp");
          b6[4].setBounds(320,204,60 ,35);
          b6[5]=new JButton("Degree");
          b6[5].setBounds(320,250,60 ,35);
          b6[6]=new JButton("Radians");
          b6[6].setBounds(320,300,60 ,35);
          for(int i=0;i<=6;i++)
          {
               second.add(b6[i]);
               b6[i].setBorder(new LineBorder(Color.lightGray,3));
               b6[i].addActionListener(this);
          }
        b8=new JButton[16];
        b8[0]=new JButton("E");
        b8[0].setBounds(16, 190, 50,35 );
        b8[1]=new JButton("Ln");
        b8[1].setBounds(77, 190, 50,35 );
        b8[2]=new JButton("Log");
        b8[2].setBounds(140, 190, 50,35 );
        b8[3]=new JButton("10^x");
        b8[3].setBounds(200, 190, 50,35 );
        b8[4]=new JButton("10^3");
        b8[4].setBounds(260, 190, 50,35 );
        b8[5]=new JButton("X^2");
        b8[5].setBounds(16, 245, 50,35 );
        b8[6]=new JButton("X^3");
        b8[6].setBounds(77, 245, 50,35 );
        b8[7]=new JButton("X^y");
        b8[7].setBounds(140, 245, 50,35 );
        b8[8]=new JButton("PI");
        b8[8].setBounds(200, 245, 50,35 );
        b8[9]=new JButton("2*PI");
        b8[9].setBounds(260, 245, 50,35 );
        b8[10]=new JButton("Cbrt");
        b8[10].setBounds(16, 300, 50,35 );
        b8[11]=new JButton("Abs");
        b8[11].setBounds(77, 300, 50,35 );
        b8[12]=new JButton("Mod");
        b8[12].setBounds(140, 300, 50,35 );
        b8[13]=new JButton("N!");
        b8[13].setBounds(200, 300, 50,35 );
        b8[14]=new JButton("zz");
        b8[14].setBounds(260, 300, 50,35 );
        for(int i=0;i<15;i++)
        {
            b8[i].setBorder(new LineBorder(Color.BLACK,1));
            second.add(b8[i]);
            b8[i].addActionListener(this);
        }
   }
   
}
