package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedTarget extends js.Object {
  /** The country where the items in the feed will be included in the search index, represented as a  CLDR territory code. */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /** The list of destinations to exclude for this target (corresponds to unchecked check boxes in Merchant Center). */
  var excludedDestinations: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The list of destinations to include for this target (corresponds to checked check boxes in Merchant Center). Default destinations are always included
    * unless provided in the excluded_destination field.
    */
  var includedDestinations: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The two-letter ISO 639-1 language of the items in the feed. Must be a valid language for targets[].country. */
  var language: js.UndefOr[java.lang.String] = js.undefined
}

object DatafeedTarget {
  @scala.inline
  def apply(
    country: java.lang.String = null,
    excludedDestinations: js.Array[java.lang.String] = null,
    includedDestinations: js.Array[java.lang.String] = null,
    language: java.lang.String = null
  ): DatafeedTarget = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country)
    if (excludedDestinations != null) __obj.updateDynamic("excludedDestinations")(excludedDestinations)
    if (includedDestinations != null) __obj.updateDynamic("includedDestinations")(includedDestinations)
    if (language != null) __obj.updateDynamic("language")(language)
    __obj.asInstanceOf[DatafeedTarget]
  }
}

