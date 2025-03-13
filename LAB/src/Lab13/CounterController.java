/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab13;

/**
 *
 * @author dtac6
 */

import java.awt.FlowLayout;
import javax.swing.JFrame;
public class CounterController {
    Counter c;
    private JFrame f;
    public CounterController() {
        c = new Counter();
        f = new JFrame("Time Counter");
        f.setSize(200,100);
        f.add(c);
        f.setLayout(new FlowLayout());
        Thread t = new Thread(c);
        t.start();
        f.setLocation(500, 500);
        f.setVisible(true);
    }
    
}
