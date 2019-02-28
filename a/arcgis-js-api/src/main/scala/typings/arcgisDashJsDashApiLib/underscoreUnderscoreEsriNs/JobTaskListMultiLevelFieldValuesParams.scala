package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobTaskListMultiLevelFieldValuesParams
  extends stdLib.Object {
  /**
    * The name of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#listMultiLevelFieldValues)
    */
  var field: java.lang.String
  /**
    * The array of previous values, on which the current value is dependent on. For example, when selecting a city based on the state and county. The value for the state and county would be the previous values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#listMultiLevelFieldValues)
    */
  var previousSelectedValues: js.Array[java.lang.String]
  /**
    * The user name of the user who is requesting the change.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#listMultiLevelFieldValues)
    */
  var user: java.lang.String
}

