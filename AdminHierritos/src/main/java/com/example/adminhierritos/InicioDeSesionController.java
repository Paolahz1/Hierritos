package com.example.adminhierritos;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class InicioDeSesionController {

    static Scene scene;
    static Stage stage;
    @FXML
    private TextField textfieldUsuario;


    @FXML
    private TextField textfieldContrasena;


    @FXML
    protected void clickBotonInicio() {
        stage.setScene(MenuController.scene);
        textfieldContrasena.setText("1234");
    }
/*
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
*/
}