module com.example.javafx_final_partb {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx_final_partb to javafx.fxml;
    exports com.example.javafx_final_partb;
}