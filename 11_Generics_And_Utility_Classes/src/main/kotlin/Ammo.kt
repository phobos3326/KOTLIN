enum class Ammo(var damage: Int, var damageChance: Float, var criticalDamageCoeff: Float) {

    BULLET(damage = 10, damageChance = 0.5f, criticalDamageCoeff = 0.5f),
    SECONDBULLET(damage = 50, damageChance = 0.8f, criticalDamageCoeff = 0.8f),
    THIRDBULLET(damage = 80, damageChance = 1f, criticalDamageCoeff = 1f);

    fun gettingCurrentDamage(): Float {
        return damage * damageChance
    }

}