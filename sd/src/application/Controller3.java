package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Controller3 {
	@FXML
	private Label recipe;
	@FXML
	private TextArea ingredient;
	@FXML
	private TextArea order;
	int n;
	
	void initRecipe(DBDTO dto,int n) {
//	void initRecipe(int type,int cook) {
//		System.out.println(type+" and "+cook);
//		if(type==1) {
//			switch(cook) {
//			case 0:
		this.n=n;
				recipe.setWrapText(true);
				ingredient.setWrapText(true); 
				order.setWrapText(true);
				recipe.setText(dto.getRecipe_name());
				ingredient.setText(dto.getRecipe_ingredient());
				order.setText(dto.getRecipe_sequence());
//				recipe.setText("�ſ���� ���������");
//				ingredient.setText("���� 10cm, ���� 1��, �����ް� 1/2��, ���� 1��, ��������� 1��,���� 1������, �ø���� 1/2������, ���� 1������, �� 1������,���� 10cm, ���� 1��, �����ް� 1/2��");
//				order.setText("1. ������ ������ �ҿ� �븩�ϰ� ���´�.\n"+
//						"2. ���� ��㿡 �ҽ� ��Ḧ �־� ������.\n"+
//						"3. ���� ���� ����� �־� ���� 3�� 30�ʰ� ���δ�.\n"+
//						"4. ���� ������� ���� ���� �׻����� �ְ� �İǴ��⵵ ���� �ִ´�.\n"+
//						"5. ��� ���� ����, ����, ����, ���� �ް����÷� �ϼ��Ѵ�.");
//			}
		}

	@FXML
    private void clickBackFood(MouseEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Food.fxml"));
			Parent food=loader.load();
			Scene scene = new Scene(food);
			Stage primaryStage = (Stage)((Node) event.getSource()).getScene().getWindow();

			primaryStage.setScene(scene);
			primaryStage.setTitle("recipe");

			Controller2 controller2 = 
					loader.getController();
			
			DBDAO dao = new DBDAO();
			DBDTO dto[]=new DBDTO[4];
			for(int i=0;i<4;i++)
				dto[i]=dao.search(n, i);//type,cook
			int row=n/4;
			int column=n%4;
			dao.exitDB();
			if(row==1&&column==2)
				System.out.println("����");
			else if(row==1&&column==3)
				System.out.println("������ ������");
			else
				controller2.initData(row,column,dto);           

		} catch(Exception e) {
			e.printStackTrace();
		}
    }
}
