package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait supportDate
  extends Accessor
     with JSONSupport {
  /**
    * Date value returned from server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Date.html#date)
    */
  var date: stdLib.Date = js.native
  /**
    * The format of the date used in the date property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Date.html#format)
    *
    * @default EEE MMM dd HH:mm:ss zzz yyyy
    */
  var format: java.lang.String = js.native
}

