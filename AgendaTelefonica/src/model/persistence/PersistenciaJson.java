package model.persistence;

import model.entities.Agenda;
import model.exceptions.PersistenciaException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PersistenciaJson {
    String path = "C:\\Users\\fabia\\OneDrive\\Área de Trabalho\\backend-training\\AgendaTelefonica\\docs\\out.json";

    public void salvarDados(Agenda agenda) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
