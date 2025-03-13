/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab13;

/**
 *
 * @author dtac6
 */
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Poring extends JFrame {
    private static int count = 0;
    private JLabel label;
    private final Random rand = new Random();

    public Poring() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        count++;
        
        setTitle("Poring");
        setSize(100, 120);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLayout(new BorderLayout());
        
        JLabel textLabel = new JLabel(String.valueOf(count));
        
        ImageIcon por = new ImageIcon("poring.png");
        Image scaledImage = por.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon porIcon = new ImageIcon(scaledImage);
        JButton porB = new JButton(porIcon);
        
        porB.setOpaque(false);
        porB.setContentAreaFilled(false);
        porB.setBorderPainted(false);
        porB.addActionListener(e -> dispose());
        
        add(porB, BorderLayout.CENTER);
        add(textLabel, BorderLayout.EAST);
        
        Random rand = new Random();
        int x = rand.nextInt(width);
        int y = rand.nextInt(height);

        setResizable(false);
        setLocation(x, y);
        setVisible(true);
        shakeFrame();
    }
    
    public void shakeFrame() {
        Thread shakeThread = new Thread(() -> {
            final int POS = 10;
            final int TIME = 50;
            Point originalLocation = getLocation();

            while (true) {
                int x = originalLocation.x + rand.nextInt(POS) - POS / 2;
                int y = originalLocation.y + rand.nextInt(POS) - POS / 2;
                setLocation(x, y);

                try {
                    Thread.sleep(TIME);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        shakeThread.setDaemon(true);
        shakeThread.start();
    }
}
