/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab9;

/**
 *
 * @author dtac6
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Lab4.Account;
public class TellerGUI implements ActionListener {
    JFrame f;
    JPanel p1, p2;
    JTextField t1, t2;
    JLabel l1, l2;
    JButton b1, b2, b3;
    Account acct = new Account();
    public TellerGUI(){
        f = new JFrame("Teeler GUI");
        p1 = new JPanel();
        p2 = new JPanel();
        l1 = new JLabel("Balance");
        
        acct.balance = 0;
        
        t1 = new JTextField(String.valueOf(acct.balance));
        t1.setEditable(false);
        l2 = new JLabel("Amount");
        t2 = new JTextField("");
        
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        
        p1.setLayout(new GridLayout(2,2));
        p2.setLayout(new FlowLayout());
        
        f.setLayout(new GridLayout(2,1));
        
        f.add(p1);
        
        b1 = new JButton("Deposit");
        b1.addActionListener(this);
                
        b2 = new JButton("Withdraw");
        b2.addActionListener(this);
        
        b3 = new JButton("Exit");
        b3.addActionListener(this);
        
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        
        f.add(p2);
        
        f.pack();
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String ev = e.getActionCommand();
        if (ev.equals("Deposit") && !t2.getText().equals("")){
            acct.deposit(Double.parseDouble(t2.getText()));
            t1.setText(String.valueOf(acct.balance));
            t2.setText("");
        }
        else if (ev.equals("Withdraw") && !t2.getText().equals("")){
            acct.withdraw(Double.parseDouble(t2.getText()));
            t1.setText(String.valueOf(acct.balance));
            t2.setText("");
        }
        else if (ev.equals("Exit")){
            System.exit(0);
        }
    }
}
