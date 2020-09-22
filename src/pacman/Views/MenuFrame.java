/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman.Views;

import java.awt.Component;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Marvin
 */
public class MenuFrame extends JFrame {
    
    public MenuFrame() {
        add(Box.createVerticalStrut(10)); // Spacer
        
        // Create title label
        JLabel gameTitle = new JLabel("Pac Man");
        gameTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        gameTitle.setFont(new Font("serif", Font.BOLD, 60));
        add(gameTitle);
        
        add(Box.createVerticalStrut(20)); // Spacer
        
        // Add play button
        addButton("Play").addActionListener((ActionEvent e) -> {
            new GameFrame();
            dispose();
        });
        
        add(Box.createVerticalStrut(10)); // Spacer
        
        // Add high scores button
        addButton("High Scores").addActionListener((ActionEvent e) -> {
            new HighScoresFrame();
            dispose();
        });
        
        add(Box.createVerticalStrut(10)); // Spacer
        
        // Add high scores button
        addButton("Exit").addActionListener((ActionEvent e) -> {
            dispose();
        });
        
        add(Box.createVerticalStrut(10)); // Spacer
        
        // Set vertical alignment of the buttons
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        // Set the frame's title
        setTitle("Menu");
        
        // Stop running when frame closes
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Set frame size
        pack();
        this.setSize(getWidth()+200, getHeight());

        // Move frame to the center of the screen
        Point centerPoint = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        setLocation(centerPoint.x - getWidth()/2, centerPoint.y - getHeight()/2);
        
        // Show frame
        setVisible(true);
    }
    
    private JButton addButton(String title) {
        // Create button
        JButton button = new JButton(title);
        
        // Horizontally center the button
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        // Add button to the frame
        add(button);
        
        return button;
    }
    
}
