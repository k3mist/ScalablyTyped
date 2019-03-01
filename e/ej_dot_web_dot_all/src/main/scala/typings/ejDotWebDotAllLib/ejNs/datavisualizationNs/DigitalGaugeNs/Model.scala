package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DigitalGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Fires, on clicking the gauge.
    */
  var Click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, scala.Unit]] = js.undefined
  /** Fires, on double clicking the digital gauge.
    */
  var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, scala.Unit]] = js.undefined
  /** Specifies the responsiveness of the Digital gauge
    * @Default {false}
    */
  var enableResize: js.UndefOr[scala.Boolean] = js.undefined
  /** This provides options for customizing export settings
    */
  var exportSettings: js.UndefOr[ExportSettings] = js.undefined
  /** Specifies the frame of the Digital gauge.
    * @Default {{backgroundImageUrl: null, innerWidth: 6, outerWidth: 10}}
    */
  var frame: js.UndefOr[Frame] = js.undefined
  /** Specifies the height of the DigitalGauge.
    * @Default {150}
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** Triggers when the gauge is initialized.
    */
  var init: js.UndefOr[js.Function1[/* e */ InitEventArgs, scala.Unit]] = js.undefined
  /** Specifies the resize option of the DigitalGauge.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[scala.Boolean] = js.undefined
  /** Triggers when the gauge item rendering.
    */
  var itemRendering: js.UndefOr[js.Function1[/* e */ ItemRenderingEventArgs, scala.Unit]] = js.undefined
  /** Specifies the items for the DigitalGauge.
    * @Default {null}
    */
  var items: js.UndefOr[js.Array[Item]] = js.undefined
  /** Triggers when the gauge is start to load.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, scala.Unit]] = js.undefined
  /** Specifies the matrixSegmentData for the DigitalGauge.
    */
  var matrixSegmentData: js.UndefOr[js.Any] = js.undefined
  /** Triggers when the gauge render is completed.
    */
  var renderComplete: js.UndefOr[js.Function1[/* e */ RenderCompleteEventArgs, scala.Unit]] = js.undefined
  /** Fires, on right clicking the digital gauge.
    */
  var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, scala.Unit]] = js.undefined
  /** Specifies the segmentData for the DigitalGauge.
    */
  var segmentData: js.UndefOr[js.Any] = js.undefined
  /** Specifies the themes for the Digital gauge. See Themes
    * @Default {flatlight}
    */
  var themes: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the value to the DigitalGauge.
    * @Default {text}
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the width for the Digital gauge.
    * @Default {400}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    Click: js.Function1[/* e */ ClickEventArgs, scala.Unit] = null,
    doubleClick: js.Function1[/* e */ DoubleClickEventArgs, scala.Unit] = null,
    enableResize: js.UndefOr[scala.Boolean] = js.undefined,
    exportSettings: ExportSettings = null,
    frame: Frame = null,
    height: scala.Int | scala.Double = null,
    init: js.Function1[/* e */ InitEventArgs, scala.Unit] = null,
    isResponsive: js.UndefOr[scala.Boolean] = js.undefined,
    itemRendering: js.Function1[/* e */ ItemRenderingEventArgs, scala.Unit] = null,
    items: js.Array[Item] = null,
    load: js.Function1[/* e */ LoadEventArgs, scala.Unit] = null,
    matrixSegmentData: js.Any = null,
    renderComplete: js.Function1[/* e */ RenderCompleteEventArgs, scala.Unit] = null,
    rightClick: js.Function1[/* e */ RightClickEventArgs, scala.Unit] = null,
    segmentData: js.Any = null,
    themes: java.lang.String = null,
    value: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (Click != null) __obj.updateDynamic("Click")(Click)
    if (doubleClick != null) __obj.updateDynamic("doubleClick")(doubleClick)
    if (!js.isUndefined(enableResize)) __obj.updateDynamic("enableResize")(enableResize)
    if (exportSettings != null) __obj.updateDynamic("exportSettings")(exportSettings)
    if (frame != null) __obj.updateDynamic("frame")(frame)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(init)
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive)
    if (itemRendering != null) __obj.updateDynamic("itemRendering")(itemRendering)
    if (items != null) __obj.updateDynamic("items")(items)
    if (load != null) __obj.updateDynamic("load")(load)
    if (matrixSegmentData != null) __obj.updateDynamic("matrixSegmentData")(matrixSegmentData)
    if (renderComplete != null) __obj.updateDynamic("renderComplete")(renderComplete)
    if (rightClick != null) __obj.updateDynamic("rightClick")(rightClick)
    if (segmentData != null) __obj.updateDynamic("segmentData")(segmentData)
    if (themes != null) __obj.updateDynamic("themes")(themes)
    if (value != null) __obj.updateDynamic("value")(value)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

