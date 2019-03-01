package typings
package gapiDotClientDotQpxexpressLib.gapiNs.clientNs.qpxexpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaxData extends js.Object {
  /** An identifier uniquely identifying a tax in a response. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies this as a tax data object, representing some tax. Value: the fixed string qpxexpress#taxData. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The name of a tax. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object TaxData {
  @scala.inline
  def apply(id: java.lang.String = null, kind: java.lang.String = null, name: java.lang.String = null): TaxData = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[TaxData]
  }
}

