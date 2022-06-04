package me.abdel20089.eventstest;

import org.bukkit.ChatColor;
import org.bukkit.block.Banner;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.player.PlayerBucketFillEvent;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.command.CommandSender;

public final class EventsTest extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("[ET] EventsTest enabled correctly");

    }
    @Override
    public void onDisable() {
        System.out.println("[ET] EventsTest disabled correctly");
    }
}
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        e.setJoinMessage(ChatColor.BLUE + getName() + " " + ChatColor.GRAY + "joined");
    }
    public void onQuit(PlayerQuitEvent a) {

        PlayerQuitEvent.setQuitMessage(ChatColor.DARK_BLUE + getName() + " " + ChatColor.GRAY + "left");
    }
    public void onInventory(PlayerInventory b) {
        Player player = (Player) null;
        assert false;
        player.sendMessage(ChatColor.RED + "You just opened your inventory :D");
    }
