import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

// Replace this method in ATMApp.java
private void drawLogo(GraphicsContext gc) {
    // Draw card icon
    gc.setFill(Color.BLUE);
    gc.fillRect(50, 25, 100, 60); // Card rectangle
    gc.setFill(Color.WHITE);
    gc.fillText("💳", 75, 60); // Card icon using emoticon

    // Draw dollar sign
    gc.setFont(new Font(30));
    gc.setFill(Color.GREEN);
    gc.fillText("$", 120, 50);

    // Draw "ATMify" text
    gc.setFont(new Font("Arial", 24));
    gc.setFill(Color.BLACK);
    gc.fillText("ATMify", 40, 120);
}