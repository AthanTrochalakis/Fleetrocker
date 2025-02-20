/**Interface to base any Character (Enemy/Player)
 *
 */
public interface Character{

    /**Use to deal an amount of damage to Character
     * @param damage Amount of damage to deal
     * @return New health amount
     */
    public int dealDamage(int damage);
    /**Add health to charicter without going over max
     * @param health amount of health to gain if not over maximum
     * @return The new health amount
     */
    public int regenerate(int health);
    
    /**Gets the amount of health a charicter has
     * @return Amount of health
     */
    public int getHealth();
    /**Use to set a new heath value
     * @param health New health value
     */
    public void setHealth(int health);

    /**Returns the damage a charicter can do
     * @return int Damage value
     */
    public int getDamage();
    /**Use to set the damage a charicter can do
     * @param dmage Damage value
     */
    public void setDamage(int damage);

    /** Returns speed value of charicter
     *  @return Speed of charicter
     */
    //public int getSpeed();
    /** Use to set the speed of a charicter
     *  @param speed Speed value
     */
    //public void setSpeed(int speed);

    
    //This is incompleet and may change depending on how we implement this
    //leaving blank to continue working on player and enemy classes without
    //needing this.
    
    //public int getHitbox();
    //public void setHitbox(int);
}
