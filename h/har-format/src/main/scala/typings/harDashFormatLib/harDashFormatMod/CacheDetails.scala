package typings
package harDashFormatLib.harDashFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheDetails extends js.Object {
  /**  A comment provided by the user or the application */
  var comment: js.UndefOr[java.lang.String] = js.undefined
  /** Etag */
  var eTag: java.lang.String
  /**
    * Expiration time of the cache entry.
    *
    * _(Format not documente but assumingly ISO 8601 -
    * `YYYY-MM-DDThh:mm:ss.sTZD`)_
    */
  var expires: js.UndefOr[java.lang.String] = js.undefined
  /** The number of times the cache entry has been opened. */
  var hitCount: scala.Double
  /**
    * The last time the cache entry was opened.
    *
    * _(Format not documente but assumingly ISO 8601 -
    * `YYYY-MM-DDThh:mm:ss.sTZD`)_
    */
  var lastAccess: java.lang.String
}

object CacheDetails {
  @scala.inline
  def apply(
    eTag: java.lang.String,
    hitCount: scala.Double,
    lastAccess: java.lang.String,
    comment: java.lang.String = null,
    expires: java.lang.String = null
  ): CacheDetails = {
    val __obj = js.Dynamic.literal(eTag = eTag, hitCount = hitCount, lastAccess = lastAccess)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (expires != null) __obj.updateDynamic("expires")(expires)
    __obj.asInstanceOf[CacheDetails]
  }
}

