package br.com.bookstore;

import br.com.bookstore.model.Book;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class CardController {
    @FXML
    private Label authorName;

    @FXML
    private Label bookName;

    @FXML
    private HBox box;

    @FXML
    private ImageView bookImage;

    private String [] colors = {"B9E5FF", "BDB2FE", "FB9AA8", "FF5056"};

    public void setData(Book book){
        Image image = new Image(getClass().getResourceAsStream(book.getImageSrc()));
        bookImage.setImage(image);
        bookName.setText(book.getName());
        authorName.setText(book.getAuthor());
        //adicionados recentemente mudam aleatoriamente de cor de acordo com as cores definidas
        box.setStyle("-fx-background-color: "+ colors[(int)(Math.random()*colors.length)] + ";"+
                "-fx-background-radius: 15;"+
                "-fx-effect:dropShadow(three-pass-box, rgba(0,0,0,0.1),10,0,0,10);");
    }
}