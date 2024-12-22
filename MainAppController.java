package modul6;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainAppController {

    // Referensi untuk TableView dan kolom-kolomnya
    @FXML
    private TableView<Mahasiswa> tableMahasiswa;

    @FXML
    private TableColumn<Mahasiswa, String> nimColumn;

    @FXML
    private TableColumn<Mahasiswa, String> namaColumn;

    // Inisialisasi awal aplikasi
    @FXML
    public void initialize() {
        // Mengambil data mahasiswa dari DataProvider
        ObservableList<Mahasiswa> mahasiswaList = DatabaseSiswa.getMahasiswaList();

        // Menghubungkan kolom tabel dengan atribut kelas Mahasiswa
        nimColumn.setCellValueFactory(new PropertyValueFactory<>("nim"));
        namaColumn.setCellValueFactory(new PropertyValueFactory<>("nama"));

        // Memasukkan data ke dalam tabel
        tableMahasiswa.setItems(mahasiswaList);
    }
}