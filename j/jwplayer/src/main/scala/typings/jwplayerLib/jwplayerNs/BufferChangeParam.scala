package typings
package jwplayerLib.jwplayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferChangeParam extends js.Object {
  var bufferPercent: scala.Double
  var duration: scala.Double
  var metadata: js.Any
  var position: scala.Double
}

object BufferChangeParam {
  @scala.inline
  def apply(bufferPercent: scala.Double, duration: scala.Double, metadata: js.Any, position: scala.Double): BufferChangeParam = {
    val __obj = js.Dynamic.literal(bufferPercent = bufferPercent, duration = duration, metadata = metadata, position = position)
  
    __obj.asInstanceOf[BufferChangeParam]
  }
}

