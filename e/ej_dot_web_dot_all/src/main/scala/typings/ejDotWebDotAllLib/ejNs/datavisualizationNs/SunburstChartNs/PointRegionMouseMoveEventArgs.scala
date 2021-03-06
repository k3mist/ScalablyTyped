package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointRegionMouseMoveEventArgs extends js.Object {
  /** Set this option to true to cancel the event
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Includes data of mouse moved region
    */
  var data: js.UndefOr[java.lang.String] = js.undefined
  /** Instance of the sunburst model object
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object PointRegionMouseMoveEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    data: java.lang.String = null,
    model: js.Any = null,
    `type`: java.lang.String = null
  ): PointRegionMouseMoveEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (data != null) __obj.updateDynamic("data")(data)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PointRegionMouseMoveEventArgs]
  }
}

