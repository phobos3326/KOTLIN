fun main() {
    var sum = 0
    repeat(100) {
        val aa = Ammo.SECONDBULLET.gettingCurrentDamage()
        println(aa)
        if (aa <= 50) sum += 1


    }
    println(sum)

    FireType.SingleShot
    FireType.MachineGun(5)
    println(FireType.MachineGun(5))

    var wep = Weapon(12, FireType.SingleShot).getBullet(Ammo.SECONDBULLET)
    println(wep)


}


