import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class ATMApp {

    // other existing methods

    public void showSplashScreen() {
        // Previous splash screen implementation can be removed
        Canvas logoCanvas = createLogoCanvas();
        // Add logic to display logoCanvas in your UI
    }

    public Canvas createLogoCanvas() {
        int width = 300;
        int height = 150;
        Canvas canvas = new Canvas(width, height);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // Draw ATM card logo
        gc.setFill(Color.DARKBLUE);
        gc.fillRect(0, 0, width, height);
        gc.setFill(Color.WHITE);
        gc.fillText("ATM Card", 100, 75);

        // Add more design elements to the logo as needed

        return canvas;
    }
}