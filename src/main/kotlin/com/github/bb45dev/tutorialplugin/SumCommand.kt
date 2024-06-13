package com.github.bb45dev.tutorialplugin

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

object SumCommand: CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        //引数の数が２より小さい＝引数が１つもしくは０の時に以下の処理を実行
        if (args.size<2){
            sender.sendMessage("コマンドの使用方法が間違っています。")
            return false
        }
        //ここから下に処理を追加
        val num1 = args[0].toInt()
        val num2 = args[1].toInt()
        val sum = num1+num2
        sender.sendMessage("$num1 + $num2 = $sum")

        return true
    }
}