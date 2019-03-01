package typings
package atIarnaTomlLib.parseDashAsyncMod.parseAsyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** The amount text to parser per pass through the event loop. Defaults to 40kb. */
  var blocksize: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(blocksize: scala.Int | scala.Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (blocksize != null) __obj.updateDynamic("blocksize")(blocksize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

