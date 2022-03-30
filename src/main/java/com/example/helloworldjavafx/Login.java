package com.example.helloworldjavafx;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.IOException;

public class Login
{
    public Login()
    {
    }
    @FXML
    private Button login_button;
    @FXML
    private Label wrongLogin;
    @FXML
    private TextField Username;
    @FXML
    private PasswordField password;

    public void userLogin(ActionEvent event) throws IOException
    {
        checkLogin();
    }
    private void checkLogin() throws IOException
    {
        HelloApplication n = new HelloApplication();
        if(Username.getText().toString().equals("kuddus") && password.getText().toString().equals("123"))
        {
            wrongLogin.setText("Login Successful!");
            n.changeScene("afterLogin.fxml");
        }
        else
        {
            wrongLogin.setText("Wrong username or password!");
        }
    }

}
