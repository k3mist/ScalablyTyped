package typings
package coLib.coMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Co extends js.Object {
  @JSName("co")
  var co_Original: Co = js.native
  @JSName("default")
  var default_Original: Co = js.native
  def apply[F /* <: js.Function1[/* repeated */ js.Any, stdLib.Generator] */](
    fn: F,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<F> is not an array type */ args: stdLib.Parameters[F]
  ): js.Promise[coLib.ExtractType[stdLib.ReturnType[F]]] = js.native
  def co[F /* <: js.Function1[/* repeated */ js.Any, stdLib.Generator] */](
    fn: F,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<F> is not an array type */ args: stdLib.Parameters[F]
  ): js.Promise[coLib.ExtractType[stdLib.ReturnType[F]]] = js.native
  def default[F /* <: js.Function1[/* repeated */ js.Any, stdLib.Generator] */](
    fn: F,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<F> is not an array type */ args: stdLib.Parameters[F]
  ): js.Promise[coLib.ExtractType[stdLib.ReturnType[F]]] = js.native
  def wrap[F /* <: js.Function1[/* repeated */ js.Any, stdLib.Generator] */](fn: F): js.Function1[
    /* args */ stdLib.Parameters[F], 
    js.Promise[coLib.ExtractType[stdLib.ReturnType[F]]]
  ] = js.native
}

