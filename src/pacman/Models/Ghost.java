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
public class Ghost extends GameObject {

    public Ghost(int x, int y) {
        super(x, y);
    }
    
    public Ghost(int x, int y, int width, int height) {
        super(x, y, width, height);
    }
    
}
