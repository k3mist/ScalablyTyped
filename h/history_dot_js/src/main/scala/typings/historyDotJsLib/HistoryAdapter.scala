package typings
package historyDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryAdapter extends js.Object {
  def bind(element: js.Any, event: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit
  def onDomLoad(callback: js.Function0[scala.Unit]): scala.Unit
  def trigger(element: js.Any, event: java.lang.String): scala.Unit
}

object HistoryAdapter {
  @scala.inline
  def apply(
    bind: js.Function3[js.Any, java.lang.String, js.Function0[scala.Unit], scala.Unit],
    onDomLoad: js.Function1[js.Function0[scala.Unit], scala.Unit],
    trigger: js.Function2[js.Any, java.lang.String, scala.Unit]
  ): HistoryAdapter = {
    val __obj = js.Dynamic.literal(bind = bind, onDomLoad = onDomLoad, trigger = trigger)
  
    __obj.asInstanceOf[HistoryAdapter]
  }
}

