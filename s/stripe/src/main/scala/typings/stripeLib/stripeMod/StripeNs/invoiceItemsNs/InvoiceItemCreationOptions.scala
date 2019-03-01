package typings
package stripeLib.stripeMod.StripeNs.invoiceItemsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvoiceItemCreationOptions
  extends stripeLib.stripeMod.StripeNs.IDataOptionsWithMetadata {
  /**
    * The integer amount in cents of the charge to be applied to the upcoming invoice. If you want to apply a credit to the customer’s
    * account, pass a negative amount.
    */
  var amount: scala.Double
  /**
    * 3-letter ISO code for currency.
    */
  var currency: java.lang.String
  /**
    * The ID of the customer who will be billed when this invoice item is billed.
    */
  var customer: java.lang.String
  /**
    * An arbitrary string which you can attach to the invoice item. The description is displayed in the invoice for easy tracking.
    * This can be unset by updating the value to null and then saving.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Controls whether discounts apply to this invoice item. Defaults to false for prorations or negative invoice items, and true for
    * all other invoice items.
    */
  var discountable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The ID of an existing invoice to add this invoice item to. When left blank, the invoice item will be added to the next upcoming
    * scheduled invoice. Use this when adding invoice items in response to an invoice.created webhook. You cannot add an invoice item
    * to an invoice that has already been paid, attempted or closed.
    */
  var invoice: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ID of a subscription to add this invoice item to. When left blank, the invoice item will be be added to the next upcoming
    * scheduled invoice. When set, scheduled invoices for subscriptions other than the specified subscription will ignore the invoice
    * item. Use this when you want to express that an invoice item has been accrued within the context of a particular subscription.
    */
  var subscription: js.UndefOr[java.lang.String] = js.undefined
}

object InvoiceItemCreationOptions {
  @scala.inline
  def apply(
    amount: scala.Double,
    currency: java.lang.String,
    customer: java.lang.String,
    description: java.lang.String = null,
    discountable: js.UndefOr[scala.Boolean] = js.undefined,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    invoice: java.lang.String = null,
    metadata: stripeLib.stripeMod.StripeNs.IOptionsMetadata = null,
    subscription: java.lang.String = null
  ): InvoiceItemCreationOptions = {
    val __obj = js.Dynamic.literal(amount = amount, currency = currency, customer = customer)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(discountable)) __obj.updateDynamic("discountable")(discountable)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (invoice != null) __obj.updateDynamic("invoice")(invoice)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (subscription != null) __obj.updateDynamic("subscription")(subscription)
    __obj.asInstanceOf[InvoiceItemCreationOptions]
  }
}

