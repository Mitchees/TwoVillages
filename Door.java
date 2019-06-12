
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
/**
@author Mitchell Aninyang
*/
public class Door {
    private double x;
    private double y;
    public double height;

    public Door(double x, double y, double height){
        this.x = x;
        this.y = y;
        this.height = height;
    }
    
    /**
    this is my draw class, where all the design happens
    @param gc
    */
    public void draw(GraphicsContext gc){
        double doorWidth = height / 2;
        gc.setFill(Color.WHITE);
        gc.fillRect(x, y, doorWidth, height);

    }
}
