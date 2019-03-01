package typings
package loadjsLib.loadjsMod.loadjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadOptions extends js.Object {
  var async: js.UndefOr[scala.Boolean] = js.undefined
  var before: js.UndefOr[
    js.Function2[/* path */ java.lang.String, /* scriptEl */ java.lang.String, scala.Unit]
  ] = js.undefined
  var error: js.UndefOr[js.Function1[/* depsNotFound */ java.lang.String, scala.Unit]] = js.undefined
  var numRetries: js.UndefOr[scala.Double] = js.undefined
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object LoadOptions {
  @scala.inline
  def apply(
    async: js.UndefOr[scala.Boolean] = js.undefined,
    before: js.Function2[/* path */ java.lang.String, /* scriptEl */ java.lang.String, scala.Unit] = null,
    error: js.Function1[/* depsNotFound */ java.lang.String, scala.Unit] = null,
    numRetries: scala.Int | scala.Double = null,
    success: js.Function0[scala.Unit] = null
  ): LoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (before != null) __obj.updateDynamic("before")(before)
    if (error != null) __obj.updateDynamic("error")(error)
    if (numRetries != null) __obj.updateDynamic("numRetries")(numRetries.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[LoadOptions]
  }
}

