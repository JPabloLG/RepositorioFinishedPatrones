package co.unquindio.proyecto.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControler {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label home;

    @FXML
    private PasswordField passwordTxtField;

    @FXML
    private Button start;

    @FXML
    private TextField userTxtField;

    @FXML
    void startAction(ActionEvent event) throws IOException { 
        /*if(passwordTxtField.getText().equals("admin123")){
            App.setRoot("dueñoView");
        }else{
            App.setRoot("clienteView");
        }*/
    }

    @FXML
    void initialize() {
        assert home != null : "fx:id=\"home\" was not injected: check your FXML file 'login.fxml'.";
        assert passwordTxtField != null
                : "fx:id=\"passwordTxtField\" was not injected: check your FXML file 'login.fxml'.";
        assert start != null : "fx:id=\"start\" was not injected: check your FXML file 'login.fxml'.";
        assert userTxtField != null : "fx:id=\"userTxtField\" was not injected: check your FXML file 'login.fxml'.";

    }
}
