package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractWorkerEventMap extends js.Object {
  var error: ErrorEvent
}

object AbstractWorkerEventMap {
  @scala.inline
  def apply(error: ErrorEvent): AbstractWorkerEventMap = {
    val __obj = js.Dynamic.literal(error = error)
  
    __obj.asInstanceOf[AbstractWorkerEventMap]
  }
}

