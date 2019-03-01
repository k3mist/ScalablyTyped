package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Read extends js.Object {
  /**
    * The quality of the read sequence contained in this alignment record
    * (equivalent to QUAL in SAM).
    * `alignedSequence` and `alignedQuality` may be shorter than the full read
    * sequence and quality. This will occur if the alignment is part of a
    * chimeric alignment, or if the read was trimmed. When this occurs, the CIGAR
    * for this read will begin/end with a hard clip operator that will indicate
    * the length of the excised sequence.
    */
  var alignedQuality: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * The bases of the read sequence contained in this alignment record,
    * &#42;&#42;without CIGAR operations applied&#42;&#42; (equivalent to SEQ in SAM).
    * `alignedSequence` and `alignedQuality` may be
    * shorter than the full read sequence and quality. This will occur if the
    * alignment is part of a chimeric alignment, or if the read was trimmed. When
    * this occurs, the CIGAR for this read will begin/end with a hard clip
    * operator that will indicate the length of the excised sequence.
    */
  var alignedSequence: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The linear alignment for this alignment record. This field is null for
    * unmapped reads.
    */
  var alignment: js.UndefOr[LinearAlignment] = js.undefined
  /** The fragment is a PCR or optical duplicate (SAM flag 0x400). */
  var duplicateFragment: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether this read did not pass filters, such as platform or vendor quality
    * controls (SAM flag 0x200).
    */
  var failedVendorQualityChecks: js.UndefOr[scala.Boolean] = js.undefined
  /** The observed length of the fragment, equivalent to TLEN in SAM. */
  var fragmentLength: js.UndefOr[scala.Double] = js.undefined
  /** The fragment name. Equivalent to QNAME (query template name) in SAM. */
  var fragmentName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The server-generated read ID, unique across all reads. This is different
    * from the `fragmentName`.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A map of additional read alignment information. This must be of the form
    * map<string, string[]> (string key mapping to a list of string values).
    */
  var info: js.UndefOr[stdLib.Record[java.lang.String, js.Array[_]]] = js.undefined
  /**
    * The mapping of the primary alignment of the
    * `(readNumber+1)%numberReads` read in the fragment. It replaces
    * mate position and mate strand in SAM.
    */
  var nextMatePosition: js.UndefOr[Position] = js.undefined
  /** The number of reads in the fragment (extension to SAM flag 0x1). */
  var numberReads: js.UndefOr[scala.Double] = js.undefined
  /**
    * The orientation and the distance between reads from the fragment are
    * consistent with the sequencing protocol (SAM flag 0x2).
    */
  var properPlacement: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The ID of the read group this read belongs to. A read belongs to exactly
    * one read group. This is a server-generated ID which is distinct from SAM's
    * RG tag (for that value, see
    * ReadGroup.name).
    */
  var readGroupId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ID of the read group set this read belongs to. A read belongs to
    * exactly one read group set.
    */
  var readGroupSetId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The read number in sequencing. 0-based and less than numberReads. This
    * field replaces SAM flag 0x40 and 0x80.
    */
  var readNumber: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether this alignment is secondary. Equivalent to SAM flag 0x100.
    * A secondary alignment represents an alternative to the primary alignment
    * for this read. Aligners may return secondary alignments if a read can map
    * ambiguously to multiple coordinates in the genome. By convention, each read
    * has one and only one alignment where both `secondaryAlignment`
    * and `supplementaryAlignment` are false.
    */
  var secondaryAlignment: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether this alignment is supplementary. Equivalent to SAM flag 0x800.
    * Supplementary alignments are used in the representation of a chimeric
    * alignment. In a chimeric alignment, a read is split into multiple
    * linear alignments that map to different reference contigs. The first
    * linear alignment in the read will be designated as the representative
    * alignment; the remaining linear alignments will be designated as
    * supplementary alignments. These alignments may have different mapping
    * quality scores. In each linear alignment in a chimeric alignment, the read
    * will be hard clipped. The `alignedSequence` and
    * `alignedQuality` fields in the alignment record will only
    * represent the bases for its respective linear alignment.
    */
  var supplementaryAlignment: js.UndefOr[scala.Boolean] = js.undefined
}

object Read {
  @scala.inline
  def apply(
    alignedQuality: js.Array[scala.Double] = null,
    alignedSequence: java.lang.String = null,
    alignment: LinearAlignment = null,
    duplicateFragment: js.UndefOr[scala.Boolean] = js.undefined,
    failedVendorQualityChecks: js.UndefOr[scala.Boolean] = js.undefined,
    fragmentLength: scala.Int | scala.Double = null,
    fragmentName: java.lang.String = null,
    id: java.lang.String = null,
    info: stdLib.Record[java.lang.String, js.Array[_]] = null,
    nextMatePosition: Position = null,
    numberReads: scala.Int | scala.Double = null,
    properPlacement: js.UndefOr[scala.Boolean] = js.undefined,
    readGroupId: java.lang.String = null,
    readGroupSetId: java.lang.String = null,
    readNumber: scala.Int | scala.Double = null,
    secondaryAlignment: js.UndefOr[scala.Boolean] = js.undefined,
    supplementaryAlignment: js.UndefOr[scala.Boolean] = js.undefined
  ): Read = {
    val __obj = js.Dynamic.literal()
    if (alignedQuality != null) __obj.updateDynamic("alignedQuality")(alignedQuality)
    if (alignedSequence != null) __obj.updateDynamic("alignedSequence")(alignedSequence)
    if (alignment != null) __obj.updateDynamic("alignment")(alignment)
    if (!js.isUndefined(duplicateFragment)) __obj.updateDynamic("duplicateFragment")(duplicateFragment)
    if (!js.isUndefined(failedVendorQualityChecks)) __obj.updateDynamic("failedVendorQualityChecks")(failedVendorQualityChecks)
    if (fragmentLength != null) __obj.updateDynamic("fragmentLength")(fragmentLength.asInstanceOf[js.Any])
    if (fragmentName != null) __obj.updateDynamic("fragmentName")(fragmentName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (info != null) __obj.updateDynamic("info")(info)
    if (nextMatePosition != null) __obj.updateDynamic("nextMatePosition")(nextMatePosition)
    if (numberReads != null) __obj.updateDynamic("numberReads")(numberReads.asInstanceOf[js.Any])
    if (!js.isUndefined(properPlacement)) __obj.updateDynamic("properPlacement")(properPlacement)
    if (readGroupId != null) __obj.updateDynamic("readGroupId")(readGroupId)
    if (readGroupSetId != null) __obj.updateDynamic("readGroupSetId")(readGroupSetId)
    if (readNumber != null) __obj.updateDynamic("readNumber")(readNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(secondaryAlignment)) __obj.updateDynamic("secondaryAlignment")(secondaryAlignment)
    if (!js.isUndefined(supplementaryAlignment)) __obj.updateDynamic("supplementaryAlignment")(supplementaryAlignment)
    __obj.asInstanceOf[Read]
  }
}

