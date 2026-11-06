package md.bsf.cs2.guns.shotguns;

import md.bsf.cs2.guns.Gun;

public abstract class Shotgun extends Gun {

    private final int pellets;

    protected Shotgun(String name, int price, int damage, int magSize, int pellets) {
        super(name, price, damage, magSize);
        if (pellets <= 0) {
            throw new IllegalArgumentException("Pellets must be > 0: " + pellets);
        }
        this.pellets = pellets;
    }

    @Override
    public int getDamage() {      // point blank: every pellet hits
        return super.getDamage() * pellets;
    }

    @Override
    public int getKillReward() {
        return 900;
    }
}
