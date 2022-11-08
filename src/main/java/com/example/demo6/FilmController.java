package com.example.demo6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.VPos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FilmController {

    @FXML
    private Button FoodB;

    @FXML
    private Button SearchB;

    @FXML
    private FlowPane films;


    public void SearchBClick (ActionEvent action) throws IOException {
        films.getChildren().clear();
        List<FilmDescription> list = new ArrayList<FilmDescription>( ) {
        };

        list.add(new FilmDescription( "Ёлки 2", "C:\\P\\JavaHelp\\demo6oleg\\src\\main\\resources\\com\\example\\demo6\\img\\рож-ественская-е-ка-xmas-разря-ного-пиксе-а-весе-ая-47933132.jpg"));
        list.add(new FilmDescription( "Один дома", "C:\\P\\JavaHelp\\demo6oleg\\src\\main\\resources\\com\\example\\demo6\\img\\рож-ественская-е-ка-xmas-разря-ного-пиксе-а-весе-ая-47933132.jpg"));

        for(int i = 0; i < list.size();i++){
            //Parent filmItem =  FXMLLoader.load(getClass().getResource("filmItem.fxml"));
            //fp.getChildren().add(filmItem);

            FilmDescription fd = list.get(i);





            Button testButton = new Button(fd.getName());

            Image im = new Image(fd.getUrl());

            ImageView imageView = new ImageView();
            imageView.setImage(im);

            AnchorPane ap = new AnchorPane();
            ap.getChildren().add(imageView);

            ap.getChildren().add(testButton);

            films.getChildren().add(ap);
        }
    }

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
        Scene scene = new Scene(root);
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
