package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NAMessageProperties extends js.Object {
  /**
    * A description of the network analyst message.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-NAMessage.html#description)
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The network analyst message type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-NAMessage.html#type)
    */
  var `type`: js.UndefOr[js.Any] = js.undefined
}

object NAMessageProperties {
  @scala.inline
  def apply(description: java.lang.String = null, `type`: js.Any = null): NAMessageProperties = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NAMessageProperties]
  }
}

