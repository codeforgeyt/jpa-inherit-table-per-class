package com.codeforgeyt.jpainherittableperclass.repository;

import com.codeforgeyt.jpainherittableperclass.model.Spell;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public interface SpellRepository extends CrudRepository<Spell, Long> {
}
