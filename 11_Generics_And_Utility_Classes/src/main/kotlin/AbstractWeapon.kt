abstract class AbstractWeapon(var maxAmmo: Int, var fireType: FireType) {

    open val ammoMagazine: Stack<Ammo> = Stack()
    open val isLoaded: Boolean = false

    open fun getBullet(ammoType: Ammo): Ammo {

        return ammoType
    }



    open fun reloadWeapon(ammoType: Ammo) {

        ammoMagazine.push(ammoType)

    }




    open fun getAmmo() {

    }

}