package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Island extends js.Object {
  var bodies: js.Array[Body]
  var equations: js.Array[Equation]
  def getBodies(result: js.Array[_]): js.Array[Body]
  def reset(): scala.Unit
  def sleep(): scala.Boolean
  def wantsToSleep(): scala.Boolean
}

object Island {
  @scala.inline
  def apply(
    bodies: js.Array[Body],
    equations: js.Array[Equation],
    getBodies: js.Function1[js.Array[_], js.Array[Body]],
    reset: js.Function0[scala.Unit],
    sleep: js.Function0[scala.Boolean],
    wantsToSleep: js.Function0[scala.Boolean]
  ): Island = {
    val __obj = js.Dynamic.literal(bodies = bodies, equations = equations, getBodies = getBodies, reset = reset, sleep = sleep, wantsToSleep = wantsToSleep)
  
    __obj.asInstanceOf[Island]
  }
}

