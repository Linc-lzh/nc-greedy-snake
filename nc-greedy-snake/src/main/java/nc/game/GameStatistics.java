package nc.game;

import java.util.List;

public class GameStatistics {
    private int onlineCount;// 当前在线人数
    private long lastVersion;// 统计版本
    private List<IntegralInfo> rankingList;// 积分排行榜
    private IntegralInfo current;// 当前玩家积分

    public int getOnlineCount() {
        return onlineCount;
    }

    public void setOnlineCount(int onlineCount) {
        this.onlineCount = onlineCount;
    }

    public long getLastVersion() {
        return lastVersion;
    }

    public void setLastVersion(long lastVersion) {
        this.lastVersion = lastVersion;
    }

    public List<IntegralInfo> getRankingList() {
        return rankingList;
    }

    public void setRankingList(List<IntegralInfo> rankingList) {
        this.rankingList = rankingList;
    }

    public IntegralInfo getCurrent() {
        return current;
    }

    public void setCurrent(IntegralInfo current) {
        this.current = current;
    }
}
