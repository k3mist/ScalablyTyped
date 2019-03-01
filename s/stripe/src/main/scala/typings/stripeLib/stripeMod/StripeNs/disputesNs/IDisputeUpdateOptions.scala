package typings
package stripeLib.stripeMod.StripeNs.disputesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDisputeUpdateOptions
  extends stripeLib.stripeMod.StripeNs.IDataOptionsWithMetadata {
  /**
    * Evidence to upload to respond to a dispute. Updating any field in the hash will submit all fields in the hash for review.
    */
  var evidence: js.UndefOr[IDisputeEvidence] = js.undefined
}

object IDisputeUpdateOptions {
  @scala.inline
  def apply(
    evidence: IDisputeEvidence = null,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    metadata: stripeLib.stripeMod.StripeNs.IOptionsMetadata = null
  ): IDisputeUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (evidence != null) __obj.updateDynamic("evidence")(evidence)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[IDisputeUpdateOptions]
  }
}

