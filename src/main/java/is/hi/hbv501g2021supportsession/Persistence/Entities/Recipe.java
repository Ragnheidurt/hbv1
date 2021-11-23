package is.hi.hbv501g2021supportsession.Persistence.Entities;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    private String instructions;
    private int serves;
    private int price;
    private int category;
    private boolean vegan;
    private boolean vegetarian;
    private boolean glutenfree;
    private boolean dairyfree;
    private boolean kosher;
    private boolean keto;
    private boolean sugarfree;

    //Getters & Setters
    public long getID() {
        return id;
    }
    public void setID(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public void setServes(int serves)
    {
        this.serves = serves;
    }

    public int getServes()
    {
        return serves;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public int getPrice()
    {
        return price;
    }

    public void setcategory(int category)
    {
        this.category = category;
    }

    public int getCategory()
    {
        return category;
    }

    public void setVegan(boolean vegan)
    {
        this.vegan = vegan;
    }

    public boolean getVegan()
    {
        return vegan;
    }

    public void setVegetarian(boolean vegetarian)
    {
        this.vegetarian = vegetarian;
    }

    public boolean getVegetarian()
    {
        return vegetarian;
    }

    public void setGlutenfree(boolean glutenfree)
    {
        this.glutenfree = glutenfree;
    }

    public boolean getGlutenfree()
    {
        return glutenfree;
    }

    public void setDairyfree(boolean dairyfree)
    {
        this.dairyfree = dairyfree;
    }

    public boolean getDairyfree()
    {
        return dairyfree;
    }

    public void setKosher(boolean kosher)
    {
        this.kosher = kosher;
    }

    public boolean getKosher()
    {
        return kosher;
    }

    public void setKeto(boolean keto)
    {
        this.keto = keto;
    }

    public boolean getKeto()
    {
        return keto;
    }

    public void setSugarfree(boolean sugarfree)
    {
        this.sugarfree = sugarfree;
    }

    public boolean getSugarfree()
    {
        return sugarfree;
    }

}