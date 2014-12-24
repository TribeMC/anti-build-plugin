package Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

import antiv3.main;

public class Build implements Listener {

	public Build(main main) {
		main.getServer().getPluginManager().registerEvents(this, main);
	}

	@EventHandler
	public void onSet(BlockPlaceEvent e) {
		if (canBreak(e.getPlayer())) {

		} else {
			e.setCancelled(true);
		}
	}

	private boolean canBreak(Player p) {
		if (p.hasPermission("build.build")) {
			if (antiv3.main.builder.contains(p)) {
				return true;

			}
			return false;
		} else {
			return false;
		}
	}
}