import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class AccountType extends Application {

           public void start (Stage primaryStage){
               primaryStage.setTitle("Account Type");
               primaryStage.setWidth(500);
	       primaryStage.setHeight(300);
                ObservableList <String> options = FXCollections.observableArrayList("Administrator","Faculty","Staff","Student","Guest");
               ComboBox combobox = new ComboBox(options);
               Label label= new Label("Greeting");
               FlowPane pane = new FlowPane();
               combobox.setOnAction(e-> label.setText("Welcome" + combobox.getValue()));
               pane.getChildren().add(label);
               pane.getChildren().add(combobox);
               Scene scene = new Scene(pane);
               primaryStage.setScene(scene);
               primaryStage.show();
           }

}
