package is.hi.hbv501g2021supportsession.Services;

import is.hi.hbv501g2021supportsession.Persistence.Entities.Recipe;
//import is.hi.hbv501g2021supportsession.Persistence.Entities.Tags;

import java.util.List;

public interface RecipeService {
    List<Recipe> findAll();
    //Recipe findOne(long id);
    List<Recipe> findByName(String name);
    //List<Recipe> findByTags(int tagId, int serves, int priceLow, int priceHigh, int category);
    //void sendRecipe(long id, String email);*/
}