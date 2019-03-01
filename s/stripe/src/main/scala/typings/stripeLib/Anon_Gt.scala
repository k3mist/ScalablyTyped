package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Gt extends js.Object {
  /**
    * Return values where the created field is after this timestamp.
    */
  var gt: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Return values where the created field is after or equal to this timestamp.
    */
  var gte: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Return values where the created field is before this timestamp.
    */
  var lt: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Return values where the created field is before or equal to this timestamp.
    */
  var lte: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Gt {
  @scala.inline
  def apply(
    gt: java.lang.String = null,
    gte: java.lang.String = null,
    lt: java.lang.String = null,
    lte: java.lang.String = null
  ): Anon_Gt = {
    val __obj = js.Dynamic.literal()
    if (gt != null) __obj.updateDynamic("gt")(gt)
    if (gte != null) __obj.updateDynamic("gte")(gte)
    if (lt != null) __obj.updateDynamic("lt")(lt)
    if (lte != null) __obj.updateDynamic("lte")(lte)
    __obj.asInstanceOf[Anon_Gt]
  }
}

