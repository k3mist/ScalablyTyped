package typings
package atOracleOraclejetLib.ojpictochartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojPictoChartItemSettableProperties
  extends atOracleOraclejetLib.atOracleOraclejetMod.JetSettableProperties {
  var borderColor: java.lang.String
  var borderWidth: scala.Double
  var categories: js.Array[java.lang.String]
  var color: java.lang.String
  var columnSpan: scala.Double
  var count: scala.Double
  var drilling: atOracleOraclejetLib.atOracleOraclejetLibStrings.inherit | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.on
  var name: java.lang.String
  var rowSpan: scala.Double
  var shape: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.plus | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleDown | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleUp | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | java.lang.String
  ] = js.undefined
  var shortDesc: java.lang.String
  var source: java.lang.String
  var sourceHover: java.lang.String
  var sourceHoverSelected: java.lang.String
  var sourceSelected: java.lang.String
  var svgClassName: java.lang.String
  var svgStyle: js.Object
}

object ojPictoChartItemSettableProperties {
  @scala.inline
  def apply(
    borderColor: java.lang.String,
    borderWidth: scala.Double,
    categories: js.Array[java.lang.String],
    color: java.lang.String,
    columnSpan: scala.Double,
    count: scala.Double,
    drilling: atOracleOraclejetLib.atOracleOraclejetLibStrings.inherit | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.on,
    name: java.lang.String,
    rowSpan: scala.Double,
    shortDesc: java.lang.String,
    source: java.lang.String,
    sourceHover: java.lang.String,
    sourceHoverSelected: java.lang.String,
    sourceSelected: java.lang.String,
    svgClassName: java.lang.String,
    svgStyle: js.Object,
    shape: atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.plus | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleDown | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleUp | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | java.lang.String = null
  ): ojPictoChartItemSettableProperties = {
    val __obj = js.Dynamic.literal(borderColor = borderColor, borderWidth = borderWidth, categories = categories, color = color, columnSpan = columnSpan, count = count, drilling = drilling.asInstanceOf[js.Any], name = name, rowSpan = rowSpan, shortDesc = shortDesc, source = source, sourceHover = sourceHover, sourceHoverSelected = sourceHoverSelected, sourceSelected = sourceSelected, svgClassName = svgClassName, svgStyle = svgStyle)
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojPictoChartItemSettableProperties]
  }
}

