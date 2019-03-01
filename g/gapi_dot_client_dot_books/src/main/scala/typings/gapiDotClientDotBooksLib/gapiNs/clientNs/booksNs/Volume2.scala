package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Volume2 extends js.Object {
  /** A list of volumes. */
  var items: js.UndefOr[js.Array[Volume]] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object Volume2 {
  @scala.inline
  def apply(
    items: js.Array[Volume] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null
  ): Volume2 = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[Volume2]
  }
}

