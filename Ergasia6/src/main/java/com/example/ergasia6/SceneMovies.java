package com.example.ergasia6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Duration;

import javafx.stage.Stage;

import java.io.IOException;
import java.util.*;


import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import java.io.IOException;

public class SceneMovies
{
    @FXML
    private Button ButtonDespicable_Me4;
    @FXML
    private Button ButtonVenom;
    @FXML
    private Button ButtonAnora;
    @FXML
    private Button ButtonEvil_Dead_Rise;

    @FXML
    private Label Despicable_Me_4_text;
    @FXML
    private Label Venom_text;
    @FXML
    private Label Anora_text;
    @FXML
    private Label Evil_Dead_Rise_text;



    private Set<Label> selectedLabels = new HashSet<>();


     Image MovieImage= new Image(getClass().getResourceAsStream("/com/example/ergasia6/img/Despicable_Me.jpg"));
     Image MovieImage2= new Image(getClass().getResourceAsStream("/com/example/ergasia6/img/venom2.jpg"));
    Image MovieImage3= new Image(getClass().getResourceAsStream("/com/example/ergasia6/img/Anora.jpg"));
    Image MovieImage4= new Image(getClass().getResourceAsStream("/com/example/ergasia6/img/Evil_Dead_Rise_sosto.jpg"));

    private Set<Button> selectedButtons = new HashSet<>();
    private Button selectedButtonsDay;
    private boolean flag =false;
    private Button selectedButtonsTime;
    private int MovieImageFromScene2;

    public void Initialize()
    {
       selectedLabels.add(Despicable_Me_4_text);
       selectedLabels.add(Venom_text);
       selectedLabels.add(Anora_text);
       selectedLabels.add(Evil_Dead_Rise_text);

        Despicable_Me_4_text.setAlignment(Pos.CENTER);
        Venom_text.setAlignment(Pos.CENTER);
        Anora_text.setAlignment(Pos.CENTER);
        Evil_Dead_Rise_text.setAlignment(Pos.CENTER);
    }


    public void selectMovie(ActionEvent event) throws IOException {

        Button button = (Button) event.getSource();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/ergasia6/hello-view.fxml"));
        Parent root = loader.load();
        HelloController helloController = loader.getController();



        if(event.getSource() == ButtonDespicable_Me4)
        {

            helloController.setMovieImageAndLabels(1) ;
        }
        else if(event.getSource() == ButtonVenom)
        {
            helloController.setMovieImageAndLabels(2);
        }
        else if(event.getSource() == ButtonAnora)
        {
            helloController.setMovieImageAndLabels(3);
        }
        else if(event.getSource() == ButtonEvil_Dead_Rise)
        {
            helloController.setMovieImageAndLabels(4);


        }
        helloController.setImageMoviePhoto();
        if(flag)
        {
            helloController.SetSelectedButtonsAndTime(selectedButtons,selectedButtonsDay,flag,selectedButtonsTime);
            helloController.setMoviePhotoFromScene2(MovieImageFromScene2);
        }

        Scene scene = new Scene(root);

        // Μετάβαση στη σκηνή 1
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();



    }

    public void setSelectedSeats(Set<Button> selectedSeats2,Button selectedButtonDays, boolean flag ,Button activeButtonTime2)throws IOException
    {
       this.selectedButtons=selectedSeats2;
       this.selectedButtonsDay=selectedButtonDays;
       this.flag=flag;
       this.selectedButtonsTime = activeButtonTime2;
    }
    public void setMoviePhotoFromScene2(int MovieImage2)
    {
        this.MovieImageFromScene2=MovieImage2;
    }

    }

