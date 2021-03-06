package typings
package uuidLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Rng
  extends uuidLib.interfacesMod.V4Options {
  def rng(): js.Array[scala.Double]
}

object Anon_Rng {
  @scala.inline
  def apply(rng: () => js.Array[scala.Double]): Anon_Rng = {
    val __obj = js.Dynamic.literal(rng = js.Any.fromFunction0(rng))
  
    __obj.asInstanceOf[Anon_Rng]
  }
}

