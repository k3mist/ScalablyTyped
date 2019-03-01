package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointInTimeRecoveryDescription extends js.Object {
  /**
    * Specifies the earliest point in time you can restore your table to. It You can restore your table to any point in time during the last 35 days. 
    */
  var EarliestRestorableDateTime: js.UndefOr[_Date] = js.undefined
  /**
    *  LatestRestorableDateTime is typically 5 minutes before the current time. 
    */
  var LatestRestorableDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The current state of point in time recovery:    ENABLING - Point in time recovery is being enabled.    ENABLED - Point in time recovery is enabled.    DISABLED - Point in time recovery is disabled.  
    */
  var PointInTimeRecoveryStatus: js.UndefOr[PointInTimeRecoveryStatus] = js.undefined
}

object PointInTimeRecoveryDescription {
  @scala.inline
  def apply(
    EarliestRestorableDateTime: _Date = null,
    LatestRestorableDateTime: _Date = null,
    PointInTimeRecoveryStatus: PointInTimeRecoveryStatus = null
  ): PointInTimeRecoveryDescription = {
    val __obj = js.Dynamic.literal()
    if (EarliestRestorableDateTime != null) __obj.updateDynamic("EarliestRestorableDateTime")(EarliestRestorableDateTime)
    if (LatestRestorableDateTime != null) __obj.updateDynamic("LatestRestorableDateTime")(LatestRestorableDateTime)
    if (PointInTimeRecoveryStatus != null) __obj.updateDynamic("PointInTimeRecoveryStatus")(PointInTimeRecoveryStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointInTimeRecoveryDescription]
  }
}

