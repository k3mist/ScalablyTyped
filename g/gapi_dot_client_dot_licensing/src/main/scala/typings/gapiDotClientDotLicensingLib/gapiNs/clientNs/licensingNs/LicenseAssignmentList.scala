package typings
package gapiDotClientDotLicensingLib.gapiNs.clientNs.licensingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LicenseAssignmentList extends js.Object {
  /** ETag of the resource. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The LicenseAssignments in this page of results. */
  var items: js.UndefOr[js.Array[LicenseAssignment]] = js.undefined
  /** Identifies the resource as a collection of LicenseAssignments. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The continuation token, used to page through large result sets. Provide this value in a subsequent request to return the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object LicenseAssignmentList {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    items: js.Array[LicenseAssignment] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null
  ): LicenseAssignmentList = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[LicenseAssignmentList]
  }
}

