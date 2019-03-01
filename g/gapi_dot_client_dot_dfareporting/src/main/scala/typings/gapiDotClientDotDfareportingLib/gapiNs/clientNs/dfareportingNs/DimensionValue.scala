package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionValue extends js.Object {
  /** The name of the dimension. */
  var dimensionName: js.UndefOr[java.lang.String] = js.undefined
  /** The eTag of this response for caching purposes. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The ID associated with the value if available. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The kind of resource this is, in this case dfareporting#dimensionValue. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Determines how the 'value' field is matched when filtering. If not specified, defaults to EXACT. If set to WILDCARD_EXPRESSION, '&#42;' is allowed as a
    * placeholder for variable length character sequences, and it can be escaped with a backslash. Note, only paid search dimensions ('dfa:paidSearch&#42;')
    * allow a matchType other than EXACT.
    */
  var matchType: js.UndefOr[java.lang.String] = js.undefined
  /** The value of the dimension. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object DimensionValue {
  @scala.inline
  def apply(
    dimensionName: java.lang.String = null,
    etag: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    matchType: java.lang.String = null,
    value: java.lang.String = null
  ): DimensionValue = {
    val __obj = js.Dynamic.literal()
    if (dimensionName != null) __obj.updateDynamic("dimensionName")(dimensionName)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (matchType != null) __obj.updateDynamic("matchType")(matchType)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DimensionValue]
  }
}

