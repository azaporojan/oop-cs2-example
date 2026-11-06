package md.bsf.cs2;

import md.bsf.cs2.guns.pistols.DesertEagle;
import md.bsf.cs2.guns.pistols.Glock18;
import md.bsf.cs2.guns.snipers.Awp;
import md.bsf.cs2.player.Kill;
import md.bsf.cs2.player.Player;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Player zhenya = new Player(76561198000000001L, "zhenya", 800);
        Player lera = new Player(76561198000000002L, "lera", 800);

        zhenya.buy(new DesertEagle());
        lera.buy(new Glock18());

        while (lera.isAlive()) {
            zhenya.shoot(lera);
        }
        System.out.println(zhenya);
        System.out.println(lera);

        Player zhenyaAgain = new Player(76561198000000001L, "zhenya_reconnect", 800);
        Set<Player> scoreboard = new HashSet<>();
        scoreboard.add(zhenya);
        scoreboard.add(lera);
        scoreboard.add(zhenyaAgain);
        System.out.println("on scoreboard: " + scoreboard.size());
        System.out.println("players created: " + Player.getPlayersCreated());

        Kill kill = new Kill("zhenya", "lera", "Desert Eagle", false);
        System.out.println(kill);

        lera.buy(new Awp());
    }
}
