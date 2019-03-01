package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISeriesPointer extends js.Object {
  var chart: IChart
  var colorEach: scala.Boolean
  var format: IFormat
  var height: scala.Double
  var style: java.lang.String
  var visible: scala.Boolean
  var width: scala.Double
}

object ISeriesPointer {
  @scala.inline
  def apply(
    chart: IChart,
    colorEach: scala.Boolean,
    format: IFormat,
    height: scala.Double,
    style: java.lang.String,
    visible: scala.Boolean,
    width: scala.Double
  ): ISeriesPointer = {
    val __obj = js.Dynamic.literal(chart = chart, colorEach = colorEach, format = format, height = height, style = style, visible = visible, width = width)
  
    __obj.asInstanceOf[ISeriesPointer]
  }
}

