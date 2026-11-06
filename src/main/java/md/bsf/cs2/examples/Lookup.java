package md.bsf.cs2.examples;

import md.bsf.cs2.behavior.Zoomable;
import md.bsf.cs2.guns.Gun;
import md.bsf.cs2.guns.rifles.Ak47;
import md.bsf.cs2.guns.rifles.Aug;
import md.bsf.cs2.guns.rifles.Rifle;
import md.bsf.cs2.guns.snipers.Awp;
import md.bsf.cs2.guns.snipers.Ssg08;

public class Lookup {

    public static void main(String[] args) {
        Gun awp = new Awp();
        Gun ssg = new Ssg08();
        Gun ak = new Ak47();
        Rifle aug = new Aug();
        Zoomable scope = new Ssg08();

        awp.inspect();                            // 1
        ssg.inspect();                            // 2
        ak.inspect();                             // 3
        System.out.println(awp.getMoveSpeed());   // 4
        System.out.println(ssg.getMoveSpeed());   // 5
        System.out.println(aug.getMoveSpeed());   // 6
        System.out.println(ak.getMoveSpeed());    // 7
        System.out.println(ssg.getKillReward());  // 8
        scope.zoom();                             // 9
        // aug.zoom();                         // 10 - does not compile: type Rifle has no zoom()
    }
}
