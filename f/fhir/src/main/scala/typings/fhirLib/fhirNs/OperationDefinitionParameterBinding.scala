package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ValueSet details if this is coded
  */
trait OperationDefinitionParameterBinding extends BackboneElement {
  /**
    * Contains extended information for property 'strength'.
    */
  var _strength: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueSetUri'.
    */
  var _valueSetUri: js.UndefOr[Element] = js.undefined
  /**
    * required | extensible | preferred | example
    */
  var strength: code
  /**
    * Source of value set
    */
  var valueSetReference: js.UndefOr[Reference] = js.undefined
  /**
    * Source of value set
    */
  var valueSetUri: js.UndefOr[uri] = js.undefined
}

object OperationDefinitionParameterBinding {
  @scala.inline
  def apply(
    strength: code,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _strength: Element = null,
    _valueSetUri: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    valueSetReference: Reference = null,
    valueSetUri: uri = null
  ): OperationDefinitionParameterBinding = {
    val __obj = js.Dynamic.literal(strength = strength)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_strength != null) __obj.updateDynamic("_strength")(_strength)
    if (_valueSetUri != null) __obj.updateDynamic("_valueSetUri")(_valueSetUri)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (valueSetReference != null) __obj.updateDynamic("valueSetReference")(valueSetReference)
    if (valueSetUri != null) __obj.updateDynamic("valueSetUri")(valueSetUri)
    __obj.asInstanceOf[OperationDefinitionParameterBinding]
  }
}

