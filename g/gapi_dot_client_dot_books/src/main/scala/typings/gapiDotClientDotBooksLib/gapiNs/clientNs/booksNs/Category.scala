package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Category extends js.Object {
  /** A list of onboarding categories. */
  var items: js.UndefOr[js.Array[gapiDotClientDotBooksLib.Anon_BadgeUrl]] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object Category {
  @scala.inline
  def apply(items: js.Array[gapiDotClientDotBooksLib.Anon_BadgeUrl] = null, kind: java.lang.String = null): Category = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[Category]
  }
}

