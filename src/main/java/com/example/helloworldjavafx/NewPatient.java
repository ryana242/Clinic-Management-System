package com.example.helloworldjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class NewPatient
{
    @FXML
    private Button back;
    @FXML
    private TextField name;
    @FXML
    private TextField dob;
    @FXML
    private TextField sex;
    @FXML
    private TextField weight;
    @FXML
    private TextField bg;
    @FXML
    private TextField meds;
    @FXML
    private TextField phone;
    @FXML
    private TextField id;
    @FXML
    private Button confirm;


    public void goBack(ActionEvent event) throws IOException
    {
        System.out.println(name.getText());
        System.out.println(dob.getText());
        System.out.println(sex.getText());
        System.out.println(weight.getText());
        System.out.println(bg.getText());
        System.out.println(meds.getText());
        System.out.println(phone.getText());
        System.out.println(id.getText());
        patientDatabase.writeToDatabase(name.getText(), dob.getText(), sex.getText(), weight.getText(), bg.getText(), meds.getText(), phone.getText(), id.getText());
        HelloApplication q = new HelloApplication();
        q.changeScene("afterLogin.fxml");
    }

    public void newConfirm(ActionEvent event) throws IOException
    {
        HelloApplication r = new HelloApplication();
        r.changeScene("afterLogin.fxml");
    }
}
