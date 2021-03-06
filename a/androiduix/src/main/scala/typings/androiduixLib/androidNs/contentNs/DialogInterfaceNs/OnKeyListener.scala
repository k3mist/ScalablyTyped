package typings
package androiduixLib.androidNs.contentNs.DialogInterfaceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnKeyListener extends js.Object {
  def onKey(
    dialog: androiduixLib.androidNs.contentNs.DialogInterface,
    keyCode: scala.Double,
    event: androiduixLib.androidNs.viewNs.KeyEvent
  ): scala.Boolean
}

object OnKeyListener {
  @scala.inline
  def apply(
    onKey: (androiduixLib.androidNs.contentNs.DialogInterface, scala.Double, androiduixLib.androidNs.viewNs.KeyEvent) => scala.Boolean
  ): OnKeyListener = {
    val __obj = js.Dynamic.literal(onKey = js.Any.fromFunction3(onKey))
  
    __obj.asInstanceOf[OnKeyListener]
  }
}

