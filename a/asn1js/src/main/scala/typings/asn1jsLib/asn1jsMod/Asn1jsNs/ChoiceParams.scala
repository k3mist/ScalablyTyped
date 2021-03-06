package typings
package asn1jsLib.asn1jsMod.Asn1jsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChoiceParams extends js.Object {
  var optional: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.UndefOr[js.Array[LocalValueBlock]] = js.undefined
}

object ChoiceParams {
  @scala.inline
  def apply(optional: js.UndefOr[scala.Boolean] = js.undefined, value: js.Array[LocalValueBlock] = null): ChoiceParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ChoiceParams]
  }
}

