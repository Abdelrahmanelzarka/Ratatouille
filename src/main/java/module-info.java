module com.example.ratatouille {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.ratatouille to javafx.fxml;
    exports com.example.ratatouille;
}