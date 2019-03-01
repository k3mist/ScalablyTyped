package typings
package stripeLib.stripeMod.StripeNs.chargesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * To charge a credit or a debit card, you create a charge object. You can retrieve and refund individual
  * charges as well as list all charges. Charges are identified by a unique random ID.
  */
trait ICharge
  extends stripeLib.stripeMod.StripeNs.IResourceObject {
  /**
    * Amount charged in cents/pence, positive integer or zero.
    */
  var amount: scala.Double
  /**
    * Amount in cents/pence refunded (can be less than the amount attribute on the
    * charge if a partial refund was issued), positive integer or zero.
    */
  var amount_refunded: scala.Double
  /**
    * ID of the Connect application that created the charge. [Expandable]
    */
  var application: js.UndefOr[
    java.lang.String | stripeLib.stripeMod.StripeNs.applicationsNs.IApplication | scala.Null
  ] = js.undefined
  /**
    * The application fee (if any) for the charge. See the Connect documentation
    * for details. [Expandable]
    */
  var application_fee: js.UndefOr[
    java.lang.String | stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFee | scala.Null
  ] = js.undefined
  /**
    * ID of the balance transaction that describes the impact of this charge on
    * your account balance (not including refunds or disputes). [Expandable]
    */
  var balance_transaction: java.lang.String | stripeLib.stripeMod.StripeNs.balanceNs.IBalanceTransaction
  /**
    * If the charge was created without capturing, this boolean represents whether or not it is
    * still uncaptured or has since been captured.
    */
  var captured: scala.Boolean
  var created: scala.Double
  /**
    * Three-letter ISO currency code representing the currency in which the
    * charge was made.
    */
  var currency: java.lang.String
  /**
    * ID of the customer this charge is for if one exists. [Expandable]
    */
  var customer: java.lang.String | stripeLib.stripeMod.StripeNs.customersNs.ICustomer | scala.Null
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The account (if any) the charge was made on behalf of, with an automatic
    * transfer. See the [Connect documentation]
    * <https://stripe.com/docs/connect/destination-charges> for details.
    * [Expandable]
    */
  var destination: js.UndefOr[java.lang.String | stripeLib.stripeMod.StripeNs.accountsNs.IAccount | scala.Null] = js.undefined
  /**
    * Details about the dispute if the charge has been disputed.
    */
  var dispute: js.UndefOr[stripeLib.stripeMod.StripeNs.disputesNs.IDispute | scala.Null] = js.undefined
  /**
    * Error code explaining reason for charge failure if available (see the errors section for a list of
    * codes: https://stripe.com/docs/api#errors).
    */
  var failure_code: java.lang.String | scala.Null
  /**
    * Message to user further explaining reason for charge failure if available.
    */
  var failure_message: java.lang.String | scala.Null
  /**
    * Hash with information on fraud assessments for the charge.
    */
  var fraud_details: stripeLib.Anon_Fraudulent
  /**
    * ID of the invoice this charge is for if one exists. [Expandable]
    */
  var invoice: java.lang.String | stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice | scala.Null
  var livemode: scala.Boolean
  var metadata: stripeLib.stripeMod.StripeNs.IMetadata
  /**
    * Value is 'charge'
    */
  @JSName("object")
  var object_ICharge: stripeLib.stripeLibStrings.charge
  /**
    * The Stripe account ID for which these funds are intended. Automatically
    * set if you use the destination parameter. For details, see [Creating
    * Separate Charges and Transfers]
    * <https://stripe.com/docs/connect/charges-transfers#on-behalf-of>.
    */
  var on_behalf_of: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * ID of the order this charge is for if one exists. [Expandable]
    */
  var order: java.lang.String | stripeLib.stripeMod.StripeNs.ordersNs.IOrder | scala.Null
  /**
    * Details about whether the payment was accepted, and why. See
    * understanding declines for details. [Expandable]
    */
  var outcome: js.UndefOr[IOutcome] = js.undefined
  /**
    * true if the charge succeeded, or was successfully authorized for later capture.
    */
  var paid: scala.Boolean
  /**
    * This is the email address that the receipt for this charge was sent to.
    */
  var receipt_email: java.lang.String | scala.Null
  /**
    * This is the transaction number that appears on email receipts sent for this charge.
    */
  var receipt_number: java.lang.String | scala.Null
  /**
    * Whether or not the charge has been fully refunded. If the charge is only partially refunded,
    * this attribute will still be false.
    */
  var refunded: scala.Boolean
  /**
    * A list of refunds that have been applied to the charge.
    */
  var refunds: IChargeRefunds
  /**
    * ID of the review associated with this charge if one exists. [Expandable]
    */
  var review: js.UndefOr[java.lang.String | stripeLib.stripeMod.StripeNs.reviewsNs.IReview | scala.Null] = js.undefined
  /**
    * Shipping information for the charge.
    */
  var shipping: js.UndefOr[stripeLib.stripeMod.StripeNs.IShippingInformation | scala.Null] = js.undefined
  /**
    * For most Stripe users, the source of every charge is a credit or debit card.
    * This hash is then the card object describing that card.
    */
  var source: stripeLib.stripeMod.StripeNs.cardsNs.ICard | stripeLib.stripeMod.StripeNs.bitcoinReceiversNs.IBitcoinReceiver | stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount
  /**
    * The transfer ID which created this charge. Only present if the charge came
    * from another Stripe account. See the Connect documentation for details.
    * [Expandable]
    */
  var source_transfer: java.lang.String | stripeLib.stripeMod.StripeNs.transfersNs.ITransfer | scala.Null
  /**
    * Extra information about a charge. This will appear on your customer’s
    * credit card statement.
    */
  var statement_descriptor: java.lang.String | scala.Null
  /**
    * The status of the payment is either "succeeded", "pending", or "failed".
    */
  var status: stripeLib.stripeLibStrings.succeeded | stripeLib.stripeLibStrings.pending | stripeLib.stripeLibStrings.failed
  /**
    * ID of the transfer to the destination account (only applicable if the
    * charge was created using the destination parameter). [Expandable]
    */
  var transfer: js.UndefOr[java.lang.String | stripeLib.stripeMod.StripeNs.transfersNs.ITransfer] = js.undefined
  /**
    * A string that identifies this transaction as part of a group.
    * See the [Connect documentation]
    * <https://stripe.com/docs/connect/charges-transfers#grouping-transactions>
    * for details.
    */
  var transfer_group: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object ICharge {
  @scala.inline
  def apply(
    amount: scala.Double,
    amount_refunded: scala.Double,
    balance_transaction: java.lang.String | stripeLib.stripeMod.StripeNs.balanceNs.IBalanceTransaction,
    captured: scala.Boolean,
    created: scala.Double,
    currency: java.lang.String,
    fraud_details: stripeLib.Anon_Fraudulent,
    id: java.lang.String,
    livemode: scala.Boolean,
    metadata: stripeLib.stripeMod.StripeNs.IMetadata,
    `object`: stripeLib.stripeLibStrings.charge,
    paid: scala.Boolean,
    refunded: scala.Boolean,
    refunds: IChargeRefunds,
    source: stripeLib.stripeMod.StripeNs.cardsNs.ICard | stripeLib.stripeMod.StripeNs.bitcoinReceiversNs.IBitcoinReceiver | stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount,
    status: stripeLib.stripeLibStrings.succeeded | stripeLib.stripeLibStrings.pending | stripeLib.stripeLibStrings.failed,
    application: java.lang.String | stripeLib.stripeMod.StripeNs.applicationsNs.IApplication = null,
    application_fee: java.lang.String | stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFee = null,
    customer: java.lang.String | stripeLib.stripeMod.StripeNs.customersNs.ICustomer = null,
    description: java.lang.String = null,
    destination: java.lang.String | stripeLib.stripeMod.StripeNs.accountsNs.IAccount = null,
    dispute: stripeLib.stripeMod.StripeNs.disputesNs.IDispute = null,
    failure_code: java.lang.String = null,
    failure_message: java.lang.String = null,
    invoice: java.lang.String | stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice = null,
    on_behalf_of: java.lang.String = null,
    order: java.lang.String | stripeLib.stripeMod.StripeNs.ordersNs.IOrder = null,
    outcome: IOutcome = null,
    receipt_email: java.lang.String = null,
    receipt_number: java.lang.String = null,
    review: java.lang.String | stripeLib.stripeMod.StripeNs.reviewsNs.IReview = null,
    shipping: stripeLib.stripeMod.StripeNs.IShippingInformation = null,
    source_transfer: java.lang.String | stripeLib.stripeMod.StripeNs.transfersNs.ITransfer = null,
    statement_descriptor: java.lang.String = null,
    transfer: java.lang.String | stripeLib.stripeMod.StripeNs.transfersNs.ITransfer = null,
    transfer_group: java.lang.String = null
  ): ICharge = {
    val __obj = js.Dynamic.literal(amount = amount, amount_refunded = amount_refunded, balance_transaction = balance_transaction.asInstanceOf[js.Any], captured = captured, created = created, currency = currency, fraud_details = fraud_details, id = id, livemode = livemode, metadata = metadata, `object` = `object`, paid = paid, refunded = refunded, refunds = refunds, source = source.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (application != null) __obj.updateDynamic("application")(application.asInstanceOf[js.Any])
    if (application_fee != null) __obj.updateDynamic("application_fee")(application_fee.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (dispute != null) __obj.updateDynamic("dispute")(dispute)
    if (failure_code != null) __obj.updateDynamic("failure_code")(failure_code)
    if (failure_message != null) __obj.updateDynamic("failure_message")(failure_message)
    if (invoice != null) __obj.updateDynamic("invoice")(invoice.asInstanceOf[js.Any])
    if (on_behalf_of != null) __obj.updateDynamic("on_behalf_of")(on_behalf_of)
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (outcome != null) __obj.updateDynamic("outcome")(outcome)
    if (receipt_email != null) __obj.updateDynamic("receipt_email")(receipt_email)
    if (receipt_number != null) __obj.updateDynamic("receipt_number")(receipt_number)
    if (review != null) __obj.updateDynamic("review")(review.asInstanceOf[js.Any])
    if (shipping != null) __obj.updateDynamic("shipping")(shipping)
    if (source_transfer != null) __obj.updateDynamic("source_transfer")(source_transfer.asInstanceOf[js.Any])
    if (statement_descriptor != null) __obj.updateDynamic("statement_descriptor")(statement_descriptor)
    if (transfer != null) __obj.updateDynamic("transfer")(transfer.asInstanceOf[js.Any])
    if (transfer_group != null) __obj.updateDynamic("transfer_group")(transfer_group)
    __obj.asInstanceOf[ICharge]
  }
}

