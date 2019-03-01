package typings
package reactDashBurgerDashMenuLib.reactDashBurgerDashMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var bodyClassName: js.UndefOr[java.lang.String] = js.undefined
  var burgerBarClassName: js.UndefOr[java.lang.String] = js.undefined
  var burgerButtonClassName: js.UndefOr[java.lang.String] = js.undefined
  var crossButtonClassName: js.UndefOr[java.lang.String] = js.undefined
  var crossClassName: js.UndefOr[java.lang.String] = js.undefined
  var customBurgerIcon: js.UndefOr[
    reactLib.reactMod.Global.JSXNs.Element | reactDashBurgerDashMenuLib.reactDashBurgerDashMenuLibNumbers.`false`
  ] = js.undefined
  var customCrossIcon: js.UndefOr[
    reactLib.reactMod.Global.JSXNs.Element | reactDashBurgerDashMenuLib.reactDashBurgerDashMenuLibNumbers.`false`
  ] = js.undefined
  var disableOverlayClick: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var isOpen: js.UndefOr[scala.Boolean] = js.undefined
  var itemListClassName: js.UndefOr[java.lang.String] = js.undefined
  var menuClassName: js.UndefOr[java.lang.String] = js.undefined
  var morphShapeClassName: js.UndefOr[java.lang.String] = js.undefined
  var noOverlay: js.UndefOr[scala.Boolean] = js.undefined
  var onStateChange: js.UndefOr[js.Function1[/* state */ State, scala.Unit]] = js.undefined
  // TODO (Rajab) This can be improved, though I do not know how. From PropTypes:
  // styles && styles.outerContainer ? PropTypes.string.isRequired : PropTypes.string
  var outerContainerId: js.UndefOr[java.lang.String] = js.undefined
  var overlayClassName: js.UndefOr[java.lang.String] = js.undefined
  // TODO (Rajab) This can be improved, though I do not know how. From PropTypes:
  // styles && styles.pageWrap ? PropTypes.string.isRequired : PropTypes.string,
  var pageWrapId: js.UndefOr[java.lang.String] = js.undefined
  var right: js.UndefOr[scala.Boolean] = js.undefined
  var styles: js.UndefOr[Styles] = js.undefined
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    bodyClassName: java.lang.String = null,
    burgerBarClassName: java.lang.String = null,
    burgerButtonClassName: java.lang.String = null,
    crossButtonClassName: java.lang.String = null,
    crossClassName: java.lang.String = null,
    customBurgerIcon: reactLib.reactMod.Global.JSXNs.Element | reactDashBurgerDashMenuLib.reactDashBurgerDashMenuLibNumbers.`false` = null,
    customCrossIcon: reactLib.reactMod.Global.JSXNs.Element | reactDashBurgerDashMenuLib.reactDashBurgerDashMenuLibNumbers.`false` = null,
    disableOverlayClick: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    isOpen: js.UndefOr[scala.Boolean] = js.undefined,
    itemListClassName: java.lang.String = null,
    menuClassName: java.lang.String = null,
    morphShapeClassName: java.lang.String = null,
    noOverlay: js.UndefOr[scala.Boolean] = js.undefined,
    onStateChange: js.Function1[/* state */ State, scala.Unit] = null,
    outerContainerId: java.lang.String = null,
    overlayClassName: java.lang.String = null,
    pageWrapId: java.lang.String = null,
    right: js.UndefOr[scala.Boolean] = js.undefined,
    styles: Styles = null,
    width: scala.Double | java.lang.String = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (bodyClassName != null) __obj.updateDynamic("bodyClassName")(bodyClassName)
    if (burgerBarClassName != null) __obj.updateDynamic("burgerBarClassName")(burgerBarClassName)
    if (burgerButtonClassName != null) __obj.updateDynamic("burgerButtonClassName")(burgerButtonClassName)
    if (crossButtonClassName != null) __obj.updateDynamic("crossButtonClassName")(crossButtonClassName)
    if (crossClassName != null) __obj.updateDynamic("crossClassName")(crossClassName)
    if (customBurgerIcon != null) __obj.updateDynamic("customBurgerIcon")(customBurgerIcon.asInstanceOf[js.Any])
    if (customCrossIcon != null) __obj.updateDynamic("customCrossIcon")(customCrossIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(disableOverlayClick)) __obj.updateDynamic("disableOverlayClick")(disableOverlayClick)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (itemListClassName != null) __obj.updateDynamic("itemListClassName")(itemListClassName)
    if (menuClassName != null) __obj.updateDynamic("menuClassName")(menuClassName)
    if (morphShapeClassName != null) __obj.updateDynamic("morphShapeClassName")(morphShapeClassName)
    if (!js.isUndefined(noOverlay)) __obj.updateDynamic("noOverlay")(noOverlay)
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(onStateChange)
    if (outerContainerId != null) __obj.updateDynamic("outerContainerId")(outerContainerId)
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName)
    if (pageWrapId != null) __obj.updateDynamic("pageWrapId")(pageWrapId)
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

