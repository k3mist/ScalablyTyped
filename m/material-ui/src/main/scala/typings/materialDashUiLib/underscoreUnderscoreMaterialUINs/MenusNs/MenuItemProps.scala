package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.MenusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemProps
  extends materialDashUiLib.underscoreUnderscoreMaterialUINs.ListNs.ListItemProps {
  // <ListItem/> is the element that get the 'other' properties
  var animation: js.UndefOr[
    reactLib.reactMod.ReactNs.ComponentClass[
      materialDashUiLib.underscoreUnderscoreMaterialUINs.PopoverNs.PopoverAnimationProps, 
      reactLib.reactMod.ReactNs.ComponentState
    ]
  ] = js.undefined
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  var desktop: js.UndefOr[scala.Boolean] = js.undefined
  var focusState: js.UndefOr[java.lang.String] = js.undefined
  var label: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var menuItems: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
}

object MenuItemProps {
  @scala.inline
  def apply(
    ListItemProps: materialDashUiLib.underscoreUnderscoreMaterialUINs.ListNs.ListItemProps = null,
    animation: reactLib.reactMod.ReactNs.ComponentClass[
      materialDashUiLib.underscoreUnderscoreMaterialUINs.PopoverNs.PopoverAnimationProps, 
      reactLib.reactMod.ReactNs.ComponentState
    ] = null,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    containerElement: reactLib.reactMod.ReactNs.ReactNode | java.lang.String = null,
    desktop: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    focusState: java.lang.String = null,
    innerDivStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    insetChildren: js.UndefOr[scala.Boolean] = js.undefined,
    label: java.lang.String | reactLib.reactMod.ReactNs.ReactNode = null,
    leftIcon: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    menuItems: reactLib.reactMod.ReactNs.ReactNode = null,
    onClick: reactLib.reactMod.ReactNs.MouseEventHandler[js.Object] = null,
    primaryText: reactLib.reactMod.ReactNs.ReactNode = null,
    rightIcon: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    secondaryText: reactLib.reactMod.ReactNs.ReactNode = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): MenuItemProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ListItemProps)
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (containerElement != null) __obj.updateDynamic("containerElement")(containerElement.asInstanceOf[js.Any])
    if (!js.isUndefined(desktop)) __obj.updateDynamic("desktop")(desktop)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (focusState != null) __obj.updateDynamic("focusState")(focusState)
    if (innerDivStyle != null) __obj.updateDynamic("innerDivStyle")(innerDivStyle)
    if (!js.isUndefined(insetChildren)) __obj.updateDynamic("insetChildren")(insetChildren)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (leftIcon != null) __obj.updateDynamic("leftIcon")(leftIcon)
    if (menuItems != null) __obj.updateDynamic("menuItems")(menuItems.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (primaryText != null) __obj.updateDynamic("primaryText")(primaryText.asInstanceOf[js.Any])
    if (rightIcon != null) __obj.updateDynamic("rightIcon")(rightIcon)
    if (secondaryText != null) __obj.updateDynamic("secondaryText")(secondaryText.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[MenuItemProps]
  }
}

