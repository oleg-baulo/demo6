package com.example.demo6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


public class FilmController {




    @FXML
    private Button SearchButton;

    @FXML
    private TextField TextField;



    
    @FXML
    public FlowPane films;

    @FXML
    public void initialize() throws IOException {
        this.Add();
    }


    List<FilmDescription> filmList = new ArrayList<>();

    public void Add() throws IOException {

        filmList.add(new FilmDescription("Ёлки 2", "file:src\\main\\resources\\com\\example\\demo6\\img\\Elki2.png"));
        filmList.add(new FilmDescription("Один дома", "file:src\\main\\resources\\com\\example\\demo6\\img\\odinDoma.png"));
        filmList.add(new FilmDescription("Один дома 2", "file:src\\main\\resources\\com\\example\\demo6\\img\\odinDoma2.png"));

        for (FilmDescription fd : filmList) {

            String bname = fd.getName();

            //URL result = getClass().getResource(fd.getUrl());

            //FileInputStream fisurl = new FileInputStream(fd.getUrl());

            Image url = new Image(fd.getUrl(), 146, 185, true, true);

            AddFilms(films, bname, url);
        }
    }

        private void AddFilms (FlowPane flowPane, String name, Image url){

            Button button = new Button();
            button.setStyle("-fx-background-color: #bb3220");
            button.setStyle("-fx-background-radius: 7");
            button.setLayoutY(226);
            button.setPrefSize(150, 50);
            button.setText(String.valueOf(name));

            ImageView imageView = new ImageView();
            imageView.setImage(url);
            imageView.setLayoutY(4);
            imageView.setFitWidth(146);
            imageView.setFitHeight(185);

            AnchorPane anchorPane = new AnchorPane(imageView, button);
            anchorPane.setStyle("-fx-background-color: #a0693d;");
            anchorPane.setStyle("-fx-background-radius: 6;");
            anchorPane.setPrefSize(155, 270);


            // flowPane.setPrefWrapLength(123);

            flowPane.getChildren().add(anchorPane);
        }








    public void SerachBClick (ActionEvent event){
        String inputFilm = TextField.getText().trim();
        AnchorPane anchorPane = new AnchorPane();
        anchorPane.setStyle("-fx-background-color: #a0693d;");
        anchorPane.setStyle("-fx-background-radius: 6;");
        anchorPane.setPrefSize(155, 270);

        Button button = new Button();
        button.setStyle("-fx-background-color: #bb3220");
        button.setStyle("-fx-background-radius: 7");
        button.setLayoutY(226);
        button.setPrefSize(150, 50);



        ImageView img = new ImageView();
        img.setLayoutY(4);
       // img.setFitWidth(146);
       // img.setFitHeight(185);

        films.getChildren().clear();

        if (inputFilm != null){
            for (FilmDescription fd : filmList){
                if (fd.getName().contains(inputFilm)){
//                    button.setText(fd.getName());
                    Image url = new Image(fd.getUrl(), 146, 185, true, true);
                    AddFilms(films, fd.getName(), url);
//                    img.setImage(url);
                }
            }

        }

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
