package typings
package rxDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Index[T]
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[T] {
  var length: scala.Double
}

object Anon_Index {
  @scala.inline
  def apply[T](
    length: scala.Double,
    NumberDictionary: /* index */ org.scalablytyped.runtime.NumberDictionary[T] = null
  ): Anon_Index[T] = {
    val __obj = js.Dynamic.literal(length = length)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[Anon_Index[T]]
  }
}

