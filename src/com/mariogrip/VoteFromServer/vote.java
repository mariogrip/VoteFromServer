package com.mariogrip.VoteFromServer;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;





public class vote implements CommandExecutor {
	
	Main plugin;
	 
	public vote(Main instance) {
	plugin = instance;
	}	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		
		if(cmd.getName().equalsIgnoreCase("vote")){ 
			sender.sendMessage(ChatColor.AQUA + "*************** VOTE ***************");
			sender.sendMessage(plugin.getConfig().getString("Header"));
			
			return true;
			
			
		} 
		
			if (args.length == 1){
				if (args[0].equalsIgnoreCase("serverlistmc")){
					sender.sendMessage("http://serverlistmc.tk/?s=" + plugin.getConfig().getString("Serverlistmc_ID"));
				
				}
				if (args[0].equalsIgnoreCase("planetminecraft")){
					sender.sendMessage(plugin.getConfig().getString("Planetminecraft_URL"));
				}
				if (args[0].equalsIgnoreCase("minestatus")){
					if (plugin.getConfig().get("Minestatus").equals("")){
					sender.sendMessage(plugin.getConfig().getString("Minestatus_URL"));
					}
				}
				if (args[0].equalsIgnoreCase("Minecraft-server-list")){
					sender.sendMessage(plugin.getConfig().getString("Minecraft-server-list_URL"));
				
				}
				if (args[0].equalsIgnoreCase("Minecraftservers.org")){
					sender.sendMessage(plugin.getConfig().getString("Minecraftservers.org"));
				}
			}
	      sender.sendMessage(plugin.getConfig().getString("Cannot_find_vote_url"));
		return true; 
	}

}
