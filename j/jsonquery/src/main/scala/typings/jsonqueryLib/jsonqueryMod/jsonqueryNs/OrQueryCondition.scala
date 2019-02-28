package typings
package jsonqueryLib.jsonqueryMod.jsonqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrQueryCondition[T] extends BinaryQueryCondition[T] {
  @JSName("$or")
  var $or: js.Array[Query[T]]
}

