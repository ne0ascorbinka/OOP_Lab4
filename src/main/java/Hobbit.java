public class Hobbit extends Character{
    public Hobbit(){
        setPower(0);
        setHp(3);
    }

    protected void toCry(){
        System.out.println("*crying*");
    }

    @Override
    void kick(Character c) {
        toCry();
    }
}

