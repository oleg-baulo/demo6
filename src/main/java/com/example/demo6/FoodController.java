package com.example.demo6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class FoodController {

    @FXML
    private Button FofilmB;
    public void HendFofilmB(ActionEvent action) throws IOException {
        Stage stage;
        Parent root;

        if (action.getSource() == FofilmB){
            stage = (Stage) FofilmB.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("film.fxml"));
        }
        else {
            stage = (Stage) FofilmB.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("food.fxml"));
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }





    @FXML
    private Button FopoetryB;
    public void HendFopoetryB(ActionEvent action) throws IOException {
        Stage stage;
        Parent root;

        if (action.getSource() == FopoetryB){
            stage = (Stage) FopoetryB.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("poetry.fxml"));
        }
        else {
            stage = (Stage) FopoetryB.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("poetry.fxml"));
        }

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }



    @FXML
    private Button SelectFoodButton;
    public void HendSelectFoodButton(ActionEvent event) throws IOException {
        Stage stage;
        Parent root;

        if (event.getSource() == SelectFoodButton){
            stage = (Stage) SelectFoodButton.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("SelectFood.fxml"));
        }
        else {
            stage = (Stage) SelectFoodButton.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("SelectFood.fxml"));
        }

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
