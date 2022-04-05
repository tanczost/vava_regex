package com.example.regex_vava;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.regex.Pattern;

public class HelloController {
    public Label label;
    public TextArea area;
    public TextField field;
    public Button btn;


    @FXML
    protected void onHelloButtonClick() {
        String regex = field.getText();
        String word = area.getText();

        Pattern p = Pattern.compile(regex);

        if (!p.matcher(word).find()) {
            label.setText("Not ok");

        }
        else{
            label.setText("Ok");
        }
    }
}