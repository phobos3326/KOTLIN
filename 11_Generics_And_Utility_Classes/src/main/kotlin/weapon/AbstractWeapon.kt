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

    fun getAmmo(): List<Ammo> {
        var currentDamage = 0
        val tempArray = mutableListOf<Ammo>()
        if (isLoaded) {
            //println("еще есть патроны")
        } else {
            reloadWeapon()
          //  println("--> заряжен <--")
        }
        when (fireType) {
            FireType.SingleShot -> {


               // println("одиночный выстрел")
                ammoMagazine.pop()?.let { tempArray.add(it) }
            }

            is FireType.MachineGun->

                for (i in 1..fireType.queueSize) ammoMagazine.pop()?.let { tempArray += it

                    println("очередь ")
                }
        }
        return tempArray
    }
}