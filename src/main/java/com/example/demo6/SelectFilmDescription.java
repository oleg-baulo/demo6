package com.example.demo6;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;



public class SelectFilmDescription {
    public void SFD(AnchorPane fp, Image img, Media media) {
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        MediaView mediaView = new MediaView(mediaPlayer);
        mediaView.setLayoutY(11);
        mediaView.setLayoutX(122);

        //Film icon
        ImageView imageView = new ImageView(img);
        imageView.setLayoutX(46);
        imageView.setLayoutY(26);
        imageView.setFitHeight(200);
        imageView.setFitWidth(141);

        //Film information pane
        AnchorPane inf = new AnchorPane();
        inf.setStyle("-fx-background-color: #9e5b26; -fx-background-radius: 7;");
        inf.setPrefHeight(262);
        inf.setPrefWidth(294);
        inf.setLayoutX(270);
        inf.setLayoutY(26);


        //FilmName
        Label fn = new Label();
        fn.setText("Name:");
        fn.setTextFill(Color.WHITE);
        fn.setPrefSize(69,32);
        fn.setLayoutY(14);
        fn.setLayoutX(11);
        fn.setFont(Font.font(22));

        //FilmRating
        Label fr = new Label();
        fr.setText("Rating:");
        fr.setTextFill(Color.WHITE);
        fr.setPrefSize(69, 32);
        fr.setLayoutY(63);
        fr.setLayoutX(14);
        fr.setFont(Font.font(22));

        //Film relise year
        Label frel = new Label();
        frel.setText("Relise year:");
        frel.setTextFill(Color.WHITE);
        frel.setPrefSize(69, 32);
        frel.setLayoutY(115);
        frel.setLayoutX(14);
        frel.setFont(Font.font(22));

        //Film age
        Label fa = new Label();
        fa.setText("Age:");
        fa.setTextFill(Color.WHITE);
        fa.setPrefSize(69, 32);
        fa.setLayoutY(167);
        fa.setLayoutX(14);
        fa.setFont(Font.font(22));

        //Film time
        Label ft = new Label();
        ft.setText("Time:");
        ft.setTextFill(Color.WHITE);
        ft.setPrefSize(69, 32);
        ft.setLayoutY(219);
        ft.setLayoutX(14);
        ft.setFont(Font.font(22));

        //Film information pane
        inf.getChildren().addAll(fn, fr, frel, fa, ft);

        //Film trailer pane
        AnchorPane tr = new AnchorPane(mediaView);
        tr.setStyle("-fx-background-color: #9e5b26; -fx-background-radius: 7;");
        tr.setPrefSize(580,262);
        tr.setLayoutX(16);
        tr.setLayoutY(326);

        fp.getChildren().addAll(inf, tr, imageView);
    }
}