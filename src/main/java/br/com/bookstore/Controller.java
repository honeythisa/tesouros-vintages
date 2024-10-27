package br.com.bookstore;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import br.com.bookstore.model.Book;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private HBox cardLayoout;

    @FXML
    private GridPane bookContainer;
    private List<Book> recentlyAdded;
    private List<Book> recommended;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        recentlyAdded = new ArrayList<>(recentlyAdded());
        recommended = new ArrayList<>(books());
        int column = 0;
        int row = 1;
        try {
            for (Book book : recentlyAdded) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/br/com/bookstore/card.fxml"));
                HBox cardBox = fxmlLoader.load();
                CardController cardController = fxmlLoader.getController();
                cardController.setData(book);
                cardLayoout.getChildren().add(cardBox);
            }
            for(Book book:recommended){
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/br/com/bookstore/book.fxml"));
                VBox bookBox = fxmlLoader.load();
                BookController BookController= fxmlLoader.getController();
                BookController.setData(book);

                if(column==6){
                    column=0;
                    ++row;
                }
                bookContainer.add(bookBox,column++,row);
                GridPane.setMargin(bookBox,new Insets(10));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<Book> recentlyAdded() {
        List<Book> ls = new ArrayList<>();
        Book book = new Book();
        book.setName("O avesso da pele");
        book.setImageSrc("/br/com/bookstore/img/1.png");
        book.setAuthor("Jeferson Tenório");
        ls.add(book);

        book = new Book();
        book.setName("Blade Runner");
        book.setImageSrc("/br/com/bookstore/img/2.png");
        book.setAuthor("Philip K. Dick");
        ls.add(book);

        book = new Book();
        book.setName("As irmãs Blue");
        book.setImageSrc("/br/com/bookstore/img/3.png");
        book.setAuthor("Coco Mellors");
        ls.add(book);

        return ls;
    }
    private List<Book> books(){
        List<Book> ls = new ArrayList<>();
        Book book = new Book();
        book.setName("Nana Vol.1");
        book.setImageSrc("/br/com/bookstore/img/4.png");
        book.setAuthor("Ai Yazawa");
        ls.add(book);

        book = new Book();
        book.setName("Demon Slayer - Kimetsu no Yaiba Vol. 10");
        book.setImageSrc("/br/com/bookstore/img/5.png");
        book.setAuthor("Koyoharu Gotouge");
        ls.add(book);

        book = new Book();
        book.setName("O Hobbit");
        book.setImageSrc("/br/com/bookstore/img/6.png");
        book.setAuthor("J.R.R. Tolkien");
        ls.add(book);

        book = new Book();
        book.setName("Me chame pelo seu nome");
        book.setImageSrc("/br/com/bookstore/img/7.png");
        book.setAuthor("André Aciman");
        ls.add(book);

        book = new Book();
        book.setName("Neuromancer");
        book.setImageSrc("/br/com/bookstore/img/8.png");
        book.setAuthor("William Gibson");
        ls.add(book);

        book = new Book();
        book.setName("A noiva do Deus do Mar");
        book.setImageSrc("/br/com/bookstore/img/9.png");
        book.setAuthor("Axie Oh");
        ls.add(book);

        book = new Book();
        book.setName("Paradise Kiss Vol. 3");
        book.setImageSrc("/br/com/bookstore/img/10.png");
        book.setAuthor("Ai Yazawa");
        ls.add(book);

        book = new Book();
        book.setName("A redoma de vidro");
        book.setImageSrc("/br/com/bookstore/img/11.png");
        book.setAuthor("Sylvia Plath");
        ls.add(book);

        book = new Book();
        book.setName("Torto arado");
        book.setImageSrc("/br/com/bookstore/img/12.png");
        book.setAuthor("Itamar Vieira Junior");
        ls.add(book);

        book = new Book();
        book.setName("Harry Potter e o Prisioneiro de Azkaban");
        book.setImageSrc("/br/com/bookstore/img/hp.png");
        book.setAuthor("J.J.K Rowling");
        ls.add(book);

        book = new Book();
        book.setName("Relatos de um gato viajante");
        book.setImageSrc("/br/com/bookstore/img/gato.png");
        book.setAuthor("Hiro Arikawa");
        ls.add(book);

        book = new Book();
        book.setName("O Guia Definitivo do Mochileiro das Galáxias");
        book.setImageSrc("/br/com/bookstore/img/guia.png");
        book.setAuthor("Douglas Adams");
        ls.add(book);

        return ls;
    }
}