package typings
package applicationinsightsLib.outLibraryFlushOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlushOptions extends js.Object {
  /**
    * Callback that will be invoked with the response from server, in case of isAppCrashing set to true,
    * with immediate notification that data was stored
    */
  var callback: js.UndefOr[js.Function1[/* v */ java.lang.String, scala.Unit]] = js.undefined
  /**
    * Flag indicating whether application is crashing. When this flag is set to true
    * and storing data locally is enabled, Node.JS SDK will attempt to store data on disk
    */
  var isAppCrashing: js.UndefOr[scala.Boolean] = js.undefined
}

object FlushOptions {
  @scala.inline
  def apply(
    callback: js.Function1[/* v */ java.lang.String, scala.Unit] = null,
    isAppCrashing: js.UndefOr[scala.Boolean] = js.undefined
  ): FlushOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (!js.isUndefined(isAppCrashing)) __obj.updateDynamic("isAppCrashing")(isAppCrashing)
    __obj.asInstanceOf[FlushOptions]
  }
}

