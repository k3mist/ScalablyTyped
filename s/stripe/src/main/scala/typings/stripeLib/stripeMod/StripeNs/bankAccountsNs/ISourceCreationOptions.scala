package typings
package stripeLib.stripeMod.StripeNs.bankAccountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISourceCreationOptions extends js.Object {
  /**
    * The name of the person or business that owns the bank
    * account. This field is required when attaching the bank
    * account to a customer object.
    */
  var account_holder_name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of entity that holds the account. This can be either
    * "individual" or "company". This field is required when
    * attaching the bank account to a customer object.
    */
  var account_holder_type: js.UndefOr[stripeLib.stripeLibStrings.individual | stripeLib.stripeLibStrings.company] = js.undefined
  /**
    * The account number for the bank account in string form.
    * Must be a checking account.
    */
  var account_number: java.lang.String
  /**
    * The country the bank account is in.
    */
  var country: java.lang.String
  /**
    * The currency the bank account is in. This must be a
    * country/currency pairing that Stripe supports.
    */
  var currency: java.lang.String
  /**
    * The routing number, sort code, or other country-appropriate
    * institution number for the bank account. For US bank
    * accounts, this is required and should be the ACH routing
    * number, not the wire routing number. If you are providing an
    * IBAN for account_number, this field is not required.
    */
  var routing_number: js.UndefOr[java.lang.String] = js.undefined
}

object ISourceCreationOptions {
  @scala.inline
  def apply(
    account_number: java.lang.String,
    country: java.lang.String,
    currency: java.lang.String,
    account_holder_name: java.lang.String = null,
    account_holder_type: stripeLib.stripeLibStrings.individual | stripeLib.stripeLibStrings.company = null,
    routing_number: java.lang.String = null
  ): ISourceCreationOptions = {
    val __obj = js.Dynamic.literal(account_number = account_number, country = country, currency = currency)
    if (account_holder_name != null) __obj.updateDynamic("account_holder_name")(account_holder_name)
    if (account_holder_type != null) __obj.updateDynamic("account_holder_type")(account_holder_type.asInstanceOf[js.Any])
    if (routing_number != null) __obj.updateDynamic("routing_number")(routing_number)
    __obj.asInstanceOf[ISourceCreationOptions]
  }
}

