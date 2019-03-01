package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApprovedBroken extends js.Object {
  var approved: scala.Double
  var broken: scala.Double
  var notApplicable: scala.Double
  var queued: scala.Double
  var rejected: scala.Double
  var running: scala.Double
}

object Anon_ApprovedBroken {
  @scala.inline
  def apply(
    approved: scala.Double,
    broken: scala.Double,
    notApplicable: scala.Double,
    queued: scala.Double,
    rejected: scala.Double,
    running: scala.Double
  ): Anon_ApprovedBroken = {
    val __obj = js.Dynamic.literal(approved = approved, broken = broken, notApplicable = notApplicable, queued = queued, rejected = rejected, running = running)
  
    __obj.asInstanceOf[Anon_ApprovedBroken]
  }
}

