package models;

import java.util.HashSet;
import java.util.Set;

public class Shopping {

    public Integer id;
    public String product;
    public Integer price;
    public String manufacturer;

    public Shopping(){

    }


    public Shopping(Integer id, String product, Integer price, String manufacturer){
        this.id = id;
        this.product = product;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    private static Set<Shopping> items;

    static{                                 // to initialize item storage
        items = new HashSet<>();
        items.add(new Shopping(1, "Top", 1500, "W"));
        items.add(new Shopping(2, "Trousers", 1000, "W"));
    }

    public static Set<Shopping> allitems(){
        return items;
    }

    public static Shopping findById(Integer id){
        for(Shopping item : items){
            if(id.equals(item.id)){
                return item;
            }
        }
        return null;
    }

    public static void add(Shopping item){
        items.add(item);
    }

    public static boolean remove(Shopping item){
        return items.remove(item);
    }

}
