package com.mycompany.gerenciador_de_debs_appimages_e_exes;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Menu;

public class PrimaryController {

    @FXML
    private MenuItem Web;
    private MenuItem close;
    private MenuBar barra;
    private Menu file;
    
    @FXML
    private void ViraWeb() throws IOException {
        App.setRoot("web");
    }
}