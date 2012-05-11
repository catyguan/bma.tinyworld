package bma.tinyworld.combat.model;

import java.util.List;
import java.util.Map;

import bma.common.langutil.core.ToStringUtil;

/**
 * 结果
 * 
 * @author guanzhong
 * 
 */
public class Result {

	private String gameId;
	private boolean end;
	private List<Player> playerInfos;
	private Map<String, Object> context;

	public String getGameId() {
		return gameId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	public boolean isEnd() {
		return end;
	}

	public void setEnd(boolean end) {
		this.end = end;
	}

	public List<Player> getPlayerInfos() {
		return playerInfos;
	}

	public void setPlayerInfos(List<Player> playerInfos) {
		this.playerInfos = playerInfos;
	}

	public Map<String, Object> getContext() {
		return context;
	}

	public void setContext(Map<String, Object> context) {
		this.context = context;
	}

	@Override
	public String toString() {
		return ToStringUtil.fieldReflect(this);
	}
}
