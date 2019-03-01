package typings
package atMaterialDashUiCoreLib.stepbuttonStepButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/ButtonBase.ButtonBaseProps, 'classes' | never> ]: @material-ui/core.@material-ui/core/ButtonBase.ButtonBaseProps[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<@material-ui/core.@material-ui/core/ButtonBase.ButtonBaseProps, @material-ui/core.@material-ui/core/StepButton/StepButton.StepButtonClasskey, never>) */ trait StepButtonProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[StepButtonClasskey] {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var alternativeLabel: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var completed: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var icon: js.UndefOr[StepButtonIcon] = js.undefined
  var last: js.UndefOr[scala.Boolean] = js.undefined
  var optional: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var orientation: js.UndefOr[atMaterialDashUiCoreLib.stepperStepperMod.Orientation] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object StepButtonProps {
  @scala.inline
  def apply(
    active: js.UndefOr[scala.Boolean] = js.undefined,
    alternativeLabel: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[StepButtonClasskey]] = null,
    completed: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    icon: StepButtonIcon = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    last: js.UndefOr[scala.Boolean] = js.undefined,
    optional: reactLib.reactMod.ReactNs.ReactNode = null,
    orientation: atMaterialDashUiCoreLib.stepperStepperMod.Orientation = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): StepButtonProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (!js.isUndefined(alternativeLabel)) __obj.updateDynamic("alternativeLabel")(alternativeLabel)
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(completed)) __obj.updateDynamic("completed")(completed)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(last)) __obj.updateDynamic("last")(last)
    if (optional != null) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[StepButtonProps]
  }
}

