package com.example.demo6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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

public class FoodController {

    @FXML
    private FlowPane foods;
    @FXML
    private javafx.scene.control.TextField TF;

    @FXML
    private Button SearchB;

    @FXML
    public void initialize() throws IOException {
        this.Add();
    }
    List<foodDescription> foodList = new ArrayList<>();


    public void Add (){
        foodList.add(new foodDescription("Яблучний пиріг", "file:src\\main\\resources\\com\\example\\demo6\\img\\Pirog.png"));
        foodList.add(new foodDescription("М'ясо", "file:src\\main\\resources\\com\\example\\demo6\\img\\miaso.png"));
        foodList.add(new foodDescription("Курка", "file:src\\main\\resources\\com\\example\\demo6\\img\\kyrica-removebg-preview.png"));
        foodList.add(new foodDescription("Бутерброд з червоною ікрою", "file:src\\main\\resources\\com\\example\\demo6\\img\\byterbrod-s-krasnoy-ikroy-removebg-preview.png"));
        foodList.add(new foodDescription("Оливье", "file:src\\main\\resources\\com\\example\\demo6\\img\\olivie-removebg-preview.png"));

        for (foodDescription fd : foodList) {

            String bname = fd.getName();
            Image url = new Image(fd.getUrl(), 170, 133, true, true);
            addFood(foods, bname, url);
        }
    }

    public void addFood(FlowPane flowPane, String name, Image img){
        AnchorPane ap = new AnchorPane();
        ap.setStyle("-fx-background-color: #ae774b; -fx-background-radius: 7;");
        ap.setPrefSize(170, 207);

        ImageView imgView = new ImageView(img);

        Button button = new Button(name);
        button.setStyle("-fx-background-color: #bb3220; -fx-background-radius: 7;");
        button.setTextFill(Color.WHITE);
        button.setFont(Font.font("System Bold", 18.0));
        button.setPrefSize(170, 58);
        button.setLayoutY(148);

        ap.getChildren().addAll(imgView, button);

        flowPane.setHgap(35);
        flowPane.setVgap(15);
        flowPane.getChildren().add(ap);
    }

    @FXML
    void searchBclick(ActionEvent event) {
        String inpFilm = TF.getText().trim();

        foods.getChildren().clear();

        if (inpFilm != null){
            for (foodDescription fd : foodList){
                if (fd.getName().contains(inpFilm)){
                    Image url = new Image(fd.getUrl(), 170, 133, true, true);
                    addFood(foods, fd.getName(), url);
                }
            }

        }
    }


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
