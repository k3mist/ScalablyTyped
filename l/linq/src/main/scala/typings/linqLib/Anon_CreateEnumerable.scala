package typings
package linqLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreateEnumerable extends js.Object {
  def createEnumerable[T](getEnumerator: js.Function0[linqLib.linqMod.EnumerableNs.IEnumerator[T]]): linqLib.linqMod.EnumerableNs.IEnumerable[T]
  def createEnumerator[T](
    initialize: js.Function0[scala.Unit],
    tryGetNext: js.Function0[scala.Boolean],
    dispose: js.Function0[scala.Unit]
  ): linqLib.linqMod.EnumerableNs.IEnumerator[T]
  def createLambda(expression: js.Any): js.Function1[/* repeated */ js.Any, _]
  def extendTo(`type`: js.Any): scala.Unit
}

object Anon_CreateEnumerable {
  @scala.inline
  def apply(
    createEnumerable: js.Function1[
      js.Function0[linqLib.linqMod.EnumerableNs.IEnumerator[js.Any]], 
      linqLib.linqMod.EnumerableNs.IEnumerable[js.Any]
    ],
    createEnumerator: js.Function3[
      js.Function0[scala.Unit], 
      js.Function0[scala.Boolean], 
      js.Function0[scala.Unit], 
      linqLib.linqMod.EnumerableNs.IEnumerator[js.Any]
    ],
    createLambda: js.Function1[js.Any, js.Function1[/* repeated */ js.Any, _]],
    extendTo: js.Function1[js.Any, scala.Unit]
  ): Anon_CreateEnumerable = {
    val __obj = js.Dynamic.literal(createEnumerable = createEnumerable, createEnumerator = createEnumerator, createLambda = createLambda, extendTo = extendTo)
  
    __obj.asInstanceOf[Anon_CreateEnumerable]
  }
}

