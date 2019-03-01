package typings
package mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILockWorkingCopyResponse extends js.Object {
  var merge: ILockData
  var previousMerge: ILockData | scala.Null
}

object ILockWorkingCopyResponse {
  @scala.inline
  def apply(merge: ILockData, previousMerge: ILockData = null): ILockWorkingCopyResponse = {
    val __obj = js.Dynamic.literal(merge = merge)
    if (previousMerge != null) __obj.updateDynamic("previousMerge")(previousMerge)
    __obj.asInstanceOf[ILockWorkingCopyResponse]
  }
}

