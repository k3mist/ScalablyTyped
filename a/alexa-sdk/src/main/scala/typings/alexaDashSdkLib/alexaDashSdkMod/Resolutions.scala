package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resolutions extends js.Object {
  var resolutionsPerAuthority: js.Array[Resolution]
}

object Resolutions {
  @scala.inline
  def apply(resolutionsPerAuthority: js.Array[Resolution]): Resolutions = {
    val __obj = js.Dynamic.literal(resolutionsPerAuthority = resolutionsPerAuthority)
  
    __obj.asInstanceOf[Resolutions]
  }
}

