package Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBucketEvent;

import antiv3.main;

public class Bukkit implements Listener {

	public Bukkit(main main) {
		main.getServer().getPluginManager().registerEvents(this, main);
	}

	@EventHandler
	public void onBukkit(PlayerBucketEvent e) {
		if (canBreak(e.getPlayer())) {

		} else {
			e.setCancelled(true);
		}
	}

	private boolean canBreak(Player p) {
		// TODO Auto-generated method stub
		if (p.hasPermission("build.break")) {
			if (antiv3.main.builder.contains(p)) {
				return true;

			}
			return false;
		} else {
			return false;
		}
	}
}
