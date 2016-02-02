package JavaFXSceneBuilder;
import javafx.fxml.FXML;
import javafx.event.*;
import javafx.scene.control.*;
import javafx.scene.control.TextField;

public class FormController implements EventHandler<ActionEvent> {

	@FXML  // need to put this in since it is private
	private TextField nameField;

	public TextField streetField;
	public TextField cityField;
	public TextField stateField;
	public TextField zipcodeField;
	public Label lbloutput;

	public Button submitButton;




	//public Text textField;

	//@FXML
	//private void loginHandle(EventHandler <Control> e) {
	public void handle(ActionEvent event) {  

		if(event.getSource()==submitButton){
			lbloutput.setText(nameField.getText()+"\n"+streetField.getText()+"\n" +cityField.getText()+
					" "+stateField.getText()+" "+zipcodeField.getText());
		}

	}
}

/*btn.setOnAction(new EventHandler<ActionEvent>() {
	@Override
	public void handle(ActionEvent event) {
		System.out.println("Hello World!");
	}
 */