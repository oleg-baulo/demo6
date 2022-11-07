package com.example.demo6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class SelectFoodController {

    @FXML
    private Button FilmB;
    public void HendFilmButton (ActionEvent event) throws IOException {
        Stage stage;
        Parent root;

        if (event.getSource() == FilmB) {
            stage = (Stage) FilmB.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("film.fxml"));
        } else {
            stage = (Stage) FilmB.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("film.fxml"));
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private Button HomeFoodB;
    public void HendFoodButton (ActionEvent event) throws IOException {
        Stage stage;
        Parent root;

        if (event.getSource() == HomeFoodB) {
            stage = (Stage) HomeFoodB.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("food.fxml"));
        } else {
            stage = (Stage) HomeFoodB.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("food.fxml"));
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private Button PoetryB;
    public void HendPoetryButton (ActionEvent event) throws IOException {
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
