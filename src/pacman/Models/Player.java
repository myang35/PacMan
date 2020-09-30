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
public class Player extends GameObject {
    private int lives;
    private int score;

    public Player(int x, int y) {
        super(x, y);
        
        lives = 3;
        score = 0;
    }
    
    public Player(int x, int y, int width, int height) {
        super(x, y, width, height);
        
        lives = 3;
        score = 0;
    }

    public int getLives() {
        return lives;
    }

    public int getScore() {
        return score;
    }
    
    public void die() {
        lives--;
    }
    
    public void addScore() {
        score++;
    }

    @Override
    public void tick() {
        
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, width, height);
    }
    
}
