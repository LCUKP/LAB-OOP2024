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
import java.io.*;
import java.time.format.DateTimeFormatter;
import java.time.*;
import java.awt.event.*;
import javax.swing.*;
public class ChatDemo implements ActionListener, WindowListener {
    private JFrame f1;
    private JPanel p1,p2,p3;
    private JTextArea ta1;
    private JTextField tf1;
    private JButton b1, b2;
    
    public ChatDemo(){
        f1 = new JFrame("ChatDemo");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        ta1 = new JTextArea(15,45);
        tf1 = new JTextField(45);
        b1 = new JButton("Submit");
        b2 = new JButton("Reset");
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        ta1.setEditable(false);
        
        p1.add(ta1);
        p2.add(tf1);
        
        p3.add(b1);
        p3.add(b2);
        p3.setLayout(new FlowLayout());
        
        f1.setLayout(new BorderLayout());
        f1.add(p1, BorderLayout.NORTH);
        f1.add(p2,BorderLayout.CENTER);
        f1.add(p3,BorderLayout.SOUTH);
        
        f1.pack();
        f1.setResizable(false);
        f1.addWindowListener(this);
        f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);
        f1.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String ch = e.getActionCommand();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        if (ch.equals("Submit")){
            String text = tf1.getText();
            String str = dtf.format(LocalDateTime.now()) + " : " + text;
            ta1.setText(ta1.getText()+ str +"\n");
            tf1.setText("");
        } else if(ch.equals("Reset")) {
            ta1.setText("");
        }
    }

    @Override  
    public void windowOpened(WindowEvent e) {
        if(new File("ChatDemo.txt").exists()){
            try (FileReader fr = new FileReader("ChatDemo.txt");){
                int ch;
                while ((ch=fr.read()) != -1){
                    ta1.setText(ta1.getText() + (char)ch);
                }
                ta1.setText(ta1.getText()+"\n");
            } catch (IOException ex){
                ex.printStackTrace();
            }
        } 
    }  

    @Override  
    public void windowClosing(WindowEvent e) {
        try (FileWriter fw = new FileWriter("ChatDemo.txt");){
                fw.write(ta1.getText());
                fw.close();
            } catch (IOException ex) {
                System.out.println(ex);
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