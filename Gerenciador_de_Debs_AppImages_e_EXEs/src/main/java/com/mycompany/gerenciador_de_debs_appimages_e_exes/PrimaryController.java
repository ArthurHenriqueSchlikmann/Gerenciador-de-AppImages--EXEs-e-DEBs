package com.mycompany.gerenciador_de_debs_appimages_e_exes;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;

public class PrimaryController {

    @FXML
    private MenuItem Web;
    private MenuItem close;
    private MenuBar barra;
    private Menu file;
    private Button btnweb;
    private PasswordField senha;
    
    @FXML
    private void ViraWeb() throws IOException {
        String senhaVerificacao = senha.getText();
        if("1852012".equals(senhaVerificacao)) {
            App.setRoot("web");
        }
    }
    
    @FXML
    private void Web() throws IOException {
        String senhaVerificacao = senha.getText();
        if("1852012".equals(senhaVerificacao)) {
            App.setRoot("web");
        }
    }
}