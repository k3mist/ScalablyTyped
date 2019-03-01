package typings
package stripeLib.stripeMod.StripeNs.subscriptionItemsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Subscription items allow you to create customer subscriptions with more than one plan, making it easy to represent
  * complex billing relationships.
  */
trait ISubscriptionItem
  extends stripeLib.stripeMod.StripeNs.IResourceObject {
  var created: scala.Double
  /**
    * Set of key/value pairs that you can attach to an object. It can be useful for storing additional information
    * about the object in a structured format.
    */
  var metadata: stripeLib.stripeMod.StripeNs.IMetadata
  /**
    * Value is "subscription_item"
    */
  @JSName("object")
  var object_ISubscriptionItem: stripeLib.stripeLibStrings.subscription_item
  /**
    * Hash describing the plan the customer is subscribed to
    */
  var plan: stripeLib.stripeMod.StripeNs.plansNs.IPlan
  /**
    * The quantity of the plan to which the customer should be subscribed.
    */
  var quantity: scala.Double
}

object ISubscriptionItem {
  @scala.inline
  def apply(
    created: scala.Double,
    id: java.lang.String,
    metadata: stripeLib.stripeMod.StripeNs.IMetadata,
    `object`: stripeLib.stripeLibStrings.subscription_item,
    plan: stripeLib.stripeMod.StripeNs.plansNs.IPlan,
    quantity: scala.Double
  ): ISubscriptionItem = {
    val __obj = js.Dynamic.literal(created = created, id = id, metadata = metadata, `object` = `object`, plan = plan, quantity = quantity)
  
    __obj.asInstanceOf[ISubscriptionItem]
  }
}

