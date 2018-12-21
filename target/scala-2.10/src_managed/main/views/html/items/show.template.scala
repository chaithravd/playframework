
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
object show extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Shopping,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(item : Shopping):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Display_items</title>
</head>
<body>
    <h1>"""),_display_(Seq[Any](/*8.10*/item/*8.14*/.product)),format.raw/*8.22*/("""</h1>
    <p>Price : """),_display_(Seq[Any](/*9.17*/item/*9.21*/.price)),format.raw/*9.27*/("""</p>
    <p>Manufacturer : """),_display_(Seq[Any](/*10.24*/item/*10.28*/.manufacturer)),format.raw/*10.41*/("""</p>

    <a href=""""),_display_(Seq[Any](/*12.15*/routes/*12.21*/.ShoppingCart.editItems(item.id))),format.raw/*12.53*/("""">Edit</a>
    <a href=""""),_display_(Seq[Any](/*13.15*/routes/*13.21*/.ShoppingCart.deleteItems(item.id))),format.raw/*13.55*/("""">Delete</a>
</body>
</html>"""))}
    }
    
    def render(item:Shopping): play.api.templates.HtmlFormat.Appendable = apply(item)
    
    def f:((Shopping) => play.api.templates.HtmlFormat.Appendable) = (item) => apply(item)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 20 12:41:22 GMT+05:30 2018
                    SOURCE: /home/chaithra/demoapplication/app/views/items/show.scala.html
                    HASH: a1bae3d06148297c8846b2251a5f802e2d635570
                    MATRIX: 781->1|892->18|1036->127|1048->131|1077->139|1134->161|1146->165|1173->171|1237->199|1250->203|1285->216|1341->236|1356->242|1410->274|1471->299|1486->305|1542->339
                    LINES: 26->1|29->1|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|40->12|40->12|40->12|41->13|41->13|41->13
                    -- GENERATED --
                */
            