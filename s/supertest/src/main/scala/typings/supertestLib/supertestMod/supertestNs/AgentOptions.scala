package typings
package supertestLib.supertestMod.supertestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentOptions extends js.Object {
  var ca: js.UndefOr[js.Any] = js.undefined
}

object AgentOptions {
  @scala.inline
  def apply(ca: js.Any = null): AgentOptions = {
    val __obj = js.Dynamic.literal()
    if (ca != null) __obj.updateDynamic("ca")(ca)
    __obj.asInstanceOf[AgentOptions]
  }
}

