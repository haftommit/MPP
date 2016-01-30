/**
 * 
 */
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
		
		Button btn = new Button("Count Letters");  
        HBox hbBtn = new HBox(15);
        hbBtn.setAlignment(Pos.TOP_LEFT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 0, 0,12,2);
        
        Button btn1=new Button("Reverse Letters");
        HBox hbBtn1= new HBox(15);
        hbBtn1.setAlignment(Pos.TOP_LEFT);
        hbBtn1.getChildren().add(btn1);
        grid.add(hbBtn1, 0, 2, 11, 2);
        
        Button btn2=new Button("Remove Duplicate");
        HBox hbBtn2= new HBox(15);
        hbBtn2.setAlignment(Pos.TOP_LEFT);
        hbBtn2.getChildren().add(btn2);
        grid.add(hbBtn2, 0, 4, 9, 2);
        
        Label lb=new Label("Input: ");
        grid.add(lb, 15, 0, 3, 1);
        
        TextField tf= new TextField();
        grid.add(tf, 15, 1, 3, 1);
        
        Label lb1=new Label("OutPut:");
        grid.add(lb1, 15, 2, 3, 1);
        
        TextField tf1= new TextField();
        grid.add(tf1, 15, 3, 3, 1);
        
        btn.setOnAction(e->{
        		String text=tf.getText();
        		int len=text.length();
        		tf1.setText(""+len);
        		});
        btn1.setOnAction(e->{
        	String text=tf.getText();
        	String val="";
        	for(int i=text.length()-1;i>=0;i--){
        		val=val+text.charAt(i);
        	}
        	tf1.setText(val);
        	
        });
        btn2.setOnAction(e->{
        	String text=tf.getText();
        	//String reverse=""+text.charAt(0);
			String h="";
			for(int i=0;i<text.length();i++){
			if(!h.contains(text.substring(i,i+1)))
				
					h += text.substring(i,i+1);
			}
			tf1.setText(h);
        	//tf1.setText(reverse);
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