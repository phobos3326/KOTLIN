import kotlin.random.Random

enum class Ammo(var damage: Int, val criticalDamageChance: Int, var criticalDamageCoeff: Float) {


    BULLET(damage = 10, criticalDamageChance = 10, criticalDamageCoeff = 0.5f),
    SECONDBULLET(damage = 50, criticalDamageChance = 25, criticalDamageCoeff = 1.4f),
    THIRDBULLET(damage = 80, criticalDamageChance = 40, criticalDamageCoeff = 1f);

    private fun Int.isDamage(): Boolean {
        val randomValues = Random.nextInt(1, 100)
        return criticalDamageChance < randomValues

    }

    fun gettingCurrentDamage(): Int {

        return if (criticalDamageChance.isDamage()) {
            (damage * criticalDamageCoeff).toInt()
        } else {
            damage
        }
    }


}