package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalSearchOptions extends js.Object {
  var onInfoHtmlSet: js.UndefOr[
    js.Function2[/* poi */ LocalResultPoi, /* html */ stdLib.HTMLElement, scala.Unit]
  ] = js.undefined
  var onMarkersSet: js.UndefOr[js.Function1[/* pois */ js.Array[LocalResultPoi], scala.Unit]] = js.undefined
  var onResultsHtmlSet: js.UndefOr[js.Function1[/* container */ stdLib.HTMLElement, scala.Unit]] = js.undefined
  var onSearchComplete: js.UndefOr[js.Function1[/* results */ js.Array[LocalResult], scala.Unit]] = js.undefined
  var pageCapacity: js.UndefOr[scala.Double] = js.undefined
  var renderOptions: js.UndefOr[RenderOptions] = js.undefined
}

object LocalSearchOptions {
  @scala.inline
  def apply(
    onInfoHtmlSet: js.Function2[/* poi */ LocalResultPoi, /* html */ stdLib.HTMLElement, scala.Unit] = null,
    onMarkersSet: js.Function1[/* pois */ js.Array[LocalResultPoi], scala.Unit] = null,
    onResultsHtmlSet: js.Function1[/* container */ stdLib.HTMLElement, scala.Unit] = null,
    onSearchComplete: js.Function1[/* results */ js.Array[LocalResult], scala.Unit] = null,
    pageCapacity: scala.Int | scala.Double = null,
    renderOptions: RenderOptions = null
  ): LocalSearchOptions = {
    val __obj = js.Dynamic.literal()
    if (onInfoHtmlSet != null) __obj.updateDynamic("onInfoHtmlSet")(onInfoHtmlSet)
    if (onMarkersSet != null) __obj.updateDynamic("onMarkersSet")(onMarkersSet)
    if (onResultsHtmlSet != null) __obj.updateDynamic("onResultsHtmlSet")(onResultsHtmlSet)
    if (onSearchComplete != null) __obj.updateDynamic("onSearchComplete")(onSearchComplete)
    if (pageCapacity != null) __obj.updateDynamic("pageCapacity")(pageCapacity.asInstanceOf[js.Any])
    if (renderOptions != null) __obj.updateDynamic("renderOptions")(renderOptions)
    __obj.asInstanceOf[LocalSearchOptions]
  }
}

