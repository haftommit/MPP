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
import javafx.stage.Stage;

public class StringUtility extends Application {
	public void start(Stage stage){
		stage.setTitle("String Utility");
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.TOP_LEFT);
		grid.setHgap(2);
		grid.setVgap(2);
		grid.setPadding(new Insets(15, 15, 15, 15));
		
		Button btncount = new Button("Count Letters");  
        HBox hbBtn = new HBox(15);
        hbBtn.setAlignment(Pos.TOP_LEFT);
        hbBtn.getChildren().add(btncount);
        grid.add(hbBtn, 0, 0,12,2);
        
        Button btnreverse=new Button("Reverse Letters");
        HBox hbBtn1= new HBox(15);
        hbBtn1.setAlignment(Pos.TOP_LEFT);
        hbBtn1.getChildren().add(btnreverse);
        grid.add(hbBtn1, 0, 2, 11, 2);
        
        Button btnduplicate=new Button("Remove Duplicate");
        HBox hbBtn2= new HBox(15);
        hbBtn2.setAlignment(Pos.TOP_LEFT);
        hbBtn2.getChildren().add(btnduplicate);
        grid.add(hbBtn2, 0, 4, 9, 2);
        
        Label input=new Label("Input: ");
        grid.add(input, 15, 0, 3, 1);
        
        TextField txtfld= new TextField();
        grid.add(txtfld, 15, 1, 3, 1);
        
        Label output=new Label("OutPut:");
        grid.add(output, 15, 2, 3, 1);
        
        TextField txtfld1= new TextField();
        grid.add(txtfld1, 15, 3, 3, 1);
        
        btncount.setOnAction(e->{
        		String text=txtfld.getText();
        		int len=text.length();
        		txtfld1.setText(""+len);
        		});
        btnreverse.setOnAction(e->{
        	String text=txtfld.getText();
        	String val="";
        	for(int i=text.length()-1;i>=0;i--){
        		val=val+text.charAt(i);
        	}
        	txtfld1.setText(val);
        	
        });
        btnduplicate.setOnAction(e->{
        	String str=txtfld.getText();
        	//String stringreverse=""+text.charAt(0);
			String temp="";
			for(int i=0;i<str.length();i++){
			if(!temp.contains(str.substring(i,i+1)))
				
					temp += str.substring(i,i+1);
			}
			txtfld1.setText(temp);
        	
         });
        Scene scene = new Scene(grid, 500, 200);
        stage.setScene(scene);
        stage.show();
	}
	public static void main(String[] args)
	{
		launch(args);
	}
	
}