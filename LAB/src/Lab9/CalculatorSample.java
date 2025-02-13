/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab9;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.*;

/**
 *
 * @author dtac6
 */
public class CalculatorSample implements ActionListener{
    JFrame f;
    JPanel p;
    JTextField t1;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
    String num1 = "", num2 = "", op = "";
    public CalculatorSample(){
        f = new JFrame();
        p = new JPanel();
        t1 = new JTextField("");
        
        b1 = new JButton("7");
        b2 = new JButton("8");
        b3 = new JButton("9");
        b4 = new JButton("+");
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        
        b5 = new JButton("4");
        b6 = new JButton("5");
        b7 = new JButton("6");
        b8 = new JButton("-");
        
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
                
        b9 = new JButton("1");
        b10 = new JButton("2");
        b11 = new JButton("3");
        b12 = new JButton("x");
        
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
                
        b13 = new JButton("0");
        b14 = new JButton("c");
        b15 = new JButton("=");
        b16 = new JButton("/");
        
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        
        f.add(t1);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        
        p.add(b9);
        p.add(b10);
        p.add(b11);
        p.add(b12);
        
        p.add(b13);
        p.add(b14);
        p.add(b15);
        p.add(b16);
        f.add(p);
        
        p.setLayout(new GridLayout(4,4));
        f.setLayout(new GridLayout(2,1));
        
        f.pack();
        f.setTitle("เครื่องคิดเลข");
        f.setSize(400, 400);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String ev = e.getActionCommand();
        System.out.println(e.getActionCommand());
        if ((ev.equals("+") || ev.equals("-") || ev.equals("x") || ev.equals("/")) && !num1.isEmpty()) {
            op = ev;
            t1.setText("");
        }
        else if (ev.equals("c")) {
            num1 = "";
            num2 = "";
            op = "";
            t1.setText("");
        }
        else if(ev.equals("=") && !num1.isEmpty() && !num2.isEmpty() && !op.isEmpty()){
            double numD1 = Double.parseDouble(num1), numD2 = Double.parseDouble(num2), result = 0;
                if (op.equals("+")){
                    result = numD1 + numD2;
                }
                else if (op.equals("-")){
                    result = numD1 - numD2;
                }
                else if (op.equals("x")){
                    result = numD1 * numD2;
                }  
                else if (op.equals("/")){
                    result = numD1 / numD2;
                }
            num1 = "";
            num2 = "";
            t1.setText(String.valueOf(result));
        }
        else if (!num1.isEmpty() && num2.isEmpty() && op.isEmpty() && ev.equals("+") && ev.equals("-") && ev.equals("x") && ev.equals("/")){
            op = ev;
            t1.setText("");
        }
        else {
            if (op.isEmpty()) {
                num1 += ev;
                t1.setText(num1);
            }
            else if (!num1.isEmpty() && !op.isEmpty()) {
                num2 += ev;
                t1.setText(num2);
            }
        }
        }
    }

