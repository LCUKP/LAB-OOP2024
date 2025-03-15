/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalCisis;


/**
 *
 * @author dtac6
 */
import java.awt.event.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
public class TextEditor implements ActionListener {
    private JFrame f;
    private JPanel p;
    private JMenuBar mnb;
    private JMenu file;
    private JMenuItem _new, open, save, close;
    private JTextArea jta;
    
    public TextEditor(){
        f = new JFrame("My Text Editor");
        p = new JPanel();
        mnb = new JMenuBar();
        file = new JMenu("File");
        p = new JPanel();
        jta = new JTextArea(20,40);
        
        _new = new JMenuItem("New");
        open = new JMenuItem("Open");
        save = new JMenuItem("Save");
        close = new JMenuItem("Close");
        
        _new.addActionListener(this);
        open.addActionListener(this);
        save.addActionListener(this);
        close.addActionListener(this);
        
        file.add(_new);
        file.add(open);
        file.add(save);
        file.add(close);
        
        mnb.add(file);
        
        p.add(jta);
        f.add(p);
        f.setJMenuBar(mnb);
        
        
        f.pack();
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        if (e.getSource().equals(_new)){
            jta.setText("");
        } else if(e.getSource().equals(open)){
            JFileChooser fc = new JFileChooser();
            fc.setFileFilter(new FileNameExtensionFilter("Text Files (*.txt)", "txt"));
            fc.showOpenDialog(f);
            File f = fc.getSelectedFile();
            try (FileReader fr = new FileReader(f);){
                int ch;
                while ((ch=fr.read()) != -1){
                    jta.setText(jta.getText() + (char)ch);
                }
            } catch (IOException ex){
                ex.printStackTrace();
            }
        } else if(e.getSource().equals(save)){
            JFileChooser fc = new JFileChooser();
            fc.setFileFilter(new FileNameExtensionFilter("Text Files (*.txt)", "txt"));
            fc.showOpenDialog(f);
            File f = fc.getSelectedFile();
            try (FileWriter fw = new FileWriter(f)){
                fw.write(jta.getText());
            } catch(IOException ex){
                ex.printStackTrace();
            }
        } else if(e.getSource().equals(close)){
            System.exit(0);
        }
    }
    
    
    
}
