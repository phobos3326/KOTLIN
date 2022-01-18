class Weapon(maxAmmo: Int, fireType: FireType) : AbstractWeapon(maxAmmo, fireType) {

    override val ammoMagazine: Stack<Ammo>
        get() = super.ammoMagazine

    override val isLoaded: Boolean
        get() {
            return if (ammoMagazine.isEmpty()) {
                println("пустой")
                false
            } else {
                println("полный")
                true
            }
        }

    override fun ammoRND(): Ammo {
        return super.ammoRND()
    }

    override fun createAmmo(ammoType: Ammo): Ammo {
        TODO("Not yet implemented")
    }

    /*override fun createAmmo(ammoType: Ammo): Ammo {
        return createAmmo(ammoType)
    }*/

    /* override fun reloadWeapon() {
         //super.reloadWeapon(ammoType)
         ammoRND()
     }*/

    override fun reloadWeapon() {
        repeat(maxAmmo) { ammoMagazine.push(ammoRND()) }

    }

    override fun getAmmo() {
        repeat(maxAmmo){
          println(ammoMagazine.pop())   }

    }


}