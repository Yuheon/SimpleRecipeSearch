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

public class Controller3 {
	@FXML
	private Label recipe;
	@FXML
	private GridPane grid;
	void initData(int row,int column) {
		System.out.println(row+" and "+column);

		if(row==0) {
			switch(column) {
			case 0:
				recipe.setText("�ѽ�");
				break;
			case 1:
				recipe.setText("�߽�");
				System.out.println("z");
				break;
			case 2:
				recipe.setText("�Ͻ�");
				break;
			case 3:
				recipe.setText("���");
				break;      
			}
		}
		else if(row==1) {
			switch(column) {
			case 0:
				recipe.setText("�н�");
				break;
			case 1:
				recipe.setText("�߽�");
				break;
			case 2:
				recipe.setText("����");
				break;
			case 3:
				recipe.setText("��");
				break;      
			}
		}           
	}
	@FXML
    private void clickBackFood(MouseEvent event) {
        try {
            Parent mainmenu = FXMLLoader.load(getClass().getResource("Food.fxml"));
            Scene scene = new Scene(mainmenu);

            Stage primaryStage = (Stage)((Node) event.getSource()).getScene().getWindow();

            primaryStage.setScene(scene);
            primaryStage.setTitle("recipe");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
