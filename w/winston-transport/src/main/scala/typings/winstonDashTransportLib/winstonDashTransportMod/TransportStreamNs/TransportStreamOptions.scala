package typings
package winstonDashTransportLib.winstonDashTransportMod.TransportStreamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransportStreamOptions extends js.Object {
  var close: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var format: js.UndefOr[logformLib.logformMod.Format] = js.undefined
  var handleExceptions: js.UndefOr[scala.Boolean] = js.undefined
  var level: js.UndefOr[java.lang.String] = js.undefined
  var log: js.UndefOr[js.Function2[/* info */ js.Any, /* next */ js.Function0[scala.Unit], _]] = js.undefined
  var logv: js.UndefOr[js.Function2[/* info */ js.Any, /* next */ js.Function0[scala.Unit], _]] = js.undefined
  var silent: js.UndefOr[scala.Boolean] = js.undefined
}

object TransportStreamOptions {
  @scala.inline
  def apply(
    close: js.Function0[scala.Unit] = null,
    format: logformLib.logformMod.Format = null,
    handleExceptions: js.UndefOr[scala.Boolean] = js.undefined,
    level: java.lang.String = null,
    log: js.Function2[/* info */ js.Any, /* next */ js.Function0[scala.Unit], _] = null,
    logv: js.Function2[/* info */ js.Any, /* next */ js.Function0[scala.Unit], _] = null,
    silent: js.UndefOr[scala.Boolean] = js.undefined
  ): TransportStreamOptions = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close)
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(handleExceptions)) __obj.updateDynamic("handleExceptions")(handleExceptions)
    if (level != null) __obj.updateDynamic("level")(level)
    if (log != null) __obj.updateDynamic("log")(log)
    if (logv != null) __obj.updateDynamic("logv")(logv)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    __obj.asInstanceOf[TransportStreamOptions]
  }
}

