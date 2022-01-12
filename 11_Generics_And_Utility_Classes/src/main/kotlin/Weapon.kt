class Weapon(maxAmmo: Int, fireType: FireType) : AbstractWeapon(maxAmmo, fireType) {

    override var ammoMagazine: Stack<Int>
        get() = TODO("Not yet implemented")
        set(value) {}

    override var isLoaded: Boolean
        get() = TODO("Not yet implemented")
        set(value) {}


      override fun getBullet(ammotype: Ammo): Ammo {
        return super.getBullet(ammotype)
    }

    override fun reloadWeapon(ammotype: Ammo) {

    }


    override fun getAmmo() {
        TODO("Not yet implemented")
    }


}