package typings
package gapiDotClientDotBloggerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  /** The identifier of the Blog that contains this Post. */
  var id: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Id {
  @scala.inline
  def apply(id: java.lang.String = null): Anon_Id = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Anon_Id]
  }
}

