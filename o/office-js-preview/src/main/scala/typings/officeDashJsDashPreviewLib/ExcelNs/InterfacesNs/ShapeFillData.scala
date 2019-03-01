package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "shapeFill.toJSON()". */
trait ShapeFillData extends js.Object {
  /**
    *
    * Represents the shape fill fore color in HTML color format, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange")
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var foreColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Returns or sets the degree of transparency of the specified fill as a value from 0.0 (opaque) through 1.0 (clear). For API not supported shape types  or special fill type with inconsistent transparencies, return null. For example, gradient fill type could have inconsistent transparencies.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var transparency: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Returns the fill type of the shape. Read-only. See Excel.ShapeFillType for detail.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var `type`: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ShapeFillType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.NoFill | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Solid | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Gradient | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Pattern | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PictureAndTexture | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Mixed
  ] = js.undefined
}

object ShapeFillData {
  @scala.inline
  def apply(
    foreColor: java.lang.String = null,
    transparency: scala.Int | scala.Double = null,
    `type`: officeDashJsDashPreviewLib.ExcelNs.ShapeFillType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.NoFill | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Solid | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Gradient | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Pattern | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PictureAndTexture | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Mixed = null
  ): ShapeFillData = {
    val __obj = js.Dynamic.literal()
    if (foreColor != null) __obj.updateDynamic("foreColor")(foreColor)
    if (transparency != null) __obj.updateDynamic("transparency")(transparency.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeFillData]
  }
}

