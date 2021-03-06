package typings
package androiduixLib.androidNs.utilNs.PoolsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pool[T] extends js.Object {
  def acquire(): T
  def release(instance: T): scala.Boolean
}

object Pool {
  @scala.inline
  def apply[T](acquire: () => T, release: T => scala.Boolean): Pool[T] = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), release = js.Any.fromFunction1(release))
  
    __obj.asInstanceOf[Pool[T]]
  }
}

