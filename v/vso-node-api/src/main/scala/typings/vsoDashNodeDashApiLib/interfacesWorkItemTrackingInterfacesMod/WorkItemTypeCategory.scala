package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemTypeCategory extends WorkItemTrackingResource {
  /**
    * Gets or sets the default type of the work item.
    */
  var defaultWorkItemType: WorkItemTypeReference
  /**
    * The name of the category.
    */
  var name: java.lang.String
  /**
    * The reference name of the category.
    */
  var referenceName: java.lang.String
  /**
    * The work item types that belond to the category.
    */
  var workItemTypes: js.Array[WorkItemTypeReference]
}

object WorkItemTypeCategory {
  @scala.inline
  def apply(
    _links: js.Any,
    defaultWorkItemType: WorkItemTypeReference,
    name: java.lang.String,
    referenceName: java.lang.String,
    url: java.lang.String,
    workItemTypes: js.Array[WorkItemTypeReference]
  ): WorkItemTypeCategory = {
    val __obj = js.Dynamic.literal(_links = _links, defaultWorkItemType = defaultWorkItemType, name = name, referenceName = referenceName, url = url, workItemTypes = workItemTypes)
  
    __obj.asInstanceOf[WorkItemTypeCategory]
  }
}

