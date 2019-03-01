package typings
package awsDashSdkLib.libCloudfrontSignerMod.SignerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignerOptionsWithoutPolicy extends js.Object {
  /**
    * A Unix UTC timestamp indicating when the signature should expire. Required unless you pass in a full policy.
    */
  var expires: scala.Double
  /**
    * The URL to which the signature will grant access. Required unless you pass in a full policy.
    */
  var url: java.lang.String
}

object SignerOptionsWithoutPolicy {
  @scala.inline
  def apply(expires: scala.Double, url: java.lang.String): SignerOptionsWithoutPolicy = {
    val __obj = js.Dynamic.literal(expires = expires, url = url)
  
    __obj.asInstanceOf[SignerOptionsWithoutPolicy]
  }
}

