package typings
package unzipperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Promise extends js.Object {
  def promise(): js.Promise[scala.Unit]
}

object Anon_Promise {
  @scala.inline
  def apply(promise: js.Function0[js.Promise[scala.Unit]]): Anon_Promise = {
    val __obj = js.Dynamic.literal(promise = promise)
  
    __obj.asInstanceOf[Anon_Promise]
  }
}

