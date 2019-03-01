package typings
package gapiDotClientDotAnalyticsreportingLib.gapiNs.clientNs.analyticsreportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicSegment extends js.Object {
  /** The name of the dynamic segment. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Session Segment to select sessions to include in the segment. */
  var sessionSegment: js.UndefOr[SegmentDefinition] = js.undefined
  /** User Segment to select users to include in the segment. */
  var userSegment: js.UndefOr[SegmentDefinition] = js.undefined
}

object DynamicSegment {
  @scala.inline
  def apply(
    name: java.lang.String = null,
    sessionSegment: SegmentDefinition = null,
    userSegment: SegmentDefinition = null
  ): DynamicSegment = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (sessionSegment != null) __obj.updateDynamic("sessionSegment")(sessionSegment)
    if (userSegment != null) __obj.updateDynamic("userSegment")(userSegment)
    __obj.asInstanceOf[DynamicSegment]
  }
}

