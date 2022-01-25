abstract class AbstractWeapon(val maxAmmo: Int, val fireType: FireType) {

    private val ammoMagazine: Stack<Ammo> = Stack()

    val isLoaded: Boolean
        get() = !ammoMagazine.isEmpty()


    //abstract fun createAmmo(ammoType: Ammo): Ammo
    /* {
         return ammoType
     }
 */

    /* open fun enumRnd():Ammo{
         Ammo.values()
         return a
     }*/


    /*private fun createAmmo(): Ammo {
        val ammoValue = Ammo.values()
        val rnd = (0 until Ammo.values().size).random()
        println(ammoValue[rnd])
        return ammoValue[rnd]
    }*/

    abstract fun createAmmo(): Ammo


    fun reloadWeapon() {
        if (isLoaded) {
            println("еще есть патроны")
        } else {
            repeat(maxAmmo)
            {
                ammoMagazine.push(createAmmo())
                println("заряжен")
            }
        }

    }

    fun getAmmo(): Array<Ammo> {

        when (fireType) {
            FireType.SingleShot -> {
                ammoMagazine.pop()
                println("одиночный выстрел")
            }

            is FireType.MachineGun -> repeat(fireType.queueSize) {
                println("выстрел ${ammoMagazine.pop()}")
            }
        }
        return Ammo.values()
    }


}