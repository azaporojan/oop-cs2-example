package md.bsf.cs2.player;

import md.bsf.cs2.guns.Gun;

public class Player {

    public static final int MAX_MONEY = 16000;
    private static int playersCreated = 0;

    private final long steamId;
    private String nickname;
    private int money;
    private int hp = 100;
    private Gun gun;

    public Player(long steamId, String nickname, int money) {
        this.steamId = steamId;
        setNickname(nickname);
        setMoney(money);
        playersCreated++;
    }

    public void setNickname(String nickname) {
        if (nickname == null || nickname.isBlank() || nickname.length() > 32) {
            throw new IllegalArgumentException("Nickname must be 1-32 characters: " + nickname);
        }
        this.nickname = nickname;
    }

    private void setMoney(int money) {
        if (money < 0 || money > MAX_MONEY) {
            throw new IllegalArgumentException("Money must be 0-" + MAX_MONEY + ": " + money);
        }
        this.money = money;
    }

    public void buy(Gun g) {
        if (g.getPrice() > money) {
            throw new IllegalArgumentException(nickname + " can't afford " + g.getName() + ": $" + money);
        }
        setMoney(money - g.getPrice());
        gun = g;
        System.out.println(nickname + " bought " + g.getName() + ", $" + money + " left");
    }

    public void shoot(Player target) {
        if (gun != null && gun.shoot()) {
            target.takeDamage(gun.getDamage());
            if (!target.isAlive()) {
                setMoney(Math.min(MAX_MONEY, money + gun.getKillReward()));
                System.out.println(nickname + " [" + gun.getName() + "] " + target.nickname
                        + "  +$" + gun.getKillReward());
            }
        }
    }

    public void takeDamage(int damage) {
        if (damage <= 0) {
            throw new IllegalArgumentException("Damage must be > 0: " + damage);
        }
        hp = Math.max(0, hp - damage);
        System.out.println("  " + nickname + " hp: " + hp);
    }

    public boolean isAlive() { return hp > 0; }
    public long getSteamId() { return steamId; }
    public String getNickname() { return nickname; }
    public int getMoney() { return money; }
    public int getHp() { return hp; }
    public static int getPlayersCreated() { return playersCreated; }

    @Override
    public String toString() {
        return "Player{nickname='" + nickname + "', hp=" + hp + ", money=" + money + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Player other)) {
            return false;
        }
        return steamId == other.steamId;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(steamId);
    }
}
