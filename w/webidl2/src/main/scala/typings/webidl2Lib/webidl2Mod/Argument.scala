package typings
package webidl2Lib.webidl2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Argument extends js.Object {
  var default: ValueDescription
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttributes]
  /** An IDL Type describing the type of the argument. */
  var idlType: IDLTypeDescription
  /** The argument's name. */
  var name: java.lang.String
  /** True if the argument is optional. */
  var optional: scala.Boolean
  /** True if the argument is variadic. */
  var variadic: scala.Boolean
}

object Argument {
  @scala.inline
  def apply(
    default: ValueDescription,
    extAttrs: js.Array[ExtendedAttributes],
    idlType: IDLTypeDescription,
    name: java.lang.String,
    optional: scala.Boolean,
    variadic: scala.Boolean
  ): Argument = {
    val __obj = js.Dynamic.literal(default = default, extAttrs = extAttrs, idlType = idlType, name = name, optional = optional, variadic = variadic)
  
    __obj.asInstanceOf[Argument]
  }
}

