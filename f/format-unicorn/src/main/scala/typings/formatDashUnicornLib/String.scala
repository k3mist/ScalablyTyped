package typings
package formatDashUnicornLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait String extends js.Object {
  def formatUnicorn(replacements: js.Object): java.lang.String
}

object String {
  @scala.inline
  def apply(formatUnicorn: js.Function1[js.Object, java.lang.String]): String = {
    val __obj = js.Dynamic.literal(formatUnicorn = formatUnicorn)
  
    __obj.asInstanceOf[String]
  }
}

