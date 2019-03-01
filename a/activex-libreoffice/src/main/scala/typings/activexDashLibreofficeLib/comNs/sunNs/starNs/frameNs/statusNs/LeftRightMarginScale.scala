package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.statusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a left and right margin.
  * @since LibreOffice 5.3
  */
trait LeftRightMarginScale extends js.Object {
  /** specifies if the automatic calculation of the first line indent occurs. */
  var AutoFirstLine: scala.Boolean
  /** specifies a first line indent relative to TextLeft in 1/100th mm. */
  var FirstLine: scala.Double
  /** specifies a left margin in 1/100th mm. */
  var Left: scala.Double
  /** specifies a right margin in 1/100th mm. */
  var Right: scala.Double
  /** specifies a scale value for the first line margin in percent. */
  var ScaleFirstLine: scala.Double
  /** specifies a scale value for the left margin in percent. */
  var ScaleLeft: scala.Double
  /** specifies a scale value for the right margin in percent. */
  var ScaleRight: scala.Double
  /** specifies a left text margin in 1/100th mm. */
  var TextLeft: scala.Double
}

object LeftRightMarginScale {
  @scala.inline
  def apply(
    AutoFirstLine: scala.Boolean,
    FirstLine: scala.Double,
    Left: scala.Double,
    Right: scala.Double,
    ScaleFirstLine: scala.Double,
    ScaleLeft: scala.Double,
    ScaleRight: scala.Double,
    TextLeft: scala.Double
  ): LeftRightMarginScale = {
    val __obj = js.Dynamic.literal(AutoFirstLine = AutoFirstLine, FirstLine = FirstLine, Left = Left, Right = Right, ScaleFirstLine = ScaleFirstLine, ScaleLeft = ScaleLeft, ScaleRight = ScaleRight, TextLeft = TextLeft)
  
    __obj.asInstanceOf[LeftRightMarginScale]
  }
}

