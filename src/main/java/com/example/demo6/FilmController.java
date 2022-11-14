package com.example.demo6;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class FilmController {

    SelectFilmDescription seFiDe = new SelectFilmDescription();
    CompareFims compareFims = new CompareFims();


    @FXML
    private TextField TextField;

    @FXML
    private ComboBox<String> categoryBox;
    @FXML
    public FlowPane films;


    @FXML
    private AnchorPane fPane;

    public void addInBox() {
        ObservableList<String> options = FXCollections.observableArrayList(
                "Max age",
                "Min age",
                "Max rating",
                "Min rating",
                "Max relise year",
                "Min relise year",
                "Max time",
                "Min time"
        );
        categoryBox.setItems(options);
    }

    public void SelectBclick() {
        films.getChildren().clear();
        String cat = categoryBox.getValue();

        if (cat.contains("Max age")) compareFims.maxAge(filmList);
        if (cat.contains("Min age")) compareFims.minAge(filmList);
        if (cat.contains("Max relise year")) compareFims.maxRelYear(filmList);
        if (cat.contains("Min relise year")) compareFims.minRelYear(filmList);
        if (cat.contains("Max rating")) compareFims.maxRating(filmList);
        if (cat.contains("Min rating")) compareFims.minRating(filmList);
        if (cat.contains("Max time")) compareFims.maxTime(filmList);
        if (cat.contains("Min time")) compareFims.maxTime(filmList);


        for (FilmDescription fd : filmList) {
            String bname = fd.getName();
            Image url = new Image(fd.getUrl(), 146, 185, true, true);
            ButtonFilmsController(films, bname, url);
        }
    }


    @FXML
    public void initialize(){
        this.Add();
        this.addInBox();
    }


    List<FilmDescription> filmList = new ArrayList<>();

    public void Add(){

        filmList.add(new FilmDescription("Ёлки 2", "file:src\\main\\resources\\com\\example\\demo6\\Trailers\\videoplayback.mp4","file:src\\main\\resources\\com\\example\\demo6\\img\\Elki2.png", 9.1, 1995, 18, 1));
        filmList.add(new FilmDescription("Один дома", "file:src\\main\\resources\\com\\example\\demo6\\Trailers\\videoplayback.mp4",  "file:src\\main\\resources\\com\\example\\demo6\\img\\odinDoma.png", 8.1, 1994, 19, 12));
        filmList.add(new FilmDescription("Один дома 1", "file:src\\main\\resources\\com\\example\\demo6\\Trailers\\videoplayback.mp4","file:src\\main\\resources\\com\\example\\demo6\\img\\odinDoma2.png", 7.1, 1993, 18, 13));
        filmList.add(new FilmDescription("Один дома 2", "file:src\\main\\resources\\com\\example\\demo6\\Trailers\\videoplayback.mp4","file:src\\main\\resources\\com\\example\\demo6\\img\\odinDoma2.png", 6.1, 1992, 17, 14));
        filmList.add(new FilmDescription("Один дома 3", "file:src\\main\\resources\\com\\example\\demo6\\Trailers\\videoplayback.mp4","file:src\\main\\resources\\com\\example\\demo6\\img\\odinDoma2.png", 5.1, 1991, 16, 15));
        filmList.add(new FilmDescription("Один дома 4", "file:src\\main\\resources\\com\\example\\demo6\\Trailers\\videoplayback.mp4","file:src\\main\\resources\\com\\example\\demo6\\img\\odinDoma2.png", 4.1, 1990, 15, 16));
        filmList.add(new FilmDescription("Один дома 5", "file:src\\main\\resources\\com\\example\\demo6\\Trailers\\videoplayback.mp4","file:src\\main\\resources\\com\\example\\demo6\\img\\odinDoma2.png", 3.1, 1989, 14, 17));
        filmList.add(new FilmDescription("Один дома 6", "file:src\\main\\resources\\com\\example\\demo6\\Trailers\\videoplayback.mp4","file:src\\main\\resources\\com\\example\\demo6\\img\\odinDoma2.png", 2.1, 1988, 13, 18));
        filmList.add(new FilmDescription("Один дома 7", "file:src\\main\\resources\\com\\example\\demo6\\Trailers\\videoplayback.mp4","file:src\\main\\resources\\com\\example\\demo6\\img\\odinDoma2.png", 1.1, 1987, 12, 40));
        filmList.add(new FilmDescription("Один дома 8", "file:src\\main\\resources\\com\\example\\demo6\\Trailers\\videoplayback.mp4","file:src\\main\\resources\\com\\example\\demo6\\img\\odinDoma2.png", 11.1, 1986, 11, 20));
        filmList.add(new FilmDescription("Один дома 9", "file:src\\main\\resources\\com\\example\\demo6\\Trailers\\videoplayback.mp4","file:src\\main\\resources\\com\\example\\demo6\\img\\odinDoma2.png", 15.1, 1985, 10, 21));
        filmList.add(new FilmDescription("Один дома 10", "file:src\\main\\resources\\com\\example\\demo6\\Trailers\\videoplayback.mp4","file:src\\main\\resources\\com\\example\\demo6\\img\\odinDoma2.png", 68.1, 1984, 9, 22));
        filmList.add(new FilmDescription("Один дома 11", "file:src\\main\\resources\\com\\example\\demo6\\Trailers\\videoplayback.mp4","file:src\\main\\resources\\com\\example\\demo6\\img\\odinDoma2.png", 94.1, 1983, 8, 23));
        filmList.add(new FilmDescription("Один дома 12", "file:src\\main\\resources\\com\\example\\demo6\\Trailers\\videoplayback.mp4","file:src\\main\\resources\\com\\example\\demo6\\img\\odinDoma2.png", 53.1, 1982, 500, 24));

        for (FilmDescription fd : filmList) {

            String bname = fd.getName();
            Image url = new Image(fd.getUrl(), 146, 185, true, true);
            ButtonFilmsController(films, bname, url);
        }
    }

    private void ButtonFilmsController(FlowPane flowPane, String name, Image url) {


        Button button = new Button();
        button.setStyle("-fx-background-color: #bb3220; -fx-background-radius: 7;");
        button.setFont(Font.font("System Bold", 18.0));
        button.setLayoutY(226);
        button.setPrefSize(140, 50);
        button.setText(String.valueOf(name));
        button.setTextFill(Color.WHITE);

        button.setOnMouseClicked(event -> {
            fPane.getChildren().clear();
            String bt = button.getText();

            for (FilmDescription fd : filmList) {
                if (fd.getName().equals(bt)) {
                    Image img = new Image(fd.getUrl());
                    Media media = new Media(fd.getTrurl());
                    seFiDe.SFD(fPane, img, media);
                }
            }
        });


        ImageView imageView = new ImageView();
        imageView.setImage(url);
        imageView.setLayoutY(4);
        imageView.setFitWidth(140);
        imageView.setFitHeight(185);

        AnchorPane anchorPane = new AnchorPane(imageView, button);
        anchorPane.setStyle("-fx-background-color: #a0693d; -fx-background-radius: 6;");
        anchorPane.setPrefHeight(230);
        anchorPane.setPrefWidth(140);

        flowPane.setHgap(55);
        flowPane.setVgap(15);
        flowPane.getChildren().add(anchorPane);
    }

    public void SerachBClick() {
        String inpFilm = TextField.getText().trim();

        films.getChildren().clear();

        if (inpFilm != null) {
            for (FilmDescription fd : filmList) {
                if (fd.getName().contains(inpFilm)) {
                    Image url = new Image(fd.getUrl(), 146, 185, true, true);
                    ButtonFilmsController(films, fd.getName(), url);
                }
            }

        }

    }

    @FXML
    private Button FoodB;

    public void HendFoodB() throws IOException {
        Stage stage;
        Parent root;

        stage = (Stage) FoodB.getScene().getWindow();
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("food.fxml")));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    private Button PoetryB;
    public void HendPoetryB() throws IOException {
        Stage stage;
        Parent root;
        stage = (Stage) PoetryB.getScene().getWindow();
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("poetry.fxml")));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    private Button Home;

    @FXML
    void getFilmPane() throws IOException {
        Stage stage;
        Parent root;
        stage = (Stage) Home.getScene().getWindow();
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("film.fxml")));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}