package typings
package wsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataTarget extends js.Object {
  var data: js.Any
  var target: this.type
  var `type`: java.lang.String
}

object Anon_DataTarget {
  @scala.inline
  def apply(data: js.Any, target: Anon_DataTarget, `type`: java.lang.String): Anon_DataTarget = {
    val __obj = js.Dynamic.literal(data = data, target = target, `type` = `type`)
  
    __obj.asInstanceOf[Anon_DataTarget]
  }
}

