package Controllers;

import com.example.demo6.CompareFims;
import com.example.demo6.Countdown;
import Descriptions.FilmDescription;
import Descriptions.SelectFilmDescription;
import com.example.demo6.NewYearMoodGeneratorApplication;
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
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

import static java.util.Objects.requireNonNull;


public class FilmController {

    public AnchorPane FPFpane;
    public Button SearchButton;
    public Button SelectB;
    SelectFilmDescription seFiDe = new SelectFilmDescription();
    CompareFims compareFims = new CompareFims();
    Countdown countdown = new Countdown();

    @FXML
    private TextField TextField;

    @FXML
    private ComboBox<String> categoryBox;
    @FXML
    public FlowPane films;

    @FXML
    private AnchorPane fPane;

    @FXML
    private Text countDtoNewYear;
    public void countdownToNewYear() {
        countDtoNewYear.setWrappingWidth(100);
        countdown.CDTNY(countDtoNewYear);
    }
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
        this.countdownToNewYear();
    }


    List<FilmDescription> filmList = new ArrayList<>();

    public void Add(){


        filmList.add(new FilmDescription("Форест Гамп", "src/main/resources/com/example/demo6/Trailers/Forrest Gump - Trailer.mp4", "file:src\\main\\resources\\com\\example\\demo6\\img\\forestGump.jpg", 8.91, 1994, 12, 142));
        filmList.add(new FilmDescription("Один дома 2","src/main/resources/com/example/demo6/Trailers/videoplayback.mp4",  "file:src\\main\\resources\\com\\example\\demo6\\img\\odinDoma.png", 8.1, 1994, 19, 12));
        filmList.add(new FilmDescription("«Старый» Новый год","src/main/resources/com/example/demo6/Trailers/New Year's Eve (2011).mp4", "file:src\\main\\resources\\com\\example\\demo6\\img\\newYearsEve.jpg", 6.86, 2011, 16, 118));
        filmList.add(new FilmDescription("Тонкий человек", "src/main/resources/com/example/demo6/Trailers/theThinMan.mp4", "file:src\\main\\resources\\com\\example\\demo6\\img\\theThinMan.jpg", 7.9, 1934, 12, 91));
        filmList.add(new FilmDescription("Крестный отец 2", "src/main/resources/com/example/demo6/Trailers/The Godfather Part II.mp4", "file:src\\main\\resources\\com\\example\\demo6\\img\\theGodFather II.jpeg", 9.0, 1974, 16, 202));
        filmList.add(new FilmDescription("Когда Гарри встретил Салли", "src/main/resources/com/example/demo6/Trailers/When Harry met Sally.mp4", "file:src\\main\\resources\\com\\example\\demo6\\img\\whenHarryMetSally.jpg", 7.7, 1989, 16, 96));
        filmList.add(new FilmDescription("Богема", "src/main/resources/com/example/demo6/Trailers/RENT.mp4", "file:src\\main\\resources\\com\\example\\demo6\\img\\Rentjpg.jpg", 6.8, 2005, 16, 135));
        filmList.add(new FilmDescription("Мост в Терабитию", "src/main/resources/com/example/demo6/Trailers/Bridge to Terabithia - trailer.mp4", "file:src\\main\\resources\\com\\example\\demo6\\img\\Bridge in Terabitia.jpg", 7.77, 2007, 0, 93));




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
                    String rating = String.valueOf(fd.getRating());
                    String relise = String.valueOf(fd.getReliseYear());
                    String age = String.valueOf(fd.getAge());
                    String time = String.valueOf(fd.getTimeMin());

                    File trPath = new File(fd.getTrurl());
                    String trailer;
                    try {
                        trailer = trPath.toURI().toURL().toString();
                    } catch (MalformedURLException e) {
                        throw new RuntimeException(e);
                    }

                    try {
                        seFiDe.SFD(fPane, img, fd.getName(), rating, relise, age, time, trailer);
                    } catch (MalformedURLException e) {
                        throw new RuntimeException(e);
                    }
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

        for (FilmDescription fd : filmList) {
            if (fd.getName().contains(inpFilm)) {
                Image url = new Image(fd.getUrl(), 146, 185, true, true);
                ButtonFilmsController(films, fd.getName(), url);
            }
        }

    }

    @FXML
    private Button FoodB;

    public void HendFoodB() throws IOException {
        Stage stage;
        Parent root;
        stage = (Stage) FoodB.getScene().getWindow();

        var appClass = NewYearMoodGeneratorApplication.class;
        var poetryresources = appClass.getResource("food.fxml");

        root = FXMLLoader.load(requireNonNull(poetryresources));
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

        var appClass = NewYearMoodGeneratorApplication.class;
        var poetryresources = appClass.getResource("poetry.fxml");

        root = FXMLLoader.load(requireNonNull(poetryresources));
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
        stage = (Stage) PoetryB.getScene().getWindow();

        var appClass = NewYearMoodGeneratorApplication.class;
        var poetryresources = appClass.getResource("Film.fxml");

        root = FXMLLoader.load(requireNonNull(poetryresources));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}