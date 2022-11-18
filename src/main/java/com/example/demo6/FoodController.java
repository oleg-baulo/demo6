package com.example.demo6;

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

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FoodController {

    @FXML
    private FlowPane foods;
    @FXML
    private javafx.scene.control.TextField TF;
    @FXML
    private AnchorPane fPane;
    @FXML
    public void initialize() throws IOException {
        this.Add();
    }
    SelectFoodDescription selFoDesc = new SelectFoodDescription();
    List<foodDescription> foodList = new ArrayList<>();

    public String foodTextReader(String pathfile) throws IOException {


        try (BufferedReader reader = new BufferedReader(new FileReader(pathfile))) {
            String line;
            StringBuilder stringBuilder = new StringBuilder();
            String ls = System.getProperty("line.separator");
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }

            return stringBuilder.toString();
        }
    }



    public void Add () throws IOException {
        String purig = foodTextReader("src/main/resources/com/example/demo6/Recipes/YabluchniPurig/YablichniPurig.txt");
        String purigIngr = foodTextReader("src/main/resources/com/example/demo6/Recipes/YabluchniPurig/Ingridienty.txt");
        foodList.add(new foodDescription("Яблучний пиріг", "file:src\\main\\resources\\com\\example\\demo6\\img\\Pirog.png", purigIngr, purig, "175 кКал/100 г", 1 ));

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
        button.setOnMouseClicked(event -> {
            fPane.getChildren().clear();
            String btext = button.getText();
            for (foodDescription fd : foodList) {
                if (fd.getName().equals(btext)) {
                    Image img1 = new Image(fd.getUrl(), true);
                    String time = String.valueOf(fd.getTime());
                    selFoDesc.SFoodD(fPane, img1, btext, fd.getIngridienty(), fd.getRecept(), fd.getCallory(), time);
                }
            }
        });

        ap.getChildren().addAll(imgView, button);

        flowPane.setHgap(35);
        flowPane.setVgap(15);
        flowPane.getChildren().add(ap);
    }

    @FXML
    void searchBclick() {
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
    public void HendFofilmB() throws IOException {
        Stage stage;
        Parent root;

            stage = (Stage) FofilmB.getScene().getWindow();
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("film.fxml")));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }






    @FXML
    private Button FopoetryB;
    public void HendFopoetryB() throws IOException {
        Stage stage;
        Parent root;
            stage = (Stage) FopoetryB.getScene().getWindow();
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("poetry.fxml")));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
