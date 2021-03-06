package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FdPromisify extends js.Object {
  /**
    * Asynchronous fstat(2) - Get file status.
    * @param fd A file descriptor.
    */
  def __promisify__(fd: scala.Double): js.Promise[nodeLib.fsMod.Stats]
}

object Anon_FdPromisify {
  @scala.inline
  def apply(__promisify__ : scala.Double => js.Promise[nodeLib.fsMod.Stats]): Anon_FdPromisify = {
    val __obj = js.Dynamic.literal(__promisify__ = js.Any.fromFunction1(__promisify__))
  
    __obj.asInstanceOf[Anon_FdPromisify]
  }
}

