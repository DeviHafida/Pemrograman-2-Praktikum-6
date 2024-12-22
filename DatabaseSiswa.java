package modul6;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DatabaseSiswa {

    // Method untuk mendapatkan daftar mahasiswa
    public static ObservableList<Mahasiswa> getMahasiswaList() {
        return FXCollections.observableArrayList(
            new Mahasiswa(1, "192310004", "Dimas Mahesa Madya"),
            new Mahasiswa(2, "192310005", "Arjuna Wira Atmadja"),
            new Mahasiswa(3, "192310007", "Raditya Taraka Bunga"),
            new Mahasiswa(4, "192310008", "Raglana Andaru Ranu"),
            new Mahasiswa(5, "192310010", "Nadindra Wadon Nugraha"),
            new Mahasiswa(6, "192310011", "Hadyan Arga"),
            new Mahasiswa(7, "192310015", "Nandana Sohib Lesmana"),
            new Mahasiswa(8, "192310018", "Padantya Sanatana Astama"),
            new Mahasiswa(9, "192310020", "Bahuwirya Adiguna Palibaya"),
            new Mahasiswa(10, "192310024", "Frisqi Saggaf")
        );
    }
}