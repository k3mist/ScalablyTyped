package typings
package arangodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SegmentThreshold extends js.Object {
  var segmentThreshold: scala.Double
  var threshold: scala.Double
  var `type`: arangodbLib.ArangoDBNs.ArangoSearchViewConsolidationType
}

object Anon_SegmentThreshold {
  @scala.inline
  def apply(
    segmentThreshold: scala.Double,
    threshold: scala.Double,
    `type`: arangodbLib.ArangoDBNs.ArangoSearchViewConsolidationType
  ): Anon_SegmentThreshold = {
    val __obj = js.Dynamic.literal(segmentThreshold = segmentThreshold, threshold = threshold, `type` = `type`)
  
    __obj.asInstanceOf[Anon_SegmentThreshold]
  }
}

