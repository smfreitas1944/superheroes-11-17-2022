package com.revature.dao;

import com.revature.model.Superhero;

public interface SuperHeroDao {
    // CRUD:
    Superhero save(Superhero superhero);

	boolean insertSuperhero(Superhero superhero, int id);
}
