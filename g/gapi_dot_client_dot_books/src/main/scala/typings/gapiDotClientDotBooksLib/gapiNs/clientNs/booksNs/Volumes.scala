package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Volumes extends js.Object {
  /** A list of volumes. */
  var items: js.UndefOr[js.Array[Volume]] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Total number of volumes found. This might be greater than the number of volumes returned in this response if results have been paginated. */
  var totalItems: js.UndefOr[scala.Double] = js.undefined
}

object Volumes {
  @scala.inline
  def apply(
    items: js.Array[Volume] = null,
    kind: java.lang.String = null,
    totalItems: scala.Int | scala.Double = null
  ): Volumes = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[Volumes]
  }
}

