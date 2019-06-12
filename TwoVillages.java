
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import static javafx.application.Application.launch;
import static javafx.scene.paint.Color.DARKGREEN;


/**
 *  This is my main class.
 *
 * @author Mitchell Aninyang, 000796709
 */
public class TwoVillages extends Application {

    /**
     * Start method (use this instead of main).
     *
     * @param stage The FX stage to draw on
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas(1200, 1200); // Set canvas Size in Pixels
        stage.setTitle("FXGraphicsTemplate"); // Set window title
        root.getChildren().add(canvas);
        stage.setScene(scene);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // YOUR CODE STARTS HERE
        /**
         * Village object
         */
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
        Village v = new Village("Aultron", Math.random()*((600 - 10) + 1) + 10, 10, Color.RED);
        v.draw(gc);
        Village v2 = new Village("McNab",Math.random()*((300 - 10) + 1) + 10 , Math.random()*((800 - 250) + 1) + 250, Color.RED);
        v2.draw(gc);
        /**
         * This is for the Kings house.
         */
        House house = new House(800, 500, 300);
        house.draw(gc);



        // YOUR CODE STOPS HERE
        stage.show();
    }

    /**
     * The actual main method that launches the app.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        launch(args);
    }
}
