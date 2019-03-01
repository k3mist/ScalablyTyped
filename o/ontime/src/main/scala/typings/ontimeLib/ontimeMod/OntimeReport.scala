package typings
package ontimeLib.ontimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OntimeReport extends js.Object {
  /**
    * Clears timers for scheduling jobs that the ontime instance knows.
    * This does not terminate the current execution of a job; you still need to call ot.done() for that purpose.
    */
  def cancel(): scala.Unit
  /**
    * Should be called after the job has been finished.
    * This is important especially when single is set to true because scheduling the next run is done in the method.
    */
  def done(): scala.Unit
}

object OntimeReport {
  @scala.inline
  def apply(cancel: js.Function0[scala.Unit], done: js.Function0[scala.Unit]): OntimeReport = {
    val __obj = js.Dynamic.literal(cancel = cancel, done = done)
  
    __obj.asInstanceOf[OntimeReport]
  }
}

