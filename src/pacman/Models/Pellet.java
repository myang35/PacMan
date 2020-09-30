/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman.Models;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Marvin
 */
public class Pellet extends GameObject {
    
    public Pellet(int x, int y) {
        super(x, y);
    }
    
    public Pellet(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void tick() {
        
    }

    @Override
    public void render(Graphics g) {
        g.setColor(new Color(252, 198, 169)); // peach color
        g.fillOval(x + 2*width/5, y + 2*height/5, height/width, height/width);
    }
    
}