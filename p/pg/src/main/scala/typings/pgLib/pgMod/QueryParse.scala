package typings
package pgLib.pgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryParse extends js.Object {
  var name: java.lang.String
  var text: java.lang.String
  var types: js.Array[java.lang.String]
}

object QueryParse {
  @scala.inline
  def apply(name: java.lang.String, text: java.lang.String, types: js.Array[java.lang.String]): QueryParse = {
    val __obj = js.Dynamic.literal(name = name, text = text, types = types)
  
    __obj.asInstanceOf[QueryParse]
  }
}

