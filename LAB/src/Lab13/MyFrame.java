/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab13;

/**
 *
 * @author dtac6
 */
import java.awt.*;
import javax.swing.*;
public class MyFrame {
    private JFrame f;
    private JPanel p;
    private MyCock cock;
    private Thread t;

    public MyFrame() {
        f = new JFrame("Time");
        f.setSize(200,100);
        p = new JPanel();
        cock = new MyCock();
        f.add(cock);
        t = new Thread(cock);
        t.start();
        f.setLocation(800, 500);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }
}
