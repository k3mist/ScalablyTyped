package typings
package noptLib.noptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeInfo extends js.Object {
  var `type`: js.Object
  def validate(data: CommandData, k: java.lang.String, `val`: java.lang.String): scala.Boolean
}

object TypeInfo {
  @scala.inline
  def apply(`type`: js.Object, validate: (CommandData, java.lang.String, java.lang.String) => scala.Boolean): TypeInfo = {
    val __obj = js.Dynamic.literal(validate = js.Any.fromFunction3(validate))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TypeInfo]
  }
}

