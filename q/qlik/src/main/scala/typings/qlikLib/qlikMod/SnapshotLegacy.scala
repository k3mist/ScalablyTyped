package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotLegacy extends js.Object {
  var canTakeSnapshot: scala.Boolean
}

object SnapshotLegacy {
  @scala.inline
  def apply(canTakeSnapshot: scala.Boolean): SnapshotLegacy = {
    val __obj = js.Dynamic.literal(canTakeSnapshot = canTakeSnapshot)
  
    __obj.asInstanceOf[SnapshotLegacy]
  }
}

