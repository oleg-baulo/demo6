package com.example.demo6;

import javafx.application.Platform;
import javafx.beans.property.StringProperty;
import javafx.css.Size;
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
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


public class FilmController {

    @FXML
    private ImageView Image;

    @FXML
    private Button SelectFilmButton;

    @FXML
    public FlowPane films;

    @FXML
    public void initialize() throws IOException {
        this.Add();
    }

    public void Add() throws IOException {
        List<FilmDescription> filmList = new ArrayList<>();
        filmList.add(new FilmDescription("Ёлки 2", "img\\Elki2.png"));


        for (FilmDescription fd : filmList) {

            String bname = fd.getName();
            Image url = new Image(Files.newInputStream(Path.of(fd.getUrl())));

            AddFilms(films, bname, url);
        }
    }
    public static void AddFilms(FlowPane flowPane, String name, Image url) {

        Button button = new Button();
        button.setStyle("-fx-background-color: #bb3220");
        button.setStyle("-fx-background-radius: 7");
        button.setLayoutY(226);
        button.setPrefSize(50, 156);
        button.setText(String.valueOf(name));

        ImageView imageView = new ImageView();
        imageView.setImage(url);
        imageView.setLayoutY(4);
        imageView.setFitWidth(146);
        imageView.setFitHeight(185);

        AnchorPane anchorPane = new AnchorPane(imageView, button);
        anchorPane.setStyle("-fx-background-color: #a0693d");
        anchorPane.setStyle("-fx-background-radius: 6");
        anchorPane.setPrefSize(277, 156);


       // flowPane.setPrefWrapLength(123);

        flowPane.getChildren().add(anchorPane);
    }




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


//    @FXML
//    private Button SelectFilmButton;
//
//    public void HendSelectFilmButton(ActionEvent event) throws IOException {
//
//        Stage stage;
//        Parent root;
//
//        if (event.getSource() == SelectFilmButton){
//            stage = (Stage) SelectFilmButton.getScene().getWindow();
//            root = FXMLLoader.load(getClass().getResource("SelectFilm.fxml"));
//        }
//        else {
//            stage = (Stage) SelectFilmButton.getScene().getWindow();
//            root = FXMLLoader.load(getClass().getResource("SelectFilm.fxml"));
//        }
//
//        Scene scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//    }

}
