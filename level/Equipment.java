public class Equipment{
    //add this to the damage of player
    public int damageMod;

    /**Constructor for equipment class, use to set damage that equipment can do.
     * @param damageMod the amount of extra damage a player can do with this equipment
     */
    public Equipment(int damageMod){
	this.damageMod = damageMod;
    }

    /**method to change the damage mod for this equipment
     * @param damagemod the amount of extra damage a player can do
     */
    public void setDamageMod(int damageMod){
	this.damageMod = damageMod;
    }
}
