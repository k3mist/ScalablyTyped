package typings
package findDashPackageDashJsonLib.findDashPackageDashJsonMod.finderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FinderIterator extends js.Object {
  def next(): FindResult
}

object FinderIterator {
  @scala.inline
  def apply(next: js.Function0[FindResult]): FinderIterator = {
    val __obj = js.Dynamic.literal(next = next)
  
    __obj.asInstanceOf[FinderIterator]
  }
}

