/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8;

/**
 *
 * @author dtac6
 */
import java.awt.*;
import javax.swing.*;
public class CalculatorOneGUI {
    JFrame f;
    JPanel p;
    JTextField t1,t2,t3;
    JButton b1, b2, b3, b4;
    public CalculatorOneGUI(){
        f = new JFrame();
        p = new JPanel();
        t1 = new JTextField("");
        t2 = new JTextField("");
        t3 = new JTextField("");
        
        b1 = new JButton("add");
        b2 = new JButton("sub");
        b3 = new JButton("multi");
        b4 = new JButton("div");
        f.add(t1);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        f.add(t2);
        f.add(p);
        f.add(t3);
        
        f.setLayout(new GridLayout(4,1));
        
        f.pack();
        f.setTitle("เครื่องคิดเลข");
        f.setSize(300, 170);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
}
