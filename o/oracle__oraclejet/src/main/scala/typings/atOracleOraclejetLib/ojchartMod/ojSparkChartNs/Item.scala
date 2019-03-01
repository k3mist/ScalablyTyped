package typings
package atOracleOraclejetLib.ojchartMod.ojSparkChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait Item extends js.Object {
  var borderColor: java.lang.String
  var color: java.lang.String
  var date: stdLib.Date
  var high: scala.Double
  var low: scala.Double
  var markerDisplayed: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  var markerShape: atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.plus | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleDown | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleUp | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | java.lang.String
  var markerSize: scala.Double
  var svgClassName: java.lang.String
  var svgStyle: js.Object
  var value: scala.Double
}

object Item {
  @scala.inline
  def apply(
    borderColor: java.lang.String,
    color: java.lang.String,
    date: stdLib.Date,
    high: scala.Double,
    low: scala.Double,
    markerDisplayed: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off,
    markerShape: atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.plus | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleDown | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleUp | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | java.lang.String,
    markerSize: scala.Double,
    svgClassName: java.lang.String,
    svgStyle: js.Object,
    value: scala.Double
  ): Item = {
    val __obj = js.Dynamic.literal(borderColor = borderColor, color = color, date = date, high = high, low = low, markerDisplayed = markerDisplayed.asInstanceOf[js.Any], markerShape = markerShape.asInstanceOf[js.Any], markerSize = markerSize, svgClassName = svgClassName, svgStyle = svgStyle, value = value)
  
    __obj.asInstanceOf[Item]
  }
}

