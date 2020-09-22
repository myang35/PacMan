/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman.Models;

import java.awt.Rectangle;

/**
 *
 * @author Marvin
 */
public abstract class GameObject {
    protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected int xVelocity;
    protected int yVelocity;
    protected Rectangle collisionBoundary;
    
    public GameObject(int x, int y) {
        this.x = x;
        this.y = y;
        this.width = 32;
        this.height = 32;
        this.xVelocity = 0;
        this.yVelocity = 0;
        collisionBoundary = new Rectangle(x, y, width, height);
    }
    
    public GameObject(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.xVelocity = 0;
        this.yVelocity = 0;
        collisionBoundary = new Rectangle(x, y, width, height);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getXVelocity() {
        return xVelocity;
    }

    public void setXVelocity(int xVelocity) {
        this.xVelocity = xVelocity;
    }

    public int getYVelocity() {
        return yVelocity;
    }

    public void setYVelocity(int yVelocity) {
        this.yVelocity = yVelocity;
    }

    public Rectangle getCollisionBoundary() {
        return collisionBoundary;
    }

    public void setCollisionBoundary(Rectangle collisionBoundary) {
        this.collisionBoundary = collisionBoundary;
    }
    
    
}
