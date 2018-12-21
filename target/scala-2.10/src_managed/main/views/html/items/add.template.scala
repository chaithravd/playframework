
package views.html.items

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object add extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>ADD_items</title>
</head>
<body>
<h1>Add items for shopping</h1>
<form method="post" action="add">
    Product id : <input type="text" name="id"><br><br>
    Product Name : <input type="text" name="product"><br><br>
    Product price : <input type="text" name="price"><br><br>
    Manufacturer : <input type="text" name="manufacturer"><br><br>
    <input type="submit" name="Register" value="ADD">
</form>
</body>
</html>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Dec 19 12:01:37 GMT+05:30 2018
                    SOURCE: /home/chaithra/demoapplication/app/views/items/add.scala.html
                    HASH: e1f047784dee791e166dcf6646ba15a5ef2ee306
                    MATRIX: 859->0
                    LINES: 29->1
                    -- GENERATED --
                */
            