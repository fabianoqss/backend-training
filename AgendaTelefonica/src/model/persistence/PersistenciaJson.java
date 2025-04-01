package model.persistence;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.entities.Agenda;
import model.util.LocalDateAdapter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class PersistenciaJson {

    public static void salvarDados(Agenda agenda, String path) {
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(LocalDate.class, new LocalDateAdapter()) // Adiciona suporte para LocalDate
                .setPrettyPrinting()
                .create();

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
