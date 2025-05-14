/*
Author: Abby Ralston
Date Started: Wed. Apr. 30, 2025
Date Finished:
 */

 import javafx.animation.*;
 import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javafx.scene.*;
 import javafx.scene.paint.Color;
 import javafx.scene.shape.Polygon;
 import javafx.scene.shape.Rectangle;
 import javafx.stage.*;
 import javafx.util.*;
 import javafx.scene.layout.Pane;
 import javafx.stage.Stage;
 
 public class PentaRectAnim extends Application{
     @Override
     public void start(Stage primaryStage) {
         Pane pane = new Pane();

         //make the epic shapes \(^o^)/
         Rectangle rect = new Rectangle(0, 0, 50, 100);
         rect.setFill(Color.LIGHTCORAL);
         rect.setStroke(Color.CORAL);
        
         //add the epic shapes :>
         //polygons are so complicated for NO REASON >:[
            Polygon penta = new Polygon();
            penta.setFill(Color.CRIMSON);
            penta.setStroke(Color.SALMON);
            ObservableList<Double> list = penta.getPoints();
   
            //makes the radius and center for the pentagon
            double centerX = 500 / 2;
            double centerY = 500 / 2;
            double radius = Math.min(500, 500) * 0.4;
   
            //makes points for the pentagon
            for(int i = 0; i<5; i++) {
               list.add(centerX + radius * Math.cos(2 * i * Math.PI / 5));
               list.add(centerY - radius * Math.sin(2 * i * Math.PI / 5));
            }
   
            pane.getChildren().clear();
            pane.getChildren().add(penta);
            pane.getChildren().add(rect);
    
         //makes the rectangle go around the pentagon \(^w^)/
         PathTransition pathing = new PathTransition();
         
         //how long the animation will be before infinitely repeating
         pathing.setDuration(Duration.seconds(7));
         pathing.setCycleCount(Timeline.INDEFINITE);
         
         //makes it so that the rectangle is moving AROUND the pentagon
         pathing.setPath(penta);
         pathing.setNode(rect);

         /* not sure what ORTHOGONAL TO TANGENT is, 
         all I know is that it works ¯\_(ツ)_/¯ */
         pathing.setOrientation(
            PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        
         //no clue what Auto Reverse is, I'll find out someday lol
         pathing.setAutoReverse(true);
        
         //let's make the opacity of the rectangle fade B)
         FadeTransition fade =
            new FadeTransition(Duration.seconds(7), rect);
         
         //makes it so that the opacity goes down
         fade.setFromValue(1.0);
         fade.setToValue(0.1);
         
         //makes it fade indefinitely
         fade.setCycleCount(Timeline.INDEFINITE);
         fade.setAutoReverse(true);
         
         //plays both animations :P
         fade.play();
         pathing.play();

         /*pause and unpause \(o_0)/
         I made it auto play (because I'm epic like that) */
         penta.setOnMousePressed(e -> pathing.pause());
         penta.setOnMouseReleased(e -> pathing.play());

         //starts the animation >:D
         Scene scene = new Scene(pane, 500, 500);
         primaryStage.setTitle("PentaRectAnimation");
         primaryStage.setScene(scene);
         primaryStage.show();
     }   
     public static void main(String[] args){
        launch(args);
     }


 }