package typings
package textDashEncodingDashUtfDash8Lib.textDashEncodingDashUtfDash8Mod.TextEncodingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextEncodeOptions extends js.Object {
  var stream: js.UndefOr[scala.Boolean] = js.undefined
}

object TextEncodeOptions {
  @scala.inline
  def apply(stream: js.UndefOr[scala.Boolean] = js.undefined): TextEncodeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(stream)) __obj.updateDynamic("stream")(stream)
    __obj.asInstanceOf[TextEncodeOptions]
  }
}

