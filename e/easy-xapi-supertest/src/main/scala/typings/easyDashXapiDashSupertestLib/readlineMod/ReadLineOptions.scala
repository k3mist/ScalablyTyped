package typings
package easyDashXapiDashSupertestLib.readlineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadLineOptions extends js.Object {
  var completer: js.UndefOr[js.Function] = js.undefined
  var input: easyDashXapiDashSupertestLib.NodeJSNs.ReadableStream
  var output: easyDashXapiDashSupertestLib.NodeJSNs.WritableStream
  var terminal: js.UndefOr[scala.Boolean] = js.undefined
}

object ReadLineOptions {
  @scala.inline
  def apply(
    input: easyDashXapiDashSupertestLib.NodeJSNs.ReadableStream,
    output: easyDashXapiDashSupertestLib.NodeJSNs.WritableStream,
    completer: js.Function = null,
    terminal: js.UndefOr[scala.Boolean] = js.undefined
  ): ReadLineOptions = {
    val __obj = js.Dynamic.literal(input = input, output = output)
    if (completer != null) __obj.updateDynamic("completer")(completer)
    if (!js.isUndefined(terminal)) __obj.updateDynamic("terminal")(terminal)
    __obj.asInstanceOf[ReadLineOptions]
  }
}

