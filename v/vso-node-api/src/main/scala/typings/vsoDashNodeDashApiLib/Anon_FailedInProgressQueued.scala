package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FailedInProgressQueued extends js.Object {
  var failed: scala.Double
  var inProgress: scala.Double
  var queued: scala.Double
  var succeeded: scala.Double
}

object Anon_FailedInProgressQueued {
  @scala.inline
  def apply(failed: scala.Double, inProgress: scala.Double, queued: scala.Double, succeeded: scala.Double): Anon_FailedInProgressQueued = {
    val __obj = js.Dynamic.literal(failed = failed, inProgress = inProgress, queued = queued, succeeded = succeeded)
  
    __obj.asInstanceOf[Anon_FailedInProgressQueued]
  }
}

