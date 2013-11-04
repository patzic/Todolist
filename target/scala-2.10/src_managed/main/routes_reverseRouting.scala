// @SOURCE:/auto_home/pboussier/Desktop/play/Todolist/conf/routes
// @HASH:183e60587d75af97e4cbf457fe6eba658991a4fe
// @DATE:Mon Nov 04 09:21:51 CET 2013

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:9
def tasks(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "tasks")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:10
def newTask(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "tasks")
}
                                                

// @LINE:12
def listtask(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "extern")
}
                                                
    
}
                          
}
                  


// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:9
def tasks : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.tasks",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tasks"})
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
                        

// @LINE:10
def newTask : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.newTask",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tasks"})
      }
   """
)
                        

// @LINE:12
def listtask : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.listtask",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "extern"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {

// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:9
def tasks(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.tasks(), HandlerDef(this, "controllers.Application", "tasks", Seq(), "GET", """ Tasks          """, _prefix + """tasks""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:10
def newTask(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.newTask(), HandlerDef(this, "controllers.Application", "newTask", Seq(), "POST", """""", _prefix + """tasks""")
)
                      

// @LINE:12
def listtask(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.listtask(), HandlerDef(this, "controllers.Application", "listtask", Seq(), "GET", """""", _prefix + """extern""")
)
                      
    
}
                          
}
                  
      