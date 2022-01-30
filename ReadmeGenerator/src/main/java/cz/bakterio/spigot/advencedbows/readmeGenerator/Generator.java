package cz.bakterio.spigot.advencedbows.readmeGenerator;

import cz.bakterio.spigot.advencedbows.items.CustomItem;
import cz.bakterio.spigot.advencedbows.items.ItemsManager;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Generator {
    final static File readme = new File("../../../README.md");

    public static void main(String[] args) throws IOException {
        readme.createNewFile();
        BufferedWriter writer = new BufferedWriter(new FileWriter(readme));

        writer.append("# AdvencedBows\n");
        writer.append("Take bows to serious level!!!\n\n");

        ItemsManager.addItems();
        for (CustomItem i : ItemsManager.items) {
            writer.append("## " + i.getName() + "\n");
            writer.append(i.getDescription() + "\n");
        }
        writer.flush();
        writer.close();
    }
}
