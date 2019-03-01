package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariantSet extends js.Object {
  /** The dataset to which this variant set belongs. */
  var datasetId: js.UndefOr[java.lang.String] = js.undefined
  /** A textual description of this variant set. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** The server-generated variant set ID, unique across all variant sets. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The metadata associated with this variant set. */
  var metadata: js.UndefOr[js.Array[VariantSetMetadata]] = js.undefined
  /** User-specified, mutable name. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A list of all references used by the variants in a variant set
    * with associated coordinate upper bounds for each one.
    */
  var referenceBounds: js.UndefOr[js.Array[ReferenceBound]] = js.undefined
  /**
    * The reference set to which the variant set is mapped. The reference set
    * describes the alignment provenance of the variant set, while the
    * `referenceBounds` describe the shape of the actual variant data. The
    * reference set's reference names are a superset of those found in the
    * `referenceBounds`.
    *
    * For example, given a variant set that is mapped to the GRCh38 reference set
    * and contains a single variant on reference 'X', `referenceBounds` would
    * contain only an entry for 'X', while the associated reference set
    * enumerates all possible references: '1', '2', 'X', 'Y', 'MT', etc.
    */
  var referenceSetId: js.UndefOr[java.lang.String] = js.undefined
}

object VariantSet {
  @scala.inline
  def apply(
    datasetId: java.lang.String = null,
    description: java.lang.String = null,
    id: java.lang.String = null,
    metadata: js.Array[VariantSetMetadata] = null,
    name: java.lang.String = null,
    referenceBounds: js.Array[ReferenceBound] = null,
    referenceSetId: java.lang.String = null
  ): VariantSet = {
    val __obj = js.Dynamic.literal()
    if (datasetId != null) __obj.updateDynamic("datasetId")(datasetId)
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (name != null) __obj.updateDynamic("name")(name)
    if (referenceBounds != null) __obj.updateDynamic("referenceBounds")(referenceBounds)
    if (referenceSetId != null) __obj.updateDynamic("referenceSetId")(referenceSetId)
    __obj.asInstanceOf[VariantSet]
  }
}

