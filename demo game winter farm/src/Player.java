// đại diện cho người chơi
public class Player extends Mob {
    private int coin;
    private short level;
    Player (short health, short enegy, short dame, int coin, short level) {
        super(health, enegy, dame);
        this.coin = coin;
        this.level = level;
    }
    @Override
    public void setDame(short dame) {
        super.setDame(dame);
    }
    @Override
    public void setEnegy(short enegy) {
        super.setEnegy(enegy);
    }
    @Override
    public void setHealth(short health) {
        super.setHealth(health);
    }
    public void setCoin(int coin) {
        this.coin = coin;
    }
    public void setLevel(short level) {
        this.level = level;
    }
    @Override
    public short getDame() {
        return super.getDame();
    }
    @Override
    public short getEnegy() {
        return super.getEnegy();
    }
    @Override
    public short getHealth() {
        return super.getHealth();
    }
    public int getCoin() {
        return coin;
    }
    public short getLevel() {
        return level;
    }
}