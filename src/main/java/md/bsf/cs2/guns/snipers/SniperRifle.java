package md.bsf.cs2.guns.snipers;

import md.bsf.cs2.behavior.Zoomable;
import md.bsf.cs2.guns.Gun;

public abstract class SniperRifle extends Gun implements Zoomable {

    protected SniperRifle(String name, int price, int damage, int magSize) {
        super(name, price, damage, magSize);
    }

    @Override
    public void zoom() {
        System.out.println(getName() + ": zoom x4");
    }

    @Override
    public void inspect() {
        System.out.println(getName() + ": checks the scope");
    }

    @Override
    public int getMoveSpeed() {
        return 200;
    }

    @Override
    public int getKillReward() {
        return 300;
    }
}
