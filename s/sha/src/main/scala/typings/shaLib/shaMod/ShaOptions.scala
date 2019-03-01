package typings
package shaLib.shaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShaOptions extends js.Object {
  /** defaults to `sha1` and can be any of the algorithms supported by `crypto.createHash` */
  var algorithm: js.UndefOr[java.lang.String] = js.undefined
}

object ShaOptions {
  @scala.inline
  def apply(algorithm: java.lang.String = null): ShaOptions = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm)
    __obj.asInstanceOf[ShaOptions]
  }
}

