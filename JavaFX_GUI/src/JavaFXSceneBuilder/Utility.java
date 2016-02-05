package JavaFXSceneBuilder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Utility extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Parent root = FXMLLoader.load(getClass().getResource("Utility.fxml"));
		Scene scene = new Scene(root,600,300);
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main (String args[])
	{
		launch(args);
	}

}