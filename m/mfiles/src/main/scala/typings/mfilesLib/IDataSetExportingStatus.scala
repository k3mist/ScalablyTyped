package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataSetExportingStatus extends js.Object {
  val CurrentServerTime: ITimestamp
  val IsExporting: scala.Boolean
  val LatestActivity: ITimestamp
}

object IDataSetExportingStatus {
  @scala.inline
  def apply(CurrentServerTime: ITimestamp, IsExporting: scala.Boolean, LatestActivity: ITimestamp): IDataSetExportingStatus = {
    val __obj = js.Dynamic.literal(CurrentServerTime = CurrentServerTime, IsExporting = IsExporting, LatestActivity = LatestActivity)
  
    __obj.asInstanceOf[IDataSetExportingStatus]
  }
}

