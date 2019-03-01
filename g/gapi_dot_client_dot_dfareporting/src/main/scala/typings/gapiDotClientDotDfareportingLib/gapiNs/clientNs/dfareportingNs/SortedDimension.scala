package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortedDimension extends js.Object {
  /** The kind of resource this is, in this case dfareporting#sortedDimension. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the dimension. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** An optional sort order for the dimension column. */
  var sortOrder: js.UndefOr[java.lang.String] = js.undefined
}

object SortedDimension {
  @scala.inline
  def apply(kind: java.lang.String = null, name: java.lang.String = null, sortOrder: java.lang.String = null): SortedDimension = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder)
    __obj.asInstanceOf[SortedDimension]
  }
}

