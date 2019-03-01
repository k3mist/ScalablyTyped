package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeAssignment extends js.Object {
  /** Whether this creative assignment is active. When true, the creative will be included in the ad's rotation. */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether applicable event tags should fire when this creative assignment is rendered. If this value is unset when the ad is inserted or updated, it will
    * default to true for all creative types EXCEPT for INTERNAL_REDIRECT, INTERSTITIAL_INTERNAL_REDIRECT, and INSTREAM_VIDEO.
    */
  var applyEventTags: js.UndefOr[scala.Boolean] = js.undefined
  /** Click-through URL of the creative assignment. */
  var clickThroughUrl: js.UndefOr[ClickThroughUrl] = js.undefined
  /** Companion creative overrides for this creative assignment. Applicable to video ads. */
  var companionCreativeOverrides: js.UndefOr[js.Array[CompanionClickThroughOverride]] = js.undefined
  /** Creative group assignments for this creative assignment. Only one assignment per creative group number is allowed for a maximum of two assignments. */
  var creativeGroupAssignments: js.UndefOr[js.Array[CreativeGroupAssignment]] = js.undefined
  /** ID of the creative to be assigned. This is a required field. */
  var creativeId: js.UndefOr[java.lang.String] = js.undefined
  /** Dimension value for the ID of the creative. This is a read-only, auto-generated field. */
  var creativeIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /** Date and time that the assigned creative should stop serving. Must be later than the start time. */
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Rich media exit overrides for this creative assignment.
    * Applicable when the creative type is any of the following:
    * - DISPLAY
    * - RICH_MEDIA_INPAGE
    * - RICH_MEDIA_INPAGE_FLOATING
    * - RICH_MEDIA_IM_EXPAND
    * - RICH_MEDIA_EXPANDING
    * - RICH_MEDIA_INTERSTITIAL_FLOAT
    * - RICH_MEDIA_MOBILE_IN_APP
    * - RICH_MEDIA_MULTI_FLOATING
    * - RICH_MEDIA_PEEL_DOWN
    * - VPAID_LINEAR
    * - VPAID_NON_LINEAR
    */
  var richMediaExitOverrides: js.UndefOr[js.Array[RichMediaExitOverride]] = js.undefined
  /**
    * Sequence number of the creative assignment, applicable when the rotation type is CREATIVE_ROTATION_TYPE_SEQUENTIAL. Acceptable values are 1 to 65535,
    * inclusive.
    */
  var sequence: js.UndefOr[scala.Double] = js.undefined
  /** Whether the creative to be assigned is SSL-compliant. This is a read-only field that is auto-generated when the ad is inserted or updated. */
  var sslCompliant: js.UndefOr[scala.Boolean] = js.undefined
  /** Date and time that the assigned creative should start serving. */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
  /** Weight of the creative assignment, applicable when the rotation type is CREATIVE_ROTATION_TYPE_RANDOM. Value must be greater than or equal to 1. */
  var weight: js.UndefOr[scala.Double] = js.undefined
}

object CreativeAssignment {
  @scala.inline
  def apply(
    active: js.UndefOr[scala.Boolean] = js.undefined,
    applyEventTags: js.UndefOr[scala.Boolean] = js.undefined,
    clickThroughUrl: ClickThroughUrl = null,
    companionCreativeOverrides: js.Array[CompanionClickThroughOverride] = null,
    creativeGroupAssignments: js.Array[CreativeGroupAssignment] = null,
    creativeId: java.lang.String = null,
    creativeIdDimensionValue: DimensionValue = null,
    endTime: java.lang.String = null,
    richMediaExitOverrides: js.Array[RichMediaExitOverride] = null,
    sequence: scala.Int | scala.Double = null,
    sslCompliant: js.UndefOr[scala.Boolean] = js.undefined,
    startTime: java.lang.String = null,
    weight: scala.Int | scala.Double = null
  ): CreativeAssignment = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (!js.isUndefined(applyEventTags)) __obj.updateDynamic("applyEventTags")(applyEventTags)
    if (clickThroughUrl != null) __obj.updateDynamic("clickThroughUrl")(clickThroughUrl)
    if (companionCreativeOverrides != null) __obj.updateDynamic("companionCreativeOverrides")(companionCreativeOverrides)
    if (creativeGroupAssignments != null) __obj.updateDynamic("creativeGroupAssignments")(creativeGroupAssignments)
    if (creativeId != null) __obj.updateDynamic("creativeId")(creativeId)
    if (creativeIdDimensionValue != null) __obj.updateDynamic("creativeIdDimensionValue")(creativeIdDimensionValue)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (richMediaExitOverrides != null) __obj.updateDynamic("richMediaExitOverrides")(richMediaExitOverrides)
    if (sequence != null) __obj.updateDynamic("sequence")(sequence.asInstanceOf[js.Any])
    if (!js.isUndefined(sslCompliant)) __obj.updateDynamic("sslCompliant")(sslCompliant)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreativeAssignment]
  }
}

