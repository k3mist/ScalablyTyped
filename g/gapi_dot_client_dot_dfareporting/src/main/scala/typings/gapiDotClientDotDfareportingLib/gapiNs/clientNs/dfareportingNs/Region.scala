package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Region extends js.Object {
  /** Country code of the country to which this region belongs. */
  var countryCode: js.UndefOr[java.lang.String] = js.undefined
  /** DART ID of the country to which this region belongs. */
  var countryDartId: js.UndefOr[java.lang.String] = js.undefined
  /** DART ID of this region. */
  var dartId: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#region". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Name of this region. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Region code. */
  var regionCode: js.UndefOr[java.lang.String] = js.undefined
}

object Region {
  @scala.inline
  def apply(
    countryCode: java.lang.String = null,
    countryDartId: java.lang.String = null,
    dartId: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    regionCode: java.lang.String = null
  ): Region = {
    val __obj = js.Dynamic.literal()
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode)
    if (countryDartId != null) __obj.updateDynamic("countryDartId")(countryDartId)
    if (dartId != null) __obj.updateDynamic("dartId")(dartId)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (regionCode != null) __obj.updateDynamic("regionCode")(regionCode)
    __obj.asInstanceOf[Region]
  }
}

