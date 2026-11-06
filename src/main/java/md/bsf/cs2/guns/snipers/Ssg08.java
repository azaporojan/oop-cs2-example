package md.bsf.cs2.guns.snipers;

public class Ssg08 extends SniperRifle {

    public Ssg08() {
        super("SSG 08", 1700, 88, 10);
    }

    @Override
    public int getMoveSpeed() {
        return 230;
    }
}
