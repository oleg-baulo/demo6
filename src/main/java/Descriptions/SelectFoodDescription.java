package Descriptions;

import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class SelectFoodDescription {
    public void SFoodD(AnchorPane foodPane, Image foodimage,String name ,String ingridienty, String recept, String callory, String time){


        AnchorPane foodInfPane = new AnchorPane();
        foodInfPane.setStyle("-fx-background-color: #a0693d; -fx-background-radius: 8;");
        foodInfPane.setLayoutY(19);
        foodInfPane.setLayoutX(341);
        foodInfPane.setPrefSize(262, 237);


        ScrollPane scrollInfPane = new ScrollPane(foodInfPane);
        scrollInfPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollInfPane.setStyle("-fx-background-color: #a0693d;");

        scrollInfPane.getStylesheets().add(this.getClass().getResource("Css/foodScroll.css").toExternalForm());
        scrollInfPane.setLayoutY(19);
        scrollInfPane.setLayoutX(341);
        scrollInfPane.setPrefSize(262, 237);


        Label textName = new Label("Name:");
        textName.setTextFill(Color.WHITE);
        textName.setFont(Font.font(14));
        textName.setLayoutY(14);
        textName.setLayoutX(14);

        Label kall = new Label("Kallory:");
        kall.setTextFill(Color.WHITE);
        kall.setFont(Font.font(14));
        kall.setLayoutY(44);
        kall.setLayoutX(14);

        Text nam = new Text(name);
        nam.setFill(Color.WHITE);
        nam.setFont(Font.font(14));
        nam.setLayoutX(66);
        nam.setLayoutY(29);

        Text kalll = new Text(callory);
        kalll.setFill(Color.WHITE);
        kalll.setFont(Font.font(14));
        kalll.setLayoutX(77);
        kalll.setLayoutY(59);

        Text ftime = new Text(time);
        ftime.setFill(Color.WHITE);
        ftime.setFont(Font.font(14));
        ftime.setLayoutX(55);
        ftime.setLayoutY(89);

        Label tim = new Label("Time:");
        tim.setTextFill(Color.WHITE);
        tim.setFont(Font.font(14));
        tim.setLayoutY(74);
        tim.setLayoutX(14);

        Text ingridientu = new Text(ingridienty);
        ingridientu.setFill(Color.WHITE);
        ingridientu.setLayoutY(115);
        //ingridientu.setLayoutX(0);
        ingridientu.setFont(Font.font(14));

        foodInfPane.getChildren().addAll(textName, ingridientu, kall, kalll, nam, ftime, tim);

        ImageView foodimg = new ImageView(foodimage);
        foodimg.setFitWidth(317);
        foodimg.setFitHeight(210);
        foodimg.setLayoutY(33);
        foodimg.setLayoutX(14);

        Text receptt = new Text(recept);
        receptt.setFont(Font.font(14));
        receptt.setLayoutY(23);
        receptt.setLayoutX(10);
        receptt.setFill(Color.WHITE);

        AnchorPane receptP = new AnchorPane(receptt);
        receptP.setPrefSize(592, 326);
        receptP.setStyle("-fx-background-color: #a0693d; -fx-background-radius: 8;");
        receptP.setLayoutY(274);
        receptP.setLayoutX(13);

        ScrollPane sp = new ScrollPane(receptP);
        sp.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        sp.setStyle("-fx-background-color: #a0693d; -fx-background-radius: 8;");
        sp.setPrefWidth(592);
        sp.setPrefHeight(326);
        sp.setLayoutY(274);
        sp.setLayoutX(13);

        foodPane.getChildren().addAll(foodimg, sp, scrollInfPane);
    }
}
