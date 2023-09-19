package com.example.almacenhierritos;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.rmi.RemoteException;

public class InicioDeSesionController {

    static Scene scene;
    static Stage stage;
    @FXML
    private TextField textfieldUsuario;
    @FXML
    private TextField textfieldContrasena;

    @FXML
    protected void clickBotonRegistrate() {
        textfieldUsuario.setText("Gerente");
    }

    @FXML
    protected void clickBotonInicio() {
        try {
            if(Main.client.iniciarSesion(textfieldUsuario.getText(),textfieldContrasena.getText())){
                stage.setScene(MenuController.scene);
            }else{
                System.out.println("INCORRECTO");
            }
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
/*
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
*/
}