package typings
package fpDashTsLib.libSemiringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Semiring[A] extends js.Object {
  val one: A
  val zero: A
  def add(x: A, y: A): A
  def mul(x: A, y: A): A
}

object Semiring {
  @scala.inline
  def apply[A](add: js.Function2[A, A, A], mul: js.Function2[A, A, A], one: A, zero: A): Semiring[A] = {
    val __obj = js.Dynamic.literal(add = add, mul = mul, one = one.asInstanceOf[js.Any], zero = zero.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Semiring[A]]
  }
}

