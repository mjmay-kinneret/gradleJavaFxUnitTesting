package il.ac.kinneret.mjmay;

import il.ac.kinneret.mjmay.model.SampleModelClass;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class GradlingFxController {
    @FXML
    protected Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Result of the method is: " + SampleModelClass.add(3,4));
    }


}