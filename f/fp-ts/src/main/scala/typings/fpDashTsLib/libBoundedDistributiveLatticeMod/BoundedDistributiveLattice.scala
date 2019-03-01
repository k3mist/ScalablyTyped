package typings
package fpDashTsLib.libBoundedDistributiveLatticeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoundedDistributiveLattice[A]
  extends fpDashTsLib.libBoundedLatticeMod.BoundedLattice[A]
     with fpDashTsLib.libLatticeMod.Lattice[A]

object BoundedDistributiveLattice {
  @scala.inline
  def apply[A](join: js.Function2[A, A, A], meet: js.Function2[A, A, A], one: A, zero: A): BoundedDistributiveLattice[A] = {
    val __obj = js.Dynamic.literal(join = join, meet = meet, one = one.asInstanceOf[js.Any], zero = zero.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BoundedDistributiveLattice[A]]
  }
}

