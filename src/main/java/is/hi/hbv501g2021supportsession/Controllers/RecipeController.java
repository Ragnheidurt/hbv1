package is.hi.hbv501g2021supportsession.Controllers;

import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import is.hi.hbv501g2021supportsession.Persistence.Entities.Recipe;
import is.hi.hbv501g2021supportsession.Persistence.Repositories.RecipeRepository;
import is.hi.hbv501g2021supportsession.Services.RecipeService;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Controller

public class RecipeController
{
    RecipeService recipeService;

    @Autowired
    public RecipeController(RecipeService recipeService)
    {
        this.recipeService = recipeService;
    }

    @RequestMapping(value = "/")
    public String homeController()
    {
        return "index";
    }

    @RequestMapping(value = "/recipes/{name}", method = RequestMethod.GET)
    public String recipeGetRecipeFromName(@PathVariable("name") String name, Model model)
    {
        model.addAttribute("recipe", recipeService.findByName(name));
        //model.addAttribute("recipe",new Recipe());
        return "instructions";
    }

    @RequestMapping(value = "/recipe/{a}", method = RequestMethod.GET)
    public String method(@PathVariable("a") int a, Model model)
    {
        model.addAttribute("recipes", recipeService.findByCategory(a));
        return "Recipes";
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String searchName(Model model, @Param("keyword") String keyword) {
        if(keyword!=null) {
            model.addAttribute("recipes", recipeService.findByName(keyword));
            model.addAttribute("keyword", keyword);
        } else {
            List<Recipe> list = recipeService.findAll();
            model.addAttribute("recipes", recipeService.findAll());
        }
        return "Recipes";
    }

    @RequestMapping(value = "/findbyprice", method = RequestMethod.GET)
    public String findByPrice(Model model, @Param("pricelow") int pricelow, @Param("pricehigh") int pricehigh)
    {
        model.addAttribute("recipes", recipeService.findByPrice(pricelow, pricehigh));
        model.addAttribute("pricelow", pricelow);
        model.addAttribute("pricehigh", pricehigh);
        return "Recipes";
    }

    @RequestMapping(value = "/findbyserves", method = RequestMethod.GET)
    public String findByServes(Model model, @Param("serves1") int serves1, @Param("serves2") int serves2)
    {
        model.addAttribute("recipes", recipeService.findByServes(serves1,serves2));
        model.addAttribute("serves1", serves1);
        model.addAttribute("serves2",serves2);

        return "Recipes";
    }

    @RequestMapping(value = "/recipe1/{vegan}", method = RequestMethod.GET)
    public String recipeGetRecipeFromVegan(@PathVariable("vegan") Boolean vegan, Model model)
    {
        model.addAttribute("recipes", recipeService.findByVegan(vegan));
        return "Recipes";
    }

    @RequestMapping(value = "/recipe2/{vegetarian}",method = RequestMethod.GET)
    public String recipeGetRecipeFromVegetarian(@PathVariable("vegetarian") Boolean vegetarian, Model model)
    {
        model.addAttribute("recipes",recipeService.findByVegetarian(vegetarian));
        return "Recipes";
    }

    @RequestMapping(value = "/recipe3/{glutenfree}", method=RequestMethod.GET)
    public String recipeGetRecipeFromGlutenfree(@PathVariable("glutenfree") Boolean glutenfree, Model model)
    {
        model.addAttribute("recipes", recipeService.findByGlutenfree(glutenfree));
        return "Recipes";
    }

    @RequestMapping(value = "/recipe4/{dairyfree}", method=RequestMethod.GET)
    public String recipeGetRecipeFromDairyfree(@PathVariable("dairyfree") Boolean dairyfree, Model model)
    {
        model.addAttribute("recipes",recipeService.findByDairyfree(dairyfree));
        return "Recipes";
    }

    @RequestMapping(value = "/recipe5/{kosher}", method = RequestMethod.GET)
    public String recipeGetRecipeFromKosher(@PathVariable("kosher") Boolean kosher, Model model)
    {
        model.addAttribute("recipes", recipeService.findByKosher(kosher));
        return "Recipes";
    }

    @RequestMapping(value = "/recipe6/{keto}", method = RequestMethod.GET)
    public String recipeGetRecipeFromKeto(@PathVariable("keto") Boolean keto, Model model)
    {
        model.addAttribute("recipes",recipeService.findByKeto(keto));
        return "Recipes";
    }

    @RequestMapping(value = "/recipe7/{sugarfree}",method = RequestMethod.GET)
    public String recipeGetRecipeFromSugarfree( @PathVariable("sugarfree") Boolean sugarfree, Model model)
    {
        model.addAttribute("recipes",recipeService.findBySugarfree(sugarfree));
        return "Recipes";
    }


    /*@RequestMapping(value = "/recipe", method = RequestMethod.POST)
    public void sendRecipe(long id, String email)
    {
        //Ekki hugmynd
    }*/

}