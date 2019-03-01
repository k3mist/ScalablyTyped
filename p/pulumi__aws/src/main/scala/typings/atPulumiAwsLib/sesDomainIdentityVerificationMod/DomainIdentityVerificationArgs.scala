package typings
package atPulumiAwsLib.sesDomainIdentityVerificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainIdentityVerificationArgs extends js.Object {
  /**
    * The domain name of the SES domain identity to verify.
    */
  val domain: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object DomainIdentityVerificationArgs {
  @scala.inline
  def apply(domain: atPulumiPulumiLib.resourceMod.Input[java.lang.String]): DomainIdentityVerificationArgs = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DomainIdentityVerificationArgs]
  }
}

