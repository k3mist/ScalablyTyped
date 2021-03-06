package typings
package packageDashJsonLib.packageDashJsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Person extends js.Object {
  val email: js.UndefOr[java.lang.String] = js.undefined
  val name: js.UndefOr[java.lang.String] = js.undefined
  val url: js.UndefOr[java.lang.String] = js.undefined
}

object Person {
  @scala.inline
  def apply(email: java.lang.String = null, name: java.lang.String = null, url: java.lang.String = null): Person = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email)
    if (name != null) __obj.updateDynamic("name")(name)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Person]
  }
}

