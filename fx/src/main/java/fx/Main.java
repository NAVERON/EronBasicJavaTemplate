package fx;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        System.out.println("Hello JavaFx !");
        
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label label = new Label("Hello World ! Using JavaFx ...", new Circle(300, 400, 10));
        Parent root = new Pane(label);
        
        Scene scene = new Scene(root, 600, 800);
        
        primaryStage.setScene(scene);
        primaryStage.setTitle("Eron JavaFx");
        primaryStage.show();
    }
    
}
