package md.bsf.cs2.guns.snipers;

public class Awp extends SniperRifle {

    public Awp() {
        super("AWP", 4750, 115, 5);
    }

    @Override
    public void inspect() {
        System.out.println(getName() + ": spins the AWP");
    }

    @Override
    public int getKillReward() {    // exception: only $100
        return 100;
    }
}
