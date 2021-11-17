package is.hi.hbv501g2021supportsession.Persistence.Entities;



import is.hi.hbv501g2021supportsession.Persistence.Entities.Tags;

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
    private Tags tags;
    private int serves;
    private int price;
    private int category;

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

    @Embedded
    public Tags getTags() {
        return tags;
    }
    public void setTags(Tags tags) {
        this.tags = tags;
    }
}