package typings
package atMaterialDashUiCoreLib.checkboxCheckboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/internal/SwitchBase.SwitchBaseProps, 'classes' | 'checkedIcon' | 'color' | 'icon'> ]: @material-ui/core.@material-ui/core/internal/SwitchBase.SwitchBaseProps[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<@material-ui/core.@material-ui/core/internal/SwitchBase.SwitchBaseProps, @material-ui/core.@material-ui/core/Checkbox/Checkbox.CheckboxClassKey, 'checkedIcon' | 'color' | 'icon'>) */ trait CheckboxProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[CheckboxClassKey] {
  var checkedIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.primary | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.secondary | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.default
  ] = js.undefined
  var icon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var indeterminate: js.UndefOr[scala.Boolean] = js.undefined
  var indeterminateIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object CheckboxProps {
  @scala.inline
  def apply(
    checkedIcon: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[CheckboxClassKey]] = null,
    color: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.primary | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.secondary | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.default = null,
    icon: reactLib.reactMod.ReactNs.ReactNode = null,
    indeterminate: js.UndefOr[scala.Boolean] = js.undefined,
    indeterminateIcon: reactLib.reactMod.ReactNs.ReactNode = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): CheckboxProps = {
    val __obj = js.Dynamic.literal()
    if (checkedIcon != null) __obj.updateDynamic("checkedIcon")(checkedIcon.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(indeterminate)) __obj.updateDynamic("indeterminate")(indeterminate)
    if (indeterminateIcon != null) __obj.updateDynamic("indeterminateIcon")(indeterminateIcon.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[CheckboxProps]
  }
}

