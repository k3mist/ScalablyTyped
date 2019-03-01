package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevisionCheckResponse extends js.Object {
  /** The version of the API this client revision should use when calling API methods. */
  var apiVersion: js.UndefOr[java.lang.String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#revisionCheckResponse. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The result of the revision check.
    * Possible values are:
    * - "OK" - The revision being used is current.
    * - "DEPRECATED" - There is currently a newer version available, but the revision being used still works.
    * - "INVALID" - The revision being used is not supported in any released version.
    */
  var revisionStatus: js.UndefOr[java.lang.String] = js.undefined
}

object RevisionCheckResponse {
  @scala.inline
  def apply(
    apiVersion: java.lang.String = null,
    kind: java.lang.String = null,
    revisionStatus: java.lang.String = null
  ): RevisionCheckResponse = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (revisionStatus != null) __obj.updateDynamic("revisionStatus")(revisionStatus)
    __obj.asInstanceOf[RevisionCheckResponse]
  }
}

