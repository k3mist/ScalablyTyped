package typings
package atPollyjsPersisterLib.atPollyjsPersisterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Persister extends js.Object {
  def persist(): js.Promise[scala.Unit]
}

object Persister {
  @scala.inline
  def apply(persist: js.Function0[js.Promise[scala.Unit]]): Persister = {
    val __obj = js.Dynamic.literal(persist = persist)
  
    __obj.asInstanceOf[Persister]
  }
}

