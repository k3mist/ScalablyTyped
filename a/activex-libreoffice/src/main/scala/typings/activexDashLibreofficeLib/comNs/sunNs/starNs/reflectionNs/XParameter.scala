package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reflects a parameter of an interface method or a service constructor.
  *
  * This type supersedes {@link XMethodParameter} , which only supports parameters of interface methods (which cannot have rest parameters).
  * @since OOo 2.0
  */
trait XParameter extends XMethodParameter {
  /**
    * Returns whether this is a rest parameter.
    *
    * A rest parameter must always come last in a parameter list.
    *
    * Currently, only service constructors can have rest parameters, and those rest parameters must be in parameters of type `any` .
    * @returns `TRUE` if and only if this parameter is a rest parameter
    */
  def isRestParameter(): scala.Boolean
}

object XParameter {
  @scala.inline
  def apply(
    Name: java.lang.String,
    Position: scala.Double,
    Type: XTypeDescription,
    acquire: js.Function0[scala.Unit],
    getName: js.Function0[java.lang.String],
    getPosition: js.Function0[scala.Double],
    getType: js.Function0[XTypeDescription],
    isIn: js.Function0[scala.Boolean],
    isOut: js.Function0[scala.Boolean],
    isRestParameter: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XParameter = {
    val __obj = js.Dynamic.literal(Name = Name, Position = Position, Type = Type, acquire = acquire, getName = getName, getPosition = getPosition, getType = getType, isIn = isIn, isOut = isOut, isRestParameter = isRestParameter, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XParameter]
  }
}

