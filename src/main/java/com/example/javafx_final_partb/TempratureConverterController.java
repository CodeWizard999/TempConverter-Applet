package com.example.javafx_final_partb;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;
import javafx.application.Platform;

public class TempratureConverterController {

    @FXML
    private Button bttCross;

    @FXML
    private TextField txtCel;

    @FXML
    private Label txtError;
    @FXML
    private DialogPane errorMessage;

    @FXML
    private TextField txtFah;

    private double celsius;
    private double fahrenheit;
    private int count = 0;

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

        public void handle(KeyEvent e) {
            try {

                if (e.getCode().equals(KeyCode.ENTER) && txtCel.isFocused()) {
                    celsius = Double.parseDouble(txtCel.getText());
                    String fah = Double.toString((9.0 / 5.0 * celsius) + 32);
                    txtFah.setText(fah);
                }
                else if (e.getCode().equals(KeyCode.ENTER) && txtFah.isFocused()) {
                    fahrenheit= Double.parseDouble(txtFah.getText());
                    String cel = Double.toString(5.0 /9.0 * ( fahrenheit - 32));
                    txtCel.setText(cel);
                }
            } catch (Exception exp) {
                errorMessage.setVisible(true);
                txtError.setText("Enter valid value");
            }
        }

        public void closeError(){
            errorMessage.setVisible(false);
        }
        public void closeApplication(){
            Platform.exit();
        }


}

