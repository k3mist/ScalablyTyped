package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an object (name-value pairs) in a DataView. */
trait DataViewObject
  extends /** Map of property name to property value. */
/* propertyName */ org.scalablytyped.runtime.StringDictionary[DataViewPropertyValue | DataViewObjectMap]

object DataViewObject {
  @scala.inline
  def apply(
    StringDictionary: /** Map of property name to property value. */
  /* propertyName */ org.scalablytyped.runtime.StringDictionary[DataViewPropertyValue | DataViewObjectMap] = null
  ): DataViewObject = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DataViewObject]
  }
}

