package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HmacImportParams extends Algorithm {
  var hash: HashAlgorithmIdentifier
  var length: js.UndefOr[scala.Double] = js.undefined
}

object HmacImportParams {
  @scala.inline
  def apply(hash: HashAlgorithmIdentifier, name: java.lang.String, length: scala.Int | scala.Double = null): HmacImportParams = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], name = name)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    __obj.asInstanceOf[HmacImportParams]
  }
}

