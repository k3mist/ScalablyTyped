package typings
package jstreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Buffer extends js.Object {
  var inst: js.Any
  var mode: java.lang.String
  var node: js.Array[_]
}

object Buffer {
  @scala.inline
  def apply(inst: js.Any, mode: java.lang.String, node: js.Array[_]): Buffer = {
    val __obj = js.Dynamic.literal(inst = inst, mode = mode, node = node)
  
    __obj.asInstanceOf[Buffer]
  }
}

