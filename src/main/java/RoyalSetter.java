import java.util.Random;

public class RoyalSetter extends Setter{
    public void setCharacter(Character c, int origin, int bound){
        Random rd = new Random();
        int hp = origin + rd.nextInt(bound + 1);
        c.setHp(hp);
        int power = origin + rd.nextInt(bound + 1);
        c.setPower(power);
    }

    @Override
    void setCharacter(Character c) {
        setCharacter(c, 0, 1);
    }
}
