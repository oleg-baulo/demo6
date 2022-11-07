package com.example.demo6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;

public class FilmController {

    @FXML
    private Button FoodB;
    public void HendFoodB (ActionEvent action) throws IOException {
        Stage stage;
        Parent root;

        if(action.getSource() == FoodB){
            stage = (Stage) FoodB.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("food.fxml"));
        }
        else{
            stage = (Stage) FoodB.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource(" food.fxml"));
        }

        FlowPane flowPane = new FlowPane();

        Scene scene = new Scene(flowPane);
        stage.setScene(scene);
        stage.show();
    }



    @FXML
    private Button PoetryB;
//    public void SelectFilmGuidance(ActionEvent action){
//        PoetryB.setOnMouseEntered(event -> {PoetryB.setStyle("-fx-background-color: #a07755");});
//        PoetryB.setOnMouseExited(event -> {PoetryB.setStyle("");});
//    }
    public void HendPoetryB (ActionEvent action) throws IOException {
        Stage stage;
        Parent root;

        if(action.getSource() == PoetryB){
            stage = (Stage) PoetryB.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("poetry.fxml"));
        }
        else{
            stage = (Stage) PoetryB.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("poetry.fxml"));
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    private Button SelectFilmButton;

    public void HendSelectFilmButton(ActionEvent event) throws IOException {

        Stage stage;
        Parent root;

        if (event.getSource() == SelectFilmButton){
            stage = (Stage) SelectFilmButton.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("SelectFilm.fxml"));
        }
        else {
            stage = (Stage) SelectFilmButton.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("SelectFilm.fxml"));
        }

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
