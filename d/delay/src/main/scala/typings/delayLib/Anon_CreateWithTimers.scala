package typings
package delayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreateWithTimers extends js.Object {
  def createWithTimers(timers: Anon_ArgumentsClearTimeout): Delay
}

object Anon_CreateWithTimers {
  @scala.inline
  def apply(createWithTimers: js.Function1[Anon_ArgumentsClearTimeout, Delay]): Anon_CreateWithTimers = {
    val __obj = js.Dynamic.literal(createWithTimers = createWithTimers)
  
    __obj.asInstanceOf[Anon_CreateWithTimers]
  }
}

