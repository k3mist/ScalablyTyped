package typings
package gapiDotClientDotVisionLib.gapiNs.clientNs.visionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Landmark extends js.Object {
  /** Face landmark position. */
  var position: js.UndefOr[Position] = js.undefined
  /** Face landmark type. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Landmark {
  @scala.inline
  def apply(position: Position = null, `type`: java.lang.String = null): Landmark = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Landmark]
  }
}

