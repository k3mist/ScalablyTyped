package typings
package jqueryDotGrowlLib.growlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  // while hovering over the alert, prevent it from being dismissed (true | false - default: true)
  var delayOnHover: js.UndefOr[scala.Boolean] = js.undefined
  // the duration (in milliseconds) for which the alert is displayed (default: 3200)
  var duration: js.UndefOr[scala.Double] = js.undefined
  // whether the alert should be fixed rather than auto- dismissed(true | false - default: false)
  var fixed: js.UndefOr[scala.Boolean] = js.undefined
  // the alert's position ('tl' | 'tr' | 'bl' | 'br' | 'tc' | 'bc' - default: 'tr')
  var location: js.UndefOr[java.lang.String] = js.undefined
  // Message
  var message: java.lang.String
  // the alert's size ('small' | 'medium' | 'large' - default: 'medium')
  var size: js.UndefOr[java.lang.String] = js.undefined
  // the alert's style ('default' | 'error' | 'notice' | 'warning' - default: 'default')
  var style: js.UndefOr[java.lang.String] = js.undefined
  // Title
  var title: js.UndefOr[java.lang.String] = js.undefined
  // URL
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    message: java.lang.String,
    delayOnHover: js.UndefOr[scala.Boolean] = js.undefined,
    duration: scala.Int | scala.Double = null,
    fixed: js.UndefOr[scala.Boolean] = js.undefined,
    location: java.lang.String = null,
    size: java.lang.String = null,
    style: java.lang.String = null,
    title: java.lang.String = null,
    url: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal(message = message)
    if (!js.isUndefined(delayOnHover)) __obj.updateDynamic("delayOnHover")(delayOnHover)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed)
    if (location != null) __obj.updateDynamic("location")(location)
    if (size != null) __obj.updateDynamic("size")(size)
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Options]
  }
}

