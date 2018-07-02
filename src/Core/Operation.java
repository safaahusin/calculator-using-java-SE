package Core;

import java.util.ArrayList;

public class Operation { 
    public String  Mc;
    public String op;
    public String []num;
    public String result;
    public String op_unary;
    public boolean enter;
   public ArrayList<Double>  array;
    public  Operation()
    {
         array =new ArrayList<Double>();
         Mc=new String ("");
         op=new String("");
         num=new String [2];
         num[0]=new String("");
         num[1]=new String("");
         result=new String("");
         enter =true;
    }
    public void clear()
    {
        result="";
        num[0]="";
        num[1]="";
        op="";
        enter=true;
    }
    public String return_result()
    {
        if(result.equals(""))
            return "0";
        return result;
    }
    
    
    public void delete()
    {
        if(result.equals(num[0])&&!num[0].equals("")&&!result.equals(""))
        {
            num[0]=num[0].substring(0, num[0].length()-1);
             result=result.substring(0, result.length()-1);
        }
        else if(result.equals(num[0]+op)&&!op.equals("")&&!result.equals(""))
        {
            op="";
             result=result.substring(0, result.length()-1);
        }
        else if(result.equals(num[0]+op+num[1])&&!num[1].equals("")&&!result.equals(""))
        {
             num[1]=num[1].substring(0, num[1].length()-1);
              result=result.substring(0, result.length()-1);
        }
    }
    
    
    
    public void fun_math(String op)
    {
        double x;
        result="";
        if(!num[1].equals(""))
        {
            this.add_op("=");
        }
        if(num[0].equals(""))
            x=0;
        else
           x=Double.parseDouble(num[0]);
        switch(op)
        {
            case "sin":
            {
               x = Math.toRadians(x);
                result=Math.sin(x)+""; 
                break;
            }
            case "cos":
            {            
                 x = Math.toRadians(x);
                 result=Math.cos(x)+"";
                break;
            }
            case "tan":
            {
                 x = Math.toRadians(x);
                 result=Math.tan(x)+"";
                break;
            }
            case "1/x":
            {
                result=(1.0/x)+"";
                break;
            }
            case "+/-":
            {
                if( Math.signum(x)==0)
                    result="";
                else if( Math.signum(x)==1) 
                result=(-1.0*x)+"";
                else if( Math.signum(x)==-1) 
                result=(-1.0*x)+"";
                break;
            }
            case "Sq":
            {
                result=Math.sqrt(x)+"";
                break;
            }
            case "Sin^-1":
            {
                result=Math.toDegrees(Math.asin(x))+"";
                break;
            }
            case "Cose^-1":
            {
                result=Math.toDegrees(Math.acos(x))+"";
                break;
            }
            case "Tan^-1":
            {
                result=Math.toDegrees(Math.atan(x))+"";
                break;
            }
            case "Cosh":
            {
                result=Math.cosh(x)+"";
                break;
            }
            case "Sinh":
            { 
                result=Math.sinh(x)+"";
                break;
            }
            case "Tanh":
            { 
                result=Math.tanh(x)+"";
                break;
            }
         /*   case "cosh^-1":
            {
                result=Math.toDegrees(Math.as(x))+"";
                break;
            }
            case "sinh^-1":
            {
                result=Math.toDegrees(Math.asinh(x))+"";
                break;
            }
            case "tanh^-1":
            {
                result=Math.toDegrees(Math.cosh(x))+"";
                break;
            }
                 */
            case "Ln":
            {
                result = Math.log(x)+"";
                break;
            }
            case "Log":
            {
                result = Math.log10(x)+"";
                break;
            }
            case "Abs":
            {
                result = Math.abs(x)+"";
                break;
            }
            case "Cbrt":
            {
                result = Math.cbrt(x)+"";
                break;
            }
            case "Exp":
            {
                result = Math.exp(x)+"";
                break;
            }
            
            case "Degree":
            {
                result=Math.toDegrees(x)+"";
                break;
            }
            case "Radians":
            {
                result=Math.toRadians(x)+"";
                break;
            }
            case "N!":
            {
                double fact = 1;
              for(int i=1;i<=x;i++){    
                fact=fact*i;    
                         }    
                   result=fact+"";
                break;
            }
            case "Int":
            {
                int y=(int)x;
                result=y+"";
                  break;
            }
            case "Frac":
            {
                int y=(int)x;
                double z=x-y;
                result=z+"";               
                  break;
            }
            case "F - E":
            {
                x=x-Math.E;
                result=x+""; 
                break;
            }
            case "X^2":
            {
                x=Math.pow(2, x);
                result=x+""; 
                break;
            }
            case "X^3":
            {
                x=Math.pow(3, x);
                result=x+""; 
                break;
            }
            case "10^x":
            {
                double y=1;
                for(int i=0;i<x;i++)
                {
                    y=y*10;
                }
                result=y+"";
                break;
            }
            case "10^3":
            {
                double y=1;
                for(int i=0;i<3;i++)
                {
                    y=y*10;
                }
                result=y+"";
                break;
            }
            case "Random":
            {
                result=Math.random()+"";
                break;
            }
        } 
        num[0]=result;
        num[1]="";
        this.op="";
    } 
   
