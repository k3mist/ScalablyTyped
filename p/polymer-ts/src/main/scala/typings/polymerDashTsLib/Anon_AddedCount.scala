package typings
package polymerDashTsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddedCount extends js.Object {
  var addedCount: scala.Double
  var index: scala.Double
  var `object`: js.Array[_]
  var removed: js.Array[_]
  var `type`: polymerDashTsLib.polymerDashTsLibStrings.splice
}

object Anon_AddedCount {
  @scala.inline
  def apply(
    addedCount: scala.Double,
    index: scala.Double,
    `object`: js.Array[_],
    removed: js.Array[_],
    `type`: polymerDashTsLib.polymerDashTsLibStrings.splice
  ): Anon_AddedCount = {
    val __obj = js.Dynamic.literal(addedCount = addedCount, index = index, `object` = `object`, removed = removed, `type` = `type`)
  
    __obj.asInstanceOf[Anon_AddedCount]
  }
}

