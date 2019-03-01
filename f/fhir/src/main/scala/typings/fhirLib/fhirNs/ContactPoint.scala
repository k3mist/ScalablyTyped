package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details of a Technology mediated contact point (phone, fax, email, etc.)
  */
trait ContactPoint extends Element {
  /**
    * Contains extended information for property 'rank'.
    */
  var _rank: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'system'.
    */
  var _system: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'use'.
    */
  var _use: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.undefined
  /**
    * Time period when the contact point was/is in use
    */
  var period: js.UndefOr[Period] = js.undefined
  /**
    * Specify preferred order of use (1 = highest)
    */
  var rank: js.UndefOr[positiveInt] = js.undefined
  /**
    * phone | fax | email | pager | url | sms | other
    */
  var system: js.UndefOr[code] = js.undefined
  /**
    * home | work | temp | old | mobile - purpose of this contact point
    */
  var use: js.UndefOr[code] = js.undefined
  /**
    * The actual contact point details
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object ContactPoint {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _rank: Element = null,
    _system: Element = null,
    _use: Element = null,
    _value: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    period: Period = null,
    rank: js.UndefOr[positiveInt] = js.undefined,
    system: code = null,
    use: code = null,
    value: java.lang.String = null
  ): ContactPoint = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_rank != null) __obj.updateDynamic("_rank")(_rank)
    if (_system != null) __obj.updateDynamic("_system")(_system)
    if (_use != null) __obj.updateDynamic("_use")(_use)
    if (_value != null) __obj.updateDynamic("_value")(_value)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (period != null) __obj.updateDynamic("period")(period)
    if (!js.isUndefined(rank)) __obj.updateDynamic("rank")(rank)
    if (system != null) __obj.updateDynamic("system")(system)
    if (use != null) __obj.updateDynamic("use")(use)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ContactPoint]
  }
}

