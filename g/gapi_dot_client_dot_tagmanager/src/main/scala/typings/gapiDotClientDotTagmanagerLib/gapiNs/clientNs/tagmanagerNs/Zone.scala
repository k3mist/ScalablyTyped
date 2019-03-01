package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Zone extends js.Object {
  /** GTM Account ID. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** This Zone's boundary. */
  var boundary: js.UndefOr[ZoneBoundary] = js.undefined
  /** Containers that are children of this Zone. */
  var childContainer: js.UndefOr[js.Array[ZoneChildContainer]] = js.undefined
  /** GTM Container ID. */
  var containerId: js.UndefOr[java.lang.String] = js.undefined
  /** The fingerprint of the GTM Zone as computed at storage time. This value is recomputed whenever the zone is modified. */
  var fingerprint: js.UndefOr[java.lang.String] = js.undefined
  /** Zone display name. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** User notes on how to apply this zone in the container. */
  var notes: js.UndefOr[java.lang.String] = js.undefined
  /** GTM Zone's API relative path. */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** Auto generated link to the tag manager UI */
  var tagManagerUrl: js.UndefOr[java.lang.String] = js.undefined
  /** This Zone's type restrictions. */
  var typeRestriction: js.UndefOr[ZoneTypeRestriction] = js.undefined
  /** GTM Workspace ID. */
  var workspaceId: js.UndefOr[java.lang.String] = js.undefined
  /** The Zone ID uniquely identifies the GTM Zone. */
  var zoneId: js.UndefOr[java.lang.String] = js.undefined
}

object Zone {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    boundary: ZoneBoundary = null,
    childContainer: js.Array[ZoneChildContainer] = null,
    containerId: java.lang.String = null,
    fingerprint: java.lang.String = null,
    name: java.lang.String = null,
    notes: java.lang.String = null,
    path: java.lang.String = null,
    tagManagerUrl: java.lang.String = null,
    typeRestriction: ZoneTypeRestriction = null,
    workspaceId: java.lang.String = null,
    zoneId: java.lang.String = null
  ): Zone = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (boundary != null) __obj.updateDynamic("boundary")(boundary)
    if (childContainer != null) __obj.updateDynamic("childContainer")(childContainer)
    if (containerId != null) __obj.updateDynamic("containerId")(containerId)
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint)
    if (name != null) __obj.updateDynamic("name")(name)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (path != null) __obj.updateDynamic("path")(path)
    if (tagManagerUrl != null) __obj.updateDynamic("tagManagerUrl")(tagManagerUrl)
    if (typeRestriction != null) __obj.updateDynamic("typeRestriction")(typeRestriction)
    if (workspaceId != null) __obj.updateDynamic("workspaceId")(workspaceId)
    if (zoneId != null) __obj.updateDynamic("zoneId")(zoneId)
    __obj.asInstanceOf[Zone]
  }
}

