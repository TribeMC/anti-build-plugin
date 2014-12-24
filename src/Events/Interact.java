package Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.enchantment.EnchantItemEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import antiv3.main;

public class Interact implements Listener {

	public Interact(main main) {
		main.getServer().getPluginManager().registerEvents(this, main);
	}

	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onInter(PlayerInteractEvent e){
		if(main.itemblack.contains(e.getClickedBlock().getTypeId())){
			e.setCancelled(true);
		}
		
	}
	
	@EventHandler
	public void onEnch(EnchantItemEvent e){
		e.setCancelled(true);
	}
	
	@EventHandler
	public void onEnder(InventoryOpenEvent e){
		if(e.getInventory().equals(e.getPlayer().getEnderChest())){
			e.setCancelled(true);
		}
	}
	
	
}
