package typings
package nightmareLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Downloads extends js.Object {
  var downloads: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Downloads {
  @scala.inline
  def apply(downloads: java.lang.String = null): Anon_Downloads = {
    val __obj = js.Dynamic.literal()
    if (downloads != null) __obj.updateDynamic("downloads")(downloads)
    __obj.asInstanceOf[Anon_Downloads]
  }
}

