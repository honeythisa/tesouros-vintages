module br.com.bookstore {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.almasb.fxgl.all;

    opens br.com.bookstore to javafx.fxml;
    exports br.com.bookstore;
}