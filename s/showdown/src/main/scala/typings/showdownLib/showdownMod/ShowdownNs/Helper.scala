package typings
package showdownLib.showdownMod.ShowdownNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * Helper Interface 
  */
trait Helper extends js.Object {
  def replaceRecursiveRegExp(args: js.Any*): java.lang.String
}

object Helper {
  @scala.inline
  def apply(replaceRecursiveRegExp: js.Function1[/* repeated */ js.Any, java.lang.String]): Helper = {
    val __obj = js.Dynamic.literal(replaceRecursiveRegExp = replaceRecursiveRegExp)
  
    __obj.asInstanceOf[Helper]
  }
}

