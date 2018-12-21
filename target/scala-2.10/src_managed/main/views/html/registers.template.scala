
package views.html

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
object registers extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[views.formdata.Register],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(registerForm: Form[views.formdata.Register]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.47*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("registers")/*5.19*/{_display_(Seq[Any](format.raw/*5.20*/("""
<h1>Register</h1>

"""),_display_(Seq[Any](/*8.2*/form(routes.Application.postRegister())/*8.41*/{_display_(Seq[Any](format.raw/*8.42*/("""

    First Name : <input type="text" name = """"),_display_(Seq[Any](/*10.46*/registerForm("First_Name")/*10.72*/.name)),format.raw/*10.77*/("""" value = """"),_display_(Seq[Any](/*10.89*/registerForm("First_Name")/*10.115*/.value)),format.raw/*10.121*/("""" required><br><br>
    Last Name : <input type="text" name=""""),_display_(Seq[Any](/*11.43*/registerForm("Last_Name")/*11.68*/.name)),format.raw/*11.73*/("""" value = """"),_display_(Seq[Any](/*11.85*/registerForm("Last_Name")/*11.110*/.value)),format.raw/*11.116*/("""" required><br><br>
    Email : <input type="email" name=""""),_display_(Seq[Any](/*12.40*/registerForm("Email")/*12.61*/.name)),format.raw/*12.66*/("""" value = """"),_display_(Seq[Any](/*12.78*/registerForm("Email")/*12.99*/.value)),format.raw/*12.105*/("""" required><br><br>
    Password : <input type="password" name=""""),_display_(Seq[Any](/*13.46*/registerForm("Password")/*13.70*/.name)),format.raw/*13.75*/("""" value = """"),_display_(Seq[Any](/*13.87*/registerForm("Password")/*13.111*/.value)),format.raw/*13.117*/("""" required><br><br>
    <input type="submit" name="Register" value="Register">

    """)))})),format.raw/*16.6*/("""
""")))})),format.raw/*17.2*/("""

<!--<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Register</title>
</head>
<body>--!>


<!--
</body>
</html>--!>"""))}
    }
    
    def render(registerForm:Form[views.formdata.Register]): play.api.templates.HtmlFormat.Appendable = apply(registerForm)
    
    def f:((Form[views.formdata.Register]) => play.api.templates.HtmlFormat.Appendable) = (registerForm) => apply(registerForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Dec 18 15:58:55 GMT+05:30 2018
                    SOURCE: /home/chaithra/demoapplication/app/views/registers.scala.html
                    HASH: 86ce0f0e9363915c90874e0657ecdda5a01e2b35
                    MATRIX: 801->1|956->46|984->65|1020->67|1045->84|1083->85|1138->106|1185->145|1223->146|1306->193|1341->219|1368->224|1416->236|1452->262|1481->268|1579->330|1613->355|1640->360|1688->372|1723->397|1752->403|1847->462|1877->483|1904->488|1952->500|1982->521|2011->527|2112->592|2145->616|2172->621|2220->633|2254->657|2283->663|2399->748|2432->750
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|36->8|36->8|36->8|38->10|38->10|38->10|38->10|38->10|38->10|39->11|39->11|39->11|39->11|39->11|39->11|40->12|40->12|40->12|40->12|40->12|40->12|41->13|41->13|41->13|41->13|41->13|41->13|44->16|45->17
                    -- GENERATED --
                */
            