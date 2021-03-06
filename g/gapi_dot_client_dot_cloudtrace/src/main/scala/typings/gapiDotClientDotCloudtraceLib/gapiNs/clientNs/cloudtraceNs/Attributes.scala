package typings
package gapiDotClientDotCloudtraceLib.gapiNs.clientNs.cloudtraceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attributes extends js.Object {
  /**
    * The set of attributes. Each attribute's key can be up to 128 bytes
    * long. The value can be a string up to 256 bytes, an integer, or the
    * Boolean values `true` and `false`. For example:
    *
    * "/instance_id": "my-instance"
    * "/http/user_agent": ""
    * "/http/request_bytes": 300
    * "abc.com/myattribute": true
    */
  var attributeMap: js.UndefOr[stdLib.Record[java.lang.String, AttributeValue]] = js.undefined
  /**
    * The number of attributes that were discarded. Attributes can be discarded
    * because their keys are too long or because there are too many attributes.
    * If this value is 0 then all attributes are valid.
    */
  var droppedAttributesCount: js.UndefOr[scala.Double] = js.undefined
}

object Attributes {
  @scala.inline
  def apply(
    attributeMap: stdLib.Record[java.lang.String, AttributeValue] = null,
    droppedAttributesCount: scala.Int | scala.Double = null
  ): Attributes = {
    val __obj = js.Dynamic.literal()
    if (attributeMap != null) __obj.updateDynamic("attributeMap")(attributeMap)
    if (droppedAttributesCount != null) __obj.updateDynamic("droppedAttributesCount")(droppedAttributesCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
}

