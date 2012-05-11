package bma.tinyworld.combat.model;

import java.util.List;
import java.util.Map;

import bma.common.langutil.core.ToStringUtil;

/**
 * Combat局
 * 
 * @author guanzhong
 * 
 */
public class Game {

	/**
	 * 编号
	 */
	private String id;
	/**
	 * 回合
	 */
	private int round;
	/**
	 * 相关的阵营定义
	 */
	private Faction faction;

	/**
	 * 相关的Team定义
	 */
	private List<Team> teams;

	/**
	 * 上下文，用于同一个Game不同Round之间的参数传递
	 */
	private Map<String, Object> context;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getRound() {
		return round;
	}

	public void setRound(int round) {
		this.round = round;
	}

	public Faction getFaction() {
		return faction;
	}

	public void setFaction(Faction faction) {
		this.faction = faction;
	}

	public List<Team> getTeams() {
		return teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
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
