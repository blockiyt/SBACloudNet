package de.blocki.sbacloudnet.listener;

import de.blocki.sbacloudnet.manager.CloudNetManager;
import de.blocki.sbacloudnet.utils.ConfigManager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.screamingsandals.bedwars.api.events.BedwarsGameStartEvent;

public class BWGameStart implements Listener {

    @EventHandler
    public void onGameStart(BedwarsGameStartEvent e){
        CloudNetManager.createCloudServiceByTask(ConfigManager.get("CloudNetTaskName"));
    }

}
