package typings
package ejDotWebDotAllLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Val extends js.Object {
  def valueFunction(`val`: java.lang.String): js.Any
}

object Anon_Val {
  @scala.inline
  def apply(valueFunction: java.lang.String => js.Any): Anon_Val = {
    val __obj = js.Dynamic.literal(valueFunction = js.Any.fromFunction1(valueFunction))
  
    __obj.asInstanceOf[Anon_Val]
  }
}

