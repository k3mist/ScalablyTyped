package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationSubscriptionCreateParameters extends js.Object {
  /**
    * Channel for delivering notifications triggered by the new subscription.
    */
  var channel: ISubscriptionChannel
  /**
    * Brief description for the new subscription. Typically describes filter criteria which helps identity the subscription.
    */
  var description: java.lang.String
  /**
    * Matching criteria for the new subscription. ExpressionFilter
    */
  var filter: ISubscriptionFilter
  /**
    * The container in which events must be published from in order to be matched by the new subscription. If not specified, defaults to the current host (typically an account or project collection). For example, a subscription scoped to project A will not produce notifications for events published from project B.
    */
  var scope: SubscriptionScope
  /**
    * User or group that will receive notifications for events matching the subscription's filter criteria. If not specified, defaults to the calling user.
    */
  var subscriber: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
}

object NotificationSubscriptionCreateParameters {
  @scala.inline
  def apply(
    channel: ISubscriptionChannel,
    description: java.lang.String,
    filter: ISubscriptionFilter,
    scope: SubscriptionScope,
    subscriber: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  ): NotificationSubscriptionCreateParameters = {
    val __obj = js.Dynamic.literal(channel = channel, description = description, filter = filter, scope = scope, subscriber = subscriber)
  
    __obj.asInstanceOf[NotificationSubscriptionCreateParameters]
  }
}

