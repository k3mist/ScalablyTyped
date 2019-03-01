package typings
package sjclLib.sjclMod.sjclNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SjclEllipticalPoint extends js.Object {
  def isValid(): scala.Boolean
  def mult(k: BigNumber): SjclEllipticalPoint
  def mult2(k: BigNumber, k2: BigNumber, affine2: SjclEllipticalPoint): SjclEllipticalPoint
  def multiples(): js.Array[SjclEllipticalPoint]
  def toBits(): BitArray
  def toJac(): SjclPointJacobian
}

object SjclEllipticalPoint {
  @scala.inline
  def apply(
    isValid: js.Function0[scala.Boolean],
    mult: js.Function1[BigNumber, SjclEllipticalPoint],
    mult2: js.Function3[BigNumber, BigNumber, SjclEllipticalPoint, SjclEllipticalPoint],
    multiples: js.Function0[js.Array[SjclEllipticalPoint]],
    toBits: js.Function0[BitArray],
    toJac: js.Function0[SjclPointJacobian]
  ): SjclEllipticalPoint = {
    val __obj = js.Dynamic.literal(isValid = isValid, mult = mult, mult2 = mult2, multiples = multiples, toBits = toBits, toJac = toJac)
  
    __obj.asInstanceOf[SjclEllipticalPoint]
  }
}

