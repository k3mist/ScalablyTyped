package typings
package mendixmodelsdkLib.distSdkInternalElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IByNameReferrable extends js.Object {
  /**
    * Returns the qualified name of this element, or
    * null if this element is not a part of the model,
    * or if it or one of its namespace containers does not have a
    * valid name.
    */
  val qualifiedName: java.lang.String | scala.Null
}

object IByNameReferrable {
  @scala.inline
  def apply(qualifiedName: java.lang.String = null): IByNameReferrable = {
    val __obj = js.Dynamic.literal()
    if (qualifiedName != null) __obj.updateDynamic("qualifiedName")(qualifiedName)
    __obj.asInstanceOf[IByNameReferrable]
  }
}

