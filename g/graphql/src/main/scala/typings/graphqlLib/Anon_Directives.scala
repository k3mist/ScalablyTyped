package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Directives extends js.Object {
  val directives: js.UndefOr[js.Array[graphqlLib.languageAstMod.DirectiveNode]] = js.undefined
}

object Anon_Directives {
  @scala.inline
  def apply(directives: js.Array[graphqlLib.languageAstMod.DirectiveNode] = null): Anon_Directives = {
    val __obj = js.Dynamic.literal()
    if (directives != null) __obj.updateDynamic("directives")(directives)
    __obj.asInstanceOf[Anon_Directives]
  }
}

