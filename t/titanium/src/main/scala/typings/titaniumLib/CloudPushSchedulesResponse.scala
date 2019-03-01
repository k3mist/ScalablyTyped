package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Argument passed to the callback when a request finishes successfully.
  */
trait CloudPushSchedulesResponse extends js.Object {
  /**
  	 * Error code, if any returned.
  	 */
  var code: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Indicates whether the request failed.
  	 */
  var error: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Error message, if any returned.
  	 */
  var message: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Meta data, if any returned.
  	 */
  var meta: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Array of [schedules push notifications](https://docs.appcelerator.com/arrowdb/latest/#!/api/PushSchedules), if any exist.
  	 */
  var push_schedules: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Indicates whether the request succeeded.
  	 */
  var success: js.UndefOr[scala.Boolean] = js.undefined
}

object CloudPushSchedulesResponse {
  @scala.inline
  def apply(
    code: scala.Int | scala.Double = null,
    error: js.UndefOr[scala.Boolean] = js.undefined,
    message: java.lang.String = null,
    meta: js.Any = null,
    push_schedules: js.Array[_] = null,
    success: js.UndefOr[scala.Boolean] = js.undefined
  ): CloudPushSchedulesResponse = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (message != null) __obj.updateDynamic("message")(message)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (push_schedules != null) __obj.updateDynamic("push_schedules")(push_schedules)
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[CloudPushSchedulesResponse]
  }
}

