sealed class FireType {

    object SingleShot : FireType()

    data class MachineGun(var queueSize: Int) : FireType()

}