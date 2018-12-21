
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Set[Shopping],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(items1 : Set[Shopping]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.26*/("""


<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Display</title>
</head>
<body>
    <section>
        <h1 style="text-align:center">DEMO PROJECT</h1>
        <p>This is a sample project using Play Framework and HTML 5</p>
    </section>
    <h1>Total Items:</h1>

    """),_display_(Seq[Any](/*16.6*/for(item <- items1) yield /*16.25*/{_display_(Seq[Any](format.raw/*16.26*/("""
        <a href=""""),_display_(Seq[Any](/*17.19*/routes/*17.25*/.ShoppingCart.showItems(item.id))),format.raw/*17.57*/("""">"""),_display_(Seq[Any](/*17.60*/item/*17.64*/.product)),format.raw/*17.72*/("""</a>
        <p>Price : """),_display_(Seq[Any](/*18.21*/item/*18.25*/.price)),format.raw/*18.31*/("""</p>
        <p>Manufacturer : """),_display_(Seq[Any](/*19.28*/item/*19.32*/.manufacturer)),format.raw/*19.45*/("""</p>""")))})),format.raw/*19.50*/("""

        <a href=""""),_display_(Seq[Any](/*21.19*/routes/*21.25*/.ShoppingCart.addItems())),format.raw/*21.49*/("""">ADD Items</a>


</body>
</html>"""))}
    }
    
    def render(items1:Set[Shopping]): play.api.templates.HtmlFormat.Appendable = apply(items1)
    
    def f:((Set[Shopping]) => play.api.templates.HtmlFormat.Appendable) = (items1) => apply(items1)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 20 12:54:26 GMT+05:30 2018
                    SOURCE: /home/chaithra/demoapplication/app/views/items/index.scala.html
                    HASH: b9e44346e2e2160e5452bdef401a89c02a94a687
                    MATRIX: 787->1|905->25|1225->310|1260->329|1299->330|1354->349|1369->355|1423->387|1462->390|1475->394|1505->402|1566->427|1579->431|1607->437|1675->469|1688->473|1723->486|1760->491|1816->511|1831->517|1877->541
                    LINES: 26->1|29->1|44->16|44->16|44->16|45->17|45->17|45->17|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|47->19|49->21|49->21|49->21
                    -- GENERATED --
                */
            