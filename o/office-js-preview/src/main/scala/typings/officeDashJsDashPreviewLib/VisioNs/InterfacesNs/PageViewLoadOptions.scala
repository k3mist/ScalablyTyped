package typings
package officeDashJsDashPreviewLib.VisioNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the PageView class.
  *
  * [Api set:  1.1]
  */
trait PageViewLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Get and set Page's Zoom level. The value can be between 10 and 400 and denotes the percentage of zoom.
    *
    * [Api set:  1.1]
    */
  var zoom: js.UndefOr[scala.Boolean] = js.undefined
}

object PageViewLoadOptions {
  @scala.inline
  def apply($all: js.UndefOr[scala.Boolean] = js.undefined, zoom: js.UndefOr[scala.Boolean] = js.undefined): PageViewLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom)
    __obj.asInstanceOf[PageViewLoadOptions]
  }
}

