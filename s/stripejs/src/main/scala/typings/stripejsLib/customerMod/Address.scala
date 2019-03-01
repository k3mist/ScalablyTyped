package typings
package stripejsLib.customerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  /**
    * City/District/Suburb/Town/Village.
    */
  var city: java.lang.String
  /**
    * Two-letter country code, capitalized
    * NOTE: The codes are specified by the ISO3166 alpha-2
    */
  var country: java.lang.String
  /**
    * Address line 1 (Street address/PO Box/Company name).
    */
  var line1: java.lang.String
  /**
    * Address line 2 (Apartment/Suite/Unit/Building).
    */
  var line2: java.lang.String
  /**
    * ZIP or postal code
    */
  var postal_code: java.lang.String
  /**
    * State/County/Province/Region.
    */
  var state: java.lang.String
}

object Address {
  @scala.inline
  def apply(
    city: java.lang.String,
    country: java.lang.String,
    line1: java.lang.String,
    line2: java.lang.String,
    postal_code: java.lang.String,
    state: java.lang.String
  ): Address = {
    val __obj = js.Dynamic.literal(city = city, country = country, line1 = line1, line2 = line2, postal_code = postal_code, state = state)
  
    __obj.asInstanceOf[Address]
  }
}

