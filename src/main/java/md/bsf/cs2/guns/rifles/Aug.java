package md.bsf.cs2.guns.rifles;

import md.bsf.cs2.behavior.Zoomable;

public class Aug extends Rifle implements Zoomable {

    public Aug() {
        super("AUG", 3300, 28, 30);
    }

    @Override
    public int getMoveSpeed() {
        return 220;
    }

    @Override
    public void zoom() {
        System.out.println(getName() + ": zoom x2");
    }
}
