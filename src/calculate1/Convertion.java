package calculate1;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Convertion extends Standard{
       private JPanel second;
       private JPanel []fun;
       private JComboBox []potList;
    public Convertion (){
     
        String[] potStrings  = { "Angle", "Area", "Energy", "Lenght", "Power","Pressure","Temperture","Time","Velocity","Volume","Weight/Mass" };
        setSize(800,420);
        setTitle("Convertion");
        setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        for(int i=9;i<=11;i++)
        b28[i].setEnabled(false);
        second =new JPanel();
        second.setLayout(null);
        second.setBounds(390,5,395,352);
        second.setBackground(Color.gray);
        second.setBorder(new LineBorder(Color.white,7));
        fun=new JPanel[3];
        fun[0]=new JPanel();
        fun[0].setLayout(null);
        fun[0].setBounds(13,10,360,90);
        fun[0].setBorder(new TitledBorder("Type Of Unit"));
        fun[0].setBackground(Color.GRAY);
        potList=new JComboBox[3];
        potList[0] = new JComboBox(potStrings);
        potList[0].setSelectedIndex(10);
        potList[0].setBounds(20,30,300, 30);
        potList[0].addActionListener(this);
        fun[0].add(potList[0]);
        second.add(fun[0]); 
        String [][]twostring={{"Degree","Gardin","Radian"},{"Arces","Square Ceintimeter","Square Feet","Square inhch","Square Killo Meter","Square milli","Square milli meter"}};
        fun[1]=new JPanel();
         fun[1].setLayout(null);
        fun[1].setBounds(13,120,360,90);
        fun[1].setBorder(new TitledBorder("From"));
        fun[1].setBackground(Color.GRAY);
        potList[1] = new JComboBox(twostring[0]);
        potList[1].setSelectedIndex(2);
        potList[1].setBounds(20,30,300, 30);
        potList[1].addActionListener(this);
        fun[1].add(potList[1]);
        second.add(fun[1]); 
        fun[2]=new JPanel();
         fun[2].setLayout(null);
        fun[2].setBounds(13,230,360,90);
        fun[2].setBorder(new TitledBorder("To"));
        fun[2].setBackground(Color.GRAY);
        potList[2] = new JComboBox(twostring[1]);
        potList[2].setSelectedIndex(6);
        potList[2].setBounds(20,30,300, 30);
        potList[2].addActionListener(this);
        fun[2].add(potList[2]);
        second.add(fun[2]);
         add(second);
    }
}
