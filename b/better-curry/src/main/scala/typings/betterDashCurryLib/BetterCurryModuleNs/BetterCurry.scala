package typings
package betterDashCurryLib.BetterCurryModuleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BetterCurry extends js.Object {
  var MAX_OPTIMIZED: scala.Double = js.native
  def delegate[T](proto: T, target: java.lang.String): Delegate[T] = js.native
  def flatten(args: (js.Array[_] | js.Any)*): js.Array[_] = js.native
  def predefine[T /* <: js.Function */](fn: T, args: js.Array[_]): OriginalFunctionReminder[T] = js.native
  def predefine[T /* <: js.Function */](fn: T, args: js.Array[_], context: js.Object): OriginalFunctionReminder[T] = js.native
  def predefine[T /* <: js.Function */](fn: T, args: js.Array[_], context: js.Object, len: scala.Double): OriginalFunctionReminder[T] = js.native
  def predefine[T /* <: js.Function */](fn: T, args: js.Array[_], context: js.Object, len: scala.Double, checkArguments: scala.Boolean): OriginalFunctionReminder[T] = js.native
  def wrap[T /* <: js.Function */](fn: T): OriginalFunctionReminder[T] = js.native
  def wrap[T /* <: js.Function */](fn: T, context: js.Object): OriginalFunctionReminder[T] = js.native
  def wrap[T /* <: js.Function */](fn: T, context: js.Object, len: scala.Double): OriginalFunctionReminder[T] = js.native
  def wrap[T /* <: js.Function */](fn: T, context: js.Object, len: scala.Double, checkArguments: scala.Boolean): OriginalFunctionReminder[T] = js.native
}

