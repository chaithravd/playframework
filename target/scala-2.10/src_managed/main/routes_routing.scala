// @SOURCE:/home/chaithra/demoapplication/conf/routes
// @HASH:6e3f601ea3d774480a6c8f1a11065f9b14f96a92
// @DATE:Thu Dec 20 17:02:14 GMT+05:30 2018


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:8
private[this] lazy val controllers_Application_newRegister1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("newregister"))))
        

// @LINE:9
private[this] lazy val controllers_Application_postRegister2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("newregister"))))
        

// @LINE:13
private[this] lazy val controllers_ShoppingCart_index3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("shop"))))
        

// @LINE:14
private[this] lazy val controllers_ShoppingCart_addItems4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("shop/add"))))
        

// @LINE:15
private[this] lazy val controllers_ShoppingCart_showItems5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("shop/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:16
private[this] lazy val controllers_ShoppingCart_editItems6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("shop/edit/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:17
private[this] lazy val controllers_ShoppingCart_changeItems7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("shop/edit/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:18
private[this] lazy val controllers_ShoppingCart_saveItems8 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("shop/add"))))
        

// @LINE:19
private[this] lazy val controllers_ShoppingCart_deleteItems9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("shop/remove/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:20
private[this] lazy val controllers_ShoppingCart_checkform10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("shop/checkout/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:24
private[this] lazy val controllers_Assets_at11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """newregister""","""controllers.Application.newRegister()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """newregister""","""controllers.Application.postRegister()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """shop""","""controllers.ShoppingCart.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """shop/add""","""controllers.ShoppingCart.addItems()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """shop/$id<[^/]+>""","""controllers.ShoppingCart.showItems(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """shop/edit/$id<[^/]+>""","""controllers.ShoppingCart.editItems(id:Integer)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """shop/edit/$id<[^/]+>""","""controllers.ShoppingCart.changeItems(id:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """shop/add""","""controllers.ShoppingCart.saveItems()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """shop/remove/$id<[^/]+>""","""controllers.ShoppingCart.deleteItems(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """shop/checkout/$id<[^/]+>""","""controllers.ShoppingCart.checkform(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:8
case controllers_Application_newRegister1(params) => {
   call { 
        invokeHandler(controllers.Application.newRegister(), HandlerDef(this, "controllers.Application", "newRegister", Nil,"GET", """""", Routes.prefix + """newregister"""))
   }
}
        

// @LINE:9
case controllers_Application_postRegister2(params) => {
   call { 
        invokeHandler(controllers.Application.postRegister(), HandlerDef(this, "controllers.Application", "postRegister", Nil,"POST", """""", Routes.prefix + """newregister"""))
   }
}
        

// @LINE:13
case controllers_ShoppingCart_index3(params) => {
   call { 
        invokeHandler(controllers.ShoppingCart.index(), HandlerDef(this, "controllers.ShoppingCart", "index", Nil,"GET", """""", Routes.prefix + """shop"""))
   }
}
        

// @LINE:14
case controllers_ShoppingCart_addItems4(params) => {
   call { 
        invokeHandler(controllers.ShoppingCart.addItems(), HandlerDef(this, "controllers.ShoppingCart", "addItems", Nil,"GET", """""", Routes.prefix + """shop/add"""))
   }
}
        

// @LINE:15
case controllers_ShoppingCart_showItems5(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        invokeHandler(controllers.ShoppingCart.showItems(id), HandlerDef(this, "controllers.ShoppingCart", "showItems", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """shop/$id<[^/]+>"""))
   }
}
        

// @LINE:16
case controllers_ShoppingCart_editItems6(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        invokeHandler(controllers.ShoppingCart.editItems(id), HandlerDef(this, "controllers.ShoppingCart", "editItems", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """shop/edit/$id<[^/]+>"""))
   }
}
        

// @LINE:17
case controllers_ShoppingCart_changeItems7(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(controllers.ShoppingCart.changeItems(id), HandlerDef(this, "controllers.ShoppingCart", "changeItems", Seq(classOf[String]),"POST", """""", Routes.prefix + """shop/edit/$id<[^/]+>"""))
   }
}
        

// @LINE:18
case controllers_ShoppingCart_saveItems8(params) => {
   call { 
        invokeHandler(controllers.ShoppingCart.saveItems(), HandlerDef(this, "controllers.ShoppingCart", "saveItems", Nil,"POST", """""", Routes.prefix + """shop/add"""))
   }
}
        

// @LINE:19
case controllers_ShoppingCart_deleteItems9(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        invokeHandler(controllers.ShoppingCart.deleteItems(id), HandlerDef(this, "controllers.ShoppingCart", "deleteItems", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """shop/remove/$id<[^/]+>"""))
   }
}
        

// @LINE:20
case controllers_ShoppingCart_checkform10(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(controllers.ShoppingCart.checkform(id), HandlerDef(this, "controllers.ShoppingCart", "checkform", Seq(classOf[String]),"GET", """""", Routes.prefix + """shop/checkout/$id<[^/]+>"""))
   }
}
        

// @LINE:24
case controllers_Assets_at11(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     