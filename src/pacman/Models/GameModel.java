/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman.Models;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author Marvin
 */
public class GameModel {
    private int level;
    private ArrayList<GameObject> objects = new ArrayList<>();
    
    public GameModel() {
        level = 1;
    }
    
    public int getLevel() {
        return level;
    }
    
    public void nextLevel() {
        level++;
    }
    
    public void tick() {
        for (GameObject o : objects) {
            o.tick();
        }
    }
    
    public void render(Graphics g) {
        for (GameObject o : objects) {
            o.render(g);
        }
    }
}
