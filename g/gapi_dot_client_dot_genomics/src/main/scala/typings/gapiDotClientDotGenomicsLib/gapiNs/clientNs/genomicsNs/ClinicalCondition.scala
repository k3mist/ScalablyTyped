package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClinicalCondition extends js.Object {
  /**
    * The MedGen concept id associated with this gene.
    * Search for these IDs at http://www.ncbi.nlm.nih.gov/medgen/
    */
  var conceptId: js.UndefOr[java.lang.String] = js.undefined
  /** The set of external IDs for this condition. */
  var externalIds: js.UndefOr[js.Array[ExternalId]] = js.undefined
  /** A set of names for the condition. */
  var names: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The OMIM id for this condition.
    * Search for these IDs at http://omim.org/
    */
  var omimId: js.UndefOr[java.lang.String] = js.undefined
}

object ClinicalCondition {
  @scala.inline
  def apply(
    conceptId: java.lang.String = null,
    externalIds: js.Array[ExternalId] = null,
    names: js.Array[java.lang.String] = null,
    omimId: java.lang.String = null
  ): ClinicalCondition = {
    val __obj = js.Dynamic.literal()
    if (conceptId != null) __obj.updateDynamic("conceptId")(conceptId)
    if (externalIds != null) __obj.updateDynamic("externalIds")(externalIds)
    if (names != null) __obj.updateDynamic("names")(names)
    if (omimId != null) __obj.updateDynamic("omimId")(omimId)
    __obj.asInstanceOf[ClinicalCondition]
  }
}

