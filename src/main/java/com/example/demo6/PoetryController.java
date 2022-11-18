package com.example.demo6;

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
import java.util.Objects;

public class PoetryController {

    @FXML
    private FlowPane poetryPane;
    @FXML
    private TextField search;


    @FXML
    public void initialize() throws IOException {
        this.add();
    }



    List<PoetryDescription> poetryList = new ArrayList<>();


    public String poetryTextReader(String pathfile) throws IOException {


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


    public void add () throws IOException {
        String padavSnig = poetryTextReader("src/main/resources/com/example/demo6/Poetries/padavSnig.txt");
        poetryList.add(new PoetryDescription("a", padavSnig));
        poetryList.add(new PoetryDescription("b", padavSnig));
        poetryList.add(new PoetryDescription("c", padavSnig));
        poetryList.add(new PoetryDescription("d", padavSnig));
        poetryList.add(new PoetryDescription("e", padavSnig));
        poetryList.add(new PoetryDescription("f", padavSnig));
        poetryList.add(new PoetryDescription("g", padavSnig));
        poetryList.add(new PoetryDescription("h", padavSnig));
        poetryList.add(new PoetryDescription("i", padavSnig));
        poetryList.add(new PoetryDescription("j", padavSnig));
        poetryList.add(new PoetryDescription("k", padavSnig));
        poetryList.add(new PoetryDescription("l", padavSnig));
        poetryList.add(new PoetryDescription("m", padavSnig));
        poetryList.add(new PoetryDescription("n", padavSnig));
        poetryList.add(new PoetryDescription("o", padavSnig));
        poetryList.add(new PoetryDescription("p", padavSnig));
        poetryList.add(new PoetryDescription("q", padavSnig));
        poetryList.add(new PoetryDescription("r", padavSnig));

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
        Poetry.setLayoutX(10);
        Poetry.setFont(Font.font("System Bold", 15));


        anchorPane.getChildren().addAll(pName, Poetry);

        flowPane.setHgap(23);
        flowPane.setVgap(15);

        flowPane.getChildren().add(anchorPane);
    }///





    public void SearchBclick (){
        poetryPane.getChildren().clear();
        String inpPoetry = search.getText().trim();

        if (inpPoetry != null){
          for (PoetryDescription pd : poetryList){
              if (pd.getName().contains(inpPoetry)){
                  poetryAdd(poetryPane, pd.getName(), pd.getVerse());
              }
            }
        }
    }









    @FXML
    private Button PfilmB;
    public void HendPfilmB () throws IOException {
            Stage stage;
            Parent root;

            stage = (Stage) PfilmB.getScene().getWindow();
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("film.fxml")));

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
    }


    @FXML
    private Button PfoodB;
    public void HendPfoodB () throws IOException {
        Stage stage;
        Parent root;

            stage = (Stage) PfoodB.getScene().getWindow();
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("food.fxml")));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
