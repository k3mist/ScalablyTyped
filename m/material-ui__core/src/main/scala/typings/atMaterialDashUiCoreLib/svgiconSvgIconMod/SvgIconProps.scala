package typings
package atMaterialDashUiCoreLib.svgiconSvgIconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.SVGProps<react.SVGSVGElement>, 'classes' | never> ]: react.react.SVGProps<react.SVGSVGElement>[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<react.react.SVGProps<react.SVGSVGElement>, @material-ui/core.@material-ui/core/SvgIcon/SvgIcon.SvgIconClassKey, never>) */ trait SvgIconProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[SvgIconClassKey] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreMod.PropTypesNs.Color | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.action | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.disabled | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.error
  ] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[SvgIconProps]] = js.undefined
  var fontSize: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.inherit | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.default | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.small | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.large
  ] = js.undefined
  var nativeColor: js.UndefOr[java.lang.String] = js.undefined
  var shapeRendering: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var titleAccess: js.UndefOr[java.lang.String] = js.undefined
  var viewBox: js.UndefOr[java.lang.String] = js.undefined
}

object SvgIconProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[SvgIconClassKey]] = null,
    color: atMaterialDashUiCoreLib.atMaterialDashUiCoreMod.PropTypesNs.Color | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.action | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.disabled | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.error = null,
    component: reactLib.reactMod.ReactNs.ReactType[SvgIconProps] = null,
    fontSize: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.inherit | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.default | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.small | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.large = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    nativeColor: java.lang.String = null,
    shapeRendering: java.lang.String = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    titleAccess: java.lang.String = null,
    viewBox: java.lang.String = null
  ): SvgIconProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (nativeColor != null) __obj.updateDynamic("nativeColor")(nativeColor)
    if (shapeRendering != null) __obj.updateDynamic("shapeRendering")(shapeRendering)
    if (style != null) __obj.updateDynamic("style")(style)
    if (titleAccess != null) __obj.updateDynamic("titleAccess")(titleAccess)
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox)
    __obj.asInstanceOf[SvgIconProps]
  }
}

