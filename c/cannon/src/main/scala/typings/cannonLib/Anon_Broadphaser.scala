package typings
package cannonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Broadphaser extends js.Object {
  var broadphaser: scala.Double
  var integrate: scala.Double
  var makeContactConstraints: scala.Double
  var narrowphase: scala.Double
  var solve: scala.Double
}

object Anon_Broadphaser {
  @scala.inline
  def apply(
    broadphaser: scala.Double,
    integrate: scala.Double,
    makeContactConstraints: scala.Double,
    narrowphase: scala.Double,
    solve: scala.Double
  ): Anon_Broadphaser = {
    val __obj = js.Dynamic.literal(broadphaser = broadphaser, integrate = integrate, makeContactConstraints = makeContactConstraints, narrowphase = narrowphase, solve = solve)
  
    __obj.asInstanceOf[Anon_Broadphaser]
  }
}

