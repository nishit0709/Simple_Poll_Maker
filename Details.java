//Stage-2
package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Details 
{
	static String Ques,OPT1,OPT2;
	public static void details(String Q,String opt1,String opt2)
	{
		Ques=Q;
		OPT1=opt1;
		OPT2=opt2;
	}
	public static void Show()
	{
		BorderPane B=new BorderPane();
		GridPane grid=new GridPane();
		B.setCenter(grid);
		
		Text heading=new Text("Poll Details");
		Button b=new Button("Create Poll");
		Text Question =new Text("Question: ");
		TextField q=new TextField();
		Text Option_1=new Text("Option-A: ");
		TextField t1=new TextField();
		Text Option_2=new Text("Option-B: ");
		TextField t2=new TextField();
		
		heading.setFont(Font.font("Verdana",24));
		Question.setFont(Font.font(18));
		Option_1.setFont(Font.font(18));
		Option_2.setFont(Font.font(18));
		B.setTop(heading);
		grid.setPadding(new Insets(10,10,10,10));
		grid.add(Question, 0, 4);
		grid.add(q, 1, 4);
		grid.add(Option_1, 0, 6);
		grid.add(t1, 1, 6);
		grid.add(Option_2, 0, 8);
		grid.add(t2, 1, 8);
		grid.setVgap(20);
		grid.setHgap(10);
		B.setAlignment(heading, Pos.TOP_CENTER);
		B.setAlignment(b, Pos.BASELINE_CENTER);
		B.setBottom(b);
		Stage Window=new Stage();
		b.setOnAction(e->{
			Window.close();
			details(q.getText(),t1.getText(),t2.getText());
			Poll.poll(Ques,OPT1,OPT2);
		});		
		Scene scene=new Scene(B,500,600);
		Window.setScene(scene);	
		Window.show();
	}	
}
