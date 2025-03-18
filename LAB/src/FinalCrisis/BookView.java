/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalCrisis;


/**
 *
 * @author dtac6
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class BookView implements ActionListener{
    private JFrame f;
    private JPanel p1, p2;
    private JLabel l1, l2, l3;
    private JTextField tf1, tf2, tf3;
    private JComboBox<String> comb;
    private JButton prevousButton, nextButton, addButton, updateButton, deleteButton;
    String[] items = {"General", "Computer", "Math&Sci", "Photo"};

    public BookView() {
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
        
        prevousButton = new JButton("<<<");
        prevousButton.addActionListener(this);
        
        nextButton = new JButton(">>>");
        nextButton.addActionListener(this);
        
        addButton = new JButton("Add");
        addButton.addActionListener(this);
        
        updateButton = new JButton("Updaate");
        updateButton.addActionListener(this);
        
        deleteButton = new JButton("Delete");
        deleteButton.addActionListener(this);
        
        p1.setLayout(new GridLayout(3,2));
        p2.setLayout(new GridLayout(2,3));
        
        p1.add(l1);
        p1.add(tf1);
        p1.add(l2);
        p1.add(tf2);
        p1.add(l3);
        p1.add(comb);

        p2.add(prevousButton);
        p2.add(tf3);
        p2.add(nextButton);
        p2.add(addButton);
        p2.add(updateButton);
        p2.add(deleteButton);
        
        f.setLayout(new GridLayout(2,1));
        f.add(p1);
        f.add(p2);
        
        f.pack();
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        if(e.getSource().equals(addButton)){
            new BookAdd();
        }
    }
    
    
}
