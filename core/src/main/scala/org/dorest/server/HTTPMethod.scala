/*
   Copyright 2011 Michael Eichberg et al

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package org.dorest.server

/**
 *
 * @author Michael Eichberg
 */
sealed trait HTTPMethod

object HTTPMethod {

    def apply(methodName: String) = methodName match {
        case "GET" => GET
        case "POST" => POST
        case "PUT" => PUT
        case "DELETE" => DELETE
    }
    
    def unapply(method: HTTPMethod): String = method match {
      case GET => "GET"
      case POST => "POST"
      case PUT => "PUT"
      case DELETE => "DELETE"
    }
    
}

case object GET extends HTTPMethod 

case object POST extends HTTPMethod

case object PUT extends HTTPMethod

case object DELETE extends HTTPMethod

/*
object HTTPMethod extends Enumeration {
    val GET = Value("GET")
    val POST = Value("POST")
    val PUT = Value("PUT")
    val DELETE = Value("DELETE")

    // The following methods will be added, when needed...
    // val OPTIONS = Value("OPTIONS")
    // val HEAD = Value("HEAD")
    // val TRACE = Value("TRACE")
    // val CONNECT = Value("CONNECT")
}
*/