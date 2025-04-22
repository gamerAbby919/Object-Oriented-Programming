import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

public class Exercise15 extends Application {
    @Override
	public void start(Stage firstStage) {
		//No clue what the 10 means lol
		HBox pane = new HBox(10);
		pane.setAlignment(Pos.CENTER);

		//make 4 different buttons (UP,DOWN,->,<-, & RESET POS.)
		Button btUP = new Button("UP");
		Button btDOWN = new Button("DOWN");
		Button btLEFT = new Button("LEFT");
		Button btRIGHT = new Button("RIGHT");
		Button btResetPOS = new Button("Reset");
		
		//make a circle to move around \(^o^)/
		//you may have to redo this part
		Circle circle = new Circle();
		circle.centerXProperty().bind(pane.widthProperty().divide(2)); 
		circle.centerYProperty().bind(pane.heightProperty().divide(2)); 
		pane.getChildren().add(circle);

		//when any direction is pressed, it only moves in that direction


		//Shows project in a pane :>
		Scene scene = new Scene(pane);
		firstStage.setTitle("Exercise 15");
		firstStage.setScene(scene);
		firstStage.show();
	}
}