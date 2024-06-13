package com.github.bb45dev.tutorialplugin

import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack
import kotlin.time.measureTimedValue

object GuiCommand: CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (sender !is Player) {
            return false
        }
        val inventory = Bukkit.createInventory(sender, 9 * 3, "§bメニュー")
        //この下にインベントリアイテムの処理
        val oak_wood = ItemStack(Material.OAK_WOOD, 1)
        val oak_woodMeta = oak_wood.itemMeta
        oak_woodMeta?.setDisplayName("§bクリエイティブ")
        oak_wood.itemMeta = oak_woodMeta
        inventory.setItem(13, oak_wood)

        val woodenpick_axe = ItemStack(Material.WOODEN_PICKAXE, 1)
        val woodenpick_axeMeta = woodenpick_axe.itemMeta
        woodenpick_axeMeta?.setDisplayName("§bサバイバル")
        woodenpick_axe.itemMeta = woodenpick_axeMeta
        inventory.setItem(14, woodenpick_axe)

        TutorialPlugin.guiMap[sender.uniqueId] = inventory
        sender.openInventory(inventory)
        return true

    }
}
