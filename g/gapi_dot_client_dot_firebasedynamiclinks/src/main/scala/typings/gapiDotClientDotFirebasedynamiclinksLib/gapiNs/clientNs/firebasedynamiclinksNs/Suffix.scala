package typings
package gapiDotClientDotFirebasedynamiclinksLib.gapiNs.clientNs.firebasedynamiclinksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Suffix extends js.Object {
  /** Suffix option. */
  var option: js.UndefOr[java.lang.String] = js.undefined
}

object Suffix {
  @scala.inline
  def apply(option: java.lang.String = null): Suffix = {
    val __obj = js.Dynamic.literal()
    if (option != null) __obj.updateDynamic("option")(option)
    __obj.asInstanceOf[Suffix]
  }
}

