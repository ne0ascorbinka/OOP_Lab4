import java.util.Random;

public class Knight extends Character {
    private KickStrategy strategy = new RoyalStrategy();
    private RoyalSetter setter = new RoyalSetter();
    public Knight(){
        setter.setCharacter(this, 2, 12);
    }

    @Override
    void kick(Character c) {
        strategy.kick(this, c);
    }
}

