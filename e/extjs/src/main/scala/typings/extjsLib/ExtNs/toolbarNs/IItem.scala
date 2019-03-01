package typings
package extjsLib.ExtNs.toolbarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IItem
  extends extjsLib.ExtNs.IComponent {
  /** [Method] Disable the component  */
  @JSName("disable")
  var disable_IItem: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Enable the component */
  @JSName("enable")
  var enable_IItem: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Try to focus this component
  		* @returns Ext.Component The focused Component. Usually this Component. Some Containers may delegate focus to a descendant Component (Windows can do this through their defaultFocus config option.
  		*/
  @JSName("focus")
  var focus_IItem: js.UndefOr[js.Function0[extjsLib.ExtNs.IComponent]] = js.undefined
  /** [Config Option] (String) */
  var overflowText: js.UndefOr[java.lang.String] = js.undefined
}

object IItem {
  @scala.inline
  def apply(
    IComponent: extjsLib.ExtNs.IComponent = null,
    disable: js.Function0[scala.Unit] = null,
    enable: js.Function0[scala.Unit] = null,
    focus: js.Function0[extjsLib.ExtNs.IComponent] = null,
    overflowText: java.lang.String = null
  ): IItem = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IComponent)
    if (disable != null) __obj.updateDynamic("disable")(disable)
    if (enable != null) __obj.updateDynamic("enable")(enable)
    if (focus != null) __obj.updateDynamic("focus")(focus)
    if (overflowText != null) __obj.updateDynamic("overflowText")(overflowText)
    __obj.asInstanceOf[IItem]
  }
}

