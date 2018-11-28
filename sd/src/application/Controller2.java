package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Controller2 {
	@FXML
	private Label food;
	@FXML
	private GridPane grid;
	void initData(int row,int column) {
		System.out.println(row+" and "+column);

		if(row==0) {
			switch(column) {
			case 0:
				food.setText("�ѽ�");
				break;
			case 1:
				food.setText("�߽�");
				System.out.println("z");
				break;
			case 2:
				food.setText("�Ͻ�");
				break;
			case 3:
				food.setText("���");
				break;      
			}
		}
		else if(row==1) {
			switch(column) {
			case 0:
				food.setText("�н�");
				break;
			case 1:
				food.setText("�߽�");
				break;
			case 2:
				food.setText("����");
				break;
			case 3:
				food.setText("��");
				break;      
			}
		}           
	}
	private static int toIndex(Integer value) {
		return value == null ? 0 : value;
	}

	
	@FXML
	private void clickfoodmenu(MouseEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("cookingrecipe.fxml"));
			Parent cookingrecipe=loader.load();
			Scene scene = new Scene(cookingrecipe);
			Stage primaryStage = (Stage)((Node) event.getSource()).getScene().getWindow();

			Node node = (Node) event.getSource();
			Parent p = node.getParent();

			while (p != grid) {
				node = p;
				p = p.getParent();
			}

			int row = toIndex(GridPane.getRowIndex(node));
			int column = toIndex(GridPane.getColumnIndex(node));
			System.out.println("r : "+row+" c : "+column);
			primaryStage.setScene(scene);
			primaryStage.setTitle("recipe");
			Controller3 controller3 = 
					loader.getController();			
			controller3.initData(row,column);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	@FXML
	private void clickBackMain(MouseEvent event) {
		try {
			Parent koreanfood = FXMLLoader.load(getClass().getResource("mainmenu.fxml"));
			Scene scene = new Scene(koreanfood);

			Stage primaryStage = (Stage)((Node) event.getSource()).getScene().getWindow();

			primaryStage.setScene(scene);
			primaryStage.setTitle("recipe");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
