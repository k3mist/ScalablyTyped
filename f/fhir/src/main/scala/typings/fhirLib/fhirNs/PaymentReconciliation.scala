package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PaymentReconciliation resource
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fhirLib.fhirNs.Resource because Already inherited */ trait PaymentReconciliation extends DomainResource {
  /**
    * Contains extended information for property 'created'.
    */
  var _created: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'disposition'.
    */
  var _disposition: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Creation date
    */
  var created: js.UndefOr[dateTime] = js.undefined
  /**
    * List of settlements
    */
  var detail: js.UndefOr[js.Array[PaymentReconciliationDetail]] = js.undefined
  /**
    * Disposition Message
    */
  var disposition: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Printed Form Identifier
    */
  var form: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Business Identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Insurer
    */
  var organization: js.UndefOr[Reference] = js.undefined
  /**
    * complete | error | partial
    */
  var outcome: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Period covered
    */
  var period: js.UndefOr[Period] = js.undefined
  /**
    * Processing comments
    */
  var processNote: js.UndefOr[js.Array[PaymentReconciliationProcessNote]] = js.undefined
  /**
    * Claim reference
    */
  var request: js.UndefOr[Reference] = js.undefined
  /**
    * Responsible organization
    */
  var requestOrganization: js.UndefOr[Reference] = js.undefined
  /**
    * Responsible practitioner
    */
  var requestProvider: js.UndefOr[Reference] = js.undefined
  /**
    * active | cancelled | draft | entered-in-error
    */
  var status: js.UndefOr[code] = js.undefined
  /**
    * Total amount of Payment
    */
  var total: js.UndefOr[Money] = js.undefined
}

object PaymentReconciliation {
  @scala.inline
  def apply(
    _created: Element = null,
    _disposition: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    contained: js.Array[Resource] = null,
    created: dateTime = null,
    detail: js.Array[PaymentReconciliationDetail] = null,
    disposition: java.lang.String = null,
    extension: js.Array[Extension] = null,
    form: CodeableConcept = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    organization: Reference = null,
    outcome: CodeableConcept = null,
    period: Period = null,
    processNote: js.Array[PaymentReconciliationProcessNote] = null,
    request: Reference = null,
    requestOrganization: Reference = null,
    requestProvider: Reference = null,
    resourceType: code = null,
    status: code = null,
    text: Narrative = null,
    total: Money = null
  ): PaymentReconciliation = {
    val __obj = js.Dynamic.literal()
    if (_created != null) __obj.updateDynamic("_created")(_created)
    if (_disposition != null) __obj.updateDynamic("_disposition")(_disposition)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (created != null) __obj.updateDynamic("created")(created)
    if (detail != null) __obj.updateDynamic("detail")(detail)
    if (disposition != null) __obj.updateDynamic("disposition")(disposition)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (form != null) __obj.updateDynamic("form")(form)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (organization != null) __obj.updateDynamic("organization")(organization)
    if (outcome != null) __obj.updateDynamic("outcome")(outcome)
    if (period != null) __obj.updateDynamic("period")(period)
    if (processNote != null) __obj.updateDynamic("processNote")(processNote)
    if (request != null) __obj.updateDynamic("request")(request)
    if (requestOrganization != null) __obj.updateDynamic("requestOrganization")(requestOrganization)
    if (requestProvider != null) __obj.updateDynamic("requestProvider")(requestProvider)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (status != null) __obj.updateDynamic("status")(status)
    if (text != null) __obj.updateDynamic("text")(text)
    if (total != null) __obj.updateDynamic("total")(total)
    __obj.asInstanceOf[PaymentReconciliation]
  }
}

