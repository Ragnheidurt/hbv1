package is.hi.hbv501g2021supportsession.Services.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import is.hi.hbv501g2021supportsession.Services.RecipeService;
import is.hi.hbv501g2021supportsession.Persistence.Entities.Recipe;
import is.hi.hbv501g2021supportsession.Persistence.Repositories.RecipeRepository;

import java.util.List;

@Service

public class RecipeServiceImplementation implements RecipeService {
    RecipeRepository repository;

    @Autowired
    public RecipeServiceImplementation(RecipeRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Recipe> findAll() {
        return repository.findAll();
    }

    /*@Override
    public Recipe findOne(long id) {
        return repository.findOne(id);
    }*/

    @Override
    public List<Recipe> findByName(String name) {
        return repository.findByName(name);
    }

    /*@Override
    public void sendRecipe(long id, String email) {
        //Eftir að implementa
        return;
    }*/
}


