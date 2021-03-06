package typings
package reDashReselectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsCache[C, R, P, S, D] extends js.Object {
  var cache: reDashReselectLib.reDashReselectMod.ICacheObject
  def clearCache(): scala.Unit
  def getMatchingSelector(state: S, props: P, args: js.Any*): reDashReselectLib.reDashReselectMod.OutputParametricSelector[S, P, R, C, D]
  def removeMatchingSelector(state: S, props: P, args: js.Any*): scala.Unit
}

object Anon_ArgsCache {
  @scala.inline
  def apply[C, R, P, S, D](
    cache: reDashReselectLib.reDashReselectMod.ICacheObject,
    clearCache: () => scala.Unit,
    getMatchingSelector: (S, P, /* repeated */ js.Any) => reDashReselectLib.reDashReselectMod.OutputParametricSelector[S, P, R, C, D],
    removeMatchingSelector: (S, P, /* repeated */ js.Any) => scala.Unit
  ): Anon_ArgsCache[C, R, P, S, D] = {
    val __obj = js.Dynamic.literal(cache = cache, clearCache = js.Any.fromFunction0(clearCache), getMatchingSelector = js.Any.fromFunction3(getMatchingSelector), removeMatchingSelector = js.Any.fromFunction3(removeMatchingSelector))
  
    __obj.asInstanceOf[Anon_ArgsCache[C, R, P, S, D]]
  }
}

