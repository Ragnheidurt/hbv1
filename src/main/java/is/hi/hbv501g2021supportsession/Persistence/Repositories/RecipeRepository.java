package is.hi.hbv501g2021supportsession.Persistence.Repositories;

import org.springframework.data.jpa.repository.Query;
import is.hi.hbv501g2021supportsession.Persistence.Entities.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    List<Recipe> findAll();

    @Query(value = "Select * FROM recipe p WHERE p.id = ?1", nativeQuery = true)
    Recipe findOne(long id);

    List<Recipe> findByName(String name);

    List<Recipe> findByCategory(int category);

    @Query(value = "SELECT * FROM recipe p WHERE p.serves >= ?1 AND p.serves <= ?2", nativeQuery = true)
    List<Recipe> findByServes(int servesLow, int servesHigh);

    @Query(value = "SELECT * FROM recipe p WHERE p.price >= ?1 AND p.price <= ?2", nativeQuery = true)
    List<Recipe> findByPrice(int priceLow, int priceHigh);

    List<Recipe> findByVegan(boolean vegan);
    List<Recipe> findByVegetarian(boolean vegetarian);
    List<Recipe> findByGlutenfree(boolean glutenfree);
    List<Recipe> findByDairyfree(boolean dairyfree);
    List<Recipe> findByKosher(boolean kosher);
    List<Recipe> findBySugarfree(boolean sugarfree);

    //void sendRecipe(long id, String email);
}
