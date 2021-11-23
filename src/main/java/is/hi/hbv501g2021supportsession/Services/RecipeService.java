package is.hi.hbv501g2021supportsession.Services;

import is.hi.hbv501g2021supportsession.Persistence.Entities.Recipe;

import java.util.List;

public interface RecipeService {
    List<Recipe> findAll();
    Recipe findOne(long id);
    List<Recipe> findByName(String name);
    //void sendRecipe(long id, String email);*/
}