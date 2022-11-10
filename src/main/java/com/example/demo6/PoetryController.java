package com.example.demo6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PoetryController {

    @FXML
    private FlowPane poetryPane;

    @FXML
    private Button searchButton;
    @FXML
    private TextField search;


    @FXML
    public void initialize() throws IOException {
        this.add();
    }



    List<PoetryDescription> poetryList = new ArrayList<>();


    public String poetryTextReader(String pathfile) throws IOException {
        String line;
        String poetry = "";
        BufferedReader textReader = new BufferedReader(new FileReader(pathfile));

        while ((line = textReader.readLine()) != null){
            poetry = line;
        }

        return poetry;
    }


    public void add () throws IOException {
        String padavSnig = poetryTextReader("src/main/resources/com/example/demo6/Poetries/padavSnig.txt");
        poetryList.add(new PoetryDescription("Падав сніг", padavSnig));

        for (PoetryDescription pd : poetryList){
            String pName = pd.getName();
            String poetry = pd.getVerse();

            poetryAdd(poetryPane, pName, poetry);
        }

    }

    public void poetryAdd(FlowPane flowPane, String name, String poetry){///
        AnchorPane anchorPane = new AnchorPane();
        anchorPane.setStyle("-fx-background-color: #ae774b; -fx-background-radius: 7;");
        anchorPane.setPrefWidth(178);
        anchorPane.setPrefHeight(222);

        Text pName = new Text(name);
        //pName.setText(name);
        pName.setFill(Color.WHITE);
        pName.setLayoutX(14);
        pName.setLayoutY(22);
        pName.setFont(Font.font("System Bold", 20));

        Text Poetry = new Text(poetry);
        Poetry.setFill(Color.WHITE);
        Poetry.setLayoutY(61);
        Poetry.setLayoutX(20);
        Poetry.setFont(Font.font("System Bold", 15));


        anchorPane.getChildren().addAll(pName, Poetry);

        flowPane.getChildren().add(anchorPane);
    }///


    @FXML
    private Button PfilmB;
    public void HendPfilmB (ActionEvent action) throws IOException {
            Stage stage;
            Parent root;

            stage = (Stage) PfilmB.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("film.fxml"));

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
    }


    @FXML
    private Button PfoodB;
    public void HendPfoodB (ActionEvent action) throws IOException {
        Stage stage;
        Parent root;

            stage = (Stage) PfoodB.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("film.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
