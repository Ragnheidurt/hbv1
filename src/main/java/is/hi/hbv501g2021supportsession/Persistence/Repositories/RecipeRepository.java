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

    //@Query(value = "SELECT p FROM recipe p WHERE p.name = 'test'")
    List<Recipe> findByName(String name);

    //void sendRecipe(long id, String email);*/
}
