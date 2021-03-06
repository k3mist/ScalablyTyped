package typings
package nodeLib.querystringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  var decodeURIComponent: js.UndefOr[js.Function1[/* str */ java.lang.String, java.lang.String]] = js.undefined
  var maxKeys: js.UndefOr[scala.Double] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(
    decodeURIComponent: /* str */ java.lang.String => java.lang.String = null,
    maxKeys: scala.Int | scala.Double = null
  ): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (decodeURIComponent != null) __obj.updateDynamic("decodeURIComponent")(js.Any.fromFunction1(decodeURIComponent))
    if (maxKeys != null) __obj.updateDynamic("maxKeys")(maxKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseOptions]
  }
}

