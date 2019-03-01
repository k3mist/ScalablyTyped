package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TableViewConnectionPointSaveInfo...
  */
trait ITableViewConnectionPointSaveInfo extends js.Object {
  /**
    * List of the fields in the table.
    */
  var qFields: js.Array[java.lang.String]
  /**
    * Information about the position of the connection point.
    */
  var qPos: IPoint
}

object ITableViewConnectionPointSaveInfo {
  @scala.inline
  def apply(qFields: js.Array[java.lang.String], qPos: IPoint): ITableViewConnectionPointSaveInfo = {
    val __obj = js.Dynamic.literal(qFields = qFields, qPos = qPos)
  
    __obj.asInstanceOf[ITableViewConnectionPointSaveInfo]
  }
}

