abstract class AbstractWeapon(val maxAmmo: Int, val fireType: FireType) {

    open val ammoMagazine: Stack<Ammo> = Stack()

    abstract val isLoaded: Boolean


    abstract fun createAmmo(ammoType: Ammo): Ammo
   /* {
        return ammoType
    }
*/

   /* open fun enumRnd():Ammo{
        Ammo.values()
        return a
    }*/



    open fun ammoRND(): Ammo {
        val ammoValue = Ammo.values()
        val rnd = (0 until Ammo.values().size).random()
        println(ammoValue[rnd])
        return ammoValue[rnd]
    }

    open fun reloadWeapon() {




    }

    abstract fun getAmmo()

}