import java.util.Random;

public class King extends Character {
    private KickStrategy strategy = new RoyalStrategy();
    private RoyalSetter setter = new RoyalSetter();
    public King(){
        setter.setCharacter(this, 5, 15);
    }
    @Override
    void kick(Character c) {
        strategy.kick(this, c);
    }
}
