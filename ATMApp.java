import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ATMApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("ATM Application");
        Group root = new Group();
        Canvas canvas = new Canvas(400, 300);
        drawLogo(canvas.getGraphicsContext2D());
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private void drawLogo(GraphicsContext gc) {
        // Set background
        gc.setFill(Color.WHITE);
        gc.fillRect(0, 0, 400, 300);

        // Draw ATM Card
        gc.setFill(Color.BLUE);
        gc.fillRoundRect(50, 100, 300, 150, 20, 20);

        // Draw Dollar Sign
        gc.setFill(Color.GREEN);
        gc.setFont(new javafx.scene.text.Font(60));
        gc.fillText("$", 190, 180);

        // Draw ATMify Text
        gc.setFill(Color.BLACK);
        gc.setFont(new javafx.scene.text.Font(40));
        gc.fillText("ATMify", 120, 250);
    }

    public static void main(String[] args) {
        launch(args);
    }
}