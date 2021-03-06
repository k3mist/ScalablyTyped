package typings
package meteorLib.ejsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EJSONableCustomType extends js.Object {
  @JSName("clone")
  var clone_FEJSONableCustomType: js.UndefOr[js.Function0[this.type]] = js.undefined
  @JSName("equals")
  var equals_FEJSONableCustomType: js.UndefOr[js.Function1[/* other */ js.Object, scala.Boolean]] = js.undefined
  def toJSONValue(): JSONable
  def typeName(): java.lang.String
}

object EJSONableCustomType {
  @scala.inline
  def apply(
    toJSONValue: () => JSONable,
    typeName: () => java.lang.String,
    clone: () => EJSONableCustomType = null,
    equals: /* other */ js.Object => scala.Boolean = null
  ): EJSONableCustomType = {
    val __obj = js.Dynamic.literal(toJSONValue = js.Any.fromFunction0(toJSONValue), typeName = js.Any.fromFunction0(typeName))
    if (clone != null) __obj.updateDynamic("clone")(js.Any.fromFunction0(clone))
    if (equals != null) __obj.updateDynamic("equals")(js.Any.fromFunction1(equals))
    __obj.asInstanceOf[EJSONableCustomType]
  }
}

