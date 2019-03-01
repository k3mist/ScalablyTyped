package typings
package heremapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_City extends js.Object {
  var city: java.lang.String
  var country: java.lang.String
  var countryCode: java.lang.String
  var county: java.lang.String
  var district: java.lang.String
  var house: java.lang.String
  var postalCode: java.lang.String
  var stateCode: java.lang.String
  var street: java.lang.String
  var text: java.lang.String
}

object Anon_City {
  @scala.inline
  def apply(
    city: java.lang.String,
    country: java.lang.String,
    countryCode: java.lang.String,
    county: java.lang.String,
    district: java.lang.String,
    house: java.lang.String,
    postalCode: java.lang.String,
    stateCode: java.lang.String,
    street: java.lang.String,
    text: java.lang.String
  ): Anon_City = {
    val __obj = js.Dynamic.literal(city = city, country = country, countryCode = countryCode, county = county, district = district, house = house, postalCode = postalCode, stateCode = stateCode, street = street, text = text)
  
    __obj.asInstanceOf[Anon_City]
  }
}

