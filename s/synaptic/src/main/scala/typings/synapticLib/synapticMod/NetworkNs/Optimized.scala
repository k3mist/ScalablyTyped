package typings
package synapticLib.synapticMod.NetworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Optimized extends js.Object {
  var memory: stdLib.Float64Array
  def ownership(memoryBuffer: stdLib.Float64Array): scala.Unit
}

object Optimized {
  @scala.inline
  def apply(memory: stdLib.Float64Array, ownership: js.Function1[stdLib.Float64Array, scala.Unit]): Optimized = {
    val __obj = js.Dynamic.literal(memory = memory, ownership = ownership)
  
    __obj.asInstanceOf[Optimized]
  }
}

