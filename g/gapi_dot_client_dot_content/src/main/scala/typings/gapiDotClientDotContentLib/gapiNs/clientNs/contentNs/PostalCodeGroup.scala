package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostalCodeGroup extends js.Object {
  /** The CLDR territory code of the country the postal code group applies to. Required. */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the postal code group, referred to in headers. Required. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** A range of postal codes. Required. */
  var postalCodeRanges: js.UndefOr[js.Array[PostalCodeRange]] = js.undefined
}

object PostalCodeGroup {
  @scala.inline
  def apply(
    country: java.lang.String = null,
    name: java.lang.String = null,
    postalCodeRanges: js.Array[PostalCodeRange] = null
  ): PostalCodeGroup = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country)
    if (name != null) __obj.updateDynamic("name")(name)
    if (postalCodeRanges != null) __obj.updateDynamic("postalCodeRanges")(postalCodeRanges)
    __obj.asInstanceOf[PostalCodeGroup]
  }
}

