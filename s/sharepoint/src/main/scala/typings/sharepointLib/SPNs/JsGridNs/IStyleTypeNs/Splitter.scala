package typings
package sharepointLib.SPNs.JsGridNs.IStyleTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Splitter
  extends sharepointLib.SPNs.JsGridNs.IStyleType {
  var backgroundColor: js.Any
  var innerBorderColor: js.Any
  var leftInnerBorderColor: js.Any
  var outerBorderColor: js.Any
}

object Splitter {
  @scala.inline
  def apply(
    backgroundColor: js.Any,
    innerBorderColor: js.Any,
    leftInnerBorderColor: js.Any,
    outerBorderColor: js.Any
  ): Splitter = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor, innerBorderColor = innerBorderColor, leftInnerBorderColor = leftInnerBorderColor, outerBorderColor = outerBorderColor)
  
    __obj.asInstanceOf[Splitter]
  }
}

