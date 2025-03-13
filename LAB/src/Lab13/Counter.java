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
import java.awt.event.*;
import javax.swing.*;
public class Counter extends JLabel implements Runnable,MouseListener{
    private int sec = 0;
    private int min = 0;
    private int hour = 0;
    private boolean running = true;
    @Override
    public void run() {
        while(true){
            synchronized (this) {
                while (!running) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            sec++;
            if (sec >= 60) {
                min++;
                sec = 0;
            }
            if (min >= 60) {
                hour++;
                min = 0;
            }
            setFont(new Font("Arial", Font.BOLD, 30));
            String text = String.format("%02d:%02d:%02d", hour,min,sec);
            setText(text);
            addMouseListener(this);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        synchronized (this) {
            System.out.println("C");
            running = !running;
            if (running) {
                notify();
            }
        }
    }
    @Override
    public void mousePressed(MouseEvent e) {}  
    @Override
    public void mouseReleased(MouseEvent e) {}  
    @Override
    public void mouseEntered(MouseEvent e) {}  
    @Override
    public void mouseExited(MouseEvent e) {}  
}
