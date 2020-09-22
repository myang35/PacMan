/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman.Models;

/**
 *
 * @author Marvin
 */
public class GameModel {
    public static final String TITLE = "Pac Man";
    
    private int level;
    
    public GameModel() {
        level = 1;
    }

    public static String getTitle() {
        return TITLE;
    }
    
    public int getLevel() {
        return level;
    }
    
    public void nextLevel() {
        level++;
    }
}
