package typings
package eslintLib.eslintMod.RuleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleModule extends js.Object {
  var meta: js.UndefOr[RuleMetaData] = js.undefined
  def create(context: RuleContext): RuleListener
}

object RuleModule {
  @scala.inline
  def apply(create: RuleContext => RuleListener, meta: RuleMetaData = null): RuleModule = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    if (meta != null) __obj.updateDynamic("meta")(meta)
    __obj.asInstanceOf[RuleModule]
  }
}

