public class GameManager {
    public void fight(Character c1, Character c2){
        while (c1.isAlive() && c2.isAlive()){
            c1.kick(c2);
            Character c = c1;
            c1 = c2;
            c2 = c;
        }
    }
}
