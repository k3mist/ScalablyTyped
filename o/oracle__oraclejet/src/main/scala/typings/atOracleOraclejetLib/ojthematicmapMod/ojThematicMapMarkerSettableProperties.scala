package typings
package atOracleOraclejetLib.ojthematicmapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojThematicMapMarkerSettableProperties
  extends atOracleOraclejetLib.atOracleOraclejetMod.JetSettableProperties {
  var borderColor: java.lang.String
  var borderStyle: atOracleOraclejetLib.atOracleOraclejetLibStrings.solid | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var borderWidth: scala.Double
  var categories: js.Array[java.lang.String]
  var color: java.lang.String
  var height: scala.Double
  var label: java.lang.String
  var labelPosition: atOracleOraclejetLib.atOracleOraclejetLibStrings.bottom | atOracleOraclejetLib.atOracleOraclejetLibStrings.center | atOracleOraclejetLib.atOracleOraclejetLibStrings.top
  var labelStyle: js.Object
  var location: java.lang.String
  var opacity: scala.Double
  var rotation: scala.Double
  var selectable: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  var shape: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.ellipse | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.plus | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleDown | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleUp | java.lang.String
  ] = js.undefined
  var shortDesc: java.lang.String
  var source: java.lang.String
  var sourceHover: java.lang.String
  var sourceHoverSelected: java.lang.String
  var sourceSelected: java.lang.String
  var svgClassName: java.lang.String
  var svgStyle: js.Object
  var value: scala.Double
  var width: scala.Double
  var x: scala.Double | scala.Null
  var y: scala.Double | scala.Null
}

object ojThematicMapMarkerSettableProperties {
  @scala.inline
  def apply(
    borderColor: java.lang.String,
    borderStyle: atOracleOraclejetLib.atOracleOraclejetLibStrings.solid | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    borderWidth: scala.Double,
    categories: js.Array[java.lang.String],
    color: java.lang.String,
    height: scala.Double,
    label: java.lang.String,
    labelPosition: atOracleOraclejetLib.atOracleOraclejetLibStrings.bottom | atOracleOraclejetLib.atOracleOraclejetLibStrings.center | atOracleOraclejetLib.atOracleOraclejetLibStrings.top,
    labelStyle: js.Object,
    location: java.lang.String,
    opacity: scala.Double,
    rotation: scala.Double,
    selectable: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.off,
    shortDesc: java.lang.String,
    source: java.lang.String,
    sourceHover: java.lang.String,
    sourceHoverSelected: java.lang.String,
    sourceSelected: java.lang.String,
    svgClassName: java.lang.String,
    svgStyle: js.Object,
    value: scala.Double,
    width: scala.Double,
    shape: atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.ellipse | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.plus | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleDown | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleUp | java.lang.String = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): ojThematicMapMarkerSettableProperties = {
    val __obj = js.Dynamic.literal(borderColor = borderColor, borderStyle = borderStyle.asInstanceOf[js.Any], borderWidth = borderWidth, categories = categories, color = color, height = height, label = label, labelPosition = labelPosition.asInstanceOf[js.Any], labelStyle = labelStyle, location = location, opacity = opacity, rotation = rotation, selectable = selectable.asInstanceOf[js.Any], shortDesc = shortDesc, source = source, sourceHover = sourceHover, sourceHoverSelected = sourceHoverSelected, sourceSelected = sourceSelected, svgClassName = svgClassName, svgStyle = svgStyle, value = value, width = width)
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojThematicMapMarkerSettableProperties]
  }
}

