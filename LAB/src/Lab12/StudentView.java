/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab12;

/**
 *
 * @author dtac6
 */
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;
public class StudentView implements ActionListener, WindowListener {
    private JFrame f1;
    private JPanel p1;
    private JLabel l1, l2, l3;
    private JTextField tf1, tf2, tf3;
    private JButton b1, b2;
    
    public StudentView(){
        f1 = new JFrame("Student Class");
        p1 = new JPanel();
        l1 = new JLabel("ID:");
        l2 = new JLabel("Name:");
        l3 = new JLabel("Money:");
        tf1 = new JTextField(15);
        tf2 = new JTextField(15);
        tf3 = new JTextField(15);
        b1 = new JButton("Deposit");
        b2 = new JButton("Withdraw");
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        tf3.setEditable(false);
        
        p1.setLayout(new GridLayout(4,2));
        p1.add(l1);
        p1.add(tf1);
        
        p1.add(l2);
        p1.add(tf2);
        
        p1.add(l3);
        p1.add(tf3);
        
        p1.add(b1);
        p1.add(b2);
        
        f1.add(p1);
        f1.addWindowListener(this);
        f1.pack();
        f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);
        f1.setResizable(false);
        f1.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        String str = e.getActionCommand();
        if (tf3.getText().equals("")){
            tf3.setText("0");
        }
        if(str.equals("Deposit")){
            System.out.println("1");
            tf3.setText(String.valueOf(Integer.parseInt(tf3.getText()) + 100));
        } else if (str.equals("Withdraw")){
            if (Integer.parseInt(tf3.getText()) >= 100){
                tf3.setText(String.valueOf(Integer.parseInt(tf3.getText()) - 100));
            }
        }
    }
    @Override  
    public void windowOpened(WindowEvent e) {
        if (new File("StudentM.dat").exists()){
        System.out.println("2");
            Student s = new Student();
            try(FileInputStream fin = new FileInputStream("StudentM.dat")){
                ObjectInputStream in = new ObjectInputStream(fin);
                s = (Student) in.readObject();
                tf1.setText(String.valueOf(s.getID()));
                tf2.setText(s.getName());
                tf3.setText(String.valueOf(s.getMoney()));
            } catch(IOException ex ){
                ex.printStackTrace();
            } catch (ClassNotFoundException c){
                c.printStackTrace();
            }
        }
    }  

    @Override  
    public void windowClosing(WindowEvent e) {
        System.out.println("3");
        try(FileOutputStream fout = new FileOutputStream("StudentM.dat")){
            ObjectOutputStream out = new ObjectOutputStream(fout);
            Student s = new Student(tf2.getText(), Integer.parseInt(tf1.getText()), Integer.parseInt(tf3.getText()));
            out.writeObject(s);
            out.close();
        } catch(IOException ex){
            ex.printStackTrace();
        }
    } 
        
    @Override  
    public void windowClosed(WindowEvent e) { }  

    @Override  
    public void windowIconified(WindowEvent e) { }  

    @Override  
    public void windowDeiconified(WindowEvent e) { }  

    @Override  
    public void windowActivated(WindowEvent e) { }  

    @Override  
    public void windowDeactivated(WindowEvent e) { } 
}
