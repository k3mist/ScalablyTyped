package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Buffered extends js.Object {
  var buffered: js.UndefOr[scala.Boolean] = js.undefined
  var entryTypes: js.Array[java.lang.String]
}

object Anon_Buffered {
  @scala.inline
  def apply(entryTypes: js.Array[java.lang.String], buffered: js.UndefOr[scala.Boolean] = js.undefined): Anon_Buffered = {
    val __obj = js.Dynamic.literal(entryTypes = entryTypes)
    if (!js.isUndefined(buffered)) __obj.updateDynamic("buffered")(buffered)
    __obj.asInstanceOf[Anon_Buffered]
  }
}

