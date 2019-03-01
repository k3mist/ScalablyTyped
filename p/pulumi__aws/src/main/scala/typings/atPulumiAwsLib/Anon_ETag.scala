package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ETag extends js.Object {
  var eTag: java.lang.String
  var key: java.lang.String
  var sequencer: java.lang.String
  var size: scala.Double
  var versionId: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ETag {
  @scala.inline
  def apply(
    eTag: java.lang.String,
    key: java.lang.String,
    sequencer: java.lang.String,
    size: scala.Double,
    versionId: java.lang.String = null
  ): Anon_ETag = {
    val __obj = js.Dynamic.literal(eTag = eTag, key = key, sequencer = sequencer, size = size)
    if (versionId != null) __obj.updateDynamic("versionId")(versionId)
    __obj.asInstanceOf[Anon_ETag]
  }
}

