package com.example.demo6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;

public class SelectFilmController {

    @FXML
    private Button FoodB;
    @FXML
    void HendFoodB(ActionEvent event) throws IOException {

        Stage stage = (Stage) FoodB.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("film.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }


    @FXML
    private Button HomeFilmB;
    @FXML
    void HendHomeFilm(ActionEvent event) throws IOException {

        Stage stage;
        Parent root;

        if (event.getSource() == HomeFilmB) {

            stage = (Stage) HomeFilmB.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("film.fxml"));
        }
            else{
                stage = (Stage) HomeFilmB.getScene().getWindow();
                root = FXMLLoader.load(getClass().getResource("film.fxml"));
            }

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
    }


    @FXML
    private Button PoetryB;
    @FXML
    void HendPoetryB(ActionEvent event) throws IOException {
        Stage stage;
        Parent root;

        if (event.getSource() == PoetryB){
            stage = (Stage) PoetryB.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("poetry.fxml"));
        }

        else {
            stage = (Stage) PoetryB.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("poetry.fxml"));
        }

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
