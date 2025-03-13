/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab13;

/**
 *
 * @author dtac6
 */
import java.awt.Font;
import javax.swing.*;
import java.util.*;
public class MyCock extends JLabel implements Runnable {
    @Override
    public void run() {
        while(true){
            Calendar d = Calendar.getInstance();
            int sec = d.get(Calendar.SECOND);
            int min = d.get(Calendar.MINUTE);
            int hour = d.get(Calendar.HOUR_OF_DAY);
            
            setFont(new Font("Arial", Font.BOLD, 30));
            
            String time = String.format("%02d:%02d:%02d", hour, min, sec);
            setText(time);
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
