package first_project_javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class FirstApp extends Application {

    Circle circle;
    Button button;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("My first title in my first application in favafx");

        circle = new Circle(0, 0, 30, Color.RED);
        button = new Button();
        button.setText("Click me");
        button.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
                if (circle.getFill() == Color.RED) {
                    circle.setFill(Color.GREEN);
                } else
                    circle.setFill(Color.RED);
            }
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(circle);
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}