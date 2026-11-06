package md.bsf.cs2.examples;

public class Procedural {

    public static void main(String[] args) {
        String deagleName = "Desert Eagle";
        int deagleAmmo = 7;
        int deagleMag = 7;

        String akName = "AK-47";
        int akAmmo = 30;

        deagleAmmo = shoot(deagleName, deagleAmmo);
        deagleAmmo = shoot(deagleName, deagleAmmo);
        akAmmo = shoot(akName, akAmmo);

        deagleAmmo = 999;   // nothing stops us
        System.out.println(deagleName + " ammo: " + deagleAmmo + "/" + deagleMag);
    }

    static int shoot(String name, int ammo) {
        if (ammo == 0) {
            System.out.println(name + ": *click*");
            return 0;
        }
        System.out.println(name + ": bang! " + (ammo - 1));
        return ammo - 1;
    }
}
