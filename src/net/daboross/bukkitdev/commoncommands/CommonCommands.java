package net.daboross.bukkitdev.commoncommands;

/**
 *
 * @author daboross
 */
import java.util.Map;
import java.util.logging.Level;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.PluginCommand;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author daboross
 */
public final class CommonCommands extends JavaPlugin {

    private static CommonCommands instance;

    /**
     *
     */
    @Override
    public void onEnable() {
        PvPClass pvpClass = new PvPClass();
        PluginCommand cc = getCommand("cc");
        PluginCommand color = getCommand("color");
        PluginCommand setdabo = getCommand("setdabo");
        PluginCommand pvp = getCommand("pvp");
        if (cc != null) {
            cc.setExecutor(new CommonCommandExecutor());
        } else {
            getLogger().severe("Command CC is null");
        }
        if (color != null) {
            color.setExecutor(new ColorCommandExecutor());
        } else {
            getLogger().severe("Command COLOR is null");
        }
        if (pvp != null) {
            pvp.setExecutor(pvpClass);
        } else {
            getLogger().severe("Command PVP is null");
        }
        if (setdabo != null) {
            setdabo.setExecutor(new SetDaboExecutor());
        } else {
            getLogger().severe("Command SETDABO is null");
        }
        PluginManager pm = this.getServer().getPluginManager();
        pm.registerEvents(pvpClass, this);
        instance = this;
    }

    /**
     *
     */
    @Override
    public void onDisable() {
        instance = null;
    }
    /**
     *
     * @param sender
     * @param cmd
     * @param label
     * @param args
     * @return
     */
    private Map<Integer, String> colorMap = new ColorMap();

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        getLogger().log(Level.INFO, "Tried to Run Command: " + cmd.getName());
        return false;
    }

    public static CommonCommands getCurrentInstance() {
        return instance;
    }
}
