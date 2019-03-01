package typings
package reactDashShareLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  /** Body of the email, defaults to shared url. */
  var body: js.UndefOr[java.lang.String] = js.undefined
  /** Title of the shared page */
  var subject: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Body {
  @scala.inline
  def apply(body: java.lang.String = null, subject: java.lang.String = null): Anon_Body = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    __obj.asInstanceOf[Anon_Body]
  }
}

