package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWorkflowAssignment extends js.Object {
  var AssignedTo_DEPRECATED: IPropertyValue
  var CompletedBy_DEPRECATED: IPropertyValue
  var Deadline_DEPRECATED: IPropertyValue
  var Description_DEPRECATED: IPropertyValue
  var MonitoredBy_DEPRECATED: IPropertyValue
  def Clone_DEPRECATED(): IWorkflowAssignment
}

object IWorkflowAssignment {
  @scala.inline
  def apply(
    AssignedTo_DEPRECATED: IPropertyValue,
    Clone_DEPRECATED: js.Function0[IWorkflowAssignment],
    CompletedBy_DEPRECATED: IPropertyValue,
    Deadline_DEPRECATED: IPropertyValue,
    Description_DEPRECATED: IPropertyValue,
    MonitoredBy_DEPRECATED: IPropertyValue
  ): IWorkflowAssignment = {
    val __obj = js.Dynamic.literal(AssignedTo_DEPRECATED = AssignedTo_DEPRECATED, Clone_DEPRECATED = Clone_DEPRECATED, CompletedBy_DEPRECATED = CompletedBy_DEPRECATED, Deadline_DEPRECATED = Deadline_DEPRECATED, Description_DEPRECATED = Description_DEPRECATED, MonitoredBy_DEPRECATED = MonitoredBy_DEPRECATED)
  
    __obj.asInstanceOf[IWorkflowAssignment]
  }
}

