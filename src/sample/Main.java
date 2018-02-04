package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.util.Random;


public class Main extends Application  {
    double x = 0;
    double y = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setTitle("Running button");

        Button button = new Button("Shut me");

        //  button.setTranslateX(x) i button.setTranslateX(y)
        button.setOnMouseEntered(value -> {

            Random r = new Random();
            double x = r.nextInt(500) + 1;
            double y = r.nextInt(201) + 1;

            if (x < 450 & y < 150) {

                button.setTranslateX(x);
                button.setTranslateY(y);

            } else

            {
                button.setTranslateX(530);
                button.setTranslateY(570);
            }

        });

        button.setOnMouseClicked(value ->  {
            Platform.exit();

        });

        HBox hbox = new HBox(button);

        Scene scene = new Scene(hbox, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}