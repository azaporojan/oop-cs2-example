package md.bsf.cs2.guns.pistols;

import md.bsf.cs2.guns.Gun;

public abstract class Pistol extends Gun {

    protected Pistol(String name, int price, int damage, int magSize) {
        super(name, price, damage, magSize);
    }

    @Override
    public int getKillReward() {
        return 300;
    }
}
