package com.example.demo6;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class FilmController {


    @FXML
    private ScrollPane sPаnе;

    @FXML
    private Button SearchButton;


    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Button button;

    @FXML
    private ImageView image;

    @FXML
    private TextField TextField;

    @FXML
    private ComboBox<String> categoryBox;

    ObservableList<String> options = FXCollections.observableArrayList(
                        "Option 1",
                               "Option 2",
                               "Option 3"
                );

//    public void addInBox (){
//        ObservableList<String> options =
//                FXCollections.observableArrayList(
//                        "Option 1",
//                        "Option 2",
//                        "Option 3"
//                );
//        ComboBox combo_box = new ComboBox(FXCollections.observableArrayList(options));
//    }

    public void addInBox(){

        categoryBox.setItems(options);
    }


    @FXML
    public FlowPane films;

    @FXML
    public void initialize() throws IOException {
        this.Add();
        this.addInBox();
    }


    List<FilmDescription> filmList = new ArrayList<>();

    public void Add() throws IOException {

        filmList.add(new FilmDescription("Ёлки 2", "file:src\\main\\resources\\com\\example\\demo6\\img\\Elki2.png"));
        filmList.add(new FilmDescription("Один дома", "file:src\\main\\resources\\com\\example\\demo6\\img\\odinDoma.png"));
        filmList.add(new FilmDescription("Один дома 2", "file:src\\main\\resources\\com\\example\\demo6\\img\\odinDoma2.png"));
        filmList.add(new FilmDescription("Один дома 2", "file:src\\main\\resources\\com\\example\\demo6\\img\\odinDoma2.png"));
        filmList.add(new FilmDescription("Один дома 2", "file:src\\main\\resources\\com\\example\\demo6\\img\\odinDoma2.png"));
        filmList.add(new FilmDescription("Один дома 2", "file:src\\main\\resources\\com\\example\\demo6\\img\\odinDoma2.png"));
        filmList.add(new FilmDescription("Один дома 2", "file:src\\main\\resources\\com\\example\\demo6\\img\\odinDoma2.png"));
        filmList.add(new FilmDescription("Один дома 2", "file:src\\main\\resources\\com\\example\\demo6\\img\\odinDoma2.png"));
        filmList.add(new FilmDescription("Один дома 2", "file:src\\main\\resources\\com\\example\\demo6\\img\\odinDoma2.png"));
        filmList.add(new FilmDescription("Один дома 2", "file:src\\main\\resources\\com\\example\\demo6\\img\\odinDoma2.png"));
        filmList.add(new FilmDescription("Один дома 2", "file:src\\main\\resources\\com\\example\\demo6\\img\\odinDoma2.png"));
        filmList.add(new FilmDescription("Один дома 2", "file:src\\main\\resources\\com\\example\\demo6\\img\\odinDoma2.png"));
        filmList.add(new FilmDescription("Один дома 2", "file:src\\main\\resources\\com\\example\\demo6\\img\\odinDoma2.png"));
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

//        Button button = new Button();
//        button.setStyle("-fx-background-color: #bb3220; -fx-background-radius: 7;");
//        button.setFont(Font.font("System Bold", 18.0));
//        button.setLayoutY(226);
//        button.setPrefSize(140, 50);
//        button.setText(String.valueOf(name));
//        button.setTextFill(Color.WHITE);
//
//
//        ImageView imageView = new ImageView();
//        imageView.setImage(url);
//        imageView.setLayoutY(4);
//        imageView.setFitWidth(140);
//        imageView.setFitHeight(185);
//
//        AnchorPane anchorPane = new AnchorPane(imageView, button);
//        anchorPane.setStyle("-fx-background-color: #a0693d; -fx-background-radius: 6;");
//        anchorPane.setPrefHeight(230);
//        anchorPane.setPrefWidth(140);


        //flowPane2.getChildren().add(anchorPane);



        // flowPane.setPrefWrapLength(123);


        Button b = new Button(button.getStyle());
         b.setPrefWidth(button.getPrefWidth());
         b.setPrefHeight(button.getPrefHeight());
         b.setLayoutY(button.getLayoutY());
         b.setLayoutX(button.getLayoutX());
         b.setText(name);

        ImageView img = new ImageView();
         img.setLayoutY(image.getLayoutY());
         img.setLayoutX(image.getLayoutX());
         img.setImage(url);

        AnchorPane ap = new AnchorPane(b, img);
         ap.setPrefHeight(anchorPane.getPrefHeight());
         ap.setPrefWidth(anchorPane.getPrefWidth());
         ap.setStyle(anchorPane.getStyle());





         flowPane.setHgap(55);
         flowPane.setVgap(15);
         flowPane.getChildren().add(anchorPane);
    }








    public void SerachBClick (ActionEvent event){
        String inpFilm = TextField.getText().trim();

        films.getChildren().clear();

        if (inpFilm != null){
            for (FilmDescription fd : filmList){
                if (fd.getName().contains(inpFilm)){
                    Image url = new Image(fd.getUrl(), 146, 185, true, true);
                    AddFilms(films, fd.getName(), url);
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