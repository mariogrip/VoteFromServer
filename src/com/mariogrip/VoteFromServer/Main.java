package com.mariogrip.VoteFromServer;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;




public class Main extends JavaPlugin
{
	 
	@Override
	public void onEnable()
	  {
		 Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.YELLOW + "[VoteFromServer] Loading Class!");
		
		 getCommand("vote").setExecutor(new vote(this));
	    Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.YELLOW + "[VoteFromServer] Loading Config!");
	    loadConfiguration();
	    Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.YELLOW + "[VoteFromServer] Loaded!");
	  }
	 
	  public void loadConfiguration() {
		  
		    getConfig().options().copyDefaults(true);
            getConfig().options().copyHeader(true);
            this.saveDefaultConfig();
		    saveConfig();
		   
		  }
		
}
