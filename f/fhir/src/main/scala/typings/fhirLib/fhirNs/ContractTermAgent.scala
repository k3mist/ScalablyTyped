package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contract Term Agent List
  */
trait ContractTermAgent extends BackboneElement {
  /**
    * Contract Term Agent Subject
    */
  var actor: Reference
  /**
    * Type of the Contract Term Agent
    */
  var role: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}

object ContractTermAgent {
  @scala.inline
  def apply(
    actor: Reference,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    role: js.Array[CodeableConcept] = null
  ): ContractTermAgent = {
    val __obj = js.Dynamic.literal(actor = actor)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (role != null) __obj.updateDynamic("role")(role)
    __obj.asInstanceOf[ContractTermAgent]
  }
}

