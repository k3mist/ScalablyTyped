package typings
package surveyDashKnockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClearInterval extends js.Object {
  def clearInterval(timerId: scala.Double): scala.Unit
  def setInterval(func: js.Function0[_]): scala.Double
}

object Anon_ClearInterval {
  @scala.inline
  def apply(
    clearInterval: js.Function1[scala.Double, scala.Unit],
    setInterval: js.Function1[js.Function0[_], scala.Double]
  ): Anon_ClearInterval = {
    val __obj = js.Dynamic.literal(clearInterval = clearInterval, setInterval = setInterval)
  
    __obj.asInstanceOf[Anon_ClearInterval]
  }
}

