package typings
package atPulumiAwsLib.acmpcaCertificateAuthorityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateAuthorityArgs extends js.Object {
  /**
    * Nested argument containing algorithms and certificate subject information. Defined below.
    */
  val certificateAuthorityConfiguration: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_KeyAlgorithmSigningAlgorithm]
  /**
    * Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. Defaults to `false`.
    */
  val enabled: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * Nested argument containing revocation configuration. Defined below.
    */
  val revocationConfiguration: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_CrlConfigurationAnonCustomCnameEnabled]
  ] = js.undefined
  /**
    * Specifies a key-value map of user-defined tags that are attached to the certificate authority.
    */
  val tags: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
  /**
    * The type of the certificate authority. Currently, this must be `SUBORDINATE`.
    */
  val `type`: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object CertificateAuthorityArgs {
  @scala.inline
  def apply(
    certificateAuthorityConfiguration: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_KeyAlgorithmSigningAlgorithm],
    enabled: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    revocationConfiguration: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_CrlConfigurationAnonCustomCnameEnabled] = null,
    tags: atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): CertificateAuthorityArgs = {
    val __obj = js.Dynamic.literal(certificateAuthorityConfiguration = certificateAuthorityConfiguration.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (revocationConfiguration != null) __obj.updateDynamic("revocationConfiguration")(revocationConfiguration.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateAuthorityArgs]
  }
}

