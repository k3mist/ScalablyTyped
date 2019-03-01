package typings
package rheostatLib.rheostatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends Events {
  var algorithm: js.UndefOr[Algorithm] = js.undefined
  var autoAdjustVerticalPosition: js.UndefOr[scala.Boolean] = js.undefined
  var background: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var handle: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var orientation: js.UndefOr[Orientation] = js.undefined
  var pitComponent: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var pitPoints: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var progressBar: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var snap: js.UndefOr[scala.Boolean] = js.undefined
  var snapPoints: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var values: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    algorithm: Algorithm = null,
    autoAdjustVerticalPosition: js.UndefOr[scala.Boolean] = js.undefined,
    background: reactLib.reactMod.ReactNs.ReactType[_] = null,
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    getNextHandlePosition: js.Function2[/* handleIdx */ scala.Double, /* percentPosition */ scala.Double, scala.Double] = null,
    handle: reactLib.reactMod.ReactNs.ReactType[_] = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    onChange: js.Function1[/* publicState */ PublicState, _] = null,
    onClick: js.Function0[_] = null,
    onKeyPress: js.Function0[_] = null,
    onSliderDragEnd: js.Function0[_] = null,
    onSliderDragMove: js.Function0[_] = null,
    onSliderDragStart: js.Function0[_] = null,
    onValuesUpdated: js.Function1[/* publicState */ PublicState, _] = null,
    orientation: Orientation = null,
    pitComponent: reactLib.reactMod.ReactNs.ReactType[_] = null,
    pitPoints: js.Array[scala.Double] = null,
    progressBar: reactLib.reactMod.ReactNs.ReactType[_] = null,
    snap: js.UndefOr[scala.Boolean] = js.undefined,
    snapPoints: js.Array[scala.Double] = null,
    values: js.Array[scala.Double] = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm)
    if (!js.isUndefined(autoAdjustVerticalPosition)) __obj.updateDynamic("autoAdjustVerticalPosition")(autoAdjustVerticalPosition)
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (getNextHandlePosition != null) __obj.updateDynamic("getNextHandlePosition")(getNextHandlePosition)
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(onKeyPress)
    if (onSliderDragEnd != null) __obj.updateDynamic("onSliderDragEnd")(onSliderDragEnd)
    if (onSliderDragMove != null) __obj.updateDynamic("onSliderDragMove")(onSliderDragMove)
    if (onSliderDragStart != null) __obj.updateDynamic("onSliderDragStart")(onSliderDragStart)
    if (onValuesUpdated != null) __obj.updateDynamic("onValuesUpdated")(onValuesUpdated)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (pitComponent != null) __obj.updateDynamic("pitComponent")(pitComponent.asInstanceOf[js.Any])
    if (pitPoints != null) __obj.updateDynamic("pitPoints")(pitPoints)
    if (progressBar != null) __obj.updateDynamic("progressBar")(progressBar.asInstanceOf[js.Any])
    if (!js.isUndefined(snap)) __obj.updateDynamic("snap")(snap)
    if (snapPoints != null) __obj.updateDynamic("snapPoints")(snapPoints)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[Props]
  }
}

