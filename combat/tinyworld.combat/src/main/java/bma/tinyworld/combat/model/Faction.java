package bma.tinyworld.combat.model;

import java.util.List;

import bma.common.langutil.core.ToStringUtil;

public class Faction {

	private List<FactionRelation> relations;

	public List<FactionRelation> getRelations() {
		return relations;
	}

	public void setRelations(List<FactionRelation> relations) {
		this.relations = relations;
	}

	@Override
	public String toString() {
		return ToStringUtil.fieldReflect(this);
	}
}
