package typings
package jqueryDotTinycarouselLib.JQueryTinyCarouselNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryTinyCarouselOptions extends js.Object {
  /**
    * Show animation when changing block? (default: true)
    */
  var animation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Vertical or horizontal scroller? 'x' or 'y'. (default: 'x')
    */
  var axis: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Function that executes after every move (default: null)
    */
  var callback: js.UndefOr[
    js.Function2[/* element */ stdLib.HTMLElement, /* index */ scala.Double, scala.Unit]
  ] = js.undefined
  /**
    * Show left and right navigation buttons? (default: true)
    */
  var controls: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * How many blocks do you want to move at a time? (default: 1)
    */
  var display: js.UndefOr[scala.Double] = js.undefined
  /**
    * Time of the animation in miliseconds (default: 1000)
    */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
    * Move to the next block on an interval. (default: false)
    */
  var interval: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Interval time in milliseconds. (default: 3000)
    */
  var intervaltime: js.UndefOr[scala.Double] = js.undefined
  /**
    * Show page number navigation buttons? (default: false)
    */
  var pager: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If interval is true and rewind is true it will play in reverse if the last slide is reached. (default: false)
    */
  var rewind: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Start block of the carousel. (default: 1)
    */
  var start: js.UndefOr[scala.Double] = js.undefined
}

object JQueryTinyCarouselOptions {
  @scala.inline
  def apply(
    animation: js.UndefOr[scala.Boolean] = js.undefined,
    axis: java.lang.String = null,
    callback: js.Function2[/* element */ stdLib.HTMLElement, /* index */ scala.Double, scala.Unit] = null,
    controls: js.UndefOr[scala.Boolean] = js.undefined,
    display: scala.Int | scala.Double = null,
    duration: scala.Int | scala.Double = null,
    interval: js.UndefOr[scala.Boolean] = js.undefined,
    intervaltime: scala.Int | scala.Double = null,
    pager: js.UndefOr[scala.Boolean] = js.undefined,
    rewind: js.UndefOr[scala.Boolean] = js.undefined,
    start: scala.Int | scala.Double = null
  ): JQueryTinyCarouselOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation)
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls)
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval)
    if (intervaltime != null) __obj.updateDynamic("intervaltime")(intervaltime.asInstanceOf[js.Any])
    if (!js.isUndefined(pager)) __obj.updateDynamic("pager")(pager)
    if (!js.isUndefined(rewind)) __obj.updateDynamic("rewind")(rewind)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryTinyCarouselOptions]
  }
}

