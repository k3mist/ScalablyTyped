package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxDataPage extends js.Object {
  var qArea: Rect
  var qIsReduced: scala.Boolean
  var qMatrix: js.Array[NxCellRows]
  var qTails: js.Array[NxGroupTail]
}

object NxDataPage {
  @scala.inline
  def apply(
    qArea: Rect,
    qIsReduced: scala.Boolean,
    qMatrix: js.Array[NxCellRows],
    qTails: js.Array[NxGroupTail]
  ): NxDataPage = {
    val __obj = js.Dynamic.literal(qArea = qArea, qIsReduced = qIsReduced, qMatrix = qMatrix, qTails = qTails)
  
    __obj.asInstanceOf[NxDataPage]
  }
}

