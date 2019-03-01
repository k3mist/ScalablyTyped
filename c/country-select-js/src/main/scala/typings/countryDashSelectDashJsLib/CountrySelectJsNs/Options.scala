package typings
package countryDashSelectDashJsLib.CountrySelectJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Set the default country by it's country code. Otherwise it will just be
    * the first country in the list.
    */
  var defaultCountry: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Display only the countries you specify. Takes an array of country codes.
    */
  var onlyCountries: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Specify the countries to appear at the top of the list. Defaults to
    * ["us", "gb"]
    */
  var preferredCountries: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Set the dropdown's width to be the same as the input. This is
    * automatically enabled for small screens.
    */
  var responsiveDropdown: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    defaultCountry: java.lang.String = null,
    onlyCountries: js.Array[java.lang.String] = null,
    preferredCountries: js.Array[java.lang.String] = null,
    responsiveDropdown: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (defaultCountry != null) __obj.updateDynamic("defaultCountry")(defaultCountry)
    if (onlyCountries != null) __obj.updateDynamic("onlyCountries")(onlyCountries)
    if (preferredCountries != null) __obj.updateDynamic("preferredCountries")(preferredCountries)
    if (!js.isUndefined(responsiveDropdown)) __obj.updateDynamic("responsiveDropdown")(responsiveDropdown)
    __obj.asInstanceOf[Options]
  }
}

