package cz.bakterio.spigot.advencedbows.database;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import cz.bakterio.spigot.advencedbows.AdvencedBows;
import cz.bakterio.spigot.advencedbows.models.CanonModel;

import java.io.*;
import java.lang.module.FindException;
import java.util.ArrayList;

public class CanonDatabase {
    public static final ArrayList<CanonModel> canons = new ArrayList<>();
    private static final File json = new File(AdvencedBows.getPlugin().getDataFolder().getAbsolutePath() + "/canons.json");
    private static final Gson gson = new GsonBuilder().create();

    public static void save() throws IOException {
        checkFile();
        final FileWriter writer = new FileWriter(json);
        gson.toJson(canons, writer);
        writer.flush();
        writer.close();
        System.out.println("Canons has been saved.");
    }

    public static void load() throws IOException {
        checkFile();
        JsonReader reader = new JsonReader(new FileReader(json));
    }

    private static void checkFile() {
        try {
            json.getParentFile().mkdir();
            json.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
