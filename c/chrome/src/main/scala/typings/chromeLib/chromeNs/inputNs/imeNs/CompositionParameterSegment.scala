package typings
package chromeLib.chromeNs.inputNs.imeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompositionParameterSegment extends js.Object {
  /** Index of the character to end this segment after. */
  var end: scala.Double
  /** Index of the character to start this segment at */
  var start: scala.Double
  /** The type of the underline to modify this segment. */
  var style: java.lang.String
}

object CompositionParameterSegment {
  @scala.inline
  def apply(end: scala.Double, start: scala.Double, style: java.lang.String): CompositionParameterSegment = {
    val __obj = js.Dynamic.literal(end = end, start = start, style = style)
  
    __obj.asInstanceOf[CompositionParameterSegment]
  }
}

