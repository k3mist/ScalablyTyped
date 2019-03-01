package typings
package semanticDashUiDashReactLib.distCommonjsCollectionsFormFormTextAreaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormTextAreaProps
  extends StrictFormTextAreaProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object FormTextAreaProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    as: js.Any = null,
    autoHeight: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    content: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent = null,
    control: js.Any = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    error: js.UndefOr[scala.Boolean] = js.undefined,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    label: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsGenericMod.HtmlLabelProps] = null,
    onChange: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.FormEvent[reactLib.HTMLTextAreaElement], 
      /* data */ semanticDashUiDashReactLib.distCommonjsAddonsTextAreaTextAreaMod.TextAreaProps, 
      scala.Unit
    ] = null,
    onInput: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.FormEvent[reactLib.HTMLTextAreaElement], 
      /* data */ semanticDashUiDashReactLib.distCommonjsAddonsTextAreaTextAreaMod.TextAreaProps, 
      scala.Unit
    ] = null,
    required: js.Any = null,
    rows: scala.Double | java.lang.String = null,
    style: js.Object = null,
    `type`: java.lang.String = null,
    value: scala.Double | java.lang.String = null,
    width: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticWIDTHS = null
  ): FormTextAreaProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as)
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (control != null) __obj.updateDynamic("control")(control)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onInput != null) __obj.updateDynamic("onInput")(onInput)
    if (required != null) __obj.updateDynamic("required")(required)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[FormTextAreaProps]
  }
}

