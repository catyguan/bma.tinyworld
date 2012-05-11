package bma.tinyworld.combat.model;

import java.util.Map;

import bma.common.langutil.core.ToStringUtil;

public class Equipment {

	public static final String TYPE_SKILL = "skill";
	public static final String TYPE_FEAT = "feat";
	public static final String TYPE_ITEM = "item";
	public static final String TYPE_WEAPON = "weapon";

	private String id;
	private String type;
	private Map<String, Object> data;

	@Override
	public String toString() {
		return ToStringUtil.fieldReflect(this);
	}
}
