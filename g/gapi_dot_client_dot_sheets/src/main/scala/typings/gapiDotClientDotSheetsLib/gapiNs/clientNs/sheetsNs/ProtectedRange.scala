package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProtectedRange extends js.Object {
  /** The description of this protected range. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The users and groups with edit access to the protected range.
    * This field is only visible to users with edit access to the protected
    * range and the document.
    * Editors are not supported with warning_only protection.
    */
  var editors: js.UndefOr[Editors] = js.undefined
  /**
    * The named range this protected range is backed by, if any.
    *
    * When writing, only one of range or named_range_id
    * may be set.
    */
  var namedRangeId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ID of the protected range.
    * This field is read-only.
    */
  var protectedRangeId: js.UndefOr[scala.Double] = js.undefined
  /**
    * The range that is being protected.
    * The range may be fully unbounded, in which case this is considered
    * a protected sheet.
    *
    * When writing, only one of range or named_range_id
    * may be set.
    */
  var range: js.UndefOr[GridRange] = js.undefined
  /**
    * True if the user who requested this protected range can edit the
    * protected area.
    * This field is read-only.
    */
  var requestingUserCanEdit: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The list of unprotected ranges within a protected sheet.
    * Unprotected ranges are only supported on protected sheets.
    */
  var unprotectedRanges: js.UndefOr[js.Array[GridRange]] = js.undefined
  /**
    * True if this protected range will show a warning when editing.
    * Warning-based protection means that every user can edit data in the
    * protected range, except editing will prompt a warning asking the user
    * to confirm the edit.
    *
    * When writing: if this field is true, then editors is ignored.
    * Additionally, if this field is changed from true to false and the
    * `editors` field is not set (nor included in the field mask), then
    * the editors will be set to all the editors in the document.
    */
  var warningOnly: js.UndefOr[scala.Boolean] = js.undefined
}

object ProtectedRange {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    editors: Editors = null,
    namedRangeId: java.lang.String = null,
    protectedRangeId: scala.Int | scala.Double = null,
    range: GridRange = null,
    requestingUserCanEdit: js.UndefOr[scala.Boolean] = js.undefined,
    unprotectedRanges: js.Array[GridRange] = null,
    warningOnly: js.UndefOr[scala.Boolean] = js.undefined
  ): ProtectedRange = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (editors != null) __obj.updateDynamic("editors")(editors)
    if (namedRangeId != null) __obj.updateDynamic("namedRangeId")(namedRangeId)
    if (protectedRangeId != null) __obj.updateDynamic("protectedRangeId")(protectedRangeId.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range)
    if (!js.isUndefined(requestingUserCanEdit)) __obj.updateDynamic("requestingUserCanEdit")(requestingUserCanEdit)
    if (unprotectedRanges != null) __obj.updateDynamic("unprotectedRanges")(unprotectedRanges)
    if (!js.isUndefined(warningOnly)) __obj.updateDynamic("warningOnly")(warningOnly)
    __obj.asInstanceOf[ProtectedRange]
  }
}

