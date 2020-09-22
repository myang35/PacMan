/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman.Views;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Marvin
 */
public class GameFrame extends JFrame {
    
    /**
     * Create full screen frame.
     */
    public GameFrame() {
        // Add back button
        JButton backButton = new JButton("Back");
        backButton.addActionListener((ActionEvent e) -> {
            new MenuFrame();
            dispose();
        });
        add(backButton);
        
        // Set the frame's title
        setTitle("Pac Man");

        // Stop running when frame closes
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set frame size
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        // Show frame
        setVisible(true);
    }

    /**
     * Create frame with custom size.
     * @param width
     * @param height 
     */
    public GameFrame(int width, int height) {
        // Set the frame's title
        setTitle("Pac Man");

        // Stop running when frame closes
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set frame size
        setSize(new Dimension(width, height));

        // Show frame
        setVisible(true);
    }
}
