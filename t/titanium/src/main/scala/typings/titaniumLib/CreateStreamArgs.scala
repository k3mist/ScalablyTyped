package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Argument passed to [createStream](Titanium.Stream.createStream).
  */
trait CreateStreamArgs extends js.Object {
  /**
  	 * Mode to open the stream in.
  	 */
  var mode: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Object that the stream will read from or write to.
  	 */
  var source: js.UndefOr[titaniumLib.TitaniumNs.Blob | titaniumLib.TitaniumNs.Buffer] = js.undefined
}

object CreateStreamArgs {
  @scala.inline
  def apply(
    mode: scala.Int | scala.Double = null,
    source: titaniumLib.TitaniumNs.Blob | titaniumLib.TitaniumNs.Buffer = null
  ): CreateStreamArgs = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStreamArgs]
  }
}

