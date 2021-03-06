package typings
package astDashTypesLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Field[T] extends js.Object {
  val defaultFn: js.UndefOr[js.Function] = js.undefined
  val hidden: scala.Boolean
  val name: java.lang.String
  val `type`: Type[T]
  def getValue(obj: org.scalablytyped.runtime.StringDictionary[js.Any]): js.Any
}

object Field {
  @scala.inline
  def apply[T](
    getValue: org.scalablytyped.runtime.StringDictionary[js.Any] => js.Any,
    hidden: scala.Boolean,
    name: java.lang.String,
    toString: () => java.lang.String,
    `type`: Type[T],
    defaultFn: js.Function = null
  ): Field[T] = {
    val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction1(getValue), hidden = hidden, name = name, toString = js.Any.fromFunction0(toString))
    __obj.updateDynamic("type")(`type`)
    if (defaultFn != null) __obj.updateDynamic("defaultFn")(defaultFn)
    __obj.asInstanceOf[Field[T]]
  }
}

