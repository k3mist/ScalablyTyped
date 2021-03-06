package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupStore extends js.Object {
  def group(stats: js.Any): scala.Unit
  def ungroup(): scala.Unit
}

object GroupStore {
  @scala.inline
  def apply(group: js.Any => scala.Unit, ungroup: () => scala.Unit): GroupStore = {
    val __obj = js.Dynamic.literal(group = js.Any.fromFunction1(group), ungroup = js.Any.fromFunction0(ungroup))
  
    __obj.asInstanceOf[GroupStore]
  }
}

