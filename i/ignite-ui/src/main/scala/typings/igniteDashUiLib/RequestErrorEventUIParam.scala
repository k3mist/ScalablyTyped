package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestErrorEventUIParam extends js.Object {
  /**
  	 * Gets the processed error message sent by the server
  	 */
  var message: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets a reference to the grid.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the whole response object
  	 */
  var response: js.UndefOr[js.Any] = js.undefined
}

object RequestErrorEventUIParam {
  @scala.inline
  def apply(message: java.lang.String = null, owner: js.Any = null, response: js.Any = null): RequestErrorEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (response != null) __obj.updateDynamic("response")(response)
    __obj.asInstanceOf[RequestErrorEventUIParam]
  }
}

