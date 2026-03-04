import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ATMApp extends Application {

    private double balance = 0;
    private String username = "user";
    private String pin = "1234";
    
    // Placeholder for transaction history
    private StringBuilder transactionHistory = new StringBuilder();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("ATM Application");
        
        Canvas canvas = new Canvas(300, 200);
        drawLogo(canvas.getGraphicsContext2D());

        VBox vbox = new VBox(drawLoginForm(primaryStage));
        Group root = new Group();
        root.getChildren().addAll(canvas, vbox);
        
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void drawLogo(GraphicsContext gc) {
        gc.clearRect(0, 0, 300, 200);
        gc.setFill(javafx.scene.paint.Color.BLUE);
        gc.fillRect(50, 20, 200, 160);
        gc.setFill(javafx.scene.paint.Color.WHITE);
        gc.fillText("ATM", 150, 100);
    }

    private VBox drawLoginForm(Stage primaryStage) {
        Label userLabel = new Label("Username:");
        TextField userTextField = new TextField();
        Label pinLabel = new Label("PIN:");
        PasswordField pinTextField = new PasswordField();
        Button loginButton = new Button("Login");

        loginButton.setOnAction(e -> {
            if (userTextField.getText().equals(username) && pinTextField.getText().equals(pin)) {
                showMainMenu(primaryStage);
            } else {
                showAlert("Invalid login.");
            }
        });

        VBox vbox = new VBox(userLabel, userTextField, pinLabel, pinTextField, loginButton);
        return vbox;
    }

    private void showMainMenu(Stage primaryStage) {
        // Main menu implementation here (Deposit, Withdraw, etc.)
        // Placeholder content for demonstration.
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Welcome");
        alert.setHeaderText("Login successful");
        alert.setContentText("Choose an option: Deposit, Withdraw, Check Balance, Change PIN, Transactions");
        alert.showAndWait();
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Warning");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    
    // Methods for deposit, withdraw, check balance, change pin, and transaction history can be added here
}