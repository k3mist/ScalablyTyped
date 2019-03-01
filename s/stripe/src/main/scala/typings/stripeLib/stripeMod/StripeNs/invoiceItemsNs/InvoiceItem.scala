package typings
package stripeLib.stripeMod.StripeNs.invoiceItemsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvoiceItem
  extends stripeLib.stripeMod.StripeNs.IResourceObject {
  var amount: scala.Double
  var currency: java.lang.String
  var customer: java.lang.String
  var date: scala.Double
  var description: java.lang.String
  /**
    * If true, discounts will apply to this invoice item. Always false for prorations.
    */
  var discountable: scala.Boolean
  /**
    * If null, the invoice item is pending and will be included in the upcoming invoice.
    */
  var invoice: java.lang.String | scala.Null
  var livemode: scala.Boolean
  var metadata: stripeLib.stripeMod.StripeNs.IMetadata
  /**
    * Value is "invoiceitem"
    */
  @JSName("object")
  var object_InvoiceItem: stripeLib.stripeLibStrings.invoiceitem
  var period: stripeLib.stripeMod.StripeNs.invoicesNs.IPeriod
  /**
    * If the invoice item is a proration, the plan of the subscription that the proration was computed for.
    */
  var plan: stripeLib.stripeMod.StripeNs.plansNs.IPlan
  /**
    * Whether or not the invoice item was created automatically as a proration adjustment when the customer switched plans
    */
  var proration: scala.Boolean
  /**
    * If the invoice item is a proration, the quantity of the subscription that the proration was computed for.
    */
  var quantity: scala.Double
  /**
    * The subscription that this invoice item has been created for, if any.
    */
  var subscription: java.lang.String | stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription
}

object InvoiceItem {
  @scala.inline
  def apply(
    amount: scala.Double,
    currency: java.lang.String,
    customer: java.lang.String,
    date: scala.Double,
    description: java.lang.String,
    discountable: scala.Boolean,
    id: java.lang.String,
    livemode: scala.Boolean,
    metadata: stripeLib.stripeMod.StripeNs.IMetadata,
    `object`: stripeLib.stripeLibStrings.invoiceitem,
    period: stripeLib.stripeMod.StripeNs.invoicesNs.IPeriod,
    plan: stripeLib.stripeMod.StripeNs.plansNs.IPlan,
    proration: scala.Boolean,
    quantity: scala.Double,
    subscription: java.lang.String | stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription,
    invoice: java.lang.String = null
  ): InvoiceItem = {
    val __obj = js.Dynamic.literal(amount = amount, currency = currency, customer = customer, date = date, description = description, discountable = discountable, id = id, livemode = livemode, metadata = metadata, `object` = `object`, period = period, plan = plan, proration = proration, quantity = quantity, subscription = subscription.asInstanceOf[js.Any])
    if (invoice != null) __obj.updateDynamic("invoice")(invoice)
    __obj.asInstanceOf[InvoiceItem]
  }
}

