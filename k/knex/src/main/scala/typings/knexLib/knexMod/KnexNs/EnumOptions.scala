package typings
package knexLib.knexMod.KnexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumOptions extends js.Object {
  var enumName: java.lang.String
  var useNative: scala.Boolean
}

object EnumOptions {
  @scala.inline
  def apply(enumName: java.lang.String, useNative: scala.Boolean): EnumOptions = {
    val __obj = js.Dynamic.literal(enumName = enumName, useNative = useNative)
  
    __obj.asInstanceOf[EnumOptions]
  }
}

