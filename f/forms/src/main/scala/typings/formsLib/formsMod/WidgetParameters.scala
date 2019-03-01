package typings
package formsLib.formsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WidgetParameters extends js.Object {
  /** Custom classes to add to the rendered widget. */
  var classes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Custom classes to add to the choices label when applicable (multipleRadio and multipleCheckbox) */
  var labelClasses: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** A string representing the widget type, e.g. 'text' or 'checkbox' */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object WidgetParameters {
  @scala.inline
  def apply(
    classes: js.Array[java.lang.String] = null,
    labelClasses: js.Array[java.lang.String] = null,
    `type`: java.lang.String = null
  ): WidgetParameters = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (labelClasses != null) __obj.updateDynamic("labelClasses")(labelClasses)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WidgetParameters]
  }
}

