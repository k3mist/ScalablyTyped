package typings
package ganacheDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Log extends js.Object {
  def log(msg: java.lang.String): scala.Unit
}

object Anon_Log {
  @scala.inline
  def apply(log: java.lang.String => scala.Unit): Anon_Log = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log))
  
    __obj.asInstanceOf[Anon_Log]
  }
}

