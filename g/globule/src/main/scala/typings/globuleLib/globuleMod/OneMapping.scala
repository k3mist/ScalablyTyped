package typings
package globuleLib.globuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OneMapping extends js.Object {
  var dest: java.lang.String
  var src: js.Array[java.lang.String]
}

object OneMapping {
  @scala.inline
  def apply(dest: java.lang.String, src: js.Array[java.lang.String]): OneMapping = {
    val __obj = js.Dynamic.literal(dest = dest, src = src)
  
    __obj.asInstanceOf[OneMapping]
  }
}

