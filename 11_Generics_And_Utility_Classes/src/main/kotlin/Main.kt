import java.util.*


fun main() {
    var sum = 0
    repeat(100) {
        val aa = Ammo.SECONDBULLET.gettingCurrentDamage()
        println(aa)
        if (aa <= 50) sum += 1


    }
    println(sum)

    FireType.singleShot
    FireType.machineGun(5)
    println(FireType.machineGun(5))



}


