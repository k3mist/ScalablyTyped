package typings
package gapiDotClientDotQpxexpressLib.gapiNs.clientNs.qpxexpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentInfo extends js.Object {
  /** The booking code or class for this segment. */
  var bookingCode: js.UndefOr[java.lang.String] = js.undefined
  /** The number of seats available in this booking code on this segment. */
  var bookingCodeCount: js.UndefOr[scala.Double] = js.undefined
  /** The cabin booked for this segment. */
  var cabin: js.UndefOr[java.lang.String] = js.undefined
  /** In minutes, the duration of the connection following this segment. */
  var connectionDuration: js.UndefOr[scala.Double] = js.undefined
  /** The duration of the flight segment in minutes. */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /** The flight this is a segment of. */
  var flight: js.UndefOr[FlightInfo] = js.undefined
  /** An id uniquely identifying the segment in the solution. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Identifies this as a segment object. A segment is one or more consecutive legs on the same flight. For example a hypothetical flight ZZ001, from DFW to
    * OGG, could have one segment with two legs: DFW to HNL (leg 1), HNL to OGG (leg 2). Value: the fixed string qpxexpress#segmentInfo.
    */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The legs composing this segment. */
  var leg: js.UndefOr[js.Array[LegInfo]] = js.undefined
  /**
    * The solution-based index of a segment in a married segment group. Married segments can only be booked together. For example, an airline might report a
    * certain booking code as sold out from Boston to Pittsburgh, but as available as part of two married segments Boston to Chicago connecting through
    * Pittsburgh. For example content of this field, consider the round-trip flight ZZ1 PHX-PHL ZZ2 PHL-CLT ZZ3 CLT-PHX. This has three segments, with the
    * two outbound ones (ZZ1 ZZ2) married. In this case, the two outbound segments belong to married segment group 0, and the return segment belongs to
    * married segment group 1.
    */
  var marriedSegmentGroup: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the operation of this segment remains subject to government approval. */
  var subjectToGovernmentApproval: js.UndefOr[scala.Boolean] = js.undefined
}

object SegmentInfo {
  @scala.inline
  def apply(
    bookingCode: java.lang.String = null,
    bookingCodeCount: scala.Int | scala.Double = null,
    cabin: java.lang.String = null,
    connectionDuration: scala.Int | scala.Double = null,
    duration: scala.Int | scala.Double = null,
    flight: FlightInfo = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    leg: js.Array[LegInfo] = null,
    marriedSegmentGroup: java.lang.String = null,
    subjectToGovernmentApproval: js.UndefOr[scala.Boolean] = js.undefined
  ): SegmentInfo = {
    val __obj = js.Dynamic.literal()
    if (bookingCode != null) __obj.updateDynamic("bookingCode")(bookingCode)
    if (bookingCodeCount != null) __obj.updateDynamic("bookingCodeCount")(bookingCodeCount.asInstanceOf[js.Any])
    if (cabin != null) __obj.updateDynamic("cabin")(cabin)
    if (connectionDuration != null) __obj.updateDynamic("connectionDuration")(connectionDuration.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (flight != null) __obj.updateDynamic("flight")(flight)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (leg != null) __obj.updateDynamic("leg")(leg)
    if (marriedSegmentGroup != null) __obj.updateDynamic("marriedSegmentGroup")(marriedSegmentGroup)
    if (!js.isUndefined(subjectToGovernmentApproval)) __obj.updateDynamic("subjectToGovernmentApproval")(subjectToGovernmentApproval)
    __obj.asInstanceOf[SegmentInfo]
  }
}

