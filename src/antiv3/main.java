package antiv3;

import java.util.ArrayList;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {

	@Override
	public void onEnable() {
		// TODO Auto-generated method stub

		new Events.Break(this);
		new Events.Build(this);
		new Events.Bukkit(this);
		new Events.Interact(this);
		
		itemblack.add(130);
		itemblack.add(116);
		itemblack.add(58);
		System.out.println("AntiBuild von V3lop5 erfolgreich geladen!");
	}
	
	
	public static ArrayList<Player> builder = new ArrayList<Player>();
	public static ArrayList<Integer> itemblack = new ArrayList<Integer>();

	
	@Override
	public boolean onCommand(CommandSender cs, Command cmd,
			String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("build")){
		if(cs instanceof Player){
			Player p = (Player) cs;
			
			if(builder.contains(p)){
				builder.remove(p);
			}else{
				builder.add(p);
			}
			
		}else{
			cs.sendMessage("Nur Spieler können bauen!");
		}
		}
		
		return false;
	}
}
