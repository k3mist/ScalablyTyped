package typings
package androiduixLib.androidNs.viewNs.ViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnGenericMotionListener extends js.Object {
  def onGenericMotion(v: androiduixLib.androidNs.viewNs.View, event: androiduixLib.androidNs.viewNs.MotionEvent): js.Any
}

object OnGenericMotionListener {
  @scala.inline
  def apply(
    onGenericMotion: js.Function2[
      androiduixLib.androidNs.viewNs.View, 
      androiduixLib.androidNs.viewNs.MotionEvent, 
      js.Any
    ]
  ): OnGenericMotionListener = {
    val __obj = js.Dynamic.literal(onGenericMotion = onGenericMotion)
  
    __obj.asInstanceOf[OnGenericMotionListener]
  }
}

