package modul6;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Memuat file FXML
        Parent root = FXMLLoader.load(getClass().getResource("Tabel.fxml"));

        // Membuat scene
        Scene scene = new Scene(root);

        // Mengatur judul dan scene pada stage
        primaryStage.setTitle("Database Mahasiswa");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
