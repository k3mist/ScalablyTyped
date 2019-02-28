package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationTaskSubscribeToNotificationParams
  extends stdLib.Object {
  /**
    * The email address to add to the notification type's subscriber list. May contain tokens.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#subscribeToNotification)
    */
  var email: java.lang.String
  /**
    * The unique id of the notification type to which the email address will be added.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#subscribeToNotification)
    */
  var notificationTypeId: scala.Double
  /**
    * The username requesting the addition of email address to the notification subscriber's list.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#subscribeToNotification)
    */
  var user: java.lang.String
}

