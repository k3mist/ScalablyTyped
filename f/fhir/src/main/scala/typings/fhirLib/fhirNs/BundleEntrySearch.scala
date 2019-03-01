package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Search related information
  */
trait BundleEntrySearch extends BackboneElement {
  /**
    * Contains extended information for property 'mode'.
    */
  var _mode: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'score'.
    */
  var _score: js.UndefOr[Element] = js.undefined
  /**
    * match | include | outcome - why this is in the result set
    */
  var mode: js.UndefOr[code] = js.undefined
  /**
    * Search ranking (between 0 and 1)
    */
  var score: js.UndefOr[decimal] = js.undefined
}

object BundleEntrySearch {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _mode: Element = null,
    _score: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    mode: code = null,
    modifierExtension: js.Array[Extension] = null,
    score: js.UndefOr[decimal] = js.undefined
  ): BundleEntrySearch = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_mode != null) __obj.updateDynamic("_mode")(_mode)
    if (_score != null) __obj.updateDynamic("_score")(_score)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (!js.isUndefined(score)) __obj.updateDynamic("score")(score)
    __obj.asInstanceOf[BundleEntrySearch]
  }
}

