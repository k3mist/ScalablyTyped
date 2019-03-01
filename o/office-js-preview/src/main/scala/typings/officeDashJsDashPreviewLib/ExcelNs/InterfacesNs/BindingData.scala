package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "binding.toJSON()". */
trait BindingData extends js.Object {
  /**
    *
    * Represents binding identifier. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Returns the type of the binding. See Excel.BindingType for details. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var `type`: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.BindingType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Range | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Table | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Text
  ] = js.undefined
}

object BindingData {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    `type`: officeDashJsDashPreviewLib.ExcelNs.BindingType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Range | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Table | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Text = null
  ): BindingData = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingData]
  }
}

