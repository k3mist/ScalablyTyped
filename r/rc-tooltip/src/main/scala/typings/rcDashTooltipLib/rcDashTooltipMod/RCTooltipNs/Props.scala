package typings
package rcDashTooltipLib.rcDashTooltipMod.RCTooltipNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props
  extends reactLib.reactMod.ReactNs.Props[js.Any] {
  var afterVisibleChange: js.UndefOr[js.Function1[/* visible */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  var align: js.UndefOr[js.Object] = js.undefined
  var arrowContent: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var defaultVisible: js.UndefOr[scala.Boolean] = js.undefined
  var destroyTooltipOnHide: js.UndefOr[scala.Boolean] = js.undefined
  var getTooltipContainer: js.UndefOr[js.Function0[reactLib.Element]] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var mouseEnterDelay: js.UndefOr[scala.Double] = js.undefined
  var mouseLeaveDelay: js.UndefOr[scala.Double] = js.undefined
  var onPopupAlign: js.UndefOr[
    js.Function2[/* popupDomNode */ reactLib.Element, /* align */ js.Object, scala.Unit]
  ] = js.undefined
  var onVisibleChange: js.UndefOr[js.Function1[/* visible */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  var overlay: reactLib.reactMod.ReactNs.ReactNode
  var overlayClassName: js.UndefOr[java.lang.String] = js.undefined
  var overlayStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var placement: js.UndefOr[Placement | js.Object] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var transitionName: js.UndefOr[java.lang.String] = js.undefined
  var trigger: js.UndefOr[js.Array[Trigger]] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    overlay: reactLib.reactMod.ReactNs.ReactNode,
    afterVisibleChange: js.Function1[/* visible */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    align: js.Object = null,
    arrowContent: reactLib.reactMod.ReactNs.ReactNode = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    defaultVisible: js.UndefOr[scala.Boolean] = js.undefined,
    destroyTooltipOnHide: js.UndefOr[scala.Boolean] = js.undefined,
    getTooltipContainer: js.Function0[reactLib.Element] = null,
    id: java.lang.String = null,
    key: reactLib.reactMod.ReactNs.Key = null,
    mouseEnterDelay: scala.Int | scala.Double = null,
    mouseLeaveDelay: scala.Int | scala.Double = null,
    onPopupAlign: js.Function2[/* popupDomNode */ reactLib.Element, /* align */ js.Object, scala.Unit] = null,
    onVisibleChange: js.Function1[/* visible */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    overlayClassName: java.lang.String = null,
    overlayStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    placement: Placement | js.Object = null,
    prefixCls: java.lang.String = null,
    ref: reactLib.reactMod.ReactNs.LegacyRef[js.Any] = null,
    transitionName: java.lang.String = null,
    trigger: js.Array[Trigger] = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
    if (afterVisibleChange != null) __obj.updateDynamic("afterVisibleChange")(afterVisibleChange)
    if (align != null) __obj.updateDynamic("align")(align)
    if (arrowContent != null) __obj.updateDynamic("arrowContent")(arrowContent.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultVisible)) __obj.updateDynamic("defaultVisible")(defaultVisible)
    if (!js.isUndefined(destroyTooltipOnHide)) __obj.updateDynamic("destroyTooltipOnHide")(destroyTooltipOnHide)
    if (getTooltipContainer != null) __obj.updateDynamic("getTooltipContainer")(getTooltipContainer)
    if (id != null) __obj.updateDynamic("id")(id)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (mouseEnterDelay != null) __obj.updateDynamic("mouseEnterDelay")(mouseEnterDelay.asInstanceOf[js.Any])
    if (mouseLeaveDelay != null) __obj.updateDynamic("mouseLeaveDelay")(mouseLeaveDelay.asInstanceOf[js.Any])
    if (onPopupAlign != null) __obj.updateDynamic("onPopupAlign")(onPopupAlign)
    if (onVisibleChange != null) __obj.updateDynamic("onVisibleChange")(onVisibleChange)
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName)
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle)
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[Props]
  }
}

