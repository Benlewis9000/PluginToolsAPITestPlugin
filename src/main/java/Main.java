import plugintoolsapi.ConfigManager;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public class Main extends JavaPlugin {

    ConfigManager configManager;

    @Override
    public void onEnable(){

        configManager = new ConfigManager(this, new HashMap<>());

        testLoadConfigFromDatafolder();
        testLoadConfigFromResources();
        testLoadConfigFromNew();

    }

    public void onDisable(){



    }

    private void testLoadConfigFromDatafolder(){

        String fileName = "datafolderconfig.yml";

        configManager.loadConfig(fileName);
        FileConfiguration config = configManager.getConfig(fileName);
        System.out.println(config.getString("source"));

    }

    private void testLoadConfigFromResources(){

        String fileName = "resourcesconfig.yml";

        configManager.loadConfig(fileName);
        FileConfiguration config = configManager.getConfig(fileName);
        System.out.println(config.getString("source"));

    }

    private void testLoadConfigFromNew(){

        String fileName = "new.yml";

        configManager.loadConfig(fileName);
        FileConfiguration config = configManager.getConfig(fileName);
        config.set("source", "new");

    }

}
