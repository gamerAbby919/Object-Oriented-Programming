/* 
Author: Abby Ralston
Date: April 24th, 2025
Class: TESD 1800
Teacher: Jason
Assignment: Exercise 15 Planning
*/
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Exercise15 extends Application {
    @Override
	public void start(Stage firstStage) {
		Pane pane = new Pane();

		//make 4 different buttons (UP,DOWN,-> , <- )
		Button btUP = new Button("UP");
		Button btDOWN = new Button("DOWN");
		Button btLEFT = new Button("LEFT");
		Button btRIGHT = new Button("RIGHT");
		
		//position buttons around
		btUP.setTranslateX(100);
		btUP.setTranslateY(450);
		btDOWN.setTranslateX(200);
		btDOWN.setTranslateY(450);
		btLEFT.setTranslateX(300);
		btLEFT.setTranslateY(450);
		btRIGHT.setTranslateX(400);
		btRIGHT.setTranslateY(450);
		
		//make a circle to move around \(^o^)/
		pane.getChildren().add(btUP);
		pane.getChildren().add(btDOWN);
		pane.getChildren().add(btLEFT);
		pane.getChildren().add(btRIGHT);
		Circle circle = new Circle();
		circle.setCenterX(250); 
		circle.setCenterY(250);
		circle.setRadius(50);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.BLANCHEDALMOND);
	
		//when any direction is pressed, it only moves in that direction
		btUP.setOnAction((d) -> {
			circle.setCenterY(circle.getCenterY() - 50);
		});
		btDOWN.setOnAction((d) -> {
			circle.setCenterY(circle.getCenterY() + 50);
		});
		btLEFT.setOnAction((l) -> {
			circle.setCenterX(circle.getCenterX() - 50);
		});
		btRIGHT.setOnAction((d) -> {
			circle.setCenterX(circle.getCenterX() + 50);
		});
		//Shows circle, buttons, and sets the pane
		pane.getChildren().add(circle);
		Scene scene = new Scene(pane, 500, 500);
		firstStage.setTitle("Exercise 15");
		firstStage.setScene(scene);
		firstStage.show();
	}

	public static void main(String[] args){
		launch(args);
	}
}