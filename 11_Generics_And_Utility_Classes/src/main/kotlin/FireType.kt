sealed class FireType {

    object singleShot : FireType() {
        var singleShot = 1
    }

    data class machineGun(var queueSize: Int) : FireType() {
        val longShot = queueSize

    }

}