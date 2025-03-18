/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalCrisis;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author dtac6
 */
public class BookAdd implements ActionListener{
    private JFrame f;
    private JPanel p1, p2;
    private JLabel l1, l2, l3;
    private JTextField tf1, tf2, tf3;
    private JComboBox<String> comb;
    private JButton insert;
    String[] items = {"General", "Computer", "Math&Sci", "Photo"};

    public BookAdd() {
        f = new JFrame("BookView");
        p1 = new JPanel();
        p2 = new JPanel();
        l1 = new JLabel("Name");
        l2 = new JLabel("Price");
        l3 = new JLabel("Type");
        
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        
        tf3.setEditable(false);
        
        comb = new JComboBox<>(items);
        
        p1.setLayout(new GridLayout(3,2));
        p2.setLayout(new FlowLayout());
        
        insert = new JButton("insert");
        insert.addActionListener(this);
        
        p1.add(l1);
        p1.add(tf1);
        p1.add(l2);
        p1.add(tf2);
        p1.add(l3);
        p1.add(comb);
        
        p2.add(insert);
        
        f.setLayout(new GridLayout(2,1));
        f.add(p1);
        f.add(p2);
        
        f.pack();
        f.setDefaultCloseOperation(f.DO_NOTHING_ON_CLOSE);
        f.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(insert)){
            System.out.println(comb.getSelectedItem());
            String name = tf1.getText();
            double price = Double.parseDouble(tf2.getText());
            String type = String.valueOf(comb.getSelectedItem());
            Book b = new Book(name, price,type);
            
            
            
            f.dispose();
        }
    }
}
