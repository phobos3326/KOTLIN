import warrior.General
import warrior.Soldier
import weapon.Ammo
import weapon.Weapons

fun main() {


    // здесь пока только проверка отдельных функций


    val soldier = Soldier()

    val general = General()


    for (i in 1..general.maxHealth) {
        if (!general.isKilled) {
            println(general.currentHealth)
            soldier.attack(general)
        } else
            break
    }
    println(general.currentHealth)


}


