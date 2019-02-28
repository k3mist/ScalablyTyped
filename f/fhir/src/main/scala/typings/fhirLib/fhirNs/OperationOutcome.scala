package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the success/failure of an action
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fhirLib.fhirNs.Resource because Already inherited */ trait OperationOutcome extends DomainResource {
  /**
    * A single issue associated with the action
    */
  var issue: js.Array[OperationOutcomeIssue]
}

