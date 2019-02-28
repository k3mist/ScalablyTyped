package typings
package rxjsLib.internalObservableFromEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStyleEventEmitter
  extends EventTargetLike[js.Any] {
  def off(eventName: java.lang.String, handler: js.Function): scala.Unit
  def on(eventName: java.lang.String, handler: js.Function): scala.Unit
}

