package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RsaHashedImportParams extends Algorithm {
  var hash: HashAlgorithmIdentifier
}

object RsaHashedImportParams {
  @scala.inline
  def apply(hash: HashAlgorithmIdentifier, name: java.lang.String): RsaHashedImportParams = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], name = name)
  
    __obj.asInstanceOf[RsaHashedImportParams]
  }
}

