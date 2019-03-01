package typings
package tstlLib.numericIComputableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IComputable[Param, Ret]
  extends tstlLib.numericINegatableMod.INegatable[Ret] {
  def divides(`val`: Param): Ret
  def minus(`val`: Param): Ret
  def modules(`val`: Param): Ret
  def multiplies(`val`: Param): Ret
  def plus(`val`: Param): Ret
}

object IComputable {
  @scala.inline
  def apply[Param, Ret](
    divides: js.Function1[Param, Ret],
    minus: js.Function1[Param, Ret],
    modules: js.Function1[Param, Ret],
    multiplies: js.Function1[Param, Ret],
    negate: js.Function0[Ret],
    plus: js.Function1[Param, Ret]
  ): IComputable[Param, Ret] = {
    val __obj = js.Dynamic.literal(divides = divides, minus = minus, modules = modules, multiplies = multiplies, negate = negate, plus = plus)
  
    __obj.asInstanceOf[IComputable[Param, Ret]]
  }
}

