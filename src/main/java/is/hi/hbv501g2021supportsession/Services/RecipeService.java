package is.hi.hbv501g2021supportsession.Services;

import is.hi.hbv501g2021supportsession.Persistence.Entities.Recipe;

import java.util.List;

public interface RecipeService {
    List<Recipe> findAll();
    Recipe findOne(long id);
    List<Recipe> findByName(String name);
    List<Recipe> findByCategory(int category);
    List<Recipe> findByServes(int servesLow, int servesHigh);
    List<Recipe> findByPrice(int priceLow, int priceHigh);
    List<Recipe> findByVegan(boolean vegan);
    List<Recipe> findByVegetarian(boolean vegetarian);
    List<Recipe> findByGlutenfree(boolean glutenfree);
    List<Recipe> findByDairyfree(boolean dairyfree);
    List<Recipe> findByKosher(boolean kosher);
    List<Recipe> findBySugarfree(boolean sugarfree);
    List<Recipe> findByKeto(boolean keto);
    //void sendRecipe(long id, String email);*/
}