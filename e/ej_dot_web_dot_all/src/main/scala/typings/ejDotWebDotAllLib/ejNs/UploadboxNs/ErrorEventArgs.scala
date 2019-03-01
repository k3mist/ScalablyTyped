package typings
package ejDotWebDotAllLib.ejNs.UploadboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorEventArgs extends js.Object {
  /** error event action details.
    */
  var action: js.UndefOr[java.lang.String] = js.undefined
  /** details about the error information.
    */
  var error: js.UndefOr[java.lang.String] = js.undefined
  /** returns the file details of the file uploaded
    */
  var files: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ErrorEventArgs {
  @scala.inline
  def apply(
    action: java.lang.String = null,
    error: java.lang.String = null,
    files: js.Any = null,
    `type`: java.lang.String = null
  ): ErrorEventArgs = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (error != null) __obj.updateDynamic("error")(error)
    if (files != null) __obj.updateDynamic("files")(files)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ErrorEventArgs]
  }
}

