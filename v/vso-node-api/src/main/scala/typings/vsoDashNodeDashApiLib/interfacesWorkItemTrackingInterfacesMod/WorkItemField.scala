package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemField extends WorkItemTrackingResource {
  /**
    * The description of the field.
    */
  var description: java.lang.String
  /**
    * Indicates whether this field is an identity field.
    */
  var isIdentity: scala.Boolean
  /**
    * Indicates whether this instance is picklist.
    */
  var isPicklist: scala.Boolean
  /**
    * Indicates whether this instance is a suggested picklist .
    */
  var isPicklistSuggested: scala.Boolean
  /**
    * The name of the field.
    */
  var name: java.lang.String
  /**
    * Indicates whether the field is [read only].
    */
  var readOnly: scala.Boolean
  /**
    * The reference name of the field.
    */
  var referenceName: java.lang.String
  /**
    * The supported operations on this field.
    */
  var supportedOperations: js.Array[WorkItemFieldOperation]
  /**
    * The type of the field.
    */
  var `type`: FieldType
  /**
    * The usage of the field.
    */
  var usage: FieldUsage
}

object WorkItemField {
  @scala.inline
  def apply(
    _links: js.Any,
    description: java.lang.String,
    isIdentity: scala.Boolean,
    isPicklist: scala.Boolean,
    isPicklistSuggested: scala.Boolean,
    name: java.lang.String,
    readOnly: scala.Boolean,
    referenceName: java.lang.String,
    supportedOperations: js.Array[WorkItemFieldOperation],
    `type`: FieldType,
    url: java.lang.String,
    usage: FieldUsage
  ): WorkItemField = {
    val __obj = js.Dynamic.literal(_links = _links, description = description, isIdentity = isIdentity, isPicklist = isPicklist, isPicklistSuggested = isPicklistSuggested, name = name, readOnly = readOnly, referenceName = referenceName, supportedOperations = supportedOperations, `type` = `type`, url = url, usage = usage)
  
    __obj.asInstanceOf[WorkItemField]
  }
}

