package br.com.bookstore;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class BookDescriptionController {
    @FXML
    private TextArea descriptionArea;

    public void setDescription(String description) {
        descriptionArea.setText(description);
    }
}
