package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateEmbeddedObjectPositionResponse extends js.Object {
  /** The new position of the embedded object. */
  var position: js.UndefOr[EmbeddedObjectPosition] = js.undefined
}

object UpdateEmbeddedObjectPositionResponse {
  @scala.inline
  def apply(position: EmbeddedObjectPosition = null): UpdateEmbeddedObjectPositionResponse = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[UpdateEmbeddedObjectPositionResponse]
  }
}

