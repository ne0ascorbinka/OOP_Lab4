public abstract class Character {
    private int hp, power;
    abstract void kick(Character c);

    boolean isAlive() {
        return this.getHp() > 0;
    }

    public void setHp(int hp) {
        this.hp = Math.max(0, hp);
    }

    public void setPower(int power) {
        this.power = Math.max(0, power);
    }

    public int getHp() {
        return hp;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return getClass().getName() + "{" +
                "hp=" + hp +
                ", power=" + power +
                '}';
    }
}

