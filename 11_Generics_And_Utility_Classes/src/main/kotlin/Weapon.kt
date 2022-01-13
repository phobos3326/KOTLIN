class Weapon(maxAmmo: Int, fireType: FireType) : AbstractWeapon(maxAmmo, fireType) {

    override val ammoMagazine: Stack<Ammo>
        get() = super.ammoMagazine

    override val isLoaded: Boolean
        get()  {

            return if (ammoMagazine.isEmpty()) {
                println("пустой")
                false
            } else{
                println("полный")
                true
            }

        }

    override fun getBullet(ammoType: Ammo): Ammo {
        return super.getBullet(ammoType)
    }

    override fun reloadWeapon(ammoType: Ammo) {
        super.reloadWeapon(ammoType)
    }

    override fun getAmmo() {
        super.getAmmo()
    }


}