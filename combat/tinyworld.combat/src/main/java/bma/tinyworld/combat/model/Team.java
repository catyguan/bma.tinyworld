package bma.tinyworld.combat.model;

import java.util.List;

import bma.common.langutil.core.ToStringUtil;

public class Team {

	private String faction;
	private List<Player> players;

	public String getFaction() {
		return faction;
	}

	public void setFaction(String faction) {
		this.faction = faction;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	@Override
	public String toString() {
		return ToStringUtil.fieldReflect(this);
	}
}
