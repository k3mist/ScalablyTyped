package typings
package stripeLib.stripeMod.StripeNs.tokensNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICardToken extends ITokenBase {
  /**
    * Hash describing the card used to make the charge
    */
  var card: js.UndefOr[stripeLib.stripeMod.StripeNs.cardsNs.ICardHash] = js.undefined
}

object ICardToken {
  @scala.inline
  def apply(
    client_ip: java.lang.String,
    created: scala.Double,
    id: java.lang.String,
    livemode: scala.Boolean,
    `object`: stripeLib.stripeLibStrings.token,
    `type`: stripeLib.stripeLibStrings.card | stripeLib.stripeLibStrings.bank_account,
    used: scala.Boolean,
    card: stripeLib.stripeMod.StripeNs.cardsNs.ICardHash = null
  ): ICardToken = {
    val __obj = js.Dynamic.literal(client_ip = client_ip, created = created, id = id, livemode = livemode, `object` = `object`, `type` = `type`.asInstanceOf[js.Any], used = used)
    if (card != null) __obj.updateDynamic("card")(card)
    __obj.asInstanceOf[ICardToken]
  }
}

