package typings
package dotLib.dotMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait String extends js.Object {
  def encodeHTML(): java.lang.String
}

object String {
  @scala.inline
  def apply(encodeHTML: js.Function0[java.lang.String]): String = {
    val __obj = js.Dynamic.literal(encodeHTML = encodeHTML)
  
    __obj.asInstanceOf[String]
  }
}

