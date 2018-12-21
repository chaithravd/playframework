
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
object edit extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Shopping],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(editForm : Form[Shopping]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.29*/("""

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Edit_items</title>
</head>
<body>
<h1>Edit items in the cart</h1>
<form method="post" action="edit">
    Product id : <input type="text" name="id"><br><br>
    Product Name : <input type="text" name="product"><br><br>
    Product price : <input type="text" name="price"><br><br>
    Manufacturer : <input type="text" name="manufacturer"><br><br>
    <input type="submit" name="submit" value="EDIT">
</form>
</body>
</html>"""))}
    }
    
    def render(editForm:Form[Shopping]): play.api.templates.HtmlFormat.Appendable = apply(editForm)
    
    def f:((Form[Shopping]) => play.api.templates.HtmlFormat.Appendable) = (editForm) => apply(editForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Dec 19 12:42:15 GMT+05:30 2018
                    SOURCE: /home/chaithra/demoapplication/app/views/items/edit.scala.html
                    HASH: d3bbb0f57a163d081fe76ef9d19d7c5ffb039c2e
                    MATRIX: 787->1|908->28
                    LINES: 26->1|29->1
                    -- GENERATED --
                */
            