package is.hi.hbv501g2021supportsession.Persistence.Repositories;

import org.springframework.data.jpa.repository.Query;
import is.hi.hbv501g2021supportsession.Persistence.Entities.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import is.hi.hbv501g2021supportsession.Persistence.Entities.Tags;

import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    List<Recipe> findAll();

    //@Query(value = "Select p FROM recipe p WHERE p.id = 1")
    //Recipe findOne(long id);

    //@Query(value = "SELECT p FROM recipe p WHERE p.name = 'test'")
    List<Recipe> findByName(String name);

    //@Query(value = "SELECT p FROM Recipe p WHERE p.tags = ?1 AND p.serves = ?2 AND p.price >= ?3 AND p.price <= ?4 AND p.category = ?5")
    //List<Recipe> findByTags(int tagId, int serves, int priceLow, int priceHigh, int category);

    //void sendRecipe(long id, String email);*/
}
