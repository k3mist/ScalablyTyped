package typings
package atEgjsAxesLib.inputTypeInputTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInputType extends js.Object {
  var axes: js.Array[java.lang.String]
  var disable: js.UndefOr[js.Function0[_]] = js.undefined
  var element: stdLib.HTMLElement
  var enable: js.UndefOr[js.Function0[_]] = js.undefined
  var hammer: js.UndefOr[js.Any] = js.undefined
  var isEnable: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  def connect(observer: IInputTypeObserver): IInputType
  def destroy(): js.Any
  def disconnect(): js.Any
  def mapAxes(axes: js.Array[java.lang.String]): js.Any
}

object IInputType {
  @scala.inline
  def apply(
    axes: js.Array[java.lang.String],
    connect: js.Function1[IInputTypeObserver, IInputType],
    destroy: js.Function0[js.Any],
    disconnect: js.Function0[js.Any],
    element: stdLib.HTMLElement,
    mapAxes: js.Function1[js.Array[java.lang.String], js.Any],
    disable: js.Function0[_] = null,
    enable: js.Function0[_] = null,
    hammer: js.Any = null,
    isEnable: js.Function0[scala.Boolean] = null
  ): IInputType = {
    val __obj = js.Dynamic.literal(axes = axes, connect = connect, destroy = destroy, disconnect = disconnect, element = element, mapAxes = mapAxes)
    if (disable != null) __obj.updateDynamic("disable")(disable)
    if (enable != null) __obj.updateDynamic("enable")(enable)
    if (hammer != null) __obj.updateDynamic("hammer")(hammer)
    if (isEnable != null) __obj.updateDynamic("isEnable")(isEnable)
    __obj.asInstanceOf[IInputType]
  }
}