    public void add_num(String value)
    {
        int index=0;
        if(enter==false)
        {
            result="";
            num[0]="";
            num[1]="";
            this.op="";
        }
        if(result.length()!=0)
        if(result.charAt(result.length()-1)!='^'&&result.charAt(result.length()-1)!='%'&&result.charAt(result.length()-1)!='-'&&result.charAt(result.length()-1)!='+'&&result.charAt(result.length()-1)!='*'&&result.charAt(result.length()-1)!='/')
           index=0;
        else
            index=1;
        if(value.equals(Math.E+"")||value.equals(Math.PI+"")||value.equals(2.0*Math.PI+""))
        {
            num[index]=value;
            result=num[0]+op+num[1];
        }
        else  if(!value.equals("0")||!result.equals(""))
        {
          num[index]+=value;
          result+=value;
        }
    }
    
public boolean add_op(String op)
{
    boolean check=true;
    if(result.equals("")&&!op.equals("="))
    {
        num[0]="0";
        result="0";
        num[1]="";
        enter=true;
        result+=op;
        this.op=op;
        return check;
    }
    if(op.equals("=")||(!num[1].equals("")&&result.charAt(result.length()-1)!='^'&&result.charAt(result.length()-1)!='+'&&result.charAt(result.length()-1)!='-'&&result.charAt(result.length()-1)!='*'&&result.charAt(result.length()-1)!='/'&&result.charAt(result.length()-1)!='%'))
    {
        switch(this.op)
        {
            case "+":
            {
                double x=Double.parseDouble(num[0]);
                double y=Double.parseDouble(num[1]);
                double z=x+y;
                result=z+"";
                break;
            }
            case "-":
            {
                double x=Double.parseDouble(num[0]);
                double y=Double.parseDouble(num[1]);
                double z=x-y;
                result=z+"";
                break;
            }
            case "*":
            {
                double x=Double.parseDouble(num[0]);
                double y=Double.parseDouble(num[1]);
                double z=x*y;
                result=z+"";
                break;
            }
            case "/":
            {
                double x=Double.parseDouble(num[0]);
                double y=Double.parseDouble(num[1]);
                if(y!=0.0){
                double z=x/y; 
                result=z+"";
                } 
                else
                {
                    result="";
                    check=false;
                }
             break;   
            }
            case "%":
            {
                double x=Double.parseDouble(num[0]);
                double y=Double.parseDouble(num[1]);
                double z=x%y;
                result=z+"";
                break;
            }
            case "^":
            {
                double x=Double.parseDouble(num[0]);
                double y=Double.parseDouble(num[1]);
                double z=Math.pow(x, y);
                result=z+"";
                break;
            }
        }
          num[0]=result;
          num[1]="";
          if(!op.equals("="))
          { 
          result+=op;
          this.op=op;
          }
    }
    else
    {
this.op=op;
result+=op;
num[1]="";
    }
    return check;
    
}

/// done ..................
    public void setMSum(String num)
    {
        double Mnew=Double.parseDouble(num);
        double Mold=0;
        if(!Mc.equals("")){
        Mold=Double.parseDouble(Mc);
        }
        double Mresult=Mnew+Mold;
        Mc=Mresult+"";
    }
    public void setMSub(String num)
    { 
        double Mnew=Double.parseDouble(num);
        double Mold=0;
        if(!Mc.equals("")){
        Mold=Double.parseDouble(Mc);
        }
        double Mresult=Mold-Mnew;
        Mc=Mresult+"";
    }
    public String get_Mc()
    {
        if(Mc.equals(""))
            return "0";
        return Mc;
    }
    
