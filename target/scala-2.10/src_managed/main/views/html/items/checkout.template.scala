
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
object checkout extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Checkout Form</title>
</head>
<body>
<section>
    <h1 id="head1">Checkout Form</h1>
</section>

    <section>
        <div class = "row">
            <div class = col-75>
                <div class="container">
                        <form>
                            <div>
                                <label name="f_name">First Name</label>
                                <input type="text" id="fname" name="fname">
                            </div>
                        </form>
                </div>
            </div>
        </div>
    </section>



</body>
</html>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 20 17:01:32 GMT+05:30 2018
                    SOURCE: /home/chaithra/demoapplication/app/views/items/checkout.scala.html
                    HASH: ff116560e5b5b55db68ede6061e264a4db1ffeb2
                    MATRIX: 864->0
                    LINES: 29->1
                    -- GENERATED --
                */
            