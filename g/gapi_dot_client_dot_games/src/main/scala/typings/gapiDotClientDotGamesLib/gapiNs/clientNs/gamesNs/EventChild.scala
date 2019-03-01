package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventChild extends js.Object {
  /** The ID of the child event. */
  var childId: js.UndefOr[java.lang.String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#eventChild. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object EventChild {
  @scala.inline
  def apply(childId: java.lang.String = null, kind: java.lang.String = null): EventChild = {
    val __obj = js.Dynamic.literal()
    if (childId != null) __obj.updateDynamic("childId")(childId)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[EventChild]
  }
}

