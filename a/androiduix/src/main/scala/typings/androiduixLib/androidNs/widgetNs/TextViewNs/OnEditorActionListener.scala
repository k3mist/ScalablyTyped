package typings
package androiduixLib.androidNs.widgetNs.TextViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnEditorActionListener extends js.Object {
  def onEditorAction(
    v: androiduixLib.androidNs.widgetNs.TextView,
    actionId: scala.Double,
    event: androiduixLib.androidNs.viewNs.KeyEvent
  ): scala.Boolean
}

object OnEditorActionListener {
  @scala.inline
  def apply(
    onEditorAction: js.Function3[
      androiduixLib.androidNs.widgetNs.TextView, 
      scala.Double, 
      androiduixLib.androidNs.viewNs.KeyEvent, 
      scala.Boolean
    ]
  ): OnEditorActionListener = {
    val __obj = js.Dynamic.literal(onEditorAction = onEditorAction)
  
    __obj.asInstanceOf[OnEditorActionListener]
  }
}

