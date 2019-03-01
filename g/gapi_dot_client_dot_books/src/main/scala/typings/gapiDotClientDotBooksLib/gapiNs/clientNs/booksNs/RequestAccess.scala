package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestAccess extends js.Object {
  /** A concurrent access response. */
  var concurrentAccess: js.UndefOr[ConcurrentAccessRestriction] = js.undefined
  /** A download access response. */
  var downloadAccess: js.UndefOr[DownloadAccessRestriction] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object RequestAccess {
  @scala.inline
  def apply(
    concurrentAccess: ConcurrentAccessRestriction = null,
    downloadAccess: DownloadAccessRestriction = null,
    kind: java.lang.String = null
  ): RequestAccess = {
    val __obj = js.Dynamic.literal()
    if (concurrentAccess != null) __obj.updateDynamic("concurrentAccess")(concurrentAccess)
    if (downloadAccess != null) __obj.updateDynamic("downloadAccess")(downloadAccess)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[RequestAccess]
  }
}

