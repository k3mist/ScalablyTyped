package typings
package stripejsLib.paymentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateOptions extends js.Object {
  /**
    * The currency in which the customer should be charged
    * @example 'usd'
    */
  var currency: java.lang.String
  /**
    * An array of payment item objects
    * NOTE: The sum of the line item amounts does not need to add up to the total amount above
    * @see total
    *
    * @default []
    */
  var displayItems: js.UndefOr[js.Array[PaymentItem]] = js.undefined
  /**
    * An array of possible shipping options
    * NOTE: This first one in the array will be listed as the default option
    *
    * @default []
    */
  var shippingOptions: js.UndefOr[js.Array[stripejsLib.shippingMod.ShippingOption]] = js.undefined
  /**
    * The total amount the customer has to pay
    * NOTE: This object is shown to the customer in the browser‘s payment UI
    */
  var total: PaymentItem
}

object UpdateOptions {
  @scala.inline
  def apply(
    currency: java.lang.String,
    total: PaymentItem,
    displayItems: js.Array[PaymentItem] = null,
    shippingOptions: js.Array[stripejsLib.shippingMod.ShippingOption] = null
  ): UpdateOptions = {
    val __obj = js.Dynamic.literal(currency = currency, total = total)
    if (displayItems != null) __obj.updateDynamic("displayItems")(displayItems)
    if (shippingOptions != null) __obj.updateDynamic("shippingOptions")(shippingOptions)
    __obj.asInstanceOf[UpdateOptions]
  }
}

