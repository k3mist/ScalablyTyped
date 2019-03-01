package typings
package gapiDotClientDotAdexchangesellerLib.gapiNs.clientNs.adexchangesellerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportingMetadataEntry extends js.Object {
  /**
    * For metrics this is a list of dimension IDs which the metric is compatible with, for dimensions it is a list of compatibility groups the dimension
    * belongs to.
    */
  var compatibleDimensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The names of the metrics the dimension or metric this reporting metadata entry describes is compatible with. */
  var compatibleMetrics: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Unique identifier of this reporting metadata entry, corresponding to the name of the appropriate dimension or metric. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Kind of resource this is, in this case adexchangeseller#reportingMetadataEntry. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The names of the dimensions which the dimension or metric this reporting metadata entry describes requires to also be present in order for the report
    * to be valid. Omitting these will not cause an error or warning, but may result in data which cannot be correctly interpreted.
    */
  var requiredDimensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The names of the metrics which the dimension or metric this reporting metadata entry describes requires to also be present in order for the report to
    * be valid. Omitting these will not cause an error or warning, but may result in data which cannot be correctly interpreted.
    */
  var requiredMetrics: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The codes of the projects supported by the dimension or metric this reporting metadata entry describes. */
  var supportedProducts: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ReportingMetadataEntry {
  @scala.inline
  def apply(
    compatibleDimensions: js.Array[java.lang.String] = null,
    compatibleMetrics: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    requiredDimensions: js.Array[java.lang.String] = null,
    requiredMetrics: js.Array[java.lang.String] = null,
    supportedProducts: js.Array[java.lang.String] = null
  ): ReportingMetadataEntry = {
    val __obj = js.Dynamic.literal()
    if (compatibleDimensions != null) __obj.updateDynamic("compatibleDimensions")(compatibleDimensions)
    if (compatibleMetrics != null) __obj.updateDynamic("compatibleMetrics")(compatibleMetrics)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (requiredDimensions != null) __obj.updateDynamic("requiredDimensions")(requiredDimensions)
    if (requiredMetrics != null) __obj.updateDynamic("requiredMetrics")(requiredMetrics)
    if (supportedProducts != null) __obj.updateDynamic("supportedProducts")(supportedProducts)
    __obj.asInstanceOf[ReportingMetadataEntry]
  }
}

