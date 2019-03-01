package typings
package gapiDotClientDotCloudbillingLib.gapiNs.clientNs.cloudbillingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Money extends js.Object {
  /** The 3-letter currency code defined in ISO 4217. */
  var currencyCode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Number of nano (10^-9) units of the amount.
    * The value must be between -999,999,999 and +999,999,999 inclusive.
    * If `units` is positive, `nanos` must be positive or zero.
    * If `units` is zero, `nanos` can be positive, zero, or negative.
    * If `units` is negative, `nanos` must be negative or zero.
    * For example $-1.75 is represented as `units`=-1 and `nanos`=-750,000,000.
    */
  var nanos: js.UndefOr[scala.Double] = js.undefined
  /**
    * The whole units of the amount.
    * For example if `currencyCode` is `"USD"`, then 1 unit is one US dollar.
    */
  var units: js.UndefOr[java.lang.String] = js.undefined
}

object Money {
  @scala.inline
  def apply(
    currencyCode: java.lang.String = null,
    nanos: scala.Int | scala.Double = null,
    units: java.lang.String = null
  ): Money = {
    val __obj = js.Dynamic.literal()
    if (currencyCode != null) __obj.updateDynamic("currencyCode")(currencyCode)
    if (nanos != null) __obj.updateDynamic("nanos")(nanos.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units)
    __obj.asInstanceOf[Money]
  }
}

