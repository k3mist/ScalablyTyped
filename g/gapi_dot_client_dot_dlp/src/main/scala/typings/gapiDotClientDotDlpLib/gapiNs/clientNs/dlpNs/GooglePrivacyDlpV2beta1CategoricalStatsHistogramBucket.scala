package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1CategoricalStatsHistogramBucket extends js.Object {
  /** Total number of records in this bucket. */
  var bucketSize: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sample of value frequencies in this bucket. The total number of
    * values returned per bucket is capped at 20.
    */
  var bucketValues: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1ValueFrequency]] = js.undefined
  /** Lower bound on the value frequency of the values in this bucket. */
  var valueFrequencyLowerBound: js.UndefOr[java.lang.String] = js.undefined
  /** Upper bound on the value frequency of the values in this bucket. */
  var valueFrequencyUpperBound: js.UndefOr[java.lang.String] = js.undefined
}

object GooglePrivacyDlpV2beta1CategoricalStatsHistogramBucket {
  @scala.inline
  def apply(
    bucketSize: java.lang.String = null,
    bucketValues: js.Array[GooglePrivacyDlpV2beta1ValueFrequency] = null,
    valueFrequencyLowerBound: java.lang.String = null,
    valueFrequencyUpperBound: java.lang.String = null
  ): GooglePrivacyDlpV2beta1CategoricalStatsHistogramBucket = {
    val __obj = js.Dynamic.literal()
    if (bucketSize != null) __obj.updateDynamic("bucketSize")(bucketSize)
    if (bucketValues != null) __obj.updateDynamic("bucketValues")(bucketValues)
    if (valueFrequencyLowerBound != null) __obj.updateDynamic("valueFrequencyLowerBound")(valueFrequencyLowerBound)
    if (valueFrequencyUpperBound != null) __obj.updateDynamic("valueFrequencyUpperBound")(valueFrequencyUpperBound)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1CategoricalStatsHistogramBucket]
  }
}

