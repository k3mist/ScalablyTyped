package typings
package notifyjsDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationOptions extends js.Object {
  // show the arrow pointing at the element
  var arrowShow: scala.Boolean
  // arrow size in pixels
  var arrowSize: scala.Double
  // whether to auto-hide the notification
  var autoHide: scala.Boolean
  // if autoHide, hide after milliseconds
  var autoHideDelay: scala.Double
  // default class (string or [string])
  var className: java.lang.String
  // whether to hide the notification on click
  var clickToHide: scala.Boolean
  // default positions
  var elementPosition: java.lang.String
  // padding between element and notification
  var gap: scala.Double
  var globalPosition: java.lang.String
  // hide animation
  var hideAnimation: java.lang.String
  // hide animation duration
  var hideDuration: scala.Double
  // position defines the notification position though uses the defaults below
  var position: java.lang.String
  // show animation
  var showAnimation: java.lang.String
  // show animation duration
  var showDuration: scala.Double
  // default style
  var style: java.lang.String
}

object NotificationOptions {
  @scala.inline
  def apply(
    arrowShow: scala.Boolean,
    arrowSize: scala.Double,
    autoHide: scala.Boolean,
    autoHideDelay: scala.Double,
    className: java.lang.String,
    clickToHide: scala.Boolean,
    elementPosition: java.lang.String,
    gap: scala.Double,
    globalPosition: java.lang.String,
    hideAnimation: java.lang.String,
    hideDuration: scala.Double,
    position: java.lang.String,
    showAnimation: java.lang.String,
    showDuration: scala.Double,
    style: java.lang.String
  ): NotificationOptions = {
    val __obj = js.Dynamic.literal(arrowShow = arrowShow, arrowSize = arrowSize, autoHide = autoHide, autoHideDelay = autoHideDelay, className = className, clickToHide = clickToHide, elementPosition = elementPosition, gap = gap, globalPosition = globalPosition, hideAnimation = hideAnimation, hideDuration = hideDuration, position = position, showAnimation = showAnimation, showDuration = showDuration, style = style)
  
    __obj.asInstanceOf[NotificationOptions]
  }
}

