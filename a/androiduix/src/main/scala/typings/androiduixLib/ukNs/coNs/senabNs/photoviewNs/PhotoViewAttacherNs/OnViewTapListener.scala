package typings
package androiduixLib.ukNs.coNs.senabNs.photoviewNs.PhotoViewAttacherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnViewTapListener extends js.Object {
  def onViewTap(view: androiduixLib.androidNs.viewNs.View, x: scala.Double, y: scala.Double): scala.Unit
}

object OnViewTapListener {
  @scala.inline
  def apply(
    onViewTap: js.Function3[androiduixLib.androidNs.viewNs.View, scala.Double, scala.Double, scala.Unit]
  ): OnViewTapListener = {
    val __obj = js.Dynamic.literal(onViewTap = onViewTap)
  
    __obj.asInstanceOf[OnViewTapListener]
  }
}

