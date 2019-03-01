package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IEnumerable[T] extends js.Object {
  def getEnumerator(): IEnumerator[T]
}

object IEnumerable {
  @scala.inline
  def apply[T](getEnumerator: js.Function0[IEnumerator[T]]): IEnumerable[T] = {
    val __obj = js.Dynamic.literal(getEnumerator = getEnumerator)
  
    __obj.asInstanceOf[IEnumerable[T]]
  }
}

