package com.example.demo6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class PoetryController {

    @FXML
    private Button PfilmB;
    public void HendPfilmB (ActionEvent action) throws IOException {
        Stage stage;
        Parent root;

        if(action.getSource() == PfilmB){
            stage = (Stage) PfilmB.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("film.fxml"));
        }
        else{
            stage = (Stage) PfilmB.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    private Button PfoodB;
    public void HendPfoodB (ActionEvent action) throws IOException {
        Stage stage;
        Parent root;

        if(action.getSource() == PfoodB){
            stage = (Stage) PfoodB.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("food.fxml"));
        }
        else{
            stage = (Stage) PfoodB.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("film.fxml"));
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
