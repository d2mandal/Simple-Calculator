import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;

public class calculator   //no need to implement ActionListner  by defining here if we define here then we need to override it outside the constructor
{
    JFrame frame;
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bdot,bans,b_sum,b_sub,b_div,b_mul,CLR;
    JTextField textfield;
    double number1,number2;
    String operator;

    public calculator()
    {
        frame=new JFrame("Calculator");
        frame.setBounds(50,40,500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);  //We can't maximize screen
        
         Font font=new Font("Arial",Font.PLAIN,20);
        textfield=new JTextField();
        textfield.setEditable(false);  //Input will not take for keyboard(it is not editable)
        textfield.setBackground(Color.white); //For setting background yellow
        
        textfield.setFont(font);
        textfield.setHorizontalAlignment(SwingConstants.RIGHT); //for satring from right
        
        textfield.setBounds(150,20,220,40);
        frame.add(textfield);
        
        b1=new JButton("1");
        b1.setBounds(150,70,60,30);
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String num=textfield.getText()+b1.getText();
                textfield.setText(num);
            }
        });
        frame.add(b1);
       

        b2=new JButton("2");
        b2.setBounds(230,70,60,30);
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String num=textfield.getText()+b2.getText();
                textfield.setText(num);
            }
        });
        frame.add(b2);

        b3=new JButton("3");
        b3.setBounds(310,70,60,30);
        
        b3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String num=textfield.getText()+b3.getText();
                textfield.setText(num);
            }
        });
        frame.add(b3);

        b4=new JButton("4");
        b4.setBounds(150,110,60,30);
        b4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String num=textfield.getText()+b4.getText();
                textfield.setText(num);
            }
        });
        frame.add(b4);

        b5=new JButton("5");
        b5.setBounds(230,110,60,30);

        b5.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String num=textfield.getText()+b5.getText();
                textfield.setText(num);
            }
        });
        frame.add(b5);

        b6=new JButton("6");
        b6.setBounds(310,110,60,30);
        
        b6.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String num=textfield.getText()+b6.getText();
                textfield.setText(num);
            }
        });
        frame.add(b6);

        b7=new JButton("7");
        b7.setBounds(150,150,60,30);
        
        b7.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String num=textfield.getText()+b7.getText();
                textfield.setText(num);
            }
        });
        frame.add(b7);

        b8=new JButton("8");
        b8.setBounds(230,150,60,30);
        
        b8.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String num=textfield.getText()+b8.getText();
                textfield.setText(num);
            }
        });
        frame.add(b8);

        b9=new JButton("9");
        b9.setBounds(310,150,60,30);
        
        b9.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String num=textfield.getText()+b9.getText();
                textfield.setText(num);
            }
        });
        frame.add(b9);

        bdot=new JButton (".");
        bdot.setBounds(150,190,60,30);

        bdot.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String num=textfield.getText()+bdot.getText();
                textfield.setText(num);
            }
        });
        frame.add(bdot);

        b0=new JButton("0");
        b0.setBounds(230,190,60,30);
        
        b0.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String num=textfield.getText()+b0.getText();
                textfield.setText(num);
            }
        });
        frame.add(b0);

        CLR=new JButton("CLR");
        CLR.setBounds(150,270,80,30);
        
        CLR.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                textfield.setText("");
            }

        });
        frame.add(CLR);

        b_sum=new JButton("+");
        b_sum.setBounds(150,230,60,30);
        
        b_sum.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {

                String newString=textfield.getText();
                number1=Double.parseDouble(textfield.getText());

                newString=newString+"+";
                operator="+";

                textfield.setText(newString);

 

          }
        });

        frame.add(b_sum);

        b_sub=new JButton("-");
        b_sub.setBounds(230,230,60,30);
        
        b_sub.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {

                String newString=textfield.getText();
                newString=newString+"-";
                number1=Double.parseDouble(textfield.getText());
                operator="-";

                textfield.setText(newString);

 

          }
        });
        
        frame.add(b_sub);

        b_mul=new JButton("*");
        b_mul.setBounds(310,230,60,30);
        
        b_mul.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {

                String newString=textfield.getText();
                newString=newString+"*";
                number1=Double.parseDouble(textfield.getText());
                operator="*";

                textfield.setText(newString);

 

          }
        });
        frame.add(b_mul);

        b_div=new JButton("/");
        b_div.setBounds(310,190,60,30);
        b_div.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {

                String newString=textfield.getText();
                newString=newString+"/";
                number1=Double.parseDouble(textfield.getText());
                operator="/";

                textfield.setText(newString);

 

          }
        });
        frame.add(b_div);

        bans=new JButton("=");
        bans.setBounds(290,270,80,30);
        
       bans.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String newstring=textfield.getText();
                int index=newstring.indexOf(operator);
                String substring=newstring.substring(index+1);
                number2=Double.parseDouble(substring);
                double result=0;

                switch(operator)
                {
                    case "+":result=number1+number2;
                    break;
                    case "-":result=number1-number2;
                    break;
                    case "*":result=number1*number2;
                    break;
                    case "/":result=number1/number2;
                    break;
                }


                textfield.setText(Double.toString(result));
                

            

            }
        });
        frame.add(bans);
        
       
      

       frame.setVisible(true);
     }

   

    public static void main(String[] args)
    {
        new calculator();
    }
}