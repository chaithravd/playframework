package controllers;
import models.Shopping;
import play.*;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.items.*;
import play.data.*;
import views.html.items.edit;

import java.util.Set;

public class ShoppingCart extends Controller {

    //@Inject
    //private final FormFactory formFactory;

    public static Result index(){
        Set<Shopping> items = Shopping.allitems();
        return ok(views.html.items.index.render(items));
    }

    public static Result addItems() {
        //Form<Shopping> itemform = formFactory.form(Shopping.class);

        return ok(views.html.items.add.render() );
    }

    public static Result saveItems() {
        Form<Shopping> itemsave = Form.form(Shopping.class).bindFromRequest();
        Shopping items = itemsave.get();
        Shopping.add(items);
        return redirect(routes.ShoppingCart.index());
    }

    public static Result editItems(Integer id){

        Shopping items = Shopping.findById(id);
        if(items==null){
            return notFound("item not found");
        }
        Form<Shopping> itemedit = Form.form(Shopping.class).fill(items);   //fill method not working
        return ok(edit.render(itemedit));
    }

    public static Result changeItems(String s){
        Form<Shopping> itemedit = Form.form(Shopping.class).bindFromRequest();
        Shopping items = itemedit.get();
        Shopping olditem = Shopping.findById(items.id);
        if(olditem==null){
            return notFound("item not present in the cart to edit");
        }
        olditem.product = items.product;
        olditem.price = items.price;
        olditem.manufacturer = items.manufacturer;
        return redirect(routes.ShoppingCart.index());
    }

    public static Result deleteItems(Integer id){
        Shopping item = Shopping.findById(id);
        if(item==null){
            return notFound("item not found");
        }
        Shopping.remove(item);
        return redirect(routes.ShoppingCart.index());
    }

    public static Result showItems(Integer id){
        Shopping item = Shopping.findById(id);
        if(item==null){
            return notFound("Item not in cart");
        }
        return ok(views.html.items.show.render(item));
    }

    public static Result checkform(String s){
        return ok(views.html.items.checkout.render());
    }

}
