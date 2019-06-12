/**
 * This is my window class
 *
 * @author Mitchell Aninyang
 */

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Window {
    /**
     * this is the X coordinate for the window
     */
    private double x;
    /**
     * this is the y coordinate for the window
     */
    private double y;
    /**
     * this is the diameter of the window
     */
    private double diameter;

    /**
     * window constructor
     * @param x will be equal to the instance variable x
     * @param y will be equal to the instance variable y
     * @param diameter will be equal to the instance variable diameter
     */
    public Window(double x, double y, double diameter){
        this.x = x;
        this.y = y;
        this.diameter = diameter;
    }

    /**
     * this is my draw method
     * @param gc
     */
    public void draw(GraphicsContext gc){
        gc.setFill(Color.WHITE);
        gc.fillOval(x, y, diameter, diameter);
    }
}
