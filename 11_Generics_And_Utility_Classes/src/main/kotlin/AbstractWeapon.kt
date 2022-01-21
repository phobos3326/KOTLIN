abstract class AbstractWeapon(val maxAmmo: Int, val fireType: FireType) {

    val ammoMagazine: Stack<Ammo> = Stack()

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


    fun createAmmo(): Ammo {
        val ammoValue = Ammo.values()
        val rnd = (0 until Ammo.values().size).random()
        println(ammoValue[rnd])
        return ammoValue[rnd]
    }

    fun reloadWeapon() {
        repeat(maxAmmo) { ammoMagazine.push(createAmmo()) }
    }

    fun getAmmo(): Array<Ammo> {
        val fireType = FireType.SingleShot
        val fireType2 = FireType.MachineGun
        when(fireType){
            FireType.SingleShot -> ammoMagazine.pop()
            FireType.MachineGun -> ammoMagazine.pop()
        }

        repeat(maxAmmo) {
            println(ammoMagazine.pop())
        }
        return Ammo.values()
    }


}