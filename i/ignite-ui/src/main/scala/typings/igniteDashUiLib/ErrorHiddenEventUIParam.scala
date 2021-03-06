package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorHiddenEventUIParam extends js.Object {
  /**
  	 * Populated with options for the specific field in the collection or null.
  	 */
  var fieldOptions: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the text of message.
  	 */
  var message: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets reference to the igValidator widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets reference to the target of the message.
  	 */
  var target: js.UndefOr[java.lang.String] = js.undefined
}

object ErrorHiddenEventUIParam {
  @scala.inline
  def apply(
    fieldOptions: js.Any = null,
    message: java.lang.String = null,
    owner: js.Any = null,
    target: java.lang.String = null
  ): ErrorHiddenEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (fieldOptions != null) __obj.updateDynamic("fieldOptions")(fieldOptions)
    if (message != null) __obj.updateDynamic("message")(message)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[ErrorHiddenEventUIParam]
  }
}

