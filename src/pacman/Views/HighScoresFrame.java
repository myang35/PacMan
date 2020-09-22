/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman.Views;

import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Marvin
 */
public class HighScoresFrame extends JFrame {
    
    public HighScoresFrame() {
        JScrollPane scrollPane = new JScrollPane(new JPanel());
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(scrollPane);
        
        // Add back button
        JButton backButton = new JButton("Back");
        backButton.addActionListener((ActionEvent e) -> {
            new MenuFrame();
            dispose();
        });
        add(backButton);
        
        // Set the frame's title
        setTitle("High Scores");

        // Stop running when frame closes
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set frame size
        setSize(400, 400);
        
        // Move frame to the center of the screen
        Point centerPoint = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        setLocation(centerPoint.x - getWidth()/2, centerPoint.y - getHeight()/2);

        // Show frame
        setVisible(true);
    }
    
}
