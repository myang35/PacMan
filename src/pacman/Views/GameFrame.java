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
import pacman.Models.GameModel;

/**
 *
 * @author Marvin
 */
public class GameFrame extends JFrame {
    
    GameModel model;
    
    /**
     * Create full screen frame.
     * @param model
     */
    public GameFrame(GameModel model) {
        this.model = model;
        
        // Add back button
        JButton backButton = new JButton("Back");
        backButton.addActionListener((ActionEvent e) -> {
            new MenuFrame(model);
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
     * @param model
     * @param width
     * @param height 
     */
    public GameFrame(GameModel model, int width, int height) {
        this.model = model;
        
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
