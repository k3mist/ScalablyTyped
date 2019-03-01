package typings
package androiduixLib.androidNs.contentNs.DialogInterfaceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnClickListener extends js.Object {
  def onClick(dialog: androiduixLib.androidNs.contentNs.DialogInterface, which: scala.Double): scala.Unit
}

object OnClickListener {
  @scala.inline
  def apply(onClick: js.Function2[androiduixLib.androidNs.contentNs.DialogInterface, scala.Double, scala.Unit]): OnClickListener = {
    val __obj = js.Dynamic.literal(onClick = onClick)
  
    __obj.asInstanceOf[OnClickListener]
  }
}

