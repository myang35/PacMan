/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman;

import pacman.Models.GameModel;
import pacman.Views.MenuFrame;

/**
 *
 * @author Marvin
 */
public class PacMan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GameModel model = new GameModel();
        new MenuFrame(model);
    }
    
}
