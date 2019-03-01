package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the Shape object, for use in "shape.set({ ... })". */
trait ShapeUpdateData extends js.Object {
  /**
    *
    * Returns or sets the alternative descriptive text string for a Shape object when the object is saved to a Web page.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var altTextDescription: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Returns or sets the alternative title text string for a Shape object when the object is saved to a Web page.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var altTextTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Returns the fill formatting of the shape object.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var fill: js.UndefOr[ShapeFillUpdateData] = js.undefined
  /**
    *
    * Represents the geometric shape type of the specified shape. See Excel.GeometricShapeType for detail. Returns null if the shape is not geometric, for example, get GeometricShapeType of a line or a chart will return null.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var geometricShapeType: js.UndefOr[
    /* import warning: LimitUnionLength.enterTypeRef Was union type with length 178 */ js.Any
  ] = js.undefined
  /**
    *
    * Represents the height, in points, of the shape.
    Throws an invalid argument exception when set with negative value or zero as input.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * The distance, in points, from the left side of the shape to the left of the worksheet.
    Throws an invalid argument exception when set with negative value as input.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var left: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Returns the line formatting of the shape object.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var lineFormat: js.UndefOr[ShapeLineFormatUpdateData] = js.undefined
  /**
    *
    * Represents if the aspect ratio locked, in boolean, of the shape.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var lockAspectRatio: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the name of the shape.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Represents the placment, value that represents the way the object is attached to the cells below it.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var placement: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.Placement | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.TwoCell | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.OneCell | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Absolute
  ] = js.undefined
  /**
    *
    * Represents the rotation, in degrees, of the shape.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var rotation: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * The distance, in points, from the top edge of the shape to the top of the worksheet.
    Throws an invalid argument exception when set with negative value as input.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var top: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the visibility, in boolean, of the specified shape.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the width, in points, of the shape.
    Throws an invalid argument exception when set with negative value or zero as input.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ShapeUpdateData {
  @scala.inline
  def apply(
    altTextDescription: java.lang.String = null,
    altTextTitle: java.lang.String = null,
    fill: ShapeFillUpdateData = null,
    geometricShapeType: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 178 */ js.Any = null,
    height: scala.Int | scala.Double = null,
    left: scala.Int | scala.Double = null,
    lineFormat: ShapeLineFormatUpdateData = null,
    lockAspectRatio: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    placement: officeDashJsDashPreviewLib.ExcelNs.Placement | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.TwoCell | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.OneCell | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Absolute = null,
    rotation: scala.Int | scala.Double = null,
    top: scala.Int | scala.Double = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): ShapeUpdateData = {
    val __obj = js.Dynamic.literal()
    if (altTextDescription != null) __obj.updateDynamic("altTextDescription")(altTextDescription)
    if (altTextTitle != null) __obj.updateDynamic("altTextTitle")(altTextTitle)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (geometricShapeType != null) __obj.updateDynamic("geometricShapeType")(geometricShapeType)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (lineFormat != null) __obj.updateDynamic("lineFormat")(lineFormat)
    if (!js.isUndefined(lockAspectRatio)) __obj.updateDynamic("lockAspectRatio")(lockAspectRatio)
    if (name != null) __obj.updateDynamic("name")(name)
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeUpdateData]
  }
}

