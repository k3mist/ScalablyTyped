package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Explanation extends js.Object {
  var description: java.lang.String
  var details: js.Array[Explanation]
  var value: scala.Double
}

object Explanation {
  @scala.inline
  def apply(description: java.lang.String, details: js.Array[Explanation], value: scala.Double): Explanation = {
    val __obj = js.Dynamic.literal(description = description, details = details, value = value)
  
    __obj.asInstanceOf[Explanation]
  }
}

