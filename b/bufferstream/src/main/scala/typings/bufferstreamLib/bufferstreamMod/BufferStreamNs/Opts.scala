package typings
package bufferstreamLib.bufferstreamMod.BufferStreamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Opts extends js.Object {
  /*
  			if true and the source is a child_process the stream will block the entire process (timeouts wont work anymore, but splitting and listening on data still works, because they work sync)
  		*/
  var blocking: js.UndefOr[scala.Boolean] = js.undefined
  /*
  			immediately call disable
  		*/
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /*
  			default encoding for writing strings
  		*/
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  /*
  			defines buffer level or sets buffer to given size (see ↓setSize for more)
  		*/
  var size: js.UndefOr[js.Any] = js.undefined
  /*
  			short form for:
  			split(token, function (chunk) {emit('data', chunk)})
  		*/
  // String or Buffer
  var split: js.UndefOr[js.Any] = js.undefined
}

object Opts {
  @scala.inline
  def apply(
    blocking: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    encoding: java.lang.String = null,
    size: js.Any = null,
    split: js.Any = null
  ): Opts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blocking)) __obj.updateDynamic("blocking")(blocking)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (size != null) __obj.updateDynamic("size")(size)
    if (split != null) __obj.updateDynamic("split")(split)
    __obj.asInstanceOf[Opts]
  }
}

