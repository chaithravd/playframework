// @SOURCE:/home/chaithra/demoapplication/conf/routes
// @HASH:6e3f601ea3d774480a6c8f1a11065f9b14f96a92
// @DATE:Thu Dec 20 17:02:14 GMT+05:30 2018

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:24
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:9
// @LINE:8
// @LINE:6
package controllers {

// @LINE:24
class ReverseAssets {
    

// @LINE:24
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
class ReverseShoppingCart {
    

// @LINE:16
def editItems(id:Integer): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "shop/edit/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                                                

// @LINE:18
def saveItems(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "shop/add")
}
                                                

// @LINE:17
def changeItems(id:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "shop/edit/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                                                

// @LINE:15
def showItems(id:Integer): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "shop/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                                                

// @LINE:20
def checkform(id:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "shop/checkout/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                                                

// @LINE:19
def deleteItems(id:Integer): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "shop/remove/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                                                

// @LINE:14
def addItems(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "shop/add")
}
                                                

// @LINE:13
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "shop")
}
                                                
    
}
                          

// @LINE:9
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:8
def newRegister(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "newregister")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:9
def postRegister(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "newregister")
}
                                                
    
}
                          
}
                  


// @LINE:24
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.javascript {

// @LINE:24
class ReverseAssets {
    

// @LINE:24
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
class ReverseShoppingCart {
    

// @LINE:16
def editItems : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ShoppingCart.editItems",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "shop/edit/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:18
def saveItems : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ShoppingCart.saveItems",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "shop/add"})
      }
   """
)
                        

// @LINE:17
def changeItems : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ShoppingCart.changeItems",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "shop/edit/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

// @LINE:15
def showItems : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ShoppingCart.showItems",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "shop/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:20
def checkform : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ShoppingCart.checkform",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "shop/checkout/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

// @LINE:19
def deleteItems : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ShoppingCart.deleteItems",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "shop/remove/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:14
def addItems : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ShoppingCart.addItems",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "shop/add"})
      }
   """
)
                        

// @LINE:13
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ShoppingCart.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "shop"})
      }
   """
)
                        
    
}
              

// @LINE:9
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:8
def newRegister : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.newRegister",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newregister"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:9
def postRegister : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.postRegister",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "newregister"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:24
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.ref {


// @LINE:24
class ReverseAssets {
    

// @LINE:24
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
class ReverseShoppingCart {
    

// @LINE:16
def editItems(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ShoppingCart.editItems(id), HandlerDef(this, "controllers.ShoppingCart", "editItems", Seq(classOf[Integer]), "GET", """""", _prefix + """shop/edit/$id<[^/]+>""")
)
                      

// @LINE:18
def saveItems(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ShoppingCart.saveItems(), HandlerDef(this, "controllers.ShoppingCart", "saveItems", Seq(), "POST", """""", _prefix + """shop/add""")
)
                      

// @LINE:17
def changeItems(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ShoppingCart.changeItems(id), HandlerDef(this, "controllers.ShoppingCart", "changeItems", Seq(classOf[String]), "POST", """""", _prefix + """shop/edit/$id<[^/]+>""")
)
                      

// @LINE:15
def showItems(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ShoppingCart.showItems(id), HandlerDef(this, "controllers.ShoppingCart", "showItems", Seq(classOf[Integer]), "GET", """""", _prefix + """shop/$id<[^/]+>""")
)
                      

// @LINE:20
def checkform(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ShoppingCart.checkform(id), HandlerDef(this, "controllers.ShoppingCart", "checkform", Seq(classOf[String]), "GET", """""", _prefix + """shop/checkout/$id<[^/]+>""")
)
                      

// @LINE:19
def deleteItems(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ShoppingCart.deleteItems(id), HandlerDef(this, "controllers.ShoppingCart", "deleteItems", Seq(classOf[Integer]), "GET", """""", _prefix + """shop/remove/$id<[^/]+>""")
)
                      

// @LINE:14
def addItems(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ShoppingCart.addItems(), HandlerDef(this, "controllers.ShoppingCart", "addItems", Seq(), "GET", """""", _prefix + """shop/add""")
)
                      

// @LINE:13
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ShoppingCart.index(), HandlerDef(this, "controllers.ShoppingCart", "index", Seq(), "GET", """""", _prefix + """shop""")
)
                      
    
}
                          

// @LINE:9
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:8
def newRegister(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.newRegister(), HandlerDef(this, "controllers.Application", "newRegister", Seq(), "GET", """""", _prefix + """newregister""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:9
def postRegister(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.postRegister(), HandlerDef(this, "controllers.Application", "postRegister", Seq(), "POST", """""", _prefix + """newregister""")
)
                      
    
}
                          
}
        
    