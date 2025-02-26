package nc.game;

public class IntegralInfo {

    private String accountId;
    private String gameName;
    private int dieIntegral = 0; // 死亡积分
    private int killIntegral = 0;// 击杀角色数
    private long lastVersion; // 对应版本

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getDieIntegral() {
        return dieIntegral;
    }

    public void setDieIntegral(int dieIntegral) {
        this.dieIntegral = dieIntegral;
    }

    public int getKillIntegral() {
        return killIntegral;
    }

    public void setKillIntegral(int killIntegral) {
        this.killIntegral = killIntegral;
    }

    public long getLastVersion() {
        return lastVersion;
    }

    public void setLastVersion(long lastVersion) {
        this.lastVersion = lastVersion;
    }
}