    public void add_statistic(String x)
    {
          Double num=Double.valueOf(x);
          array.add(num);
          result="";
          enter=true;
    }
    public void op_statistic(String op)
    {
        if(op.equals("CAD"))
        {
            array.clear();
            result="";
            enter=true;
        }
        else if(op.equals("DL"))
        {
            if(array.size()!=0)
            array.remove(array.size()-1);
            result="";
            enter=true;
        } 
        else if (op.equals("Sum x"))
        {
            double x=0;
            for(int i=0;i<array.size();i++)
            {
                x+=array.get(i);
            }
            array.clear();
            array.add(x);
            result=x+"";
        } 
        else if (op.equals("Sum x2"))
        {
            double x=0;
            for(int i=0;i<array.size();i++)
            {
                x+=array.get(i);
            }
            array.clear();
            x=Math.pow(x, 2);
            array.add(x);
            result=x+"";
        } 
        else if (op.equals("mean"))
        {
            if(array.size()!=0){
            double x=0;
            for(int i=0;i<array.size();i++)
            {
                x+=array.get(i);
            }
            x=x/array.size();
            array.clear();
            array.add(x);
            result=x+"";
            }
            else
            {
                result="";
            }
        }
        else if (op.equals("mean2"))
        {
            if(array.size()!=0){
            double x=0;
            for(int i=0;i<array.size();i++)
            {
                x+=array.get(i);
            }
            x=x/array.size();
            array.clear();
            x=Math.pow(x, 2);
            array.add(x);
            result=x+"";
            }
            else
            {
                result="";
            }
        }
        else if (op.equals("standard deviation"))
        {
            ArrayList <Double>arr=new ArrayList<Double>();
            if(array.size()!=0)
            {
            double x=0;
            for(int i=0;i<array.size();i++)
            {
                x+=array.get(i);
            }
            x=x/array.size();
             // Calculate mean 
            // to sub mean
            for(int i=0;i<array.size();i++)
            {
                arr.add(array.get(i)-x);
            }
            array.clear();
            for(int i=0;i<arr.size();i++)
            {
                array.add(Math.pow(arr.get(i), 2));
            }
            
            // to sum all num
            x=0;
            for(int i=0;i<array.size();i++)
            {
                x+=array.get(i);
            }
            x=Math.sqrt(x);
            array.clear();
            array.add(x);
            result=x+"";
            }
            else
            {
                result="";
            }
        }
        else if (op.equals("standard deviation2"))
        {
            ArrayList <Double>arr=new ArrayList<Double>();
            if(array.size()!=0) 
            {
            double x=0;
            for(int i=0;i<array.size();i++)
            {
                x+=array.get(i);
            }
            x=x/array.size();
             // Calculate mean 
            // to sub mean
            for(int i=0;i<array.size();i++)
            {
                arr.add(array.get(i)-x);
            }
            array.clear();
            for(int i=0;i<arr.size();i++)
            {
                array.add(Math.pow(arr.get(i), 2));
            }
            
            // to sum all num
            x=0;
            for(int i=0;i<array.size();i++)
            {
                x+=array.get(i);
            }
            array.clear();
            array.add(x);
            result=x+"";
            }
            else
            {
                result="";
            }
        }
    }
}