package bma.tinyworld.combat.model;

import bma.common.langutil.core.ToStringUtil;

public class FactionRelation {

	public static final String FR_ALLIANCE = "alliance";
	public static final String FR_FRIEND = "friend";
	public static final String FR_NEUTRAL = "neutral";
	public static final String FR_HOSTILE = "hostile";
	public static final String FR_ENEMY = "enemy";

	private String type;
	private String source;
	private String target;
	private boolean both;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public boolean isBoth() {
		return both;
	}

	public void setBoth(boolean both) {
		this.both = both;
	}

	@Override
	public String toString() {
		return ToStringUtil.fieldReflect(this);
	}

}
