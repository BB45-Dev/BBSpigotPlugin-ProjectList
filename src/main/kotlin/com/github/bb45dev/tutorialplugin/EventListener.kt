package com.github.bb45dev.tutorialplugin

import org.bukkit.Bukkit
import org.bukkit.GameMode
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.inventory.InventoryClickEvent
import org.bukkit.event.player.PlayerJoinEvent
import org.spigotmc.event.player.PlayerSpawnLocationEvent
import javax.swing.text.Position


object EventListener: Listener {
    @EventHandler
    fun onjoin(event: PlayerJoinEvent) {
        event.joinMessage = "§e${event.player.name}がサーバーに参加しました。"

    }

    @EventHandler
    fun onInventoryClick(event: InventoryClickEvent) {
        if (TutorialPlugin.guiMap[event.whoClicked.uniqueId] == event.inventory) {
            event.isCancelled = true

            if (event.currentItem == null) return

            //ここの下の行に変数をプレイヤーに保存する処理を追加
            val player = Bukkit.getPlayer(event.whoClicked.name)

                        }
                        //オークの木材の時の処理
                        if (event.currentItem!!.type == Material.OAK_WOOD) {
                            event.whoClicked.gameMode = GameMode.CREATIVE

                        }
                        //木のピッケルの時の処理
                        if (event.currentItem!!.type == Material.WOODEN_PICKAXE) {
                            event.whoClicked.gameMode = GameMode.SURVIVAL
                        }
                    }
                }

