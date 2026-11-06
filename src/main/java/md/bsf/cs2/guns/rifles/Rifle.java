package md.bsf.cs2.guns.rifles;

import md.bsf.cs2.guns.Gun;

public abstract class Rifle extends Gun {

    protected Rifle(String name, int price, int damage, int magSize) {
        super(name, price, damage, magSize);
    }

    @Override
    public int getMoveSpeed() {
        return 215;
    }

    @Override
    public int getKillReward() {
        return 300;
    }
}
