package typings
package gapiDotClientDotFitnessLib.gapiNs.clientNs.fitnessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataType extends js.Object {
  /** A field represents one dimension of a data type. */
  var field: js.UndefOr[js.Array[DataTypeField]] = js.undefined
  /** Each data type has a unique, namespaced, name. All data types in the com.google namespace are shared as part of the platform. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object DataType {
  @scala.inline
  def apply(field: js.Array[DataTypeField] = null, name: java.lang.String = null): DataType = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[DataType]
  }
}

