package typings
package androiduixLib.ukNs.coNs.senabNs.photoviewNs.PhotoViewAttacherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnMatrixChangedListener extends js.Object {
  def onMatrixChanged(rect: androiduixLib.androidNs.graphicsNs.RectF): scala.Unit
}

object OnMatrixChangedListener {
  @scala.inline
  def apply(onMatrixChanged: js.Function1[androiduixLib.androidNs.graphicsNs.RectF, scala.Unit]): OnMatrixChangedListener = {
    val __obj = js.Dynamic.literal(onMatrixChanged = onMatrixChanged)
  
    __obj.asInstanceOf[OnMatrixChangedListener]
  }
}

