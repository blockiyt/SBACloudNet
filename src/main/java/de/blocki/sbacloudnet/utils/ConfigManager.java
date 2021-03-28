package de.blocki.sbacloudnet.utils;

import de.blocki.sbacloudnet.main.Main;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class ConfigManager {

    private static File file = new File(Main.getPlugin.getDataFolder(), "config.yml");
    private static YamlConfiguration yamlConfiguration = YamlConfiguration.loadConfiguration(file);


    public static void set(String path, String value){
        yamlConfiguration.set(path, value);
        save();
    }

    public static String get(String path){
        return yamlConfiguration.getString(path);
    }

    public static void save(){
        try{
            yamlConfiguration.save(file);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
