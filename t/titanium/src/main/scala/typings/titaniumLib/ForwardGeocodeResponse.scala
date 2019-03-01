package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object returned in the callback from the
  * [forwardGeocoder](Titanium.Geolocation.forwardGeocoder) method.
  * Note that Android includes a number of extra fields.
  */
trait ForwardGeocodeResponse extends js.Object {
  /**
  	 * Estimated accuracy of the geocoding, in meters.
  	 */
  var accuracy: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Full address.
  	 */
  var address: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * City name.
  	 */
  var city: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Error code. Returns 0 if `success` is `true`.
  	 */
  var code: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Country name.
  	 */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Country code.
  	 */
  var countryCode: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Country code. Same as `countryCode`.
  	 */
  var country_code: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Display address. Identical to `address`.
  	 */
  var displayAddress: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Error message, if any returned.
  	 */
  var error: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Latitude of the geocoded address.
  	 */
  var latitude: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Longitude of the geocoded address.
  	 */
  var longitude: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Postal code.
  	 */
  var postalCode: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * First line of region.
  	 */
  var region1: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Not used.
  	 */
  var region2: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Street name, without street address.
  	 */
  var street: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Street name.
  	 */
  var street1: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Indicates if the operation succeeded.
  	 */
  var success: js.UndefOr[scala.Boolean] = js.undefined
}

object ForwardGeocodeResponse {
  @scala.inline
  def apply(
    accuracy: scala.Int | scala.Double = null,
    address: java.lang.String = null,
    city: java.lang.String = null,
    code: scala.Int | scala.Double = null,
    country: java.lang.String = null,
    countryCode: java.lang.String = null,
    country_code: java.lang.String = null,
    displayAddress: java.lang.String = null,
    error: java.lang.String = null,
    latitude: java.lang.String = null,
    longitude: java.lang.String = null,
    postalCode: java.lang.String = null,
    region1: java.lang.String = null,
    region2: java.lang.String = null,
    street: java.lang.String = null,
    street1: java.lang.String = null,
    success: js.UndefOr[scala.Boolean] = js.undefined
  ): ForwardGeocodeResponse = {
    val __obj = js.Dynamic.literal()
    if (accuracy != null) __obj.updateDynamic("accuracy")(accuracy.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address)
    if (city != null) __obj.updateDynamic("city")(city)
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country)
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode)
    if (country_code != null) __obj.updateDynamic("country_code")(country_code)
    if (displayAddress != null) __obj.updateDynamic("displayAddress")(displayAddress)
    if (error != null) __obj.updateDynamic("error")(error)
    if (latitude != null) __obj.updateDynamic("latitude")(latitude)
    if (longitude != null) __obj.updateDynamic("longitude")(longitude)
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode)
    if (region1 != null) __obj.updateDynamic("region1")(region1)
    if (region2 != null) __obj.updateDynamic("region2")(region2)
    if (street != null) __obj.updateDynamic("street")(street)
    if (street1 != null) __obj.updateDynamic("street1")(street1)
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[ForwardGeocodeResponse]
  }
}

