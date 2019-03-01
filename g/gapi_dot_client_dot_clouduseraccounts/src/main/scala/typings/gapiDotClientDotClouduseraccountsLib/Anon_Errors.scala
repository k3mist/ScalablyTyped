package typings
package gapiDotClientDotClouduseraccountsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Errors extends js.Object {
  /** [Output Only] The array of errors encountered while processing this operation. */
  var errors: js.UndefOr[js.Array[Anon_Code]] = js.undefined
}

object Anon_Errors {
  @scala.inline
  def apply(errors: js.Array[Anon_Code] = null): Anon_Errors = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors)
    __obj.asInstanceOf[Anon_Errors]
  }
}

