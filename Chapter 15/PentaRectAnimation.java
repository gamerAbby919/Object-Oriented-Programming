/*
Author: Abby Ralston
Date Started: Wed. Apr. 30, 2025
Date Finished:
 */

import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.*;
import javafx.util.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class PentaRectAnimation {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        Rectangle rect = new Rectangle(0, 0, 50, 100);
        rect.setFill(Color.ALICEBLUE);

        Polygon penta = new Polygon(50, 50);

        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setTitle("PentaRectAnimation");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
