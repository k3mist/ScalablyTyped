package typings
package firebaseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisplayName extends js.Object {
  var displayName: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var photoURL: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object Anon_DisplayName {
  @scala.inline
  def apply(displayName: java.lang.String = null, photoURL: java.lang.String = null): Anon_DisplayName = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (photoURL != null) __obj.updateDynamic("photoURL")(photoURL)
    __obj.asInstanceOf[Anon_DisplayName]
  }
}

