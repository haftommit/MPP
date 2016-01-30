/**
 * 
 */
package javaFXLab;

/**
 * @author haftomtesfay
 *
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public  class AddressForm extends Application{
	public void start(Stage primaryStage) {
        primaryStage.setTitle("Address Form");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_LEFT);
        grid.setHgap(2);
        grid.setVgap(2);
			//top, right, bottom, left
        grid.setPadding(new Insets(15, 15, 15, 15));

        
      //..............................................
        Label name = new Label("Name:");
        grid.add(name, 0, 0);

        TextField userTextField = new TextField();
        grid.add(userTextField, 0, 1,3,1);
        //..............................................
        Label stAddress = new Label("Street:");
        grid.add(stAddress, 3, 0,3,1);

        TextField textField1 = new TextField();
        grid.add(textField1, 3, 1);
        
      //..............................................
        Label city = new Label("City:");
        grid.add(city, 6, 0);
        
        TextField textField2 = new TextField();
        grid.add(textField2, 6, 1,3,1);
      //..............................................
        Label state = new Label("State:");
        grid.add(state, 3, 3);
        
        TextField textField3 = new TextField();
        grid.add(textField3, 3, 4,2,1);
      //..............................................
        Label zip = new Label("Zip:");
        grid.add(zip, 6, 3);
        
        TextField textField4 = new TextField();
        grid.add(textField4, 4, 4,3,1);
      //..............................................
        
        
        Button btn = new Button("Submit");  
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 6, 6);

       // final Text actiontarget = new Text();

        Text actiontarget = new Text();

        grid.add(actiontarget, 0, 7);

        btn.setOnAction(e->{
        	actiontarget.setFill(Color.BLUE);
        	actiontarget.setText(userTextField.getText()+"\n"+textField1.getText()+"\n"+
        	""+textField2.getText()+" "+textField3.getText()+" "+textField4.getText());
        });

        Scene scene = new Scene(grid, 500, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

	
	public static void main(String[] args) {
		launch(args);
	}


	
}
