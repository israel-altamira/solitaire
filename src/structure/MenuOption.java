/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structure;

/**
 *
 * @author angel
 */
public class MenuOption implements Runnable{
    
    private int x_coordinate;
    private int y_coordinate;
    
    private int x_size, y_size;
    private boolean isActive;

    public MenuOption(int x_coordinate, int y_coordinate, int x_size, int y_size) {
        this.x_coordinate = x_coordinate;
        this.y_coordinate = y_coordinate;
        this.x_size = x_size;
        this.y_size = y_size;
        this.isActive = false;
    }

    public int getX_coordinate() {
        return x_coordinate;
    }

    public int getY_coordinate() {
        return y_coordinate;
    }

    public int getX_size() {
        return x_size;
    }

    public int getY_size() {
        return y_size;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
    
    public void clicked(){
        new Thread(this).start();
    }

    @Override
    public void run() {
        // Change buttton color or image for n secconds to make the programm enjoyable
    }
    
    
}
