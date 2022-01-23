sealed class FireType {

    object SingleShot : FireType()

    data class MachineGun(val queueSize: Int) : FireType()

}