package typings
package knockbackLib.KnockbackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventWatcherOptions extends js.Object {
  var event_selector: java.lang.String
  var key: js.UndefOr[java.lang.String] = js.undefined
  def emitter(newEmitter: js.Any): scala.Unit
  def update(newValue: js.Any): scala.Unit
}

object EventWatcherOptions {
  @scala.inline
  def apply(
    emitter: js.Any => scala.Unit,
    event_selector: java.lang.String,
    update: js.Any => scala.Unit,
    key: java.lang.String = null
  ): EventWatcherOptions = {
    val __obj = js.Dynamic.literal(emitter = js.Any.fromFunction1(emitter), event_selector = event_selector, update = js.Any.fromFunction1(update))
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[EventWatcherOptions]
  }
}

