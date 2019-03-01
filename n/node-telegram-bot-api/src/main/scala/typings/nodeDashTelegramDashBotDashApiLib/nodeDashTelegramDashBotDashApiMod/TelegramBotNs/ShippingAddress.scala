package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingAddress extends js.Object {
  var city: java.lang.String
  var country_code: java.lang.String
  var post_code: java.lang.String
  var state: java.lang.String
  var street_line1: java.lang.String
  var street_line2: java.lang.String
}

object ShippingAddress {
  @scala.inline
  def apply(
    city: java.lang.String,
    country_code: java.lang.String,
    post_code: java.lang.String,
    state: java.lang.String,
    street_line1: java.lang.String,
    street_line2: java.lang.String
  ): ShippingAddress = {
    val __obj = js.Dynamic.literal(city = city, country_code = country_code, post_code = post_code, state = state, street_line1 = street_line1, street_line2 = street_line2)
  
    __obj.asInstanceOf[ShippingAddress]
  }
}

