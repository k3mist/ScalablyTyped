package typings
package flightLib.FlightNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdviceStatic extends js.Object {
  def withAdvice(): js.Function
}

object AdviceStatic {
  @scala.inline
  def apply(withAdvice: js.Function0[js.Function]): AdviceStatic = {
    val __obj = js.Dynamic.literal(withAdvice = withAdvice)
  
    __obj.asInstanceOf[AdviceStatic]
  }
}

