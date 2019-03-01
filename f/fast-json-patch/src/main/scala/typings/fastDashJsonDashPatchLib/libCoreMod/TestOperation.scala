package typings
package fastDashJsonDashPatchLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestOperation[T] extends BaseOperation {
  var op: fastDashJsonDashPatchLib.fastDashJsonDashPatchLibStrings.test
  var value: T
}

object TestOperation {
  @scala.inline
  def apply[T](
    op: fastDashJsonDashPatchLib.fastDashJsonDashPatchLibStrings.test,
    path: java.lang.String,
    value: T
  ): TestOperation[T] = {
    val __obj = js.Dynamic.literal(op = op, path = path, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TestOperation[T]]
  }
}

