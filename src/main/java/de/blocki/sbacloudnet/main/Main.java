package de.blocki.sbacloudnet.main;

import de.blocki.sbacloudnet.listener.BWGameStart;
import de.blocki.sbacloudnet.utils.ConfigManager;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public static Plugin getPlugin;

    @Override
    public void onEnable() {
        // Plugin startup logic
        getPlugin = this;
        PluginManager pm = this.getServer().getPluginManager();
        pm.registerEvents(new BWGameStart(), this);
        setDefaultConfig();

    }


    private void setDefaultConfig(){
        if(ConfigManager.get("CloudNetVersion") == null){ ConfigManager.set("CloudNetVersion", "3.3.0"); }
        if(ConfigManager.get("CloudNetTaskName") == null){ ConfigManager.set("CloudNetTaskName", "bedwars"); }
    }

}
