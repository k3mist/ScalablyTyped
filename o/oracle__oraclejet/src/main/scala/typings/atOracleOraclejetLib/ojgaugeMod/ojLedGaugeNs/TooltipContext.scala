package typings
package atOracleOraclejetLib.ojgaugeMod.ojLedGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait TooltipContext extends js.Object {
  var color: java.lang.String
  var componentElement: stdLib.Element
  var label: java.lang.String
  var parentElement: stdLib.Element
}

object TooltipContext {
  @scala.inline
  def apply(
    color: java.lang.String,
    componentElement: stdLib.Element,
    label: java.lang.String,
    parentElement: stdLib.Element
  ): TooltipContext = {
    val __obj = js.Dynamic.literal(color = color, componentElement = componentElement, label = label, parentElement = parentElement)
  
    __obj.asInstanceOf[TooltipContext]
  }
}

