package rak.starshipJr;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
 
public class StarshipApplication extends Application{
	private FXMLLoader fxmlLoader;
	private final static String MAIN_MENU_VIEW = "MainMenu";
	
	public static void main(String[] args) {
		launch(args);
    }

	@Override
	public void start(Stage primaryStage) throws Exception {
		fxmlLoader = new FXMLLoader();
		Scene scene = loadFXML(MAIN_MENU_VIEW);
    
        primaryStage.setTitle("Starship");
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("images//Logo Icon.png")));
        primaryStage.setScene(scene);
        primaryStage.show();
	}
	
	private Scene loadFXML(String fileName) throws IOException {
		fxmlLoader.setLocation(getClass().getResource("view//" + fileName + ".fxml"));
		Parent root = fxmlLoader.load();
		
		Scene scene = new Scene(root, 300, 275);
		return scene;
	}
	
}
