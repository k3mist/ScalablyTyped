package typings
package ojaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Next extends js.Object {
  def next(): js.Promise[_]
}

object Anon_Next {
  @scala.inline
  def apply(next: () => js.Promise[_]): Anon_Next = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
  
    __obj.asInstanceOf[Anon_Next]
  }
}

