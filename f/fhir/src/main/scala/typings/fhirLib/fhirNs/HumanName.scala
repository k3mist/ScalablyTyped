package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Name of a human - parts and usage
  */
trait HumanName extends Element {
  /**
    * Contains extended information for property 'family'.
    */
  var _family: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'given'.
    */
  var _given: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'prefix'.
    */
  var _prefix: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'suffix'.
    */
  var _suffix: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'use'.
    */
  var _use: js.UndefOr[Element] = js.undefined
  /**
    * Family name (often called 'Surname')
    */
  var family: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Given names (not always 'first'). Includes middle names
    */
  var given: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Time period when name was/is in use
    */
  var period: js.UndefOr[Period] = js.undefined
  /**
    * Parts that come before the name
    */
  var prefix: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Parts that come after the name
    */
  var suffix: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Text representation of the full name
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
    * usual | official | temp | nickname | anonymous | old | maiden
    */
  var use: js.UndefOr[code] = js.undefined
}

object HumanName {
  @scala.inline
  def apply(
    _family: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _given: js.Array[Element] = null,
    _id: Element = null,
    _prefix: js.Array[Element] = null,
    _suffix: js.Array[Element] = null,
    _text: Element = null,
    _use: Element = null,
    extension: js.Array[Extension] = null,
    family: java.lang.String = null,
    fhir_comments: js.Array[java.lang.String] = null,
    given: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    period: Period = null,
    prefix: js.Array[java.lang.String] = null,
    suffix: js.Array[java.lang.String] = null,
    text: java.lang.String = null,
    use: code = null
  ): HumanName = {
    val __obj = js.Dynamic.literal()
    if (_family != null) __obj.updateDynamic("_family")(_family)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_given != null) __obj.updateDynamic("_given")(_given)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_prefix != null) __obj.updateDynamic("_prefix")(_prefix)
    if (_suffix != null) __obj.updateDynamic("_suffix")(_suffix)
    if (_text != null) __obj.updateDynamic("_text")(_text)
    if (_use != null) __obj.updateDynamic("_use")(_use)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (family != null) __obj.updateDynamic("family")(family)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (given != null) __obj.updateDynamic("given")(given)
    if (id != null) __obj.updateDynamic("id")(id)
    if (period != null) __obj.updateDynamic("period")(period)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    if (text != null) __obj.updateDynamic("text")(text)
    if (use != null) __obj.updateDynamic("use")(use)
    __obj.asInstanceOf[HumanName]
  }
}

