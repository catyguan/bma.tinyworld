package bma.tinyworld.combat.model;

import java.util.List;

import bma.common.langutil.core.ToStringUtil;

public class Player {

	private String id;
	
	// start attribute
	private int level; // 等级
	private int health; // 体力
	private int focus; // 注意力

	private int power; // 力量
	// end attribute

	private List<Equipment> equipments;
	private String strategy;

	@Override
	public String toString() {
		return ToStringUtil.fieldReflect(this);
	}
}
