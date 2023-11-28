public class Mob {
    private short health;
    private short enegy;
    private short dame;
    public Mob(short health, short enegy, short dame) {
        this.health = health;
        this.enegy = enegy;
        this.dame = dame;
    }
    public void setDame(short dame) {
        this.dame = dame;
    }
    public void setEnegy(short enegy) {
        this.enegy = enegy;
    }
    public void setHealth(short health) {
        this.health = health;
    }
    public short getDame() {
        return dame;
    }
    public short getEnegy() {
        return enegy;
    }
    public short getHealth() {
        return health;
    }
}
