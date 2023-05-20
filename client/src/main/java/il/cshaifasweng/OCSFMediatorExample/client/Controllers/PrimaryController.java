package il.cshaifasweng.OCSFMediatorExample.client.Controllers;

import il.cshaifasweng.OCSFMediatorExample.client.App;
import il.cshaifasweng.OCSFMediatorExample.client.SimpleClient;
import il.cshaifasweng.OCSFMediatorExample.entities.CustomMessage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;


public class PrimaryController {
    @FXML
    private Button goToAllStudentsButton;


    @FXML
    void handleGoToAllStudentsButtonClick(ActionEvent event) {
        try {
            App.switchScreen("allStudents");
            SimpleClient.getClient().sendToServer(new CustomMessage("#showAllStudents", ""));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleGoHomeButtonClick(ActionEvent event) {
        try {
            App.switchScreen("primary");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleCreateTestButtonClick(ActionEvent event) {
        try {
            String teacherId = "1";
            SimpleClient.getClient().sendToServer(new CustomMessage("#getTeacher", teacherId));
            // TODO : send online teacher's id);
            App.switchScreen("createExamForm");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleGoSheduledTest(ActionEvent event) {
        try {
            App.switchScreen("scheduledTest");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleGoScheduleTestButtonClick(ActionEvent event) {
        try {
            SimpleClient.getClient().sendToServer(new CustomMessage("#showScheduleTest", ""));
            App.switchScreen("showScheduleTest");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
