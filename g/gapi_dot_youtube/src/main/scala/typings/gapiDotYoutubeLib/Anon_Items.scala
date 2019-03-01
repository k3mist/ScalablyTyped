package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Items extends js.Object {
  /**
    * The list of promoted items in the order that they will display across different playbacks to the same viewer.
    */
  var items: js.Array[Anon_Type]
  /**
    * The position object encapsulates information about the spatial position within the video where the promoted item will be displayed.
    */
  var position: Anon_CornerPosition
  /**
    * The timing object encapsulates information about the temporal position within the video when the promoted item will be displayed.
    */
  var timing: Anon_OffsetMs
}

object Anon_Items {
  @scala.inline
  def apply(items: js.Array[Anon_Type], position: Anon_CornerPosition, timing: Anon_OffsetMs): Anon_Items = {
    val __obj = js.Dynamic.literal(items = items, position = position, timing = timing)
  
    __obj.asInstanceOf[Anon_Items]
  }
}

