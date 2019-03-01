package typings
package ejDotWebDotAllLib.ejNs.PivotClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplaySettings extends js.Object {
  /** Allows you to customize the display of the pivot chart and pivot grid widgets in the tabs or tiles.
    * @Default {ej.PivotClient.ControlPlacement.Tab}
    */
  var controlPlacement: js.UndefOr[ControlPlacement | java.lang.String] = js.undefined
  /** Allows you to set either the chart or grid as the start-up widget.
    * @Default {ej.PivotClient.DefaultView.Grid}
    */
  var defaultView: js.UndefOr[DefaultView | java.lang.String] = js.undefined
  /** Allows you to switch to full screen view of the pivot chart and the pivot grid from default view in the pivot client.
    * @Default {false}
    */
  var enableFullScreen: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables an option to enhance the space for the pivot grid and pivot chart by hiding the cube browser and the axis element builder.
    * @Default {false}
    */
  var enableTogglePanel: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets the display mode (only chart/only grid/both) in the pivot client.
    * @Default {ej.PivotClient.DisplayMode.ChartAndGrid}
    */
  var mode: js.UndefOr[DisplayMode | java.lang.String] = js.undefined
}

object DisplaySettings {
  @scala.inline
  def apply(
    controlPlacement: ControlPlacement | java.lang.String = null,
    defaultView: DefaultView | java.lang.String = null,
    enableFullScreen: js.UndefOr[scala.Boolean] = js.undefined,
    enableTogglePanel: js.UndefOr[scala.Boolean] = js.undefined,
    mode: DisplayMode | java.lang.String = null
  ): DisplaySettings = {
    val __obj = js.Dynamic.literal()
    if (controlPlacement != null) __obj.updateDynamic("controlPlacement")(controlPlacement.asInstanceOf[js.Any])
    if (defaultView != null) __obj.updateDynamic("defaultView")(defaultView.asInstanceOf[js.Any])
    if (!js.isUndefined(enableFullScreen)) __obj.updateDynamic("enableFullScreen")(enableFullScreen)
    if (!js.isUndefined(enableTogglePanel)) __obj.updateDynamic("enableTogglePanel")(enableTogglePanel)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplaySettings]
  }
}

