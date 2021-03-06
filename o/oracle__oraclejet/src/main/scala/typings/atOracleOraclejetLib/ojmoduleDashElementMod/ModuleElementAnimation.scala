package typings
package atOracleOraclejetLib.ojmoduleDashElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleElementAnimation extends js.Object {
  def animate(context: atOracleOraclejetLib.Anon_InsertNewView): js.Promise[_]
  def canAnimate(context: atOracleOraclejetLib.Anon_IsInitial): scala.Boolean
  def prepareAnimation(context: atOracleOraclejetLib.Anon_IsInitial): js.Object
}

object ModuleElementAnimation {
  @scala.inline
  def apply(
    animate: atOracleOraclejetLib.Anon_InsertNewView => js.Promise[_],
    canAnimate: atOracleOraclejetLib.Anon_IsInitial => scala.Boolean,
    prepareAnimation: atOracleOraclejetLib.Anon_IsInitial => js.Object
  ): ModuleElementAnimation = {
    val __obj = js.Dynamic.literal(animate = js.Any.fromFunction1(animate), canAnimate = js.Any.fromFunction1(canAnimate), prepareAnimation = js.Any.fromFunction1(prepareAnimation))
  
    __obj.asInstanceOf[ModuleElementAnimation]
  }
}

