package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about security of implementation
  */
trait CapabilityStatementRestSecurity extends BackboneElement {
  /**
    * Contains extended information for property 'cors'.
    */
  var _cors: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Certificates associated with security profiles
    */
  var certificate: js.UndefOr[js.Array[CapabilityStatementRestSecurityCertificate]] = js.undefined
  /**
    * Adds CORS Headers (http://enable-cors.org/)
    */
  var cors: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * General description of how security works
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * OAuth | SMART-on-FHIR | NTLM | Basic | Kerberos | Certificates
    */
  var service: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}

object CapabilityStatementRestSecurity {
  @scala.inline
  def apply(
    _cors: Element = null,
    _description: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    certificate: js.Array[CapabilityStatementRestSecurityCertificate] = null,
    cors: js.UndefOr[scala.Boolean] = js.undefined,
    description: java.lang.String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    service: js.Array[CodeableConcept] = null
  ): CapabilityStatementRestSecurity = {
    val __obj = js.Dynamic.literal()
    if (_cors != null) __obj.updateDynamic("_cors")(_cors)
    if (_description != null) __obj.updateDynamic("_description")(_description)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (certificate != null) __obj.updateDynamic("certificate")(certificate)
    if (!js.isUndefined(cors)) __obj.updateDynamic("cors")(cors)
    if (description != null) __obj.updateDynamic("description")(description)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (service != null) __obj.updateDynamic("service")(service)
    __obj.asInstanceOf[CapabilityStatementRestSecurity]
  }
}

