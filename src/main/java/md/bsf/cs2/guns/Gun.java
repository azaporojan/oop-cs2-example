package md.bsf.cs2.guns;

import md.bsf.cs2.behavior.Reloadable;
import md.bsf.cs2.behavior.Shootable;

public abstract class Gun implements Shootable, Reloadable {

    private final String name;
    private final int price;
    private final int damage;
    private final int magSize;
    private int ammo;

    protected Gun(String name, int price, int damage, int magSize) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name must not be blank");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be > 0: " + price);
        }
        if (damage <= 0) {
            throw new IllegalArgumentException("Damage must be > 0: " + damage);
        }
        if (magSize <= 0) {
            throw new IllegalArgumentException("Magazine size must be > 0: " + magSize);
        }
        this.name = name;
        this.price = price;
        this.damage = damage;
        this.magSize = magSize;
        this.ammo = magSize;
    }

    @Override
    public boolean shoot() {
        if (ammo == 0) {
            System.out.println(name + ": *click* - reload!");
            return false;
        }
        ammo--;
        System.out.println(name + ": bang! [" + ammo + "/" + magSize + "]");
        return true;
    }

    @Override
    public void reload() {
        ammo = magSize;
        System.out.println(name + ": reloaded [" + ammo + "/" + magSize + "]");
    }

    public void inspect() {
        System.out.println(name + ": looks at the gun");
    }

    public int getMoveSpeed() {
        return 250;
    }

    public abstract int getKillReward();

    public String getName() { return name; }
    public int getPrice() { return price; }
    public int getDamage() { return damage; }
    public int getAmmo() { return ammo; }
}
