package typings
package atVueComponentDashCompilerDashUtilsLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorWithRange extends js.Object {
  var end: scala.Double
  var msg: java.lang.String
  var start: scala.Double
}

object ErrorWithRange {
  @scala.inline
  def apply(end: scala.Double, msg: java.lang.String, start: scala.Double): ErrorWithRange = {
    val __obj = js.Dynamic.literal(end = end, msg = msg, start = start)
  
    __obj.asInstanceOf[ErrorWithRange]
  }
}

