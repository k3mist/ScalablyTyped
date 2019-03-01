package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Explanation extends js.Object {
  /** A text explaining why this volume is recommended. */
  var explanation: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Explanation {
  @scala.inline
  def apply(explanation: java.lang.String = null): Anon_Explanation = {
    val __obj = js.Dynamic.literal()
    if (explanation != null) __obj.updateDynamic("explanation")(explanation)
    __obj.asInstanceOf[Anon_Explanation]
  }
}

