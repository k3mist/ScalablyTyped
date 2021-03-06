package typings
package nwDotGuiLib.nwDotGuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEventEmitter extends js.Object {
  def addListener(event: java.lang.String, listener: js.Function): EventEmitter = js.native
  def emit(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  def listeners(event: java.lang.String): js.Array[js.Function] = js.native
  def on(event: java.lang.String, listener: js.Function): EventEmitter = js.native
  def once(event: java.lang.String, listener: js.Function): EventEmitter = js.native
  def removeAllListeners(): EventEmitter = js.native
  def removeAllListeners(event: java.lang.String): EventEmitter = js.native
  def removeListener(event: java.lang.String, listener: js.Function): EventEmitter = js.native
  def setMaxListeners(n: scala.Double): scala.Unit = js.native
}

