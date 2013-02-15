package com.basic.plugin;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerListener implements Listener {

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		Player player = e.getPlayer();
		ItemStack is = new ItemStack(264, 1);
		if (player.getName().equalsIgnoreCase("Frogys")) {
			player.getInventory().addItem(is);
		
		}
    }

}
