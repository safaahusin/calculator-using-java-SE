package calculate1;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;// for action 
import Core.*;
import javax.swing.JFrame;


public class Myframe extends JFrame implements ActionListener {
    
  private  JButton []b3f;
           JTextField bt;
  private JMenuBar menubar;
  private JMenu []menu;
  private JMenuItem []edit;
  private  JButton []b28;
  private JMenuItem []view;
   String []st;
  private  Operation op=new Operation();
    
    public Myframe (){
         st=new String [6];
        menubar =new  JMenuBar();
        menu=new JMenu[3];
        menu[0] =new JMenu("View");
        menu[1] =new JMenu("Edit");
        menubar.add( menu[0]);
        menubar.add(menu[1]);
        view =new JMenuItem[7];
        view[0]=new JMenuItem("   Standard     ");
        view[1]=new JMenuItem("   Scientific   ");
        view[2]=new JMenuItem("   Statistic    ");
        view[3]=new JMenuItem("   Programer    ");
        view[4]=new JMenuItem("   Convertion    ");
        view[5]=new JMenuItem("   Equation      ");
        for(int i=0;i<6;i++)
        { 
        view[i].setFont(new Font("Serfi",Font.ITALIC,15));
        menu[0].add(view[i]); 
        view[i].addActionListener( this);
        if(i!=5)
        menu[0].addSeparator();
        }
        edit=new JMenuItem[3];
        this.setIconImage(new ImageIcon("s1.jpg").getImage());        
        edit[0]=new JMenuItem("      C o p y",new ImageIcon("s4.jpg"));
        edit[2]=new JMenuItem("      P a s t",new ImageIcon("s7.jpg"));
        edit[1]=new JMenuItem("      C u t ",new ImageIcon("s4.jpg"));
        edit[0].setFont(new Font("Serfi",Font.ITALIC,15));
        edit[0].setFont(new Font("Serfi",Font.ITALIC,15));
        menu[1].setFont(new Font("Serfi",Font.BOLD+Font.ITALIC,15));
        menu[0].setFont(new Font("Serfi",Font.BOLD+Font.ITALIC,15));
        edit[2].setFont(new Font("Serfi",Font.ITALIC,15));
        menu[1].setForeground(Color.DARK_GRAY);
        menu[1].setForeground(Color.DARK_GRAY);
        menu[1].add(edit[0]);
        menu[1].addSeparator();
        menu[1].add(edit[2]);
        menu[1].addSeparator();
        menu[1].add(edit[1]);
        setSize(400,400);
        setLayout(new BorderLayout());
         this.setJMenuBar(menubar); 
        setTitle("My Calculator ");
        setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         b3f=new JButton[2];
         b3f[0]=new JButton(" Help ");
         b3f[1]=new JButton("About");
         setLayout(null);
         Border l=new LineBorder(Color.BLACK,1);
         Border l2=new LineBorder(Color.WHITE,4);
         JPanel p1=new JPanel(null);
         b3f[0].setBounds(70, 2, 70, 20);
         b3f[1].setBounds(200, 2, 70, 20);
         p1.add(b3f[0]);
         p1.add(b3f[1]);
         for(int i=0;i<2;i++)
         {
             b3f[i].setBorder(l);
         }
         p1.setBackground(Color.gray);
         p1.setBorder(new LineBorder(Color.BLACK,1));
         p1.setBounds(10, 5,370,25);
         add(p1);
         Font f=new Font("Serfi",Font.BOLD+Font.ITALIC,15);
         bt=new JTextField("  Enter Your Expression ... ");
         bt.setBounds(10, 35, 370, 50);
         bt.setFont(f);
         bt.setBorder(new LineBorder(Color.BLACK,5));
         bt.setBackground(Color.lightGray);
         add(bt);
         edit[0].addActionListener( this);
         edit[1].addActionListener( this);
         bt.addActionListener(this);
         b3f[1].addActionListener( this);
         
        char  ch=163;
        st[0]=ch+"";
        st[0]=st[0]+"x";
        ch=181;
        st[1]=ch+"";
        st[2]=st[1]+"^2";
        st[3]=st[0]+"^2";
        st[4]=Character.toString('\u2202');
        st[4]+="n";
        st[5]=st[0]+"-1";
} 
    @Override
    public void actionPerformed(ActionEvent e) { 
        String x=new String();
        if(e.getActionCommand()=="MC")//Mc
        {
            bt.setText(op.get_Mc()+"");
            op.enter=true;
        }
        else if(e.getActionCommand()=="MS")
        {
             op.Mc="";
             op.num[0]="";
             op.num[1]="";
             op.result="";
             op.enter=true;
        }
        else if(e.getActionCommand()=="M+")
        {
             if(!bt.getText().equals("  Enter Your Expression ... "))
             {
             x=bt.getText();
             op.setMSum(x);
             op.num[0]="";
             op.num[1]="";
             op.result="";
             op.enter=true;
             }
        }
        else if(e.getActionCommand()=="M-")
        {
             if(!bt.getText().equals("  Enter Your Expression ... "))
             {
             x=bt.getText();
             op.setMSub(x);
             op.num[0]="";
             op.num[1]="";
             op.result=""; 
             op.enter=true;
             }
        }
        else if(e.getActionCommand()=="1")
        {
           op.add_num("1");
           bt.setText(op.return_result()); 
           op.enter=true;
        }
        else if(e.getActionCommand()=="2")
        {
           op.add_num("2");
           bt.setText(op.return_result());
             op.enter=true;
        }
        else if(e.getActionCommand()=="3")
        {
           op.add_num("3");
           bt.setText(op.return_result());
             op.enter=true;
        }
        else if(e.getActionCommand()=="4")
        {
           op.add_num("4");
           bt.setText(op.return_result());
             op.enter=true;
        }
        else if(e.getActionCommand()=="5")
        { 
           op.add_num("5");
           bt.setText(op.return_result());
             op.enter=true;
        }
        else if(e.getActionCommand()=="6")
        {
           op.add_num("6");
           bt.setText(op.return_result());
             op.enter=true;
        }
        else if(e.getActionCommand()=="7")
        {
           op.add_num("7");
           bt.setText(op.return_result()); 
           op.enter=true;
        }
        else if(e.getActionCommand()=="8")
        { 
           op.add_num("8");
           bt.setText(op.return_result());
             op.enter=true;
        }
        else if(e.getActionCommand()=="9")
        {
           op.add_num("9");
           bt.setText(op.return_result());
             op.enter=true;
        }
        else if(e.getActionCommand()==".")
        { 
           op.add_num(".");
           bt.setText(op.return_result());
             op.enter=true;
        }
        else if(e.getActionCommand()=="0")
        { 
           op.add_num("0");
           bt.setText(op.return_result());
             op.enter=true;
        }
        else if(e.getActionCommand()=="+")
        { 
           op.add_op("+");
           bt.setText(op.return_result());
             op.enter=true;
        }
        else if(e.getActionCommand()=="-")
        { 
           op.add_op("-");
           bt.setText(op.return_result());
             op.enter=true;
        }
        else if(e.getActionCommand()=="*")
        { 
           op.add_op("*");
           bt.setText(op.return_result());
             op.enter=true;
        }
        else if(e.getActionCommand()=="/")
        { 
           if(op.add_op("/")) 
           {
           bt.setText(op.return_result());
           }
           else
           {
               bt.setText("Errooooooooor");
               op.result="";
               op.num[0]="";
               op.num[1]="";
           }
             op.enter=true;
        }
        else if(e.getActionCommand()=="%")
        { 
           op.add_op("%");
           bt.setText(op.return_result());
             op.enter=false;
        }
        else if(e.getActionCommand()=="Del")
        {
            op.delete();
            bt.setText(op.return_result());
        }
        else if(e.getActionCommand()=="C")
        {
            op.clear();
            bt.setText(op.return_result());
              op.enter=true;
        }
        else if(e.getActionCommand()=="=")
        {
           if(op.add_op("=")) 
           {
           bt.setText(op.return_result());
           }
           else
               bt.setText("Errooooooooor");
             op.enter=false;
        }
        else if(e.getActionCommand()=="E")
        {
            op.add_num(Math.E+"");
            bt.setText(op.return_result()); 
            op.enter=false;
        }
        else if(e.getActionCommand()=="Sin")
        {
            op.fun_math("sin");
            bt.setText(op.return_result());
               op.enter=false;
        }
        else if(e.getActionCommand()=="Cos")
        {
            op.fun_math("cos");
            bt.setText(op.return_result());
               op.enter=false;
        }
        else if(e.getActionCommand()=="Tan")
        {
            op.fun_math("tan");
            bt.setText(op.return_result());
            op.enter=false;
        }
        else if(e.getActionCommand()=="Sq")
        {
            op.fun_math("Sq");
            bt.setText(op.return_result());
               op.enter=false;
        }
        else if(e.getActionCommand()=="1/X")
        {
            op.fun_math("1/x");
            bt.setText(op.return_result());
               op.enter=false;
        }
        else if(e.getActionCommand()=="+/-")
        {
            op.fun_math("+/-");
            bt.setText(op.return_result());
               op.enter=false;
        }
      else if(e.getActionCommand()=="Sin^-1")
    {
            op.fun_math("Sin^-1");
            bt.setText(op.return_result());
            op.enter=false;
    }
      else if(e.getActionCommand()=="Cos^-1")
    {
            op.fun_math("Cos^-1");
            bt.setText(op.return_result());
            op.enter=false;
    }
      else if(e.getActionCommand()=="Tan^-1")
    {
            op.fun_math("Tan^-1");
            bt.setText(op.return_result());
            op.enter=false;
    }
      else if(e.getActionCommand()=="Sinh")
    {
            op.fun_math("Sinh");
            bt.setText(op.return_result());
            op.enter=false;
    }
      else if(e.getActionCommand()=="Cosh")
    {
            op.fun_math("Cosh");
            bt.setText(op.return_result());
            op.enter=false;
    }
      else if(e.getActionCommand()=="Tanh")
    {
            op.fun_math("Tanh");
            bt.setText(op.return_result());
            op.enter=false;
    }
      else if(e.getActionCommand()=="Sinh^-1")
    {
            op.fun_math("Sinh^-1");
            bt.setText(op.return_result());
            op.enter=false;
    }
      else if(e.getActionCommand()=="Cosh^-1")
    {
            op.fun_math("Cosh^-1");
            bt.setText(op.return_result());
            op.enter=false;
    }
      else if(e.getActionCommand()=="Tanh^-1")
    {
            op.fun_math("Tanh^-1");
            bt.setText(op.return_result());
            op.enter=false;
    }
      else if(e.getActionCommand()=="Ln")
    {
            op.fun_math("Ln");
            bt.setText(op.return_result());
            op.enter=false;
    }
      else if(e.getActionCommand()=="Log")
    {
            op.fun_math("Log");
            bt.setText(op.return_result());
            op.enter=false;
    }
        else if(e.getActionCommand()=="PI")
        {
            op.add_num(Math.PI+"");
            bt.setText(op.return_result()); 
            op.enter=false;
        }
        else if(e.getActionCommand()=="2*PI")
        {
            op.add_num(2*Math.PI+"");
            bt.setText(op.return_result()); 
            op.enter=false;
        }
        else if(e.getActionCommand()=="Abs")
        {
            op.fun_math("Abs");
            bt.setText(op.return_result());
            op.enter=false;
        }
        else if(e.getActionCommand()=="Cbrt")
        {
            op.fun_math("Cbrt");
            bt.setText(op.return_result());
            op.enter=false;
        }
        else if(e.getActionCommand()=="Exp")
        {
            op.fun_math("Exp");
            bt.setText(op.return_result());
            op.enter=false;
        }
        else if(e.getActionCommand()=="Degree")
        {
            op.fun_math("Degree");
            bt.setText(op.return_result());
            op.enter=false;
        }
        else if(e.getActionCommand()=="Radians")
        {
            op.fun_math("Radians");
            bt.setText(op.return_result());
            op.enter=false;
        }
        else if(e.getActionCommand()=="N!")
        {
            op.fun_math("N!");
            bt.setText(op.return_result());
            op.enter=false;
        }
        else if(e.getActionCommand()=="Int")
        {
            op.fun_math("Int");
            bt.setText(op.return_result());
            op.enter=false;
        }
        else if(e.getActionCommand()=="F - E")
        {
            op.fun_math("F - E");
            bt.setText(op.return_result());
            op.enter=false;
        }
        else if(e.getActionCommand()=="Frac")
        {
            op.fun_math("Frac");
            bt.setText(op.return_result());
            op.enter=false;
        }
        else if(e.getActionCommand()=="Mod")
        {
            op.add_op("%");
            bt.setText(op.return_result());
            op.enter=true;
        }
        else if(e.getActionCommand()=="X^2")
        {
            op.fun_math("X^2");
            bt.setText(op.return_result());
            op.enter=false;
        }
        else if(e.getActionCommand()=="X^3")
        {
            op.fun_math("X^3");
            bt.setText(op.return_result());
            op.enter=false;
        }
        else if(e.getActionCommand()=="X^y")
        {
            op.add_op("^");
            bt.setText(op.return_result());
            op.enter=true;
        }
      else if(e.getActionCommand()=="10^3")
    {
            op.fun_math("10^3");
            bt.setText(op.return_result());
            op.enter=false;
    }
      else if(e.getActionCommand()=="10^x")
    {
            op.fun_math("10^x");
            bt.setText(op.return_result());
            op.enter=false;
    }
      else if(e.getActionCommand()=="Random")
    {
            op.fun_math("Random");
            bt.setText(op.return_result());
            op.enter=false;
    }
         if(e.getActionCommand()=="About")
        {
            setVisible(false);
            dispose();
            HelpAbout h=new HelpAbout();
            h.setVisible(true);
        }
        else if(e.getActionCommand()=="      C o p y")//copy
        {
          //  op.result=bt.getText();
        }
        else if(e.getActionCommand()=="      P a s t")//paste
        {
            
        }
        else if(e.getActionCommand()=="      C u t ")//cut
        {
            
        }
        else if(e.getActionCommand()=="  Enter Your Expression ... ")
        {
         /* 
            String Ex=bt.getText();
           if(Ex.charAt(0)!='+'||Ex.charAt(0)!='-')
           {
               op.add_num(Ex);
           }
           else
           {
               op.add_op(Ex);
           }
                 */
        }
      else if(e.getActionCommand()=="   Scientific   ")//scientific
      {
          this.setVisible(false);
          dispose();
         new Scientific().setVisible(true);
      }
      else if(e.getActionCommand()=="   Standard     ")//standard
      {
          this.setVisible(false);
          dispose();
         new Standard().setVisible(true);
      }
      else if(e.getActionCommand()=="   Statistic    ")
      {
           this.setVisible(false);
           dispose();
          new Statistic().setVisible(true);
      }
      else if(e.getActionCommand()=="   Convertion    ")
      {
           this.setVisible(false);
           dispose();
          new Convertion().setVisible(true);
      }
      else if(e.getActionCommand()=="CAD")
      {
          op.op_statistic("CAD");
          bt.setText("0");
      }
      else if(e.getActionCommand()=="Add")
      {
          op.add_statistic(bt.getText());
      }
      else if(e.getActionCommand()=="DL")
      {
             op.op_statistic("DL");
             bt.setText("0");
      }
        
      else if(e.getActionCommand()==st[0])//Sum x
      {
          op.op_statistic("Sum x");
          bt.setText(op.return_result());
          op.enter=false;
      } 
      else if(e.getActionCommand()==st[3])//Sum x ^2
      {
          op.op_statistic("Sum x2");
          bt.setText(op.return_result());
          op.enter=false;
      } 
      else if(e.getActionCommand()==st[1])//mean
      {
          op.op_statistic("mean");
          bt.setText(op.return_result());
          op.enter=false;
      } 
      else if(e.getActionCommand()==st[2])//mean ^2
      {
          op.op_statistic("mean2");
          bt.setText(op.return_result());
          op.enter=false;
      }
      else if(e.getActionCommand()==st[4])//mean
      {
          op.op_statistic("standard deviation");
          bt.setText(op.return_result());
          op.enter=false;
      } 
      else if(e.getActionCommand()==st[5])//mean
      {
          op.op_statistic("standard deviation2");
          bt.setText(op.return_result());
          op.enter=false;
      } 
         
    }
}