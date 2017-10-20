
import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.Scanner;
import java.lang.String;


public class teamsize extends Application {
       public void start (Stage primaryStage){
           TextInputDialog dialog1 = new TextInputDialog();
           dialog1.setHeaderText("Enter number of people");
            Optional<String> numPeople= dialog1.showAndWait();
           int numPeople1 = Integer.parseInt(numPeople.get());
           int groupsize;

           if(numPeople1 >10){
               groupsize = numPeople1/2;
               Alert alertTrue = new Alert(Alert.AlertType.INFORMATION);
               alertTrue.setContentText("For a group of " + "people, each group contain"+ "group");
               alertTrue.showAndWait();
           } else if (numPeople1 >3 && numPeople1 <10){
               groupsize = numPeople1/3;
               Alert smallgroup = new Alert( Alert.AlertType.INFORMATION);
               smallgroup.setContentText("For a group of peopel " + "people ,each group should contain " + "group");

           }else {
               Alert alertFalse = new Alert(Alert.AlertType.INFORMATION);
               alertFalse.setContentText("The number of people has to be at least 3 ");
               alertFalse.showAndWait();
           }

           TextInputDialog dialog2 = new TextInputDialog();
           dialog2.setHeaderText("Enter number of player");
           Optional<String> numPlayer= dialog1.showAndWait();
           int numPlayer1 = Integer.parseInt(numPlayer.get());
           int teamsize;

           if (numPlayer1 >11 && numPlayer1 <55){
               teamsize = numPlayer1/11;
               Alert smallteam = new Alert( Alert.AlertType.INFORMATION);
               smallteam.setContentText("For a team of player " + "player ,each team should contain " + "team");

           }else {
               Alert alertFalse = new Alert(Alert.AlertType.INFORMATION);
               alertFalse.setContentText("execute teamsize=1 ");
               alertFalse.showAndWait();
           }














       }



}


