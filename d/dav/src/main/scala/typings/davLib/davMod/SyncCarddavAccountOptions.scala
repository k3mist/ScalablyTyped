package typings
package davLib.davMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncCarddavAccountOptions extends js.Object {
  /**
    * list of caldav filters to send with request.
    */
  var filters: js.UndefOr[js.Array[js.Object]] = js.undefined
  /**
    * request sandbox.
    */
  var sandbox: js.UndefOr[Sandbox] = js.undefined
  /**
    * either 'basic' or 'webdav'. If unspecified, will try to do webdav sync
    * and failover to basic sync if rfc 6578 is not supported by the server.
    */
  var syncMethod: js.UndefOr[davLib.davLibStrings.basic | davLib.davLibStrings.webdav] = js.undefined
  /**
    * VTIMEZONE calendar object.
    */
  var timezone: js.UndefOr[java.lang.String] = js.undefined
  /**
    * request sender.
    */
  var xhr: js.UndefOr[davLib.davMod.transportNs.Transport] = js.undefined
}

object SyncCarddavAccountOptions {
  @scala.inline
  def apply(
    filters: js.Array[js.Object] = null,
    sandbox: Sandbox = null,
    syncMethod: davLib.davLibStrings.basic | davLib.davLibStrings.webdav = null,
    timezone: java.lang.String = null,
    xhr: davLib.davMod.transportNs.Transport = null
  ): SyncCarddavAccountOptions = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (sandbox != null) __obj.updateDynamic("sandbox")(sandbox)
    if (syncMethod != null) __obj.updateDynamic("syncMethod")(syncMethod.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone)
    if (xhr != null) __obj.updateDynamic("xhr")(xhr)
    __obj.asInstanceOf[SyncCarddavAccountOptions]
  }
}

