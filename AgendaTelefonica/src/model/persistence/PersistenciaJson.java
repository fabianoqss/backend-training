package model.persistence;

import model.entities.Agenda;
import model.exceptions.PersistenciaException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PersistenciaJson {

    public static void salvarDados(Agenda agenda, String path) {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {

        } catch (IOException e) {
            System.out.println("Não foi possível salvar o arquivo! " + e.getMessage());
        }

    }
}
