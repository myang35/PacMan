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
public class Ghost extends GameObject {

    public Ghost(int x, int y) {
        super(x, y);
    }
    
    public Ghost(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void tick() {
        
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(x, y, width, height);
    }
    
}
