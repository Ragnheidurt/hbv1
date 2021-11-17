package is.hi.hbv501g2021supportsession.Persistence.Entities;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//generated value?
@Embeddable
public class Tags {

    @Id
    private int id;
    private boolean vegan;
    private boolean vegetarian;
    private boolean glutenfree;
    private boolean dairyfree;
    private boolean kosher;
    private boolean keto;
    private boolean sugarfree;


    public void setId(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return id;
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
