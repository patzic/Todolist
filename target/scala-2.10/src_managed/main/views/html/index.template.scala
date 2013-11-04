
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Task],Form[Task],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(tasks: List[Task], taskForm: Form[Task]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.43*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Todo list")/*5.19*/ {_display_(Seq[Any](format.raw/*5.21*/("""
    
    <h1>"""),_display_(Seq[Any](/*7.10*/tasks/*7.15*/.size())),format.raw/*7.22*/(""" task(s)</h1>
    
    <ul>
        """),_display_(Seq[Any](/*10.10*/for(task <- tasks) yield /*10.28*/ {_display_(Seq[Any](format.raw/*10.30*/("""
            <li>
                """),_display_(Seq[Any](/*12.18*/task/*12.22*/.label)),format.raw/*12.28*/("""
                
              
            </li>
        """)))})),format.raw/*16.10*/("""
    </ul>
    
    <h2>Add a new task</h2>
    
    """),_display_(Seq[Any](/*21.6*/form(routes.Application.newTask())/*21.40*/ {_display_(Seq[Any](format.raw/*21.42*/("""
        
    """),_display_(Seq[Any](/*23.6*/inputText(taskForm("label")))),format.raw/*23.34*/(""" 
        
    <input type="submit" value="Create">
        
    """)))})),format.raw/*27.6*/("""
    
""")))})),format.raw/*29.2*/("""

"""))}
    }
    
    def render(tasks:List[Task],taskForm:Form[Task]): play.api.templates.Html = apply(tasks,taskForm)
    
    def f:((List[Task],Form[Task]) => play.api.templates.Html) = (tasks,taskForm) => apply(tasks,taskForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Nov 04 08:56:33 CET 2013
                    SOURCE: /auto_home/pboussier/Desktop/play/Todolist/app/views/index.scala.html
                    HASH: 75f9d2201934bc8feb0128fd599d478a2d4def8b
                    MATRIX: 738->1|872->42|900->61|936->63|961->80|1000->82|1050->97|1063->102|1091->109|1164->146|1198->164|1238->166|1309->201|1322->205|1350->211|1442->271|1531->325|1574->359|1614->361|1664->376|1714->404|1811->470|1849->477
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|35->7|38->10|38->10|38->10|40->12|40->12|40->12|44->16|49->21|49->21|49->21|51->23|51->23|55->27|57->29
                    -- GENERATED --
                */
            