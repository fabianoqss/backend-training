package model.persistence;

import model.entities.Agenda;
import model.exceptions.PersistenciaException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PersistenciaJson {

    public static void salvarDados(Agenda agenda, String path) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String json = gson.toJson(agenda);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
            bufferedWriter.write(json);
            bufferedWriter.newLine();
            System.out.println("Dados salvos com sucesso em " + path);

        } catch (IOException e) {
            System.out.println("Não foi possível salvar o arquivo! " + e.getMessage());
        }

    }
}
