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

    @RequestMapping(value = "/recipe/{vegan}/{vegetarian}", method = RequestMethod.GET)
    public String recipeGetRecipeFromTags(Model model)
    {
        boolean myBooleanVariable = false;
        model.addAttribute("myBooleanVariable", recipeService.findByVegan(myBooleanVariable));
        //model.addAttribute("recipes",recipeService.findByVegetarian(vegetarian));
        return "Recipes";
    }

/*
    @RequestMapping(value = "/recipe/{vegan}", method = RequestMethod.GET)
    public String recipeGetRecipeFromTags(@PathVariable("vegan") Boolean vegan, Model model)
    {
        model.addAttribute("recipes", recipeService.findByVegan(vegan));
        return "Recipes";
    }

    @RequestMapping(value = "/recipe/{vegetarian}",method = RequestMethod.GET)
    public String recipeGetRecipeFromVegetarian(@PathVariable("vegetarian") Boolean vegetarian, Model model)
    {
        model.addAttribute("recipes",recipeService.findByVegetarian(vegetarian));
        return "Recipes";
    }

    @RequestMapping(value = "/recipe/{glutenfree}", method=RequestMethod.GET)
    public String recipeGetRecipeFromGlutenfree(@PathVariable("glutenfree") Boolean glutenfree, Model model)
    {
        model.addAttribute("recipes", recipeService.findByGlutenfree(glutenfree));
        return "Recipes";
    }

    @RequestMapping(value = "/recipe/{dairyfree}", method=RequestMethod.GET)
    public String recipeGetRecipeFromDairyfree(@PathVariable("dairyfree") Boolean dairyfree, Model model)
    {
        model.addAttribute("recipes",recipeService.findByDairyfree(dairyfree));
        return "Recipes";
    }

    @RequestMapping(value = "/recipe/{kosher}", method = RequestMethod.GET)
    public String recipeGetRecipeFromKosher(@PathVariable("kosher") Boolean kosher, Model model)
    {
        model.addAttribute("recipes", recipeService.findByKosher(kosher));
        return "Recipes";
    }

    @RequestMapping(value = "/recipe/{keto}", method = RequestMethod.GET)
    public String recipeGetRecipeFromKeto(@PathVariable("keto") Boolean keto, Model model)
    {
        model.addAttribute("recipes",recipeService.findByKeto(keto));
        return "Recipes";
    }

    @RequestMapping(value = "/recipe/{sugarfree}",method = RequestMethod.GET)
    public String recipeGetRecipeFromSugarfree( @PathVariable("sugarfree") Boolean sugarfree, Model model)
    {
        model.addAttribute("recipes",recipeService.findBySugarfree(sugarfree));
        return "Recipes";
    }

 */





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