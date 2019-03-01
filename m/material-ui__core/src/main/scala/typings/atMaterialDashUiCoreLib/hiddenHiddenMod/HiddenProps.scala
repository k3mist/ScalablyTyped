package typings
package atMaterialDashUiCoreLib.hiddenHiddenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof {}, 'classes' | never> ]: {}[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<{}, never, never>) */ trait HiddenProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[scala.Nothing] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var implementation: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.JS | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.css
  ] = js.undefined
  var initialWidth: js.UndefOr[atMaterialDashUiCoreLib.stylesCreateBreakpointsMod.Breakpoint] = js.undefined
  var lgDown: js.UndefOr[scala.Boolean] = js.undefined
  var lgUp: js.UndefOr[scala.Boolean] = js.undefined
  var mdDown: js.UndefOr[scala.Boolean] = js.undefined
  var mdUp: js.UndefOr[scala.Boolean] = js.undefined
  var only: js.UndefOr[
    atMaterialDashUiCoreLib.stylesCreateBreakpointsMod.Breakpoint | js.Array[atMaterialDashUiCoreLib.stylesCreateBreakpointsMod.Breakpoint]
  ] = js.undefined
  var smDown: js.UndefOr[scala.Boolean] = js.undefined
  var smUp: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var xlDown: js.UndefOr[scala.Boolean] = js.undefined
  var xlUp: js.UndefOr[scala.Boolean] = js.undefined
  var xsDown: js.UndefOr[scala.Boolean] = js.undefined
  var xsUp: js.UndefOr[scala.Boolean] = js.undefined
}

object HiddenProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[scala.Nothing]] = null,
    implementation: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.JS | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.css = null,
    initialWidth: atMaterialDashUiCoreLib.stylesCreateBreakpointsMod.Breakpoint = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    lgDown: js.UndefOr[scala.Boolean] = js.undefined,
    lgUp: js.UndefOr[scala.Boolean] = js.undefined,
    mdDown: js.UndefOr[scala.Boolean] = js.undefined,
    mdUp: js.UndefOr[scala.Boolean] = js.undefined,
    only: atMaterialDashUiCoreLib.stylesCreateBreakpointsMod.Breakpoint | js.Array[atMaterialDashUiCoreLib.stylesCreateBreakpointsMod.Breakpoint] = null,
    smDown: js.UndefOr[scala.Boolean] = js.undefined,
    smUp: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    xlDown: js.UndefOr[scala.Boolean] = js.undefined,
    xlUp: js.UndefOr[scala.Boolean] = js.undefined,
    xsDown: js.UndefOr[scala.Boolean] = js.undefined,
    xsUp: js.UndefOr[scala.Boolean] = js.undefined
  ): HiddenProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (implementation != null) __obj.updateDynamic("implementation")(implementation.asInstanceOf[js.Any])
    if (initialWidth != null) __obj.updateDynamic("initialWidth")(initialWidth)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(lgDown)) __obj.updateDynamic("lgDown")(lgDown)
    if (!js.isUndefined(lgUp)) __obj.updateDynamic("lgUp")(lgUp)
    if (!js.isUndefined(mdDown)) __obj.updateDynamic("mdDown")(mdDown)
    if (!js.isUndefined(mdUp)) __obj.updateDynamic("mdUp")(mdUp)
    if (only != null) __obj.updateDynamic("only")(only.asInstanceOf[js.Any])
    if (!js.isUndefined(smDown)) __obj.updateDynamic("smDown")(smDown)
    if (!js.isUndefined(smUp)) __obj.updateDynamic("smUp")(smUp)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(xlDown)) __obj.updateDynamic("xlDown")(xlDown)
    if (!js.isUndefined(xlUp)) __obj.updateDynamic("xlUp")(xlUp)
    if (!js.isUndefined(xsDown)) __obj.updateDynamic("xsDown")(xsDown)
    if (!js.isUndefined(xsUp)) __obj.updateDynamic("xsUp")(xsUp)
    __obj.asInstanceOf[HiddenProps]
  }
}

