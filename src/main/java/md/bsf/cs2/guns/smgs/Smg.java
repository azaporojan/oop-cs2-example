package md.bsf.cs2.guns.smgs;

import md.bsf.cs2.guns.Gun;

public abstract class Smg extends Gun {

    protected Smg(String name, int price, int damage, int magSize) {
        super(name, price, damage, magSize);
    }

    @Override
    public boolean shoot() {      // burst: 3 bullets
        super.shoot();
        super.shoot();
        return super.shoot();
    }

    @Override
    public int getKillReward() {
        return 600;
    }
}
