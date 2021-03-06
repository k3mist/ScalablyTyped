package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerEventMap extends AbstractWorkerEventMap {
  var message: MessageEvent
}

object WorkerEventMap {
  @scala.inline
  def apply(error: ErrorEvent, message: MessageEvent): WorkerEventMap = {
    val __obj = js.Dynamic.literal(error = error, message = message)
  
    __obj.asInstanceOf[WorkerEventMap]
  }
}

