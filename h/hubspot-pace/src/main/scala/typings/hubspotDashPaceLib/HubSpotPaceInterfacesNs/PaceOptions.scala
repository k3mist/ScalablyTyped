package typings
package hubspotDashPaceLib.HubSpotPaceInterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaceOptions extends js.Object {
  var ajax: js.UndefOr[scala.Boolean | PaceAjaxOptions] = js.undefined
  /**
    * How long should it take for the bar to animate to a new point after receiving it
    */
  var catchupTime: js.UndefOr[scala.Double] = js.undefined
  var document: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /**
    * This tweaks the animation easing
    */
  var easeFactor: js.UndefOr[scala.Double] = js.undefined
  var elements: js.UndefOr[scala.Boolean | PaceElementsOptions] = js.undefined
  var eventLag: js.UndefOr[scala.Boolean | PaceEventLagOptions] = js.undefined
  /**
    * What is the minimum amount of time the bar should sit after the last update before disappearing
    */
  var ghostTime: js.UndefOr[scala.Double] = js.undefined
  /**
    * How quickly should the bar be moving before it has any progress info from a new source in %/ms
    */
  var initialRate: js.UndefOr[scala.Double] = js.undefined
  /**
    * Its easy for a bunch of the bar to be eaten in the first few frames before we know how much there is to load. This limits how much of the bar can be used per frame
    */
  var maxProgressPerFrame: js.UndefOr[scala.Double] = js.undefined
  /**
    * What is the minimum amount of time the bar should be on the screen. Irrespective of this number, the bar will always be on screen for 33 * (100 / maxProgressPerFrame) + ghostTime ms.
    */
  var minTime: js.UndefOr[scala.Double] = js.undefined
  /**
    * Should we restart the browser when pushState or replaceState is called?  (Generally means ajax navigation has occured)
    */
  var restartOnPushState: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Should we show the progress bar for every ajax request (not just regular or ajax-y page navigation)? Set to false to disable. If so, how many ms does the request have to be running for before we show the progress?
    */
  var restartOnRequestAfter: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  /**
    * Should pace automatically start when the page is loaded, or should it wait for `start` to be called? Always false if pace is loaded with AMD or CommonJS.
    */
  var startOnPageLoad: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * What element should the pace element be appended to on the page?
    */
  var target: js.UndefOr[java.lang.String] = js.undefined
}

object PaceOptions {
  @scala.inline
  def apply(
    ajax: scala.Boolean | PaceAjaxOptions = null,
    catchupTime: scala.Int | scala.Double = null,
    document: scala.Boolean | java.lang.String = null,
    easeFactor: scala.Int | scala.Double = null,
    elements: scala.Boolean | PaceElementsOptions = null,
    eventLag: scala.Boolean | PaceEventLagOptions = null,
    ghostTime: scala.Int | scala.Double = null,
    initialRate: scala.Int | scala.Double = null,
    maxProgressPerFrame: scala.Int | scala.Double = null,
    minTime: scala.Int | scala.Double = null,
    restartOnPushState: js.UndefOr[scala.Boolean] = js.undefined,
    restartOnRequestAfter: scala.Boolean | scala.Double = null,
    startOnPageLoad: js.UndefOr[scala.Boolean] = js.undefined,
    target: java.lang.String = null
  ): PaceOptions = {
    val __obj = js.Dynamic.literal()
    if (ajax != null) __obj.updateDynamic("ajax")(ajax.asInstanceOf[js.Any])
    if (catchupTime != null) __obj.updateDynamic("catchupTime")(catchupTime.asInstanceOf[js.Any])
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (easeFactor != null) __obj.updateDynamic("easeFactor")(easeFactor.asInstanceOf[js.Any])
    if (elements != null) __obj.updateDynamic("elements")(elements.asInstanceOf[js.Any])
    if (eventLag != null) __obj.updateDynamic("eventLag")(eventLag.asInstanceOf[js.Any])
    if (ghostTime != null) __obj.updateDynamic("ghostTime")(ghostTime.asInstanceOf[js.Any])
    if (initialRate != null) __obj.updateDynamic("initialRate")(initialRate.asInstanceOf[js.Any])
    if (maxProgressPerFrame != null) __obj.updateDynamic("maxProgressPerFrame")(maxProgressPerFrame.asInstanceOf[js.Any])
    if (minTime != null) __obj.updateDynamic("minTime")(minTime.asInstanceOf[js.Any])
    if (!js.isUndefined(restartOnPushState)) __obj.updateDynamic("restartOnPushState")(restartOnPushState)
    if (restartOnRequestAfter != null) __obj.updateDynamic("restartOnRequestAfter")(restartOnRequestAfter.asInstanceOf[js.Any])
    if (!js.isUndefined(startOnPageLoad)) __obj.updateDynamic("startOnPageLoad")(startOnPageLoad)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[PaceOptions]
  }
}

