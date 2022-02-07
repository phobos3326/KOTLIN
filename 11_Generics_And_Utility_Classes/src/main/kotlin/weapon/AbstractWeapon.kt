package weapon

import Stack

abstract class AbstractWeapon(val maxAmmo: Int, val fireType: FireType) {

    private var ammoMagazine: Stack<Ammo> = Stack()

    val isLoaded: Boolean
        get() = !ammoMagazine.isEmpty()

    abstract fun createAmmo(): Ammo

    fun reloadWeapon() {
        val magazine = Stack<Ammo>()
        repeat(maxAmmo)
        {
            magazine.push(createAmmo())
        }
        ammoMagazine = magazine
    }

    fun getAmmo(): Int {
        var currentDamage = 0
        if (isLoaded) {
            //println("еще есть патроны")
        } else {
            reloadWeapon()
          //  println("--> заряжен <--")
        }
        when (fireType) {
            FireType.SingleShot -> {
                currentDamage = ammoMagazine.pop()?.gettingCurrentDamage()!!
               // println("одиночный выстрел")
            }

            is FireType.MachineGun->
                for (i in 1..fireType.queueSize) {
                    currentDamage += ammoMagazine.pop()?.gettingCurrentDamage()!!
                   // println("очередь $currentDamage")
                }
        }
        return currentDamage
    }
}