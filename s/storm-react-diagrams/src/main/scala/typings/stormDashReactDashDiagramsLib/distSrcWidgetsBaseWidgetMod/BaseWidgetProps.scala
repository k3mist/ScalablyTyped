package typings
package stormDashReactDashDiagramsLib.distSrcWidgetsBaseWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseWidgetProps extends js.Object {
  /**
    * Override the base class name
    */
  var baseClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * append additional classes
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Additional props to add
    */
  var extraProps: js.UndefOr[js.Any] = js.undefined
}

object BaseWidgetProps {
  @scala.inline
  def apply(baseClass: java.lang.String = null, className: java.lang.String = null, extraProps: js.Any = null): BaseWidgetProps = {
    val __obj = js.Dynamic.literal()
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass)
    if (className != null) __obj.updateDynamic("className")(className)
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps)
    __obj.asInstanceOf[BaseWidgetProps]
  }
}

