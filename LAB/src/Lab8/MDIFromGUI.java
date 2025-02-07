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
public class MDIFromGUI {
    private JFrame f;
    private JMenuBar mb;
    private JMenu m1, m2, m3;
    private JMenuItem mi1, mi2, mi3, mi4, msi1, msi2;
    private JDesktopPane desktopPane;
    private JInternalFrame f1, f2, f3;
    public MDIFromGUI() {
        f = new JFrame("SubManuItem Demo");
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        mb = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");
        
        f1 = new JInternalFrame("Applicaation 01", true, true, true, true);
        f2 = new JInternalFrame("Applicaation 02", true, true, true, true);
        f3 = new JInternalFrame("Applicaation 03", true, true, true, true);
        
        f1.getContentPane().add(new JLabel("App01..."));
        f1.setSize(300,150);
        f1.setVisible(true);
        
        f2.getContentPane().add(new JLabel("App02..."));
        f2.setSize(300,200);
        f2.setVisible(true);
        
        f3.getContentPane().add(new JLabel("App03..."));
        f3.setSize(400,220);
        f3.setVisible(true);
        
        f1.setLocation(50, 400);
        f2.setLocation(250, 60);
        f3.setLocation(500, 350);
        
        desktopPane = new JDesktopPane();
        desktopPane.add(f1);
        desktopPane.add(f2);
        desktopPane.add(f3);
        
        f.add(desktopPane, BorderLayout.CENTER);
        
        
        f.setJMenuBar(mb);
        
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        
        mi1 = new JMenu("New");
        mi2 = new JMenuItem("Open");
        mi3 = new JMenuItem("Save");
        mi4 = new JMenuItem("Exit");
        
        msi1 = new JMenuItem("Window");
        msi2 = new JMenuItem("Message");
        
        mi1.add(msi1);
        mi1.add(msi2);
        
        
        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);
        m1.add(mi4);
        
        f.setResizable(false);
        f.setSize(1000, 650);
        f.setVisible(true);
        
    }
}
