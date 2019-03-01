package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary object of parameters used to create a notification using
  * <Titanium.App.iOS.scheduleLocalNotification>.
  */
trait NotificationParams extends js.Object {
  /**
  	 * Alert button text ('Open', by default) or home text ('Press Home to unlock', by default)
  	 * to display.
  	 */
  var alertAction: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Alert message to display.
  	 */
  var alertBody: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Image to display instead of `Default.png` when launching the application.
  	 */
  var alertLaunchImage: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Alert subtitle to display.
  	 */
  var alertSubtitle: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Alert title to display.
  	 */
  var alertTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Notification attachments to display.
  	 */
  var attachments: js.UndefOr[js.Array[UserNotificationAttachment]] = js.undefined
  /**
  	 * Application badge value.
  	 */
  var badge: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * String identifier of category of actions to be displayed for an interactive notification.
  	 */
  var category: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Date and time for the notification to occur.
  	 */
  var date: js.UndefOr[stdLib.Date] = js.undefined
  /**
  	 * The notification identifier.
  	 */
  var identifier: java.lang.String
  /**
  	 * Region the notification will be triggered in. Allowed parameter are:
  	 * - `latitude`: Latitude of the location center, in decimal degrees (required).
  	 * - `longitude`: Longitude of the location center, in decimal degrees (required).
  	 * - `triggersOnce`: Whether or not the notification will only fire once (optional, default: true).
  	 */
  var region: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Interval to repeat the notification. One of `weekly`, `daily`, `yearly,` `monthly`.
  	 */
  var repeat: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Path to the sound file to play when notification occurs, relative to the `Resources` folder.
  	 */
  var sound: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The string the notification adds to the category's summary format string.
  	 */
  var summaryArgument: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The number of items the notification adds to the category's summary format string.
  	 */
  var summaryArgumentCount: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Timezone of the date configured for the notification. If not set, the system timezone is used.
  	 */
  var timezone: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Data to pass to the application with the notification event.
  	 */
  var userInfo: js.UndefOr[js.Any] = js.undefined
}

object NotificationParams {
  @scala.inline
  def apply(
    identifier: java.lang.String,
    alertAction: java.lang.String = null,
    alertBody: java.lang.String = null,
    alertLaunchImage: java.lang.String = null,
    alertSubtitle: java.lang.String = null,
    alertTitle: java.lang.String = null,
    attachments: js.Array[UserNotificationAttachment] = null,
    badge: scala.Int | scala.Double = null,
    category: java.lang.String = null,
    date: stdLib.Date = null,
    region: js.Any = null,
    repeat: java.lang.String = null,
    sound: java.lang.String = null,
    summaryArgument: java.lang.String = null,
    summaryArgumentCount: java.lang.String = null,
    timezone: java.lang.String = null,
    userInfo: js.Any = null
  ): NotificationParams = {
    val __obj = js.Dynamic.literal(identifier = identifier)
    if (alertAction != null) __obj.updateDynamic("alertAction")(alertAction)
    if (alertBody != null) __obj.updateDynamic("alertBody")(alertBody)
    if (alertLaunchImage != null) __obj.updateDynamic("alertLaunchImage")(alertLaunchImage)
    if (alertSubtitle != null) __obj.updateDynamic("alertSubtitle")(alertSubtitle)
    if (alertTitle != null) __obj.updateDynamic("alertTitle")(alertTitle)
    if (attachments != null) __obj.updateDynamic("attachments")(attachments)
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category)
    if (date != null) __obj.updateDynamic("date")(date)
    if (region != null) __obj.updateDynamic("region")(region)
    if (repeat != null) __obj.updateDynamic("repeat")(repeat)
    if (sound != null) __obj.updateDynamic("sound")(sound)
    if (summaryArgument != null) __obj.updateDynamic("summaryArgument")(summaryArgument)
    if (summaryArgumentCount != null) __obj.updateDynamic("summaryArgumentCount")(summaryArgumentCount)
    if (timezone != null) __obj.updateDynamic("timezone")(timezone)
    if (userInfo != null) __obj.updateDynamic("userInfo")(userInfo)
    __obj.asInstanceOf[NotificationParams]
  }
}

