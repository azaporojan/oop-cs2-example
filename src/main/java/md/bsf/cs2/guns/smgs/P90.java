package md.bsf.cs2.guns.smgs;

public class P90 extends Smg {

    public P90() {
        super("P90", 2350, 26, 50);
    }

    @Override
    public int getKillReward() {    // exception: only $300
        return 300;
    }
}
