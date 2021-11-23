package is.hi.hbv501g2021supportsession.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import is.hi.hbv501g2021supportsession.Persistence.Entities.Recipe;
import is.hi.hbv501g2021supportsession.Persistence.Repositories.RecipeRepository;
import is.hi.hbv501g2021supportsession.Services.RecipeService;

//samræma nöfn á controllerum
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

    @RequestMapping(value = "/recipe/{name}", method = RequestMethod.POST)
    public String recipeGetRecipeFromName(@PathVariable String name, Model model)
    {
        model.addAttribute("recipes", recipeService.findByName(name));
        model.addAttribute("recipe",new Recipe());
        return "Recipes";
    }

    @RequestMapping(value = "/recipe")
    public String method(Model model)
    {
        model.addAttribute("recipes", recipeService.findOne(1));
        return "Recipes";
    }

    //Get method en ekki post?
   /*@RequestMapping(value = "/recipe", method = RequestMethod.POST)
    public String recipeViewGet(Model model)
    {
        model.addAttribute("recipe", new Recipe());
        model.addAttribute("recipes", recipeService.findAll());
        return "Recipes";
    }*/

    /*@RequestMapping(value = "/recipe", method = RequestMethod.POST)
    public void sendRecipe(long id, String email)
    {
        //Ekki hugmynd
    }*/

}