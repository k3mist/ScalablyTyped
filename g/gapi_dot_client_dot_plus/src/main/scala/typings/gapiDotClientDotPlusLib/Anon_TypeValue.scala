package typings
package gapiDotClientDotPlusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TypeValue extends js.Object {
  /**
    * The type of address. Possible values include, but are not limited to, the following values:
    * - "account" - Google account email address.
    * - "home" - Home email address.
    * - "work" - Work email address.
    * - "other" - Other.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** The email address. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_TypeValue {
  @scala.inline
  def apply(`type`: java.lang.String = null, value: java.lang.String = null): Anon_TypeValue = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_TypeValue]
  }
}

