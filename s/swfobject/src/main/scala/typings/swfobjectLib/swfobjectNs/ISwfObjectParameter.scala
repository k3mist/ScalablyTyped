package typings
package swfobjectLib.swfobjectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISwfObjectParameter extends js.Object {
  var flashvars: js.UndefOr[java.lang.String] = js.undefined
}

object ISwfObjectParameter {
  @scala.inline
  def apply(flashvars: java.lang.String = null): ISwfObjectParameter = {
    val __obj = js.Dynamic.literal()
    if (flashvars != null) __obj.updateDynamic("flashvars")(flashvars)
    __obj.asInstanceOf[ISwfObjectParameter]
  }
}

