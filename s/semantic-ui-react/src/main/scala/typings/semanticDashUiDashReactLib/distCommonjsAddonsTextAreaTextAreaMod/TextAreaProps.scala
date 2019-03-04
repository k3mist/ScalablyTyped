package typings
package semanticDashUiDashReactLib.distCommonjsAddonsTextAreaTextAreaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextAreaProps
  extends StrictTextAreaProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object TextAreaProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    as: js.Any = null,
    autoHeight: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: (/* event */ reactLib.reactMod.ReactNs.FormEvent[reactLib.HTMLTextAreaElement], /* data */ TextAreaProps) => scala.Unit = null,
    onInput: (/* event */ reactLib.reactMod.ReactNs.FormEvent[reactLib.HTMLTextAreaElement], /* data */ TextAreaProps) => scala.Unit = null,
    rows: scala.Double | java.lang.String = null,
    style: js.Object = null,
    value: scala.Double | java.lang.String = null
  ): TextAreaProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as)
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction2(onInput))
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAreaProps]
  }
}

