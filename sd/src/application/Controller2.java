package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Controller2 {
	
	@FXML
	private Label food;
	@FXML
	private ImageView image1;
	@FXML
	private ImageView image2;
	@FXML
	private ImageView image3;
	@FXML
	private ImageView image4;

	@FXML
	private Label name1;
	@FXML
	private Label name2;
	@FXML
	private Label name3;
	@FXML
	private Label name4;
	
	@FXML
	private GridPane grid;
	int n;
	void initData(int row,int column,DBDTO dto[]) {
		System.out.println(row+" and "+column);
		n=2*row+column;
		Image img;
		img = new Image(getClass().getResourceAsStream(dto[0].getRecipe_image()));
		image1.setImage(img);
		name1.setWrapText(true);
		name1.setText(dto[0].getRecipe_name());
		name1.setAlignment(Pos.CENTER);
		img = new Image(getClass().getResourceAsStream(dto[1].getRecipe_image()));
		image2.setImage(img);
		name2.setWrapText(true);
		name2.setText(dto[1].getRecipe_name());
		name2.setAlignment(Pos.CENTER);
		img = new Image(getClass().getResourceAsStream(dto[2].getRecipe_image()));
		image3.setImage(img);
		name3.setWrapText(true);
		name3.setText(dto[2].getRecipe_name());
		name3.setAlignment(Pos.CENTER);
		img = new Image(getClass().getResourceAsStream(dto[3].getRecipe_image()));
		image4.setImage(img);
		name4.setWrapText(true);
		name4.setText(dto[3].getRecipe_name());
		name4.setAlignment(Pos.CENTER);
		switch(n) {
		case 0:
			food.setText("밥");
			food.setAlignment(Pos.CENTER);

			//			img = new Image(getClass().getResourceAsStream(dto[0].getRecipe_image()));
			//			image1.setImage(img);
			//			name1.setWrapText(true);
			//			name1.setText(dto[0].getRecipe_name());
			//			name1.setAlignment(Pos.CENTER);
			//			img = new Image(getClass().getResourceAsStream(dto[1].getRecipe_image()));
			//			image2.setImage(img);
			//			name2.setWrapText(true);
			//			name2.setText(dto[1].getRecipe_name());
			//			name2.setAlignment(Pos.CENTER);
			//			img = new Image(getClass().getResourceAsStream(dto[2].getRecipe_image()));
			//			image3.setImage(img);
			//			name3.setWrapText(true);
			//			name3.setText(dto[2].getRecipe_name());
			//			name3.setAlignment(Pos.CENTER);
			//			img = new Image(getClass().getResourceAsStream(dto[3].getRecipe_image()));
			//			image4.setImage(img);
			//			name4.setWrapText(true);
			//			name4.setText(dto[3].getRecipe_name());
			//			name4.setAlignment(Pos.CENTER);
			break;
		case 1:
			food.setText("면");
			food.setAlignment(Pos.CENTER);

			//			img = new Image(getClass().getResourceAsStream(dto[0].getRecipe_image()));
			//			image1.setImage(img);
			//			name1.setWrapText(true);
			//			name1.setText(dto[0].getRecipe_name());
			//
			//			img = new Image(getClass().getResourceAsStream(dto[1].getRecipe_image()));
			//			image2.setImage(img);
			//			name2.setWrapText(true);
			//			name2.setText(dto[1].getRecipe_name());
			//
			//			img = new Image(getClass().getResourceAsStream(dto[2].getRecipe_image()));
			//			image3.setImage(img);
			//			name3.setWrapText(true);
			//			name3.setText(dto[2].getRecipe_name());
			//
			//			img = new Image(getClass().getResourceAsStream(dto[3].getRecipe_image()));
			//			image4.setImage(img);
			//			name4.setWrapText(true);
			//			name4.setText(dto[3].getRecipe_name());
			//				
			break;
		case 2:
			food.setText("고기");
			food.setAlignment(Pos.CENTER);

			//			img = new Image(getClass().getResourceAsStream(dto[0].getRecipe_image()));
			//			image1.setImage(img);
			//			name1.setWrapText(true);
			//			name1.setText(dto[0].getRecipe_name());
			//
			//			img = new Image(getClass().getResourceAsStream(dto[1].getRecipe_image()));
			//			image2.setImage(img);
			//			name2.setWrapText(true);
			//			name2.setText(dto[1].getRecipe_name());
			//
			//			img = new Image(getClass().getResourceAsStream(dto[2].getRecipe_image()));
			//			image3.setImage(img);
			//			name3.setWrapText(true);
			//			name3.setText(dto[2].getRecipe_name());
			//
			//			img = new Image(getClass().getResourceAsStream(dto[3].getRecipe_image()));
			//			image4.setImage(img);
			//			name4.setWrapText(true);
			//			name4.setText(dto[3].getRecipe_name());
			break;
		case 3:
			food.setText("찌개");
			food.setAlignment(Pos.CENTER);

			//			img = new Image(getClass().getResourceAsStream(dto[0].getRecipe_image()));
			//			image1.setImage(img);
			//			name1.setWrapText(true);
			//			name1.setText(dto[0].getRecipe_name());
			//
			//			img = new Image(getClass().getResourceAsStream(dto[1].getRecipe_image()));
			//			image2.setImage(img);
			//			name2.setWrapText(true);
			//			name2.setText(dto[1].getRecipe_name());
			//
			//			img = new Image(getClass().getResourceAsStream(dto[2].getRecipe_image()));
			//			image3.setImage(img);
			//			name3.setWrapText(true);
			//			name3.setText(dto[2].getRecipe_name());
			//
			//			img = new Image(getClass().getResourceAsStream(dto[3].getRecipe_image()));
			//			image4.setImage(img);
			//			name4.setWrapText(true);
			//			name4.setText(dto[3].getRecipe_name());
			break;      
		case 4:
			food.setText("야채");
			food.setAlignment(Pos.CENTER);

			//			img = new Image(getClass().getResourceAsStream(dto[0].getRecipe_image()));
			//			image1.setImage(img);
			//			name1.setWrapText(true);
			//			name1.setText(dto[0].getRecipe_name());
			//
			//			img = new Image(getClass().getResourceAsStream(dto[1].getRecipe_image()));
			//			image2.setImage(img);
			//			name2.setWrapText(true);
			//			name2.setText(dto[1].getRecipe_name());
			//
			//			img = new Image(getClass().getResourceAsStream(dto[2].getRecipe_image()));
			//			image3.setImage(img);
			//			name3.setWrapText(true);
			//			name3.setText(dto[2].getRecipe_name());
			//
			//			img = new Image(getClass().getResourceAsStream(dto[3].getRecipe_image()));
			//			image4.setImage(img);
			//			name4.setWrapText(true);
			//			name4.setText(dto[3].getRecipe_name());
			break;
		case 5:
			food.setText("편의점 요리");
			food.setWrapText(true);
			food.setAlignment(Pos.CENTER);
			//
			//			img = new Image(getClass().getResourceAsStream(dto[0].getRecipe_image()));
			//			image1.setImage(img);
			//			name1.setWrapText(true);
			//			name1.setText(dto[0].getRecipe_name());
			//
			//			img = new Image(getClass().getResourceAsStream(dto[1].getRecipe_image()));
			//			image2.setImage(img);
			//			name2.setWrapText(true);
			//			name2.setText(dto[1].getRecipe_name());
			//
			//			img = new Image(getClass().getResourceAsStream(dto[2].getRecipe_image()));
			//			image3.setImage(img);
			//			name3.setWrapText(true);
			//			name3.setText(dto[2].getRecipe_name());
			//
			//			img = new Image(getClass().getResourceAsStream(dto[3].getRecipe_image()));
			//			image4.setImage(img);
			//			name4.setWrapText(true);
			//			name4.setText(dto[3].getRecipe_name());
			break;
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

			DBDAO dao = new DBDAO();
			DBDTO dto = null;
			dto=dao.search(n, row*2+column);//type,cook
			dao.exitDB();
			controller3.initRecipe(dto,n);
			//			controller3.initRecipe(n,row+column);
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
