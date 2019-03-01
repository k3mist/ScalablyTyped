package typings
package officeDashJsLib.VisioNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the DocumentView class.
  *
  * [Api set:  1.1]
  */
trait DocumentViewLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
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

object DocumentViewLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    disableHyperlinks: js.UndefOr[scala.Boolean] = js.undefined,
    disablePan: js.UndefOr[scala.Boolean] = js.undefined,
    disableZoom: js.UndefOr[scala.Boolean] = js.undefined,
    hideDiagramBoundary: js.UndefOr[scala.Boolean] = js.undefined
  ): DocumentViewLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(disableHyperlinks)) __obj.updateDynamic("disableHyperlinks")(disableHyperlinks)
    if (!js.isUndefined(disablePan)) __obj.updateDynamic("disablePan")(disablePan)
    if (!js.isUndefined(disableZoom)) __obj.updateDynamic("disableZoom")(disableZoom)
    if (!js.isUndefined(hideDiagramBoundary)) __obj.updateDynamic("hideDiagramBoundary")(hideDiagramBoundary)
    __obj.asInstanceOf[DocumentViewLoadOptions]
  }
}

