package com.github.bb45dev.tutorialplugin

import org.bukkit.event.inventory.InventoryType
import org.bukkit.inventory.Inventory
import org.bukkit.plugin.java.JavaPlugin
import java.util.UUID

class TutorialPlugin : JavaPlugin() {

    companion object{
        val guiMap: MutableMap<UUID, Inventory> = mutableMapOf()
    }
    override fun onEnable() {
        // Plugin startup logic
        server.pluginManager.registerEvents(EventListener, this)
        getCommand("hello")?.setExecutor(DebugCommand)
        getCommand("gui")?.setExecutor(GuiCommand)

    }

    override fun onDisable() {
        // Plugin shutdown logic

    }
}

