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
import java.awt.event.*;

public class PoringConstructor extends JFrame implements ActionListener {
    private JButton addButton;

    public PoringConstructor() {
        setTitle("Poring Constructor");
        setSize(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        addButton = new JButton("Add");
        addButton.addActionListener(this);

        add(addButton);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            new Poring();
    }
}
}
