package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuxRecord
  extends stdLib.Object {
  /**
    * The display value of the record.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecord)
    */
  var displayProperty: js.Any
  /**
    * The unique id of the record.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecord)
    */
  var id: scala.Double
  /**
    * The array of the values in the [records](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecordValue).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecord)
    */
  var recordvalues: AuxRecordValue
}

object AuxRecord {
  @scala.inline
  def apply(
    constructor: js.Function,
    displayProperty: js.Any,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    id: scala.Double,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    recordvalues: AuxRecordValue
  ): AuxRecord = {
    val __obj = js.Dynamic.literal(constructor = constructor, displayProperty = displayProperty, hasOwnProperty = hasOwnProperty, id = id, propertyIsEnumerable = propertyIsEnumerable, recordvalues = recordvalues)
  
    __obj.asInstanceOf[AuxRecord]
  }
}

