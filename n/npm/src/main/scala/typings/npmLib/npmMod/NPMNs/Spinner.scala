package typings
package npmLib.npmMod.NPMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spinner extends js.Object {
  var int: java.lang.String
  var started: scala.Boolean
  def start(): scala.Unit
  def stop(): scala.Unit
}

object Spinner {
  @scala.inline
  def apply(
    int: java.lang.String,
    start: js.Function0[scala.Unit],
    started: scala.Boolean,
    stop: js.Function0[scala.Unit]
  ): Spinner = {
    val __obj = js.Dynamic.literal(int = int, start = start, started = started, stop = stop)
  
    __obj.asInstanceOf[Spinner]
  }
}

