/**
 * This is my house class
 *
 * @author Mitchell Aninyang, 000796709
 */


import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class House {
    /**
     * this is the X coordinate for the house
     */
    private double x;
    /**
     * this is the y coordinate for the house
     */
    private double y;
    /**
     * this is the size of the house
     */
    private double size;
    /**
     * this is the Color of the house
     *
     * @color unused
     */
    private Color color;
    /**
     * this is the number of occupants of the house
     */
    private int occupants;

    /**
     * This is the constructor for the class
     * @param x will be equal to the instance variable x
     * @param y will be equal to the instance variable y
     * @param size will be equal to the instance variable size
     */
    public House(double x, double y, double size){
        this.size = size;
        this.x = x;
        this.y = y;
    }

    /**
     * This is another constructor for the class
     * @param x will be equal to the instance variable x
     * @param y will be equal to the instance variable y
     */
    public House(double x, double y){
        this.x = x;
        this.y = y;
    }

    /**
     * This is the draw method
     * @param gc
     */
    public void draw(GraphicsContext gc){
        double width = (Math.random()*((150 - 50) + 1)) + 50;
        double height = width;

        double red = Math.random()*255;
        double green = Math.random()*255;
        double blue = Math.random()*255;
        gc.setFill(Color.rgb((int)red, (int)green, (int)blue));
        gc.fillRect(x, y, size, size);

        Door D = new Door((size/2) + this.x, (size / 2) + this.y, size / 2);
        D.draw(gc);

        Window w = new Window((size / 5) + this.x, (size / 5) + (this.y), D.height / 2);
        w.draw(gc);
    }

    /**
     * setOccupants method with a parameter n
     * @param n
     */
    public void setOccupants(int n){
        //n = Math.random()*200;
        //getOccupants();
        this.occupants = n;
        //return n;
    }

    /**
     * getOccupants method
     * @return
     */
    public int getOccupants(){
        return occupants;
    }

    /**
     * getSize method
     * @return size
     */
    public double getSize(){
        return size;
    }
}