abstract class AbstractWeapon(val maxAmmo: Int, val fireType: FireType) {

    private var ammoMagazine: Stack<Ammo> = Stack()

    val isLoaded: Boolean
        get() = !ammoMagazine.isEmpty()

    abstract fun createAmmo(): Ammo


    fun reloadWeapon() {
        val magazine = Stack<Ammo>()
        repeat(maxAmmo)
        {
            magazine.push(createAmmo())
        }
        ammoMagazine = magazine
    }

    fun getAmmo(): Array<Ammo> {
        if (isLoaded) {
            println("еще есть патроны")
        } else {
            reloadWeapon()
            println("--> заряжен <--")
        }
        when (fireType) {
            FireType.SingleShot -> {
                ammoMagazine.pop()
                println("одиночный выстрел")
            }
            is FireType.MachineGun -> repeat(fireType.queueSize) {
                println("выстрел ${ammoMagazine.pop()}")
            }
        }
        return Ammo.values()
    }


}