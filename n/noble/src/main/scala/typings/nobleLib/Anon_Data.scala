package typings
package nobleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: nodeLib.Buffer
  var uuid: java.lang.String
}

object Anon_Data {
  @scala.inline
  def apply(data: nodeLib.Buffer, uuid: java.lang.String): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data, uuid = uuid)
  
    __obj.asInstanceOf[Anon_Data]
  }
}

