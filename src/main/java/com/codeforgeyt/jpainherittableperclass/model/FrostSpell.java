package com.codeforgeyt.jpainherittableperclass.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "FROST_SPELL")
public class FrostSpell extends Spell {
    private boolean freezing;
    private Integer freezeDuration;

    public FrostSpell() {
    }

    public FrostSpell(String name, Integer energyCost,
                      Integer damage, boolean freezing,
                      Integer freezeDuration) {
        super(name, energyCost, damage);
        this.freezing = freezing;
        this.freezeDuration = freezeDuration;
    }
}
