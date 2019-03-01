package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeContinuousBackupsOutput extends js.Object {
  /**
    * Represents the continuous backups and point in time recovery settings on the table.
    */
  var ContinuousBackupsDescription: js.UndefOr[ContinuousBackupsDescription] = js.undefined
}

object DescribeContinuousBackupsOutput {
  @scala.inline
  def apply(ContinuousBackupsDescription: ContinuousBackupsDescription = null): DescribeContinuousBackupsOutput = {
    val __obj = js.Dynamic.literal()
    if (ContinuousBackupsDescription != null) __obj.updateDynamic("ContinuousBackupsDescription")(ContinuousBackupsDescription)
    __obj.asInstanceOf[DescribeContinuousBackupsOutput]
  }
}

