abstract class AbstractWeapon {

    abstract var maxAmmo: Int
    abstract var fireType: FireType
    abstract var ammoMagazine: Stack<Int>
    abstract var isLoaded:Boolean

    abstract fun getBullet():Ammo

    abstract fun reloadWeapon():Stack<Int>

}