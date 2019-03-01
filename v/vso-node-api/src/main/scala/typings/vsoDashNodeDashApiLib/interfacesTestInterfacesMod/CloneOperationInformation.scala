package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloneOperationInformation extends js.Object {
  var cloneStatistics: CloneStatistics
  /**
    * If the operation is complete, the DateTime of completion. If operation is not complete, this is DateTime.MaxValue
    */
  var completionDate: stdLib.Date
  /**
    * DateTime when the operation was started
    */
  var creationDate: stdLib.Date
  /**
    * Shallow reference of the destination
    */
  var destinationObject: ShallowReference
  /**
    * Shallow reference of the destination
    */
  var destinationPlan: ShallowReference
  /**
    * Shallow reference of the destination
    */
  var destinationProject: ShallowReference
  /**
    * If the operation has Failed, Message contains the reason for failure. Null otherwise.
    */
  var message: java.lang.String
  /**
    * The ID of the operation
    */
  var opId: scala.Double
  /**
    * The type of the object generated as a result of the Clone operation
    */
  var resultObjectType: ResultObjectType
  /**
    * Shallow reference of the source
    */
  var sourceObject: ShallowReference
  /**
    * Shallow reference of the source
    */
  var sourcePlan: ShallowReference
  /**
    * Shallow reference of the source
    */
  var sourceProject: ShallowReference
  /**
    * Current state of the operation. When State reaches Suceeded or Failed, the operation is complete
    */
  var state: CloneOperationState
  /**
    * Url for geting the clone information
    */
  var url: java.lang.String
}

object CloneOperationInformation {
  @scala.inline
  def apply(
    cloneStatistics: CloneStatistics,
    completionDate: stdLib.Date,
    creationDate: stdLib.Date,
    destinationObject: ShallowReference,
    destinationPlan: ShallowReference,
    destinationProject: ShallowReference,
    message: java.lang.String,
    opId: scala.Double,
    resultObjectType: ResultObjectType,
    sourceObject: ShallowReference,
    sourcePlan: ShallowReference,
    sourceProject: ShallowReference,
    state: CloneOperationState,
    url: java.lang.String
  ): CloneOperationInformation = {
    val __obj = js.Dynamic.literal(cloneStatistics = cloneStatistics, completionDate = completionDate, creationDate = creationDate, destinationObject = destinationObject, destinationPlan = destinationPlan, destinationProject = destinationProject, message = message, opId = opId, resultObjectType = resultObjectType, sourceObject = sourceObject, sourcePlan = sourcePlan, sourceProject = sourceProject, state = state, url = url)
  
    __obj.asInstanceOf[CloneOperationInformation]
  }
}

