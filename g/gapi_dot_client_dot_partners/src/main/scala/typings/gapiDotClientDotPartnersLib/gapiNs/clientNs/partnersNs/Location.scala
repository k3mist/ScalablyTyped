package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  /** The single string version of the address. */
  var address: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The following address lines represent the most specific part of any
    * address.
    */
  var addressLine: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Top-level administrative subdivision of this country. */
  var administrativeArea: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Dependent locality or sublocality. Used for UK dependent localities, or
    * neighborhoods or boroughs in other locations.
    */
  var dependentLocality: js.UndefOr[java.lang.String] = js.undefined
  /** Language code of the address. Should be in BCP 47 format. */
  var languageCode: js.UndefOr[java.lang.String] = js.undefined
  /** The latitude and longitude of the location, in degrees. */
  var latLng: js.UndefOr[LatLng] = js.undefined
  /** Generally refers to the city/town portion of an address. */
  var locality: js.UndefOr[java.lang.String] = js.undefined
  /** Values are frequently alphanumeric. */
  var postalCode: js.UndefOr[java.lang.String] = js.undefined
  /** CLDR (Common Locale Data Repository) region code . */
  var regionCode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Use of this code is very country-specific, but will refer to a secondary
    * classification code for sorting mail.
    */
  var sortingCode: js.UndefOr[java.lang.String] = js.undefined
}

object Location {
  @scala.inline
  def apply(
    address: java.lang.String = null,
    addressLine: js.Array[java.lang.String] = null,
    administrativeArea: java.lang.String = null,
    dependentLocality: java.lang.String = null,
    languageCode: java.lang.String = null,
    latLng: LatLng = null,
    locality: java.lang.String = null,
    postalCode: java.lang.String = null,
    regionCode: java.lang.String = null,
    sortingCode: java.lang.String = null
  ): Location = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (addressLine != null) __obj.updateDynamic("addressLine")(addressLine)
    if (administrativeArea != null) __obj.updateDynamic("administrativeArea")(administrativeArea)
    if (dependentLocality != null) __obj.updateDynamic("dependentLocality")(dependentLocality)
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode)
    if (latLng != null) __obj.updateDynamic("latLng")(latLng)
    if (locality != null) __obj.updateDynamic("locality")(locality)
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode)
    if (regionCode != null) __obj.updateDynamic("regionCode")(regionCode)
    if (sortingCode != null) __obj.updateDynamic("sortingCode")(sortingCode)
    __obj.asInstanceOf[Location]
  }
}

