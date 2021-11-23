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

    @Override
    public Recipe findOne(long id) {
        return repository.findOne(id);
    }

    @Override
    public List<Recipe> findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public List<Recipe> findByCategory(int category){
        return repository.findByCategory(category);
    }

    @Override
    public List<Recipe> findByServes(int servesLow, int servesHigh){
        return repository.findByServes(servesLow, servesHigh);
    }

    @Override
    public List<Recipe> findByPrice(int priceLow, int priceHigh){
        return repository.findByPrice(priceLow, priceHigh);
    }

    @Override
    public List<Recipe> findByVegan(boolean vegan){
        return repository.findByVegan(vegan);
    }

    @Override
    public List<Recipe> findByVegetarian(boolean vegetarian){
        return repository.findByVegetarian(vegetarian);
    }

    @Override
    public List<Recipe> findByGlutenfree(boolean glutenfree){
        return repository.findByGlutenfree(glutenfree);
    }

    @Override
    public List<Recipe> findByDairyfree(boolean dairyfree){
        return repository.findByDairyfree(dairyfree);
    }

    @Override
    public List<Recipe> findByKosher(boolean kosher){
        return repository.findByKosher(kosher);
    }

    @Override
    public List<Recipe> findBySugarfree(boolean sugarfree){
        return repository.findBySugarfree(sugarfree);
    }

    /*@Override
    public void sendRecipe(long id, String email) {
        //Eftir að implementa
        return;
    }*/
}


