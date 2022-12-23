import java.util.Random;

public class RoyalStrategy extends KickStrategy{
    public void kick(Character c1, Character c2){
        Random rd = new Random();
        int damage = rd.nextInt(c1.getPower() + 1);
        c2.setHp(c2.getHp() - damage);
    }
}
