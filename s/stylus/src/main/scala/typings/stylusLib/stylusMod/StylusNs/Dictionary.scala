package typings
package stylusLib.stylusMod.StylusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictionary[T]
  extends /* key */ org.scalablytyped.runtime.StringDictionary[T]

object Dictionary {
  @scala.inline
  def apply[T](StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[T] = null): Dictionary[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Dictionary[T]]
  }
}

