package typings
package jsonqueryLib.jsonqueryMod.jsonqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AndQueryCondition[T] extends BinaryQueryCondition[T] {
  @JSName("$and")
  var $and: js.Array[Query[T]]
}

