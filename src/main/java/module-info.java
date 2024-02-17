module com.example.ormassignment {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ormassignment to javafx.fxml;
    exports com.example.ormassignment;
}