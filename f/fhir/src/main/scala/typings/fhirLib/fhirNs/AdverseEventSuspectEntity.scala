package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The suspected agent causing the adverse event
  */
trait AdverseEventSuspectEntity extends BackboneElement {
  /**
    * Contains extended information for property 'causality'.
    */
  var _causality: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'causalityProductRelatedness'.
    */
  var _causalityProductRelatedness: js.UndefOr[Element] = js.undefined
  /**
    * causality1 | causality2
    */
  var causality: js.UndefOr[code] = js.undefined
  /**
    * assess1 | assess2
    */
  var causalityAssessment: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * AdverseEvent.suspectEntity.causalityAuthor
    */
  var causalityAuthor: js.UndefOr[Reference] = js.undefined
  /**
    * method1 | method2
    */
  var causalityMethod: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * AdverseEvent.suspectEntity.causalityProductRelatedness
    */
  var causalityProductRelatedness: js.UndefOr[java.lang.String] = js.undefined
  /**
    * result1 | result2
    */
  var causalityResult: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Refers to the specific entity that caused the adverse event
    */
  var instance: Reference
}

object AdverseEventSuspectEntity {
  @scala.inline
  def apply(
    instance: Reference,
    _causality: Element = null,
    _causalityProductRelatedness: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    causality: code = null,
    causalityAssessment: CodeableConcept = null,
    causalityAuthor: Reference = null,
    causalityMethod: CodeableConcept = null,
    causalityProductRelatedness: java.lang.String = null,
    causalityResult: CodeableConcept = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null
  ): AdverseEventSuspectEntity = {
    val __obj = js.Dynamic.literal(instance = instance)
    if (_causality != null) __obj.updateDynamic("_causality")(_causality)
    if (_causalityProductRelatedness != null) __obj.updateDynamic("_causalityProductRelatedness")(_causalityProductRelatedness)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (causality != null) __obj.updateDynamic("causality")(causality)
    if (causalityAssessment != null) __obj.updateDynamic("causalityAssessment")(causalityAssessment)
    if (causalityAuthor != null) __obj.updateDynamic("causalityAuthor")(causalityAuthor)
    if (causalityMethod != null) __obj.updateDynamic("causalityMethod")(causalityMethod)
    if (causalityProductRelatedness != null) __obj.updateDynamic("causalityProductRelatedness")(causalityProductRelatedness)
    if (causalityResult != null) __obj.updateDynamic("causalityResult")(causalityResult)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[AdverseEventSuspectEntity]
  }
}

