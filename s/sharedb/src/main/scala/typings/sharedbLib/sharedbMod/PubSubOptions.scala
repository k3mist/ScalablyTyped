package typings
package sharedbLib.sharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PubSubOptions extends js.Object {
  var prefix: js.UndefOr[java.lang.String] = js.undefined
}

object PubSubOptions {
  @scala.inline
  def apply(prefix: java.lang.String = null): PubSubOptions = {
    val __obj = js.Dynamic.literal()
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[PubSubOptions]
  }
}

