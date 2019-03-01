package typings
package atPulumiAwsLib.acmCertificateValidationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateValidationState extends js.Object {
  /**
    * The ARN of the certificate that is being validated.
    */
  val certificateArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * List of FQDNs that implement the validation. Only valid for DNS validation method ACM certificates. If this is set, the resource can implement additional sanity checks and has an explicit dependency on the resource that is implementing the validation
    */
  val validationRecordFqdns: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
}

object CertificateValidationState {
  @scala.inline
  def apply(
    certificateArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    validationRecordFqdns: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null
  ): CertificateValidationState = {
    val __obj = js.Dynamic.literal()
    if (certificateArn != null) __obj.updateDynamic("certificateArn")(certificateArn.asInstanceOf[js.Any])
    if (validationRecordFqdns != null) __obj.updateDynamic("validationRecordFqdns")(validationRecordFqdns.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateValidationState]
  }
}

