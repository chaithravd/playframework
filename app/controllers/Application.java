package controllers;

import play.*;
import play.mvc.*;

import views.html.*;
import views.formdata.Register;
import play.data.Form;
import views.html.registers;


public class Application extends Controller {

    public static Result index()
    {
        return ok(index.render("Your new application is ready."));
    }

    public static Result newRegister(){
        Form<Register> formData = Form.form(Register.class);
        return ok(registers.render(formData));
    }

    public static Result postRegister(){
        System.out.println("In the register psot");
        Form<Register> formData = Form.form(Register.class).bindFromRequest();
        Register data = formData.get();
        System.out.println("ok :"+ data.First_Name + " " + data.Last_Name + " " + data.Email + " " + data.Password);
        return ok(registers.render(formData));
    }

}
