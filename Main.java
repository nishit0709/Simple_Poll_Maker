//Stage-1

package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application
{
	Scene scene;
	Stage Window;
	public static void main(String args[])
	{
		launch(args);
	}
	public void start(Stage stage) throws Exception
	{
		Window=stage;
		BorderPane B1=new BorderPane();
		Text heading1=new Text("Welcome to Poll-Maker");
		Button b1=new Button("Create a Poll");
		heading1.setFont(Font.font("Verdana",24));
		B1.setTop(heading1);
		B1.setBottom(b1);
		B1.setAlignment(heading1, Pos.CENTER);
		B1.setAlignment(b1, Pos.BASELINE_CENTER);
		scene=new Scene(B1,500,500);
		b1.setOnAction(e-> {
			Window.close();
			Details.Show();
		});	
		Window.setScene(scene);
		Window.show();
	}
}
