package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EcdhKeyDeriveParams extends Algorithm {
  var public: CryptoKey
}

object EcdhKeyDeriveParams {
  @scala.inline
  def apply(name: java.lang.String, public: CryptoKey): EcdhKeyDeriveParams = {
    val __obj = js.Dynamic.literal(name = name, public = public)
  
    __obj.asInstanceOf[EcdhKeyDeriveParams]
  }
}

