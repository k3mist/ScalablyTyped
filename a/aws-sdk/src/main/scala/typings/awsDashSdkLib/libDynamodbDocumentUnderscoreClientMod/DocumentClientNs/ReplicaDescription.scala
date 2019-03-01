package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicaDescription extends js.Object {
  /**
    * The name of the region.
    */
  var RegionName: js.UndefOr[RegionName] = js.undefined
}

object ReplicaDescription {
  @scala.inline
  def apply(RegionName: RegionName = null): ReplicaDescription = {
    val __obj = js.Dynamic.literal()
    if (RegionName != null) __obj.updateDynamic("RegionName")(RegionName)
    __obj.asInstanceOf[ReplicaDescription]
  }
}

