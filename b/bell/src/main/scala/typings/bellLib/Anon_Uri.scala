package typings
package bellLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Uri extends js.Object {
  var uri: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Uri {
  @scala.inline
  def apply(uri: java.lang.String = null): Anon_Uri = {
    val __obj = js.Dynamic.literal()
    if (uri != null) __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[Anon_Uri]
  }
}

