package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Segment extends js.Object {
  /** Time the segment was created. */
  var created: js.UndefOr[java.lang.String] = js.undefined
  /** Segment definition. */
  var definition: js.UndefOr[java.lang.String] = js.undefined
  /** Segment ID. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Resource type for Analytics segment. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Segment name. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Segment ID. Can be used with the 'segment' parameter in Core Reporting API. */
  var segmentId: js.UndefOr[java.lang.String] = js.undefined
  /** Link for this segment. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** Type for a segment. Possible values are "BUILT_IN" or "CUSTOM". */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Time the segment was last modified. */
  var updated: js.UndefOr[java.lang.String] = js.undefined
}

object Segment {
  @scala.inline
  def apply(
    created: java.lang.String = null,
    definition: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    segmentId: java.lang.String = null,
    selfLink: java.lang.String = null,
    `type`: java.lang.String = null,
    updated: java.lang.String = null
  ): Segment = {
    val __obj = js.Dynamic.literal()
    if (created != null) __obj.updateDynamic("created")(created)
    if (definition != null) __obj.updateDynamic("definition")(definition)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (segmentId != null) __obj.updateDynamic("segmentId")(segmentId)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    __obj.asInstanceOf[Segment]
  }
}

