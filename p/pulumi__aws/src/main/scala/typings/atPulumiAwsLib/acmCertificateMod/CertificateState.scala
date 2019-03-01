package typings
package atPulumiAwsLib.acmCertificateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateState extends js.Object {
  /**
    * The ARN of the certificate
    */
  val arn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The certificate's PEM-formatted public key
    */
  val certificateBody: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The certificate's PEM-formatted chain
    */
  val certificateChain: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A domain name for which the certificate should be issued
    */
  val domainName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of attributes to feed into other resources to complete certificate validation. Can have more than one element, e.g. if SANs are defined. Only set if `DNS`-validation was used.
    */
  val domainValidationOptions: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_DomainNameResourceRecordName]
      ]
    ]
  ] = js.undefined
  /**
    * The certificate's PEM-formatted private key
    */
  val privateKey: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of domains that should be SANs in the issued certificate
    */
  val subjectAlternativeNames: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
  /**
    * A list of addresses that received a validation E-Mail. Only set if `EMAIL`-validation was used.
    */
  val validationEmails: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * Which method to use for validation. `DNS` or `EMAIL` are valid, `NONE` can be used for certificates that were imported into ACM and then into Terraform.
    * * Importing an existing certificate
    */
  val validationMethod: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object CertificateState {
  @scala.inline
  def apply(
    arn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    certificateBody: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    certificateChain: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    domainName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    domainValidationOptions: atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_DomainNameResourceRecordName]
      ]
    ] = null,
    privateKey: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    subjectAlternativeNames: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    tags: atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    validationEmails: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    validationMethod: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): CertificateState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (certificateBody != null) __obj.updateDynamic("certificateBody")(certificateBody.asInstanceOf[js.Any])
    if (certificateChain != null) __obj.updateDynamic("certificateChain")(certificateChain.asInstanceOf[js.Any])
    if (domainName != null) __obj.updateDynamic("domainName")(domainName.asInstanceOf[js.Any])
    if (domainValidationOptions != null) __obj.updateDynamic("domainValidationOptions")(domainValidationOptions.asInstanceOf[js.Any])
    if (privateKey != null) __obj.updateDynamic("privateKey")(privateKey.asInstanceOf[js.Any])
    if (subjectAlternativeNames != null) __obj.updateDynamic("subjectAlternativeNames")(subjectAlternativeNames.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (validationEmails != null) __obj.updateDynamic("validationEmails")(validationEmails.asInstanceOf[js.Any])
    if (validationMethod != null) __obj.updateDynamic("validationMethod")(validationMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateState]
  }
}

