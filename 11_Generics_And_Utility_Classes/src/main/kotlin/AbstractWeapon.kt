abstract class AbstractWeapon(var maxAmmo: Int, var fireType: FireType) {



    abstract var ammoMagazine: Stack<Int>

    open val isLoaded : Boolean = false
       //get() =

   open fun getBullet(ammotype: Ammo):Ammo{
       // val ammo:Ammo
        return ammotype
    }

    open fun reloadWeapon(ammoType:Ammo){

        ammoMagazine.push(4)

    }
    abstract fun getAmmo()

}