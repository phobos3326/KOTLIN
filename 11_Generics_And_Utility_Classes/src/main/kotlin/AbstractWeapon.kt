abstract class AbstractWeapon(var maxAmmo: Int, var fireType: FireType) {



    open val ammoMagazine: Stack<Ammo> = Stack()

    open val isLoaded : Boolean = false


   open fun getBullet(ammotype: Ammo):Ammo{

        return ammotype
    }

    open fun reloadWeapon(ammoType:Ammo){

        ammoMagazine.push(ammoType)

    }


    open fun getAmmo(){

    }

}