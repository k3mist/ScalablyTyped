package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetContainerMetadataOptions extends GetContainerPropertiesOptions {
  var accessConditions: js.UndefOr[StorageAccessCondition] = js.undefined
}

object GetContainerMetadataOptions {
  @scala.inline
  def apply(
    accessConditions: StorageAccessCondition = null,
    leaseId: java.lang.String = null,
    locationMode: java.lang.String = null,
    maximumExecutionTimeInMs: scala.Int | scala.Double = null,
    timeoutIntervalInMs: scala.Int | scala.Double = null
  ): GetContainerMetadataOptions = {
    val __obj = js.Dynamic.literal()
    if (accessConditions != null) __obj.updateDynamic("accessConditions")(accessConditions)
    if (leaseId != null) __obj.updateDynamic("leaseId")(leaseId)
    if (locationMode != null) __obj.updateDynamic("locationMode")(locationMode)
    if (maximumExecutionTimeInMs != null) __obj.updateDynamic("maximumExecutionTimeInMs")(maximumExecutionTimeInMs.asInstanceOf[js.Any])
    if (timeoutIntervalInMs != null) __obj.updateDynamic("timeoutIntervalInMs")(timeoutIntervalInMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContainerMetadataOptions]
  }
}

