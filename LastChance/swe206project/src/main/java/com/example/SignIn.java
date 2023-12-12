package com.example;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignIn {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField UserID;

    @FXML
    private PasswordField UserPassword;

    @FXML
    void SignInCheck(ActionEvent event) {
        String username = UserID.getText();
        String password = UserPassword.getText();
        System.out.println(username);
        System.out.println(password);

    }

    

}
