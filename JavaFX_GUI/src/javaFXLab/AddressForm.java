package javaFXLab;

/**
 * @author haftomtesfay
 *
 */
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public  class AddressForm extends Application{
	@Override
	public void start(Stage primaryStage) {
        primaryStage.setTitle("Address Form"); // name of the container 
        GridPane grid = new GridPane(); // Initializing the Grid layout
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(3);
        grid.setVgap(5);
        grid.setPadding(new Insets(10, 10, 10, 10));	//Padding the gird from top, right, bottom, left

      //Creating the labels and adding them to the grid layout.
        Label name = new Label("Your Name:");
        grid.add(name, 0, 0);

        TextField userTextField = new TextField();
        grid.add(userTextField, 0, 1, 3, 1); // Put it at column 0, row 1 and it can span 3 columns and still in row 1
        
        //**************************************************
        Label streetAddress = new Label("Street:");
        grid.add(streetAddress, 3, 0, 3, 1);

        TextField streettextField = new TextField();
        grid.add(streettextField, 3, 1);
        
      //**************************************************
        Label city = new Label("City:");
        grid.add(city, 6, 0);
        
        TextField citytextField = new TextField();
        grid.add(citytextField, 6, 1, 3, 1);
        
      //**************************************************
        Label state = new Label("State:");
        grid.add(state, 3, 3);
        
        TextField statetextField = new TextField();
        grid.add(statetextField, 3, 4, 2, 1);
        
      //**************************************************
        Label zip = new Label("Zip:");
        grid.add(zip, 6, 3);
        
        TextField ziptextField = new TextField();
        grid.add(ziptextField, 4, 4, 3, 1);
        
      //**************************************************
        
        
        Button btn = new Button("Submit");  
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 6, 6);

       // final Text actiontarget = new Text();

        Text actiontarget = new Text();

        grid.add(actiontarget, 2, 7); // Put the text @column 2 row 7

        btn.setOnAction(e->{
        	actiontarget.setFill(Color.BLACK);
        	actiontarget.setText(userTextField.getText()+"\n"+streettextField.getText()+"\n"+
        	""+statetextField.getText()+" "+citytextField.getText()+" "+ziptextField.getText());
        });

        Scene scene = new Scene(grid, 500, 200);
        primaryStage.setScene(scene);
        primaryStage.show(); //setting the pane visible
    }

	
	public static void main(String[] args) {
		launch(args);
	}


	
}
