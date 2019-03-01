package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskOrchestrationContainer extends TaskOrchestrationItem {
  var children: js.Array[TaskOrchestrationItem]
  var continueOnError: scala.Boolean
  var data: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var maxConcurrency: scala.Double
  var parallel: scala.Boolean
  var rollback: TaskOrchestrationContainer
}

object TaskOrchestrationContainer {
  @scala.inline
  def apply(
    children: js.Array[TaskOrchestrationItem],
    continueOnError: scala.Boolean,
    data: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    itemType: TaskOrchestrationItemType,
    maxConcurrency: scala.Double,
    parallel: scala.Boolean,
    rollback: TaskOrchestrationContainer
  ): TaskOrchestrationContainer = {
    val __obj = js.Dynamic.literal(children = children, continueOnError = continueOnError, data = data, itemType = itemType, maxConcurrency = maxConcurrency, parallel = parallel, rollback = rollback)
  
    __obj.asInstanceOf[TaskOrchestrationContainer]
  }
}

