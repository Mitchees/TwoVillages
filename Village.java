/**
 * This is my village class. It contains 3 houses.
 * Each village is randomly placed on the screen, and its houses are
 * randomly sized and randomly spaced between each other.
 *
 * @author Mitchell Aninyang
 */
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import java.io.PrintStream;

public class Village {
    /**
     * Village x coordinate position
     */
    private double x;
    /**
     * Village y coordinate position
     */
    private double y;
    /**
     * Village size
     */
    private double size;
    /**
     * Village color
     */
    private Color color;
    /**
     * Name of the village
     */
    private String name;

    /**
     *  this is the Village constructor
     *
     * @param name
     * @param x
     * @param y
     * @param color unused
     */
    public Village(String name, double x, double y, Color color){
        this.x = x;
        this.y = y;
        this.name = name;
        this.color = color;
    }

    /**
     * This is the draw method
     *
     * @param gc
     */
    public void draw(GraphicsContext gc){
        /**
         * creating random red green and blue colors for my house colors
         */
        double red = Math.random()*255;
        double green = Math.random()*255;
        double blue = Math.random()*255;

        /**
         * I created a rectangle and gave it a height of 200
         * This is the rectangle that my houses are build upon as the village.
         */
        int rectHeight = 200;

        /**
         * Initialised value for the size of the village.
         */
        double totalWidth = 0;

        /**
         * This is a variable that represents the
         * x position of x
         */
        double x = this.x;
        /**
         * While loop to create more houses in a village.
         */
            int y = 0;
            while (y < 3){
                /**
                 * I created a width variable to be random, so that
                 * each house can have random widths.
                 * Also i set the height to be equal to the width so that
                 * the house can be a square.
                 */
                double width = (Math.random()*((150 - 50) + 1)) + 50;
                double height = width;
                House h = new House(x, (this.y + rectHeight) - height, width);
                h.draw(gc);
                totalWidth = totalWidth + width;
                x = x + width + (Math.random()*((70 - 30) + 1) + 30);
                y++;
            }
        /**
         * This is where the naming, the size, and the
         * occupants of the Villages are declared and printed.
         */
        gc.setFill(Color.WHITE);
        //double occupants = Math.random()*200;
        String message = name + " (Size: " + (int) totalWidth / 20 + ", Occupants: " + (int) (Math.random()*200) +")";
        gc.setFont(Font.font("Helvetica"));
        gc.fillText(String.valueOf(message), this.x, this.y + rectHeight + 15);



    }
}
