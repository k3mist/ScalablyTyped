package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCollection extends js.Object {
  var lists: js.Array[ListObject]
}

object ListCollection {
  @scala.inline
  def apply(lists: js.Array[ListObject]): ListCollection = {
    val __obj = js.Dynamic.literal(lists = lists)
  
    __obj.asInstanceOf[ListCollection]
  }
}

