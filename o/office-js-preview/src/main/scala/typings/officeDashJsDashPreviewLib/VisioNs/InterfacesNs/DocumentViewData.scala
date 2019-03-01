package typings
package officeDashJsDashPreviewLib.VisioNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "documentView.toJSON()". */
trait DocumentViewData extends js.Object {
  /**
    *
    * Disable Hyperlinks.
    *
    * [Api set:  1.1]
    */
  var disableHyperlinks: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Disable Pan.
    *
    * [Api set:  1.1]
    */
  var disablePan: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Disable PanZoomWindow.
    *
    * [Api set:  1.1]
    */
  var disablePanZoomWindow: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Disable Zoom.
    *
    * [Api set:  1.1]
    */
  var disableZoom: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Hide Diagram Boundary.
    *
    * [Api set:  1.1]
    */
  var hideDiagramBoundary: js.UndefOr[scala.Boolean] = js.undefined
}

object DocumentViewData {
  @scala.inline
  def apply(
    disableHyperlinks: js.UndefOr[scala.Boolean] = js.undefined,
    disablePan: js.UndefOr[scala.Boolean] = js.undefined,
    disablePanZoomWindow: js.UndefOr[scala.Boolean] = js.undefined,
    disableZoom: js.UndefOr[scala.Boolean] = js.undefined,
    hideDiagramBoundary: js.UndefOr[scala.Boolean] = js.undefined
  ): DocumentViewData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableHyperlinks)) __obj.updateDynamic("disableHyperlinks")(disableHyperlinks)
    if (!js.isUndefined(disablePan)) __obj.updateDynamic("disablePan")(disablePan)
    if (!js.isUndefined(disablePanZoomWindow)) __obj.updateDynamic("disablePanZoomWindow")(disablePanZoomWindow)
    if (!js.isUndefined(disableZoom)) __obj.updateDynamic("disableZoom")(disableZoom)
    if (!js.isUndefined(hideDiagramBoundary)) __obj.updateDynamic("hideDiagramBoundary")(hideDiagramBoundary)
    __obj.asInstanceOf[DocumentViewData]
  }
}

