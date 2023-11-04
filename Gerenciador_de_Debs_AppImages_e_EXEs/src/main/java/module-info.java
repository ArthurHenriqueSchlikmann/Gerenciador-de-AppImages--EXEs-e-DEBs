module com.mycompany.gerenciador_de_debs_appimages_e_exes {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.gerenciador_de_debs_appimages_e_exes to javafx.fxml;
    exports com.mycompany.gerenciador_de_debs_appimages_e_exes;
}
