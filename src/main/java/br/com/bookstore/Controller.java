package br.com.bookstore;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private HBox cardLayoout;

    @FXML
    private ImageView logoImageView;

    @FXML
    private ImageView searchImageView;

    @FXML
    private ImageView userImageView;

    @FXML
    private ImageView topBooksImageView;

    @FXML
    private ImageView compImageView;

    @FXML
    private ImageView cateImageView;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Carregar as imagens nos ImageViews com o caminho correto
        logoImageView.setImage(new Image(getClass().getResourceAsStream("src/main/resources/br/com/bookstore/img/logo.png\n")));
        searchImageView.setImage(new Image(getClass().getResourceAsStream("src/main/resources/br/com/bookstore/img/search.png")));
        userImageView.setImage(new Image(getClass().getResourceAsStream("src/main/resources/br/com/bookstore/img/user.png")));
        topBooksImageView.setImage(new Image(getClass().getResourceAsStream("src/main/resources/br/com/bookstore/img/top.png")));
        compImageView.setImage(new Image(getClass().getResourceAsStream("src/main/resources/br/com/bookstore/img/compass.png")));
        cateImageView.setImage(new Image(getClass().getResourceAsStream("src/main/resources/br/com/bookstore/img/cate.png")));
    }
}
