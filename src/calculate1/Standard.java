package calculate1;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
/*

*/import Core.*;

public class Standard  extends Myframe { 
    
  JTextField bt;
  private JPanel j1,j2;
   JButton []b28;
  private  Operation op=new Operation();
  
   public Standard(){ 
         j1=new JPanel( null);                                                                                     
         b28=new JButton[33];
         b28[0]=new JButton("MC");
         b28[0].setBounds(12, 25, 50, 30);
         b28[1]=new JButton("M+"); 
         b28[1].setBounds(70, 25, 52, 30);
         b28[2]=new JButton("M-"); 
         b28[2].setBounds(130, 25, 52, 30);
         b28[3]=new JButton("MS");
         b28[3].setBounds(190, 25, 50, 30); 
         b28[4]=new JButton("zz");
         b28[4].setBounds(250, 25, 50, 30);
         b28[5]=new JButton("zz"); 
         b28[5].setBounds(308, 25, 52,30);
         b28[6]=new JButton("7");
         b28[6].setBounds(12, 67, 52, 35); 
         b28[7]=new JButton("8");
         b28[7].setBounds(70, 67, 52, 35); 
         b28[8]=new JButton("9"); 
         b28[8].setBounds(130, 67, 52, 35); 
         b28[9]=new JButton("Sq");
       
         b28[9].setBounds(190, 67, 52, 35);
         b28[10]=new JButton("+/-");
        
         b28[10].setBounds(250,67 , 52, 35);
         b28[11]=new JButton("1/X");
         
         b28[11].setBounds(308,67,52,35);
         b28[12]=new JButton("4");
         b28[12].setBounds(12,115,52,35);
         b28[13]=new JButton("5");
         b28[13].setBounds(70,115,52,35);
         b28[14]=new JButton("6");
         b28[14].setBounds(130,115,52,35);
         b28[15]=new JButton("1");
         b28[15].setBounds(12,164,52,35);
         b28[16]=new JButton("2");
         b28[16].setBounds(70,164,52,35);
         b28[17]=new JButton("3");
         b28[17].setBounds(130,164,52,35);
         b28[18]=new JButton("0");
         b28[18].setBounds(17,212,95,35);
         b28[19]=new JButton(".");
         b28[19].setBounds(130,212,52,35);
         b28[20]=new JButton("C");
         b28[20].setBounds(308,115,52,35);
         b28[21]=new JButton("Del");
         b28[21].setBounds(312,164,42,85);
         b28[22]=new JButton("-");
         b28[22].setBounds(10,20,45,23);
         b28[23]=new JButton("+");
         b28[23].setBounds(65,20,45,23);
         b28[24]=new JButton("*");
         b28[24].setBounds(10,60,45,23);
         b28[25]=new JButton("/");
         b28[25].setBounds(65,60,45,23);
         b28[26]=new JButton("=");
         b28[26].setBounds(40,100,45,23);
         j2=new JPanel(null);
         for(int i=0;i<27;i++)
         {
             b28[i].setBorder(new LineBorder(Color.BLACK,1));
         }
         
         for(int i=22;i<27;i++)
         {
             b28[i].setBorder(new LineBorder(Color.BLACK,2));
         }
         
         for(int i=0;i<22;i++)
         {
             j1.add(b28[i]);
         }
         
         for(int i=22;i<27;i++)
         {
             j2.add(b28[i]);
         }
        j1.setBounds(10,90,370,270); 
        j1.setBorder(new LineBorder(Color.WHITE,6));
        j2.setBorder(new TitledBorder("Op"));
        j2.setBounds(185, 107, 120, 144);
        j1.setBackground(Color.gray);
        j2.setBackground(Color.gray);
        j1.add(j2);
        add(j1);
        for(int i=0;i<27;i++)
        {
            b28[i].addActionListener(this);
        }
    }
   
   
   
    public static void main(String[] args) {
       new Standard().setVisible(true);
}
    
    
}
