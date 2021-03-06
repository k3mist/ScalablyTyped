package typings
package wonderDashFrpLib.distEs2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "FilterStream")
@js.native
class FilterStream protected ()
  extends wonderDashFrpLib.distEs2015StreamFilterStreamMod.FilterStream {
  def this(source: wonderDashFrpLib.distEs2015CoreStreamMod.Stream, predicate: js.Function3[
      /* value */ js.Any, 
      /* index */ js.UndefOr[scala.Double], 
      /* source */ js.UndefOr[wonderDashFrpLib.distEs2015CoreStreamMod.Stream], 
      scala.Boolean
    ], thisArg: js.Any) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "FilterStream")
@js.native
object FilterStream extends js.Object {
  def create(
    source: wonderDashFrpLib.distEs2015CoreStreamMod.Stream,
    predicate: js.Function3[
      /* value */ js.Any, 
      /* index */ js.UndefOr[scala.Double], 
      /* source */ js.UndefOr[wonderDashFrpLib.distEs2015CoreStreamMod.Stream], 
      scala.Boolean
    ],
    thisArg: js.Any
  ): wonderDashFrpLib.distEs2015StreamFilterStreamMod.FilterStream = js.native
}

