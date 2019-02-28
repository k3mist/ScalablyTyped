package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationTaskQueryChangeRulesParams
  extends stdLib.Object {
  /**
    * A search string to find within change rule descriptions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#queryChangeRules)
    */
  var description: java.lang.String
  /**
    * A search string to find within change rule names.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#queryChangeRules)
    */
  var name: java.lang.String
  /**
    * The type of search to perform, default is contains.  **Possible Values:** contains | exact | starts-with | ends-with
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#queryChangeRules)
    */
  var searchType: java.lang.String
  /**
    * The username requesting the search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#queryChangeRules)
    */
  var user: java.lang.String
}

