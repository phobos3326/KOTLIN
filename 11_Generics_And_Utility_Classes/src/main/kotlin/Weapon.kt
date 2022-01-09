class Weapon : AbstractWeapon() {
    override var maxAmmo: Int
        get() = TODO("Not yet implemented")
        set(value) {}
    override var fireType: FireType
        get() = TODO("Not yet implemented")
        set(value) {}
    override var ammoMagazine: Stack<Int>
        get() = TODO("Not yet implemented")
        set(value) {}
    override var isLoaded: Boolean
        get() = TODO("Not yet implemented")
        set(value) {}

    override fun getBullet(): Ammo {
        return Ammo.THIRDBULLET
    }

    override fun reloadWeapon(): Stack<Int> {
        TODO("Not yet implemented")
    }


}