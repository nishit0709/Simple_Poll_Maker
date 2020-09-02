Stage-3


package application;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Poll 
{
	Scene scene;
	static int m=0,n=0;
	public static void poll(String a,String b,String c)
	{
		Text Q=new Text(a);
		Text op1=new Text(b);
		Text op2=new Text(c);		
		Text heading=new Text("POLL");
		Label L1=new Label("0% (0)");
		Label L2=new Label("0% (0)");
		
		BorderPane B=new BorderPane();
		GridPane grid=new GridPane();
		grid.setVgap(20);
		grid.setHgap(20);
		VBox V=new VBox(30);
				
		heading.setFont(Font.font(30));
		Q.setFont(Font.font(24));
		op1.setFont(Font.font(18));
		op2.setFont(Font.font(18));
		
		Button opt1=new Button(">>>>");
		Button opt2=new Button(">>>>");
		
		B.setTop(heading);				
		grid.add(op1, 1, 2);
		grid.add(opt1, 0, 2);
		grid.add(L1, 3, 2);
		grid.add(op2, 1, 6);
		grid.add(opt2, 0, 6);	
		grid.add(L2, 3, 6);
		B.setCenter(V);
		V.getChildren().add(Q);
		V.getChildren().add(grid);
		grid.setPadding(new Insets(50,0,0,0));
		V.setPadding(new Insets(50,0,0,100));
		B.setAlignment(heading, Pos.TOP_CENTER);
		B.setAlignment(V, Pos.CENTER);
		Scene scene= new Scene(B,500,600);
		Stage Window=new Stage();
		opt1.setOnAction(e-> {
			option1();
			
			grid.getChildren().remove(L1);
			grid.getChildren().remove(L2);
			
			L1.setText((float)m/(m+n)*100+"% ("+m+")");
			L2.setText((float)n/(m+n)*100+"% ("+n+")");
			
			grid.add(L1,3,2);
			grid.add(L2,3,6);
		});
		opt2.setOnAction(e->{
			option2();
			
			grid.getChildren().remove(L1);
			grid.getChildren().remove(L2);
			
			L1.setText((float)m/(m+n)*100+"% ("+m+")");
			L2.setText((float)n/(m+n)*100+"% ("+n+")");
			
			grid.add(L1,3,2);
			grid.add(L2,3,6);
		});
		Window.setScene(scene);
		Window.show();
		
	}
	static void option1()
	{
		++m;
	}
	static void option2()
	{
		++n;
	}	
}
