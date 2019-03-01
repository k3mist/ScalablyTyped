package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoardColumn extends js.Object {
  var columnType: BoardColumnType
  var description: java.lang.String
  var id: java.lang.String
  var isSplit: scala.Boolean
  var itemLimit: scala.Double
  var name: java.lang.String
  var stateMappings: org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

object BoardColumn {
  @scala.inline
  def apply(
    columnType: BoardColumnType,
    description: java.lang.String,
    id: java.lang.String,
    isSplit: scala.Boolean,
    itemLimit: scala.Double,
    name: java.lang.String,
    stateMappings: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): BoardColumn = {
    val __obj = js.Dynamic.literal(columnType = columnType, description = description, id = id, isSplit = isSplit, itemLimit = itemLimit, name = name, stateMappings = stateMappings)
  
    __obj.asInstanceOf[BoardColumn]
  }
}

