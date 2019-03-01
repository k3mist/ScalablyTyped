package typings
package antdLib.libDrawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerProps extends js.Object {
  var bodyStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var closable: js.UndefOr[scala.Boolean] = js.undefined
  var destroyOnClose: js.UndefOr[scala.Boolean] = js.undefined
  var getContainer: js.UndefOr[java.lang.String | reactLib.HTMLElement | getContainerFunc] = js.undefined
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var mask: js.UndefOr[scala.Boolean] = js.undefined
  var maskClosable: js.UndefOr[scala.Boolean] = js.undefined
  var maskStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* e */ EventType, scala.Unit]] = js.undefined
  var placement: js.UndefOr[placementType] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var push: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var wrapClassName: js.UndefOr[java.lang.String] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object DrawerProps {
  @scala.inline
  def apply(
    bodyStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    className: java.lang.String = null,
    closable: js.UndefOr[scala.Boolean] = js.undefined,
    destroyOnClose: js.UndefOr[scala.Boolean] = js.undefined,
    getContainer: java.lang.String | reactLib.HTMLElement | getContainerFunc = null,
    height: scala.Double | java.lang.String = null,
    mask: js.UndefOr[scala.Boolean] = js.undefined,
    maskClosable: js.UndefOr[scala.Boolean] = js.undefined,
    maskStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    onClose: js.Function1[/* e */ EventType, scala.Unit] = null,
    placement: placementType = null,
    prefixCls: java.lang.String = null,
    push: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    title: reactLib.reactMod.ReactNs.ReactNode = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Double | java.lang.String = null,
    wrapClassName: java.lang.String = null,
    zIndex: scala.Int | scala.Double = null
  ): DrawerProps = {
    val __obj = js.Dynamic.literal()
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable)
    if (!js.isUndefined(destroyOnClose)) __obj.updateDynamic("destroyOnClose")(destroyOnClose)
    if (getContainer != null) __obj.updateDynamic("getContainer")(getContainer.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask)
    if (!js.isUndefined(maskClosable)) __obj.updateDynamic("maskClosable")(maskClosable)
    if (maskStyle != null) __obj.updateDynamic("maskStyle")(maskStyle)
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (!js.isUndefined(push)) __obj.updateDynamic("push")(push)
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (wrapClassName != null) __obj.updateDynamic("wrapClassName")(wrapClassName)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerProps]
  }
}

