package me.mcluke300.commandlistener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class clistener implements Listener{
	@EventHandler(priority = EventPriority.NORMAL)
	public void onPlayerCommandPreprocess(PlayerCommandPreprocessEvent event) {
			Player player = (Player)event.getPlayer();
			String msg = event.getMessage();
			
			CommandListener.oncommand(msg, player);
		}

	
	@EventHandler(priority = EventPriority.NORMAL)
	public void onQuit(PlayerQuitEvent event) {
			Player player = (Player)event.getPlayer();
			String playname = player.getName();
			CommandListener.onquit(playname);
		}
}
